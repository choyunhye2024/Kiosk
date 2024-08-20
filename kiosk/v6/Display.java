package com.kiosk.v6;

public class Display {

	String x = "x";

	final static String DOT = "🎁"; //final을쓰면 변수가 상수가 됨
                                    
	public static void line() {
		
//		So.w(x); //일반 멤버 변수는 못씀
		for(int i = 0; i<32; i=i+1) {
			
			So.p(DOT);
		}
		So.ln("");
	}

	public static void title() {
		
		line();
		So.ln("+++++++++++++고양이카페++++++++++++++");
	    line();
	}
}
