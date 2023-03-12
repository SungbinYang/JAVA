package me.sungbin.ch02;

import java.util.Scanner;

/**
 * @author : rovert
 * @packageName : me.sungbin.ch02
 * @fileName : ScannerEx
 * @date : 2023/01/31
 * @description :
 * ===========================================================
 * DATE 			AUTHOR			 NOTE
 * -----------------------------------------------------------
 * 2023/01/31       rovert         최초 생성
 */
public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세여.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num=%d%n", num);

        scanner.close();
    }
}
