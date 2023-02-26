package me.sungbin.ch02;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch02
 * @fileName : FloatToBinEx
 * @date : 2023/02/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2023/02/20       rovert         최초 생성
 */

public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToRawIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i);

        char c1 = 'A';
        char c2 = 'B';

        System.out.println(c1 + c2);
    }
}
