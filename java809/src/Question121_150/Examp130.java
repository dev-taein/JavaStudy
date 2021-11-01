package Question121_150;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Products {
	String name;
	Integer price;
	public Products(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	void printVal() { System.out.println(name + "price:"+ price + " ");

	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	Integer getPrice() {return price;}
}
public class Examp130 {
	public static void main(String[] args) {
		List<Products> li = Arrays.asList(new Products("TV", 1000), new Products("Refrigerrator", 2000));
		Consumer<Products> raise = e -> e.setPrice(e.getPrice() + 100); //forEach(Consumer)�� ����� ������
		li.forEach(raise); //���⼭ price���� 100�� ������, �� ������ �������� ������ 100�������� ����
		li.stream().forEach(Products::printVal); //���
	}
//��: TVprice:1100 
//Refrigerratorprice:2100 
}
