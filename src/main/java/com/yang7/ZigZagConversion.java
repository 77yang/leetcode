package com.yang7;

import java.util.ArrayList;
import java.util.List;

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

        if(numRows==1) return s;

        boolean addOrreduce = true;

        List<StringBuilder> ls = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ls.add(new StringBuilder());
        }

        int row = 0;
        int i = 0;
        int length = s.length();
        int maxIndex = numRows - 1;

        while (i < length) {
            ls.get(row).append(s.charAt(i++));
            if (addOrreduce) {
                if (++row == maxIndex) {
                    addOrreduce = false;
                }
            } else {
                if (--row == 0) {
                    addOrreduce = true;
                }
            }
        }

        return String.join("", ls);
    }


}
