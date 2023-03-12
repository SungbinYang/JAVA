package me.sungbin.ch02;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch02
 * @fileName : CastingEx3
 * @date : 2023/03/12
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2023/03/12       rovert         최초 생성
 */
public class CastingEx3 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double) f;

        System.out.printf("f = %20.18f\n", f);
        System.out.printf("d = %20.18f\n", d);
        System.out.printf("d2 = %20.18f\n", d2);
    }
}
