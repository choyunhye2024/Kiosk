package com.kiosk.v7;

public class Display {

	String x = "x";

	final static String DOT = "🎁";

	  public static void line() {

		for (int i = 0; i < 32; i = i + 1) {

			So.p(DOT);
		}

		So.ln("");
	}

public static void title() {
	
	line();
	So.ln("------------고양이 카페------------");
}

}
