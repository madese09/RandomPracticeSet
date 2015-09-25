package com.hackerrank.practiceset;

import java.util.Arrays;
import java.util.Scanner;

import org.joda.time.convert.Converter;

/**
 * shift 2
 * middle-Outz
 * okffng-Qwvb
 *10
www.abc.xy
87
 * fff.jkl.gh
 * @author madhumitab
 *Convert.ToChar(65 + ((chAscii – 65) + K) % 26)
 */
public class CaesarCipher {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String s = scan.next();
		String rotate = scan.next();
		System.out.println(encryptUsingCaesarCipher(s, rotate));
	}
	private static String encryptUsingCaesarCipher(String s, String rotate){
		char[] ch = s.toCharArray();
		char[] encryptedCh = new char[ch.length];
		int shift = Integer.parseInt(rotate);
		for(int i=0;i<ch.length;i++){
			//small a-z
			if(ch[i]>=97 && ch[i]<=122){
				encryptedCh[i] = (char)(97 + ((ch[i]-97)+shift)% 26);
			}else if(ch[i]>=65 && ch[i]<=90){
				encryptedCh[i] = (char)(65 + ((ch[i]-65)+shift)% 26);
			}else {
				encryptedCh[i] = ch[i];
			}
		}
		return String.valueOf(encryptedCh);
	}

}
