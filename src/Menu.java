import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class Menu {
	String productName; //제품 이름
	int price;			//가격
	int originalPrice = 0;
	int amount = 0;
	
	JTextArea textArea;
	ArrayList<String> ingerdientsMenuImages;
	
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
		//textArea.append(productName+" "+amount+"개 "+price);
		Main.OrderStatusText.get(Main.textNumber).setText(productName+" "+amount+"개 "+price);
		Main.totalAmount++;
		Main.numberText.setText(Main.totalAmount+"개");
		Main.amountText.setText(Main.totalPrice+"원");

		Main.checkTotalAmount.setText("총 개수 : "+Main.totalAmount+" 개");
		Main.checkTotalPrice.setText("총 "+Main.totalPrice+" 원");
		
		System.out.println("추가 후 배열 값");
		System.out.println(Main.orderProductName.toString());
		//System.out.println(Main.orderProduct.toString());
	}
	
	void cancel() {
		//if (Main.orderProductName.get(i).equals(productName)) {
			Main.totalAmount -= amount;
			Main.totalPrice -= price;
			Main.numberText.setText(Main.totalAmount + "개");
			Main.amountText.setText(Main.totalPrice + "원");
			Main.orderProductName.remove(productName);
			Main.orderProduct.remove(productName+" "+amount+"개 "+price);
			
			Main.checkTotalAmount.setText("총 개수 : "+Main.totalAmount+" 개");
			Main.checkTotalPrice.setText("총 "+Main.totalPrice+" 원");
			
			System.out.println(productName + " 갯수: " + amount + productName + " 가격: "
					+ price);
			System.out.println(
					"총 가격: " + (Main.totalPrice + price) + "에서  " + productName + " 가격: "
							+ price + "을 뺀 값은 " + Main.totalPrice);
			System.out.println(Main.orderProductName.toString());
			//System.out.println(Main.orderProduct.toString());
	//}
	}
	
	void addNumOfProduct(int num, int textNumber) {
		amount = amount + num;
		Main.howManyText.setText("현재  : " + amount + " 개");
		
		Main.totalPrice = Main.totalPrice + price;
		//Main.orderProductName.add(productName);
		System.out.println("productName" + productName);
		Main.OrderStatusText.get(textNumber).setText(productName+" "+amount+"개 "+ price);
		
		Main.totalAmount = Main.totalAmount + num;
		System.out.println("amount" + amount + "totalAmount" + Main.totalAmount);
		Main.numberText.setText(Main.totalAmount+"개");
		Main.amountText.setText(Main.totalPrice+"원");
	}
	
	void addNumOfProduct_hamburgerSet(int num, int textNumber, String hamburgerSet_drink, String hamburgerSet_dessert) {
		System.out.println(num + "개 추가 ");
		amount = amount + num;
		Main.howManyText.setText("현재  : " + amount + " 개");
		
		Main.totalPrice = Main.totalPrice + price;
		//Main.orderProductName.add(productName);
		System.out.println("productName" + productName);
		Main.OrderStatusText.get(textNumber).setText(productName+" "+amount+"개 "+price);
		
		Main.totalAmount = Main.totalAmount + num;
		System.out.println("amount" + amount + "totalAmount" + Main.totalAmount);
		Main.numberText.setText(Main.totalAmount+"개");
		Main.amountText.setText(Main.totalPrice+"원");
		
		if(hamburgerSet_drink != "") {
			//음료수만 변경됬다면
			Main.OrderStatusText.get(textNumber).setText(productName+" "+amount+"개 "+ price + 
					" 음료 :" + hamburgerSet_drink);
			
			//둘다 변경됬다면
			if(hamburgerSet_dessert != "") {
				Main.OrderStatusText.get(textNumber).setText(productName+" "+amount+"개 "+ price + 
						" 음료 :" + hamburgerSet_drink + " 디저트 :" + hamburgerSet_dessert);
			}

		//디저트만 변경됬다면	
		}else if(hamburgerSet_dessert != "") {
			Main.OrderStatusText.get(Main.textNumber).setText(productName+" "+amount+"개 "+ price + 
					" 디저트 :" + hamburgerSet_dessert);
		}
	}
}
