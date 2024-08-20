package com.kiosk.v6;

import java.util.ArrayList;
import java.util.Scanner;


public class Kiosk {

	ArrayList<Product> basket = new ArrayList<Product>();
	Scanner sc = new Scanner(System.in);
	Product p1 = new Product("아아", 1000);
	Product p2 = new Product("뜨아", 1500);
	Product p3 = new Product("오렌지주스", 2000);
	String cmd;

	void run() {

		xx: while (true) {

			System.out.println("1.음료선택 / 2.디저트 선택 /e.프로그램 종료");
			cmd = sc.next();
			switch (cmd) {

			case "1":
				yy: while (true) {

					p1.info();
					p2.info();
					p3.info();

					System.out.println("1.아아 / 2.뜨아 /3. 오렌지주스 x. 뒤로가기");
					System.out.println("");
					cmd = sc.next();
					switch (cmd) {

					case "1":
						System.out.println("아아 선택됨");
						Product x = new Product("아아", 1000);
						basket.add(p1);

						break;
						
					case "2":
						System.out.println("뜨아 선택됨");
						Product y = new Product ("뜨아", 2000);
						basket.add(p2);
						
						break;
						
					case "3":
					 System.out.println("오렌지주스 선택됨");
					Product z = new Product ("오렌지주스",2000);
					basket.add(p3);
					
					break;
					
					case "x":
						System.out.println("이전메뉴 이동");
						break yy;
					
					}

				}
				
			case "2":
				System.out.println("2번");
				break;
				
			case "e":
				System.out.println("프로그램종료");
				
				int count = basket.size();
				System.out.println("장바구니에 담긴 상품갯수:"+count);
				
				int sum = 0;
				for (int i=0; i<basket.size(); i=i+1) {
					
					sum = sum + basket.get(i).price;
				}

				System.out.println("계산하실 금액은:"+sum+"원입니다.");
				
				break xx;
			}
			
		}

	}

}
