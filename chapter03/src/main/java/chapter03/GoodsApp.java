package chapter03;

public class GoodsApp {
	
	public static void main(String[] args) {
		Goods camera = new Goods();		//기본생성자
		camera.setName("nikon");	
		camera.setPrice(40000);		
		camera.setCountStock(30);	
		camera.setCountSold(50);	
		System.out.println(camera);	
		camera.showInfo();
		
		int discouintPrice = camera.calcDiscouintPrice(0.5);
		System.out.println("Discount Price"+discouintPrice);
									
		Goods g1 = new Goods();		
		Goods g2 = new Goods();		
		Goods g3 = new Goods();		
		
		
		System.out.println(Goods.countOfGoods);
//		System.out.println(1);
//		System.out.println(camera);
		
		Goods g4 = new Goods("Tv",10000,10,0);
		g4.showInfo();
		System.out.println("instance count"+Goods.countOfGoods);
		
		
		
	}
	
}
