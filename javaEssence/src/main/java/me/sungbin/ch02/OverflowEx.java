package me.sungbin.ch02;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch02
 * @fileName : OverflowEx
 * @date : 2023/02/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2023/02/20       rovert         최초 생성
 */

public class OverflowEx {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin - 1 = " + (short) (sMin - 1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = "  + (sMax + 1));
        System.out.println("cMin = " + (int) cMin);
        System.out.println("cMin - 1 = " + (int) --cMin);
        System.out.println("cMax = " + cMax);
        System.out.println("cMax + 1 = " + (int) ++cMax);
    }
}
