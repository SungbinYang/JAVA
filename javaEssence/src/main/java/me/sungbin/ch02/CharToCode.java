package me.sungbin.ch02;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch02
 * @fileName : CharToCode
 * @date : 2023/02/20
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2023/02/20       rovert         최초 생성
 */

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int) ch;

        System.out.printf("%c = %d(%#X)%n", ch, code, code);

        char hch = '가';

        System.out.printf("%c = %d(%#X)%n", hch, (int) hch, (int) hch);
    }
}
