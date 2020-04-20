
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
		Main.totalPrice = Main.totalPrice+price;
		Main.orderProductName.add(productName);
		Main.OrderStatusText.get(Main.textNumber).setText(productName+" "+amount+"개 "+price);
		Main.totalAmount++;
		Main.numberText.setText(Main.totalAmount+"개");
		Main.amountText.setText(Main.totalPrice+"원");
		
		System.out.println("추가 후 배열 값");
		System.out.println(Main.orderProductName.toString());
	}
}
