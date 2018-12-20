package com.yang7;

import java.util.*;

/**
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * <p>
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        //true add
        boolean addOrreduce = true;

        Map<Integer, List> data = new HashMap<>();
        int row = 1;
        int i = 0;
        int length = s.length();
        while (i < length) {
            List list = data.get(row);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(s.charAt(i++));


            data.put(row, list);
            if (row == numRows) {
                addOrreduce = false;
            }

            if (row == 1) {
                addOrreduce = true;
            }

            if (addOrreduce) {
                row++;
            } else {
                row--;
            }
        }

        StringBuffer sb = new StringBuffer();

        data.values().forEach(ls ->
                ls.forEach(t ->
                        sb.append(t)
                )
        );

        return sb.toString();
    }


}
