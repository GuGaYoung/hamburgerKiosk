import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class Menu {
	String productName; //제품 이름
	int price;			//가격
	int amount = 0;
	
	JTextArea textArea;
	ArrayList<String> ingerdientsMenuImages;
	
	Menu(String productName, int price, int amount) {
		this.productName = productName;
		this.price = price;
		this.amount = amount;
	}
	
	void buy() {
		price = price * amount;
		Main.totalPrice = Main.totalPrice+price;
		Main.orderProductName.add(productName);
		Main.orderProduct.add(productName+" "+amount+"개 "+price);
		//textArea.append(productName+" "+amount+"개 "+price);
		Main.OrderStatusText.get(Main.textNumber).setText(productName+" "+amount+"개 "+price);
		Main.totalAmount++;
		Main.numberText.setText(Main.totalAmount+"개");
		Main.amountText.setText(Main.totalPrice+"원");
		
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
			
			System.out.println(productName + " 갯수: " + amount + productName + " 가격: "
					+ price);
			System.out.println(
					"총 가격: " + (Main.totalPrice + price) + "에서  " + productName + " 가격: "
							+ price + "을 뺀 값은 " + Main.totalPrice);
			System.out.println(Main.orderProductName.toString());
			//System.out.println(Main.orderProduct.toString());
	//}
	}
}
