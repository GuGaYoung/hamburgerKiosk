
public class ChangeSetMenu {
	int additionalPrice; //추가금액
	String drinks = "";
	String desserts = "";
	/*
	 * cider = new Menu("사이다", 1700, 1); Menu cola = new Menu("콜라", 1700, 1); Menu
	 * americano = new Menu("아메리카노", 2000, 1); Menu iceAmericano = new
	 * Menu("아이스 아메리카노", 2000, 1); Menu caffeLatte = new Menu("카페라떼", 2000, 1); Menu
	 * iceCaffeLatte
	 */
	
	public void changeSetMenu(String hamburgerSetName, int hamburgerSetAmount, int hamburberPrice, String drinksName, String dessertsName) {
		
		if(drinksName == "사이다") {
			additionalPrice = 0;
			
		}else if(drinksName == "콜라"){
			additionalPrice = 0;
			
		}else if(drinksName == "아메리카노"){
			additionalPrice = 300;
			
		}else if(drinksName == "아이스 아메리카노"){
			additionalPrice = 300;
			
		}else if(drinksName == "카페라떼"){
			additionalPrice = 700;
			
		}else if(drinksName == "아이스 카페라떼"){
			additionalPrice = 700;
			
		}
		Main.totalPrice = Main.totalPrice + additionalPrice;
		hamburberPrice = hamburberPrice + additionalPrice;
		
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
		Main.totalPrice = Main.totalPrice + additionalPrice;
		hamburberPrice = hamburberPrice + additionalPrice;
		
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

		
		System.out.println(drinksName + "로 디저트 변경 추가금액 : " + additionalPrice);
		
	}

}
