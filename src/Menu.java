
public class Menu {
	String productName; //제품 이름
	int price;			//가격
	int amount = 0;
	
	Menu(String productName, int price, int amount) {
		this.productName = productName;
		this.price = price;
		this.amount = amount;
	}
	
	void buy() {
		price = price * amount;
		MainEx.totalPrice = MainEx.totalPrice+price;
		//System.out.println(productName+"의 갯수는 "+amount+"이고 가격은 "+price+"이고 총 가격은 "+Main.totalPrice);
	}
}
