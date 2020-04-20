
public class ChangeSetMenu {
	int additionalPrice; //추가금액
	int nowDrinksPrice = 0;
	int nowDessertsPrice = 0;
	String drinks = "";
	String desserts = "";

	public void changeSetMenu(String hamburgerSetName, int hamburgerSetAmount, int hamburberPrice, String drinksName, String dessertsName) {
		
		//확인을 눌렀을 때!
		if(drinksName == "사이다") {
			additionalPrice = 0;
			drinks = "사이다";
			
		}else if(drinksName == "콜라"){
			additionalPrice = 0;
			drinks = "콜라";
			
		}else if(drinksName == "아메리카노"){
			additionalPrice = 300;
			drinks = "아메리카노";
			
		}else if(drinksName == "아이스 아메리카노"){
			additionalPrice = 300;
			drinks = "아이스 아메리카노";
			
		}else if(drinksName == "카페라떼"){
			additionalPrice = 700;
			drinks = "카페라떼";
			
		}else if(drinksName == "아이스 카페라떼"){
			additionalPrice = 700;
			drinks = "아이스 카페라떼";
			
		}
		
		//이전에 골랐던 음료의 금액과 현재 고른 음료와 다를 경우 차액만큼 더하거나 뺀다
		if(additionalPrice < nowDrinksPrice) {
			Main.totalPrice = Main.totalPrice + (nowDrinksPrice - additionalPrice);
			hamburberPrice = hamburberPrice + (nowDrinksPrice - additionalPrice);
			
		}else if(additionalPrice > nowDrinksPrice) {
			Main.totalPrice = Main.totalPrice + (additionalPrice - nowDrinksPrice);
			hamburberPrice = hamburberPrice + (additionalPrice - nowDrinksPrice);
		}
		
		System.out.println("additionalPrice" + additionalPrice);
		System.out.println("nowDrinksPrice" + nowDrinksPrice);
		System.out.println("hamburberPrice" + hamburberPrice);
		System.out.println("Main.totalPrice" + Main.totalPrice);
		
		nowDrinksPrice = additionalPrice;
		System.out.println(drinksName + "로 음료 변경 추가금액 : " + additionalPrice);
		

		if(dessertsName == "포테이토") {
			additionalPrice = 0;
			
		}else if(dessertsName == "콘샐러드") {
			additionalPrice = 200;
			
		}else if(dessertsName == "롱치즈스틱") {
			additionalPrice = 300;
			
		}else if(dessertsName == "양념감자") {
			additionalPrice = 500;
			
		}else if(dessertsName == "오징어링") {
			additionalPrice = 700;
			
		}else if(dessertsName == "치즈스틱") {
			additionalPrice = 500;
			
		}else if(dessertsName == "지파이 고소한맛") {
			additionalPrice = 1900;
			
		}else if(dessertsName == "지파이 하바네로") {
			additionalPrice = 1000;
			
		}else if(dessertsName == "쉑쉑치킨") {
			additionalPrice = 1900;
			
		}else if(dessertsName == "치즈인더에그") {
			additionalPrice = 1500;
			
		}
		
		//이전에 골랐던 음료의 금액과 현재 고른 음료와 다를 경우 차액만큼 더하거나 뺀다
		if(additionalPrice < nowDessertsPrice) {
			Main.totalPrice = Main.totalPrice + (nowDessertsPrice - additionalPrice);
			hamburberPrice = hamburberPrice + (nowDessertsPrice - additionalPrice);
			
		}else if(additionalPrice > nowDessertsPrice) {
			Main.totalPrice = Main.totalPrice + (additionalPrice - nowDessertsPrice);
			hamburberPrice = hamburberPrice + (additionalPrice - nowDessertsPrice);
		}
		nowDessertsPrice = additionalPrice;
		System.out.println(dessertsName + "로 디저트 변경 추가금액 : " + additionalPrice);
			
		System.out.println("additionalPrice" + additionalPrice);
		System.out.println("nowDessertsPrice" + nowDessertsPrice);
		System.out.println("hamburberPrice" + hamburberPrice);
		System.out.println("Main.totalPrice" + Main.totalPrice);
		
		if(drinksName != "") {
			//음료수만 변경됬다면
			Main.OrderStatusText.get(Main.textNumber).setText(hamburgerSetName+" "+hamburgerSetAmount+"개 "+ hamburberPrice + 
					" 음료 :" + drinksName);
			
			//둘다 변경됬다면
			if(dessertsName != "") {
				Main.OrderStatusText.get(Main.textNumber).setText(hamburgerSetName+" "+hamburgerSetAmount+"개 "+ hamburberPrice + 
						" 음료 :" + drinksName + " 디저트 :" + dessertsName);
			}

		//디저트만 변경됬다면	
		}else if(dessertsName != "") {
			Main.OrderStatusText.get(Main.textNumber).setText(hamburgerSetName+" "+hamburgerSetAmount+"개 "+ hamburberPrice + 
					" 디저트 :" + dessertsName);
		}
		
		Main.amountText.setText(Main.totalPrice+"원");
	}

}
