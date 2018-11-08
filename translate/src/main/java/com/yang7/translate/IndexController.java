package com.yang7.translate;


import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.regex.Pattern.compile;

@RestController
public class IndexController {

    @Autowired
    private WordRepository wordRepository;


    @GetMapping("words/{page}")
    public List<TWords> getWords(@PathVariable Integer page) {
        if (page < 1) {
            page = 1;
        }

       return  wordRepository.findAll(PageRequest.of(page, 20)).getContent();
    }



    //@GetMapping("translate")
    public  void translate() throws Exception {


        URL url = new URL("https://docs.spring.io/spring-boot/docs/2.1.0.RELEASE/reference/htmlsingle/");


        String data = IOUtils.toString(url, "utf-8");

        List<String> ls = new ArrayList<>();

        Pattern pattern = compile("\\w+");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            String group = matcher.group();
            if(group.length()<30&&group.length()>1&&!group.matches(".*\\d+.*"))
            ls.add(group);

        }


        Map<String,Integer> map = new HashMap();

        for (String word : ls) {

            Integer count = map.get(word);
            if (count == null) {
                map.put(word, 0);
            } else {
                map.put(word, ++count);
            }

        }
        map =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));




        map.forEach((k,v)-> {
            System.out.println("========"+v+"=========");

            System.out.println( k);


            String query = query(k);


            TWords build = TWords.builder().count(v).name(k).mean(query).build();

            try {
                wordRepository.save(build);
            } catch (Exception e) {
                System.out.println("duplicated key : "+k);
            }


        });

    }

    private String query(String word) {

        try {
            String data = IOUtils.toString(new URL("http://www.iciba.com/index.php?a=getWordMean&c=search&word="+word), "utf-8");


            JSONObject jsonObject = new JSONObject(data);
            String errmsg = jsonObject.getString("errmsg");
            if (!Objects.equals(errmsg, "success")) {
                System.out.println("error="+data);
                return "";
            }
             jsonObject = jsonObject.getJSONObject("baesInfo").getJSONArray("symbols").getJSONObject(0);
            JSONArray parts = jsonObject.getJSONArray("parts");
            StringBuilder sb = new StringBuilder();
            for (Object part : parts) {
                JSONObject object = (JSONObject) part;
                String s = object.getString("part");
                JSONArray means = object.getJSONArray("means");
                String explation = s + StringEscapeUtils.unescapeJava(means.toString().replace("\"", ""));
                System.out.println(explation);

                sb.append(explation).append("\n");

            }

            return sb.toString();
        } catch (Exception e) {
            return "";
        }





    }



}
