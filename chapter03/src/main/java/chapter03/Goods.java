package chapter03;

import java.security.PublicKey;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

//	public void setName(String name) {
//		this.name=name;//this.=내부에 있는 객체에 접근
//	}
//	public String getName() {
//		return name;//여기는 this 없나?
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}

	
	
	
}
