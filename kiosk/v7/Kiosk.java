package com.kiosk.v7;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

	ProcMenuDrink procMenuDrink = new ProcMenuDrink();

	public static ArrayList<Product> basket = new ArrayList<Product>();

	public static Product p1 = new Product("아아", 1000);
	public static Product p2 = new Product("뜨아", 1500);
	public static Product p3 = new Product("오렌지주스", 2000);
	public static String cmd;
	public static Scanner sc = new Scanner(System.in);

	void run() {

		xx: while (true) {

			System.out.println("1. 음료선택 / 2. 디저트 선택 . 3.프로그램 종료");
			cmd = sc.next();

			switch (cmd) {

			case "1":

				procMenuDrink.run();
				break;

			case "2":
				System.out.println("2번");
				break;

			case "3":
				System.out.println("프로그램 종료");
				
				int count = basket.size();
				System.out.println("장바구니에 담긴 상품갯수:"+count);
				
				int sum = 0;
				for(int i=0; i<basket.size(); i=i+1) {
					
					sum = sum + basket.get(i).price;
				}
				
				System.out.println("계산하실 금액은 :"+sum+"원 입니다.");
				
				break xx;
			
			}

		}

	}

}
