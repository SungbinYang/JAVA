package me.sungbin.ch02;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch02
 * @fileName : VarEx2
 * @date : 2023/01/30
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2023/01/30       rovert         최초 생성
 */
public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x: " + x + " y: " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: " + x + " y: " + y);
    }
}
