
public class Main {

	static int totalPrice = 0;
	
	public static void main(String[] args) {
		
		// 세트메뉴
		Menu wagyuEdition2Set = new Menu("와규 에디션2 세트",7600,1);
		Menu doubleX2Set = new Menu("더블X2 세트",7500,1);
		Menu AZBurgerSet = new Menu("AZ버거 세트",8300,1);
		Menu hanwooBulgogiCombo = new Menu("한우불고기 콤보",8000,1);
		Menu hanwooBulgogiBurgerSet = new Menu("한우불고기 세트",8700,1);
		Menu mozzarellaInTheBurgerSet = new Menu("모짜렐라 인 더 버거 세트",7700,1);
		Menu bigBulgogiSet = new Menu("원조 빅불 세트",7600,1);
		Menu hotCrispyBurgerSet = new Menu("핫크리스피버거 세트",6700,1);
		Menu bulgogiBurgerSet = new Menu("불고기버거 세트",5900,1);
		Menu riaMiracleBurgerSet = new Menu("리아미라클버거 세트",7400,1);
		Menu shrimpBurgerSet = new Menu("새우버거 세트",5900,1);
		Menu chickenBurgerSet = new Menu("치킨버거 세트",5100,1);
		Menu T_RexBurgerSet = new Menu("T-Rex 버거 세트",5900,1);
		Menu classicCheeseBurgerSet = new Menu("클래식 치즈 버거 세트",6400,1);
		Menu teriBurgerSet = new Menu("데리버거 세트",4900,1); 
		
		// 햄버거 메뉴
		Menu wagyuEdition2 = new Menu("와규 에디션2",5800,1);
		Menu doubleX2 = new Menu("더블X2",5500,1);
		Menu mozzarellaInTheBurger = new Menu("모짤렐라 인 더 버거",6000,1);
		Menu AZBurger = new Menu("AZ버거",6600,1);
		Menu bigBulgogi = new Menu("원조빅불",5800,1);
		Menu hotCrispyBurger = new Menu("핫크리스피버거",4900,1);
		Menu hanwooBulgogi = new Menu("한우 불고기 버거",7000,1);
		Menu bulgogiBurger = new Menu("불고기 버거",3900,1);
		Menu riaMiracleBurger = new Menu("리아미라클버거",5600,1);
		Menu shrimpBurger = new Menu("새우버거",3900,1);
		Menu chickenBurger = new Menu("치킨버거",2900,1);
		Menu T_RexBurger = new Menu("T-Rex",3700,1);
		Menu classicCheeseBurger = new Menu("클래식 치즈버거",4400,1);
		Menu teriBurger = new Menu("데리버거",2500,1);
		
		// 디저트
		Menu cheeseInTheEgg = new Menu("치즈인더에그",3000,1);
		Menu jipieHabanero_L  = new Menu("지파이 하바네로",4300,1);
		Menu jipie_S  = new Menu("지파이 고소한맛",3400,1);
		Menu chickenNugget  = new Menu("치킨너겟",1200,1);
		Menu longCheeseStick  = new Menu("롱 치즈스틱",1800,1);
		Menu coneSalad = new Menu("콘샐러드",1700,1);
		Menu sundayIceCream  = new Menu("선데이아이스크림",1500,1);
		Menu shakeShakeChicken  = new Menu("쉑쉑치킨",2500,1);
		Menu seasoningPotato  = new Menu("양념감자",2000,1);
		Menu squidRing  = new Menu("오징어링",2200,1);
		Menu naturalCheeseStick  = new Menu("치즈스틱",2000,1);
		Menu chocoCookieTornado  = new Menu("토네이도(초코쿠키)",2300,1);
		Menu greenTeaTornado  = new Menu("토네이도(녹차)",2300,1);
		Menu strawberryTornado  = new Menu("토네이도(스트로베리)",2400,1);
		Menu softCone  = new Menu("소프트콘",700,1); 
		
		// 음료수
		Menu cider = new Menu("사이다",1700,1);
		Menu cola = new Menu("콜라",1700,1);
		Menu americano = new Menu("아메리카노",2000,1);
		Menu iceAmericano = new Menu("아이스 아메리카노",2000,1);
		Menu caffeLatte = new Menu("카페라떼",2000,1);
		Menu iceCaffeLatte= new Menu("아이스카페라떼",2000,1);
		
		//세트 샀을때 계산하는 메소드
		wagyuEdition2Set.buy();
		doubleX2Set.buy();		
		AZBurgerSet.buy();	
		hanwooBulgogiCombo.buy();	
		hanwooBulgogiBurgerSet.buy();
		mozzarellaInTheBurgerSet.buy();
		bigBulgogiSet.buy();
		hotCrispyBurgerSet.buy();
		bulgogiBurgerSet.buy();
		riaMiracleBurgerSet.buy();
		shrimpBurgerSet.buy();
		chickenBurgerSet.buy();
		T_RexBurgerSet.buy();
		classicCheeseBurgerSet.buy();
		teriBurgerSet.buy();
		
		//햄버거 단품 샀을때 계산하는 메소드
		wagyuEdition2.buy();
		doubleX2.buy();
		mozzarellaInTheBurger.buy();
		AZBurger.buy();
		bigBulgogi.buy();
		hotCrispyBurger.buy();
		hanwooBulgogi.buy();
		bulgogiBurger.buy();
		riaMiracleBurger.buy();
		shrimpBurger.buy();
		chickenBurger.buy();
		T_RexBurger.buy();
		classicCheeseBurger.buy();
		teriBurger.buy();
		
		//디저트 단품 샀을때 계산하는 메소드
		cheeseInTheEgg.buy();
		jipieHabanero_L.buy();
		jipie_S.buy();
		chickenNugget.buy();
		longCheeseStick.buy();
		coneSalad.buy();
		sundayIceCream.buy();
		shakeShakeChicken.buy();
		seasoningPotato.buy();
		squidRing.buy();
		naturalCheeseStick.buy();
		chocoCookieTornado.buy();
		greenTeaTornado.buy();
		strawberryTornado.buy();
		softCone.buy();
		
		//음료수 단품 샀을때 계산하는 메소드
		cider.buy();
		cola.buy();
		americano.buy();
		iceAmericano.buy();
		caffeLatte.buy();
		iceCaffeLatte.buy();
		
		//totalPrice = totalPrice+price;
		System.out.println("구입하기를 눌렀습니다\n");
		
		//세트버거 출력
		System.out.println("제품이름: "+wagyuEdition2Set.productName+" 		가격: "+wagyuEdition2Set.price+" 		갯수: "+wagyuEdition2Set.amount);
		System.out.println("제품이름: "+doubleX2Set.productName+" 		가격: "+doubleX2Set.price+" 		갯수: "+doubleX2Set.amount);
		System.out.println("제품이름: "+AZBurgerSet.productName+" 		가격: "+AZBurgerSet.price+" 		갯수: "+AZBurgerSet.amount);
		System.out.println("제품이름: "+hanwooBulgogiCombo.productName+" 		가격: "+hanwooBulgogiCombo.price+" 		갯수: "+hanwooBulgogiCombo.amount);
		System.out.println("제품이름: "+hanwooBulgogiBurgerSet.productName+" 		가격: "+hanwooBulgogiBurgerSet.price+" 		갯수: "+hanwooBulgogiBurgerSet.amount);
		System.out.println("제품이름: "+mozzarellaInTheBurgerSet.productName+" 	가격: "+mozzarellaInTheBurgerSet.price+" 		갯수: "+mozzarellaInTheBurgerSet.amount);
		System.out.println("제품이름: "+bigBulgogiSet.productName+" 		가격: "+bigBulgogiSet.price+" 		갯수: "+bigBulgogiSet.amount);
		System.out.println("제품이름: "+hotCrispyBurgerSet.productName+" 		가격: "+hotCrispyBurgerSet.price+" 		갯수: "+hotCrispyBurgerSet.amount);
		System.out.println("제품이름: "+bulgogiBurgerSet.productName+" 		가격: "+bulgogiBurgerSet.price+" 		갯수: "+bulgogiBurgerSet.amount);
		System.out.println("제품이름: "+riaMiracleBurgerSet.productName+"	 	가격: "+riaMiracleBurgerSet.price+" 		갯수: "+riaMiracleBurgerSet.amount);
		System.out.println("제품이름: "+shrimpBurgerSet.productName+" 		가격: "+shrimpBurgerSet.price+" 		갯수: "+shrimpBurgerSet.amount);
		System.out.println("제품이름: "+chickenBurgerSet.productName+" 		가격: "+chickenBurgerSet.price+" 		갯수: "+chickenBurgerSet.amount);
		System.out.println("제품이름: "+T_RexBurgerSet.productName+" 		가격: "+T_RexBurgerSet.price+" 		갯수: "+T_RexBurgerSet.amount);
		System.out.println("제품이름: "+classicCheeseBurgerSet.productName+" 		가격: "+classicCheeseBurgerSet.price+" 		갯수: "+classicCheeseBurgerSet.amount);
		System.out.println("제품이름: "+teriBurgerSet.productName+" 		가격: "+teriBurgerSet.price+" 		갯수: "+teriBurgerSet.amount);
		
		//버거 단품 출력
		System.out.println("");
		System.out.println("제품이름: "+wagyuEdition2.productName+" 		가격: "+wagyuEdition2.price+" 		갯수: "+wagyuEdition2.amount);
		System.out.println("제품이름: "+doubleX2.productName+" 			가격: "+doubleX2.price+" 		갯수: "+doubleX2.amount);
		System.out.println("제품이름: "+mozzarellaInTheBurger.productName+" 		가격: "+mozzarellaInTheBurger.price+" 		갯수: "+mozzarellaInTheBurger.amount);
		System.out.println("제품이름: "+AZBurger.productName+" 			가격: "+AZBurger.price+" 		갯수: "+AZBurger.amount);
		System.out.println("제품이름: "+bigBulgogi.productName+" 			가격: "+bigBulgogi.price+" 		갯수: "+bigBulgogi.amount);
		System.out.println("제품이름: "+hotCrispyBurger.productName+" 		가격: "+hotCrispyBurger.price+" 		갯수: "+hotCrispyBurger.amount);
		System.out.println("제품이름: "+hanwooBulgogi.productName+" 		가격: "+hanwooBulgogi.price+" 		갯수: "+hanwooBulgogi.amount);
		System.out.println("제품이름: "+bulgogiBurger.productName+" 		가격: "+bulgogiBurger.price+" 		갯수: "+bulgogiBurger.amount);
		System.out.println("제품이름: "+riaMiracleBurger.productName+" 		가격: "+riaMiracleBurger.price+" 		갯수: "+riaMiracleBurger.amount);
		System.out.println("제품이름: "+shrimpBurger.productName+"	 		가격: "+shrimpBurger.price+" 		갯수: "+shrimpBurger.amount);
		System.out.println("제품이름: "+chickenBurger.productName+" 			가격: "+chickenBurger.price+" 		갯수: "+chickenBurger.amount);
		System.out.println("제품이름: "+T_RexBurger.productName+" 			가격: "+T_RexBurger.price+" 		갯수: "+T_RexBurger.amount);
		System.out.println("제품이름: "+classicCheeseBurger.productName+" 		가격: "+classicCheeseBurger.price+" 		갯수: "+classicCheeseBurger.amount);
		System.out.println("제품이름: "+teriBurger.productName+" 			가격: "+teriBurger.price+" 		갯수: "+teriBurger.amount);
		
		//디저트 단품 출력
		System.out.println("");
		System.out.println("제품이름: "+cheeseInTheEgg.productName+" 		가격: "+cheeseInTheEgg.price+" 		갯수: "+cheeseInTheEgg.amount);
		System.out.println("제품이름: "+jipieHabanero_L.productName+" 		가격: "+jipieHabanero_L.price+" 		갯수: "+jipieHabanero_L.amount);
		System.out.println("제품이름: "+jipie_S.productName+" 		가격: "+jipie_S.price+" 		갯수: "+jipie_S.amount);
		System.out.println("제품이름: "+chickenNugget.productName+" 			가격: "+chickenNugget.price+" 		갯수: "+chickenNugget.amount);
		System.out.println("제품이름: "+longCheeseStick.productName+" 		가격: "+longCheeseStick.price+" 		갯수: "+longCheeseStick.amount);
		System.out.println("제품이름: "+coneSalad.productName+" 			가격: "+coneSalad.price+" 		갯수: "+coneSalad.amount);
		System.out.println("제품이름: "+sundayIceCream.productName+" 		가격: "+sundayIceCream.price+" 		갯수: "+sundayIceCream.amount);
		System.out.println("제품이름: "+shakeShakeChicken.productName+" 			가격: "+shakeShakeChicken.price+" 		갯수: "+shakeShakeChicken.amount);
		System.out.println("제품이름: "+seasoningPotato.productName+" 			가격: "+seasoningPotato.price+" 		갯수: "+seasoningPotato.amount);
		System.out.println("제품이름: "+squidRing.productName+"	 		가격: "+squidRing.price+" 		갯수: "+squidRing.amount);
		System.out.println("제품이름: "+naturalCheeseStick.productName+" 			가격: "+naturalCheeseStick.price+" 		갯수: "+naturalCheeseStick.amount);
		System.out.println("제품이름: "+chocoCookieTornado.productName+" 		가격: "+chocoCookieTornado.price+" 		갯수: "+chocoCookieTornado.amount);
		System.out.println("제품이름: "+greenTeaTornado.productName+" 		가격: "+greenTeaTornado.price+" 		갯수: "+greenTeaTornado.amount);
		System.out.println("제품이름: "+strawberryTornado.productName+" 	가격: "+strawberryTornado.price+" 		갯수: "+strawberryTornado.amount);
		System.out.println("제품이름: "+softCone.productName+" 			가격: "+softCone.price+" 		갯수: "+softCone.amount);
		
		//음료수 단품 출력
		System.out.println("");
		System.out.println("제품이름: "+cider.productName+" 			가격: "+cider.price+" 		갯수: "+cider.amount);
		System.out.println("제품이름: "+cola.productName+" 			가격: "+cola.price+" 		갯수: "+cola.amount);
		System.out.println("제품이름: "+americano.productName+" 			가격: "+americano.price+" 		갯수: "+americano.amount);
		System.out.println("제품이름: "+iceAmericano.productName+" 		가격: "+iceAmericano.price+" 		갯수: "+iceAmericano.amount);
		System.out.println("제품이름: "+caffeLatte.productName+" 			가격: "+caffeLatte.price+" 		갯수: "+caffeLatte.amount);
		System.out.println("제품이름: "+iceCaffeLatte.productName+" 		가격: "+iceCaffeLatte.price+" 		갯수: "+iceCaffeLatte.amount);	
		
		System.out.println("\n총 가격은: "+totalPrice);
		
		/*
		HamburgerSet wagyuEdition2Set = new HamburgerSet("와규 에디션2 세트",7600,1);
		HamburgerSet doubleX2Set = new HamburgerSet("더블X2 세트",7500,1);
		HamburgerSet AZBurgerSet = new HamburgerSet("AZ버거 세트",8300,1);
		HamburgerSet hanwooBulgogiCombo = new HamburgerSet("한우불고기 콤보",8000,1);
		HamburgerSet hanwooBulgogiBurgerSet = new HamburgerSet("한우불고기 세트",8700,1);
		HamburgerSet mozzarellaInTheBurgerSet= new HamburgerSet("모짜렐라 인 더 버거 세트",7700,1);
		HamburgerSet bigBulgogiSet = new HamburgerSet("원조 빅불 세트",7600,1);
		HamburgerSet hotCrispyBurgerSet = new HamburgerSet("핫크리스피버거 세트",6700,1);
		HamburgerSet bulgogiBurgerSet = new HamburgerSet("불고기버거 세트",5900,1);
		HamburgerSet riaMiracleBurgerSet = new HamburgerSet("리아미라클버거 세트",7400,1);
		HamburgerSet shrimpBurgerSet = new HamburgerSet("새우버거 세트",5900,1);
		HamburgerSet chickenBurgerSet = new HamburgerSet("치킨버거 세트",5100,1);
		HamburgerSet T_RexBurgerSet = new HamburgerSet("T-Rex 버거 세트",5900,1);
		HamburgerSet classicCheeseBurgerSet = new HamburgerSet("클래식 치즈 버거 세트",6400,1);
		HamburgerSet teriBurgerSet = new HamburgerSet("데리버거 세트",4900,1); 
		
		Burger wagyuEdition2 = new Burger("와규 에디션2",5800,1);
		Burger doubleX2 = new Burger("더블X2",5500,1);
		Burger mozzarellaInTheBurger = new Burger("모짤렐라 인 더 버거",6000,1);
		Burger AZBurger = new Burger("AZ버거",6600,1);
		Burger bigBulgogi = new Burger("원조빅불",5800,1);
		Burger hotCrispyBurger = new Burger("핫크리스피버거",4900,1);
		Burger hanwooBulgogi = new Burger("한우 불고기 버거",7000,1);
		Burger bulgogiBurger = new Burger("불고기 버거",3900,1);
		Burger riaMiracleBurger = new Burger("리아미라클버거",5600,1);
		Burger shrimpBurger = new Burger("새우버거",3900,1);
		Burger chickenBurger = new Burger("치킨버거",2900,1);
		Burger T_RexBurger = new Burger("T-Rex",3700,1);
		Burger classicCheeseBurger = new Burger("클래식 치즈버거",4400,1);
		Burger teriBurger = new Burger("데리버거",2500,1);
		
		Dessert cheeseInTheEgg = new Dessert("치즈인더에그",3000,1);
		Dessert jipieHabanero_L = new Dessert("지파이 하바네로",4300,1);
		Dessert jipie_S = new Dessert("지파이 고소한맛",3400,1);
		Dessert chickenNugget = new Dessert("치킨너겟",1200,1);
		Dessert longCheeseStick = new Dessert("롱 치즈스틱",1800,1);
		Dessert coneSalad= new Dessert("콘샐러드",1700,1);
		Dessert sundayIceCream = new Dessert("선데이아이스크림",1500,1);
		Dessert shakeShakeChicken = new Dessert("쉑쉑치킨",2500,1);
		Dessert seasoningPotato = new Dessert("양념감자",2000,1);
		Dessert squidRing = new Dessert("오징어링",2200,1);
		Dessert naturalCheeseStick = new Dessert("치즈스틱",2000,1);
		Dessert chocoCookieTornado = new Dessert("토네이도(초코쿠키)",2300,1);
		Dessert greenTeaTornado = new Dessert("토네이도(녹차)",2300,1);
		Dessert strawberryTornado = new Dessert("토네이도(스트로베리)",2400,1);
		Dessert softCone = new Dessert("소프트콘",700,1); 
		
		Drink cider = new Drink("사이다",1700,1);
		Drink cola = new Drink("콜라",1700,1);
		Drink americano = new Drink("아메리카노",2000,1);
		Drink iceAmericano = new Drink("아이스 아메리카노",2000,1);
		Drink caffeLatte = new Drink("카페라떼",2000,1);
		Drink iceCaffeLatte= new Drink("아이스카페라떼",2000,1);
		*/
		
		/*
		//+버튼을 누르면 갯수가 추가되게끔
		wagyuEdition2Set.amount++;
		doubleX2Set.amount++;		
		AZBurgerSet.amount++;
		hanwooBulgogiCombo.amount++;	
		hanwooBulgogiBurgerSet.amount++;
		mozzarellaInTheBurgerSet.amount++;
		bigBulgogiSet.amount++;
		//hotCrispyBurgerSet.amount++;
		bulgogiBurgerSet.amount++;
		riaMiracleBurgerSet.amount++;
		shrimpBurgerSet.amount++;
		chickenBurgerSet.amount++;
		T_RexBurgerSet.amount++;
		classicCheeseBurgerSet.amount++;
		teriBurgerSet.amount++;
		*/
		
		/*
		//-버튼을 누르면 갯수가 빼지게끔
		wagyuEdition2Set.amount--;
		doubleX2Set.amount--;		
		AZBurgerSet.amount--;
		hanwooBulgogiCombo.amount--;
		hanwooBulgogiBurgerSet.amount--;
		mozzarellaInTheBurgerSet.amount--;
		bigBulgogiSet.amount--;
		hotCrispyBurgerSet.amount--;
		bulgogiBurgerSet.amount--;
		riaMiracleBurgerSet.amount--;
		shrimpBurgerSet.amount--;
		chickenBurgerSet.amount--;
		T_RexBurgerSet.amount--;
		classicCheeseBurgerSet.amount--;
		teriBurgerSet.amount--; */
		
		/*
		//세트 샀을때 계산하는 메소드
		wagyuEdition2Set.buyHamburgerSet();
		doubleX2Set.buyHamburgerSet();		
		AZBurgerSet.buyHamburgerSet();	
		hanwooBulgogiCombo.buyHamburgerSet();	
		hanwooBulgogiBurgerSet.buyHamburgerSet();
		mozzarellaInTheBurgerSet.buyHamburgerSet();
		bigBulgogiSet.buyHamburgerSet();
		hotCrispyBurgerSet.buyHamburgerSet();
		bulgogiBurgerSet.buyHamburgerSet();
		riaMiracleBurgerSet.buyHamburgerSet();
		shrimpBurgerSet.buyHamburgerSet();
		chickenBurgerSet.buyHamburgerSet();
		T_RexBurgerSet.buyHamburgerSet();
		classicCheeseBurgerSet.buyHamburgerSet();
		teriBurgerSet.buyHamburgerSet();
		
		//햄버거 단품 샀을때 계산하는 메소드
		wagyuEdition2.buyBurger();
		doubleX2.buyBurger();
		mozzarellaInTheBurger.buyBurger();
		AZBurger.buyBurger();
		bigBulgogi.buyBurger();
		hotCrispyBurger.buyBurger();
		hanwooBulgogi.buyBurger();
		bulgogiBurger.buyBurger();
		riaMiracleBurger.buyBurger();
		shrimpBurger.buyBurger();
		chickenBurger.buyBurger();
		T_RexBurger.buyBurger();
		classicCheeseBurger.buyBurger();
		teriBurger.buyBurger();
		
		//디저트 단품 샀을때 계산하는 메소드
		cheeseInTheEgg.buyDessert();
		jipieHabanero_L.buyDessert();
		jipie_S.buyDessert();
		chickenNugget.buyDessert();
		longCheeseStick.buyDessert();
		coneSalad.buyDessert();
		sundayIceCream.buyDessert();
		shakeShakeChicken.buyDessert();
		seasoningPotato.buyDessert();
		squidRing.buyDessert();
		naturalCheeseStick.buyDessert();
		chocoCookieTornado.buyDessert();
		greenTeaTornado.buyDessert();
		strawberryTornado.buyDessert();
		softCone.buyDessert();
		
		//음료수 단품 샀을때 계산하는 메소드
		cider.buyDrink();
		cola.buyDrink();
		americano.buyDrink();
		iceAmericano.buyDrink();
		caffeLatte.buyDrink();
		iceCaffeLatte.buyDrink();
		
		*/
	}
}
