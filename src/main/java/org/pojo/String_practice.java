package org.pojo;

public class String_practice {
	public static void main(String[] args) {
		String a = "senthil"; // unmutable
		String b=" ";
		System.out.println(a.concat("nathan"));
		System.out.println(a.length());

		for (int i = a.length() - 1; i >= 0; i--) {

			b=b+a.charAt(i);

		}
		
		System.out.println(b);

//		StringBuffer sb=new StringBuffer("senthil");//mutable
//		System.out.println("----------------------");
//		sb.append(" nathan");
//		System.out.println(sb);
//		
//		StringBuilder sbu=new StringBuilder("senthil");
//		

	}

}
