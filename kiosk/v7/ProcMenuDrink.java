
package com.kiosk.v7;

public class ProcMenuDrink {

	public void run() {

		yy: while (true) {

			Kiosk.p1.info();
			Kiosk.p2.info();
			Kiosk.p3.info();

			System.out.println("1. 아아 / 2. 뜨아 / 3. 오렌지주스 / x.이전메뉴로");
			System.out.println("");
			Kiosk.cmd = Kiosk.sc.next();

			switch (Kiosk.cmd) {

			case "1":

				System.out.println("아아선택됨");
				Kiosk.basket.add(Kiosk.p1);
				break;
				
			case "2":
				System.out.println("뜨아선택됨");
				Kiosk.basket.add(Kiosk.p2);
				break;
				
			case "3":
				System.out.println("오렌지주스 선택됨");
				Kiosk.basket.add(Kiosk.p3);
				
			case "x":
			System.out.println("이전메뉴이동");
			break yy;

			}
		}
	}
}
