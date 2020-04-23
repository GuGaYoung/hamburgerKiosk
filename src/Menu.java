import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Menu {
	String productName; //제품 이름
	int price;			//가격
	int originalPrice = 0; //변경전 원래 가격
	int amount = 0;
	
	ArrayList<String> ingerdientsMenuImages;	//추가구성 메뉴 이미지 배열
	
	Menu(String productName, int price, int amount) {
		this.productName = productName;
		this.originalPrice = price;
		this.amount = amount;
	}
	
	void buy() {
		//제품 초기화
		price = originalPrice;
		amount = 1;
		
		price = price * amount;
		Main.totalPrice = Main.totalPrice+price;
		Main.orderProductName.add(productName);
		Main.orderProduct.add(productName+" "+amount+"개 "+price);
		Main.orderStatusText.get(Main.orderStatusTextNumber).setText(productName+" "+amount+"개 "+price);
		Main.totalAmount++;
		Main.amountText.setText(Main.totalAmount+"개");
		Main.priceText.setText(Main.totalPrice+"원");

		Main.finalTotalAmount.setText("총 개수 : "+Main.totalAmount+" 개");
		Main.finalTotalPrice.setText("총 "+Main.totalPrice+" 원");
		
		System.out.println("추가 후 배열 값");
		System.out.println(Main.orderProductName.toString());
	}
	
	void cancel() {

			Main.totalAmount -= amount;
			Main.totalPrice -= price;
			Main.amountText.setText(Main.totalAmount + "개");
			Main.priceText.setText(Main.totalPrice + "원");
			Main.orderProductName.remove(productName);
			Main.orderProduct.remove(productName+" "+amount+"개 "+price);
			
			Main.finalTotalAmount.setText("총 개수 : "+Main.totalAmount+" 개");
			Main.finalTotalPrice.setText("총 "+Main.totalPrice+" 원");
			
			System.out.println(Main.orderProductName.toString());

	}
	
	void addNumOfProduct(int num, int orderStatusTextNumber) {
		Main.orderProduct.remove(productName+" "+amount+"개 "+price);
		
		amount = amount + num;
		Main.howManyText.setText("현재  : " + amount + " 개");
		
		price = price + originalPrice * num;
		Main.totalPrice = Main.totalPrice + originalPrice * num;
		//Main.orderProductName.add(productName);
		System.out.println("productName" + productName);
		Main.orderStatusText.get(orderStatusTextNumber).setText(productName+" "+amount+"개 "+ price);
		
		Main.totalAmount = Main.totalAmount + num;
		System.out.println("amount" + amount + "totalAmount" + Main.totalAmount);
		Main.amountText.setText(Main.totalAmount+"개");
		Main.priceText.setText(Main.totalPrice+"원");
		
		Main.orderProduct.add(productName+" "+amount+"개 "+price);
		Main.finalTotalAmount.setText("총 개수 : "+Main.totalAmount+" 개");
		Main.finalTotalPrice.setText("총 "+Main.totalPrice+" 원");
	}
	
	void addNumOfHamburgerSet(int num, int orderStatusTextNumber, String hamburgerSet_drink, String hamburgerSet_dessert) {
		System.out.println(num + "개 추가 ");
		amount = amount + num;
		Main.howManyText.setText("현재  : " + amount + " 개");
		
		Main.totalPrice = Main.totalPrice + price;
		//Main.orderProductName.add(productName);
		System.out.println("productName" + productName);
		Main.orderStatusText.get(orderStatusTextNumber).setText(productName+" "+amount+"개 "+price);
		
		Main.totalAmount = Main.totalAmount + num;
		System.out.println("amount" + amount + "totalAmount" + Main.totalAmount);
		Main.amountText.setText(Main.totalAmount+"개");
		Main.priceText.setText(Main.totalPrice+"원");
		
		//TODO 합치면서 코드 다시 보기
		if(hamburgerSet_drink != "") {
			//음료수만 변경됬다면
			Main.orderStatusText.get(orderStatusTextNumber).setText(productName+" "+amount+"개 "+ price + 
					" 음료 :" + hamburgerSet_drink);
			
			//둘다 변경됬다면
			if(hamburgerSet_dessert != "") {
				Main.orderStatusText.get(orderStatusTextNumber).setText(productName+" "+amount+"개 "+ price + 
						" 음료 :" + hamburgerSet_drink + " 디저트 :" + hamburgerSet_dessert);
			}

		//디저트만 변경됬다면	
		}else if(hamburgerSet_dessert != "") {
			Main.orderStatusText.get(orderStatusTextNumber).setText(productName+" "+amount+"개 "+ price + 
					" 디저트 :" + hamburgerSet_dessert);
		}
	}
}