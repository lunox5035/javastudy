package chapter03;

import mypackage.Goods2;

public class DsicountGoods2 extends Goods2 {
	private float discountRate =0.3f;

public int getDicoubtPrice() {
	//Protected는 자식에서 접근할 수 있다(price)
		return (int)discountRate*price;
	}
}
