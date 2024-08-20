package com.kiosk.v7;

public class Product {

	String name;
	int price;

	Product(String xx, int yy) {

		name = xx;
		price = yy;
	}

	void info() {

		System.out.println("상품명:" + name + " 가격:" + price);
	}

}
