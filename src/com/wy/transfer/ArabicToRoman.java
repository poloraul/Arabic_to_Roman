package com.wy.transfer;

//import com.sun.org.apache.xpath.internal.operations.String;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jarvis on 16/10/3.
 */
//    罗马数字采用七个罗马字母作数字、即Ⅰ（1）、V（5）、X（10）、L（50）、C（100）、D（500）、M（1000）。记数的方法：
//    相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
//    小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
//    小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9；
//    在一个数的上面画一条横线，表示这个数增值 1,000 倍
public class ArabicToRoman {
    private final String ROMAN_I = "I";
    private final String ROMAN_V = "V";
    private final String ROMAN_X = "X";
    private final String ROMAN_L = "L";
    private final String ROMAN_C = "C";
    private final String ROMAN_D = "D";
    private final String ROMAN_M = "M";
    private Map<String, String> carryMap = new HashMap<String, String>();
    private Map<String, String> simplizeMap = new HashMap<String, String>();
    private boolean dealFlag;



    public String araToRom(String arabicString) {
        int arabicInt = Integer.parseInt(arabicString);
        String romanString = "";
        simplizeMapInitiallize();
        for (int i = 1;i<=arabicInt;i++) {
            //初始
            dealFlag = false;
            //累计
            romanString = romanString + ROMAN_I;
            //简化及进位
            do {
                dealFlag = false;
                romanString = simplize(romanString);
            } while (dealFlag);
        }
        return romanString;
    }

    /**
     * 进位表初始化
     */
    private void simplizeMapInitiallize() {
        this.simplizeMap.put("IVI","V");
        this.simplizeMap.put("IXI","X");
        this.simplizeMap.put("XLX","L");
        this.simplizeMap.put("XCX","C");
        this.simplizeMap.put("CDC","D");
        this.simplizeMap.put("CMC","M");


        this.simplizeMap.put("IIII","IV");
        this.simplizeMap.put("XXXX","XL");
        this.simplizeMap.put("CCCC","CD");
        this.simplizeMap.put("VIV","IX");
        this.simplizeMap.put("LXL","XC");
        this.simplizeMap.put("DCD","CM");

    }
    private String simplize(String romanString) {
        String patternString;
        String replaceString;
        do {
            dealFlag = false;
            for (Map.Entry<String, String> entry : this.simplizeMap.entrySet()) {
                patternString = entry.getKey();
                replaceString = entry.getValue();
                romanString = setRomanStringAndDealFlag(romanString,patternString,replaceString);
            }
        } while (dealFlag);
        return romanString;
    }

    private String setRomanStringAndDealFlag(String romanString,String patternString, String replaceString) {
        if (romanString.indexOf(patternString) >= 0 ) {
            dealFlag = true;
        }
        return romanString.replaceAll(patternString,replaceString);
    }

}
