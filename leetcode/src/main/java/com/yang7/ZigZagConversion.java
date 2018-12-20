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
        boolean addOrreduce = true;

        Map<Integer, String> data = new HashMap<>();
        int row = 1;
        int i = 0;
        int length = s.length();
        while (i < length) {
            String str = data.get(row);
            if (str == null) {
                str = "";
            }
            str += s.charAt(i++);

            data.put(row, str);

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
                sb.append(ls)
        );

        return sb.toString();
    }


}
