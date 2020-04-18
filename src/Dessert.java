
public class Dessert extends Menu{
	
	Dessert(String productName, int price, int amount) {
		super(productName, price, amount);
	}
	
	void buyDessert(){
		price = price * amount;
		Main.totalPrice = Main.totalPrice+price;
		//System.out.println(productName+"의 갯수는 "+amount+"이고 가격은 "+price+"이고 총 가격은 "+Main.totalPrice);
	}
}