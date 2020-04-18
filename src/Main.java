
public class Main {

	static int totalPrice = 0;
	
	public static void main(String[] args) {
		
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

		
		//+버튼을 누르면 갯수가 추가되게끔
		//wagyuEdition2Set.amount++;
		doubleX2Set.amount++;		
		//AZBurgerSet.amount++;
		//hanwooBulgogiCombo.amount++;	
		hanwooBulgogiBurgerSet.amount++;
		//mozzarellaInTheBurgerSet.amount++;
		bigBulgogiSet.amount++;
		//hotCrispyBurgerSet.amount++;
		bulgogiBurgerSet.amount++;
		//riaMiracleBurgerSet.amount++;
		shrimpBurgerSet.amount++;
		//chickenBurgerSet.amount++;
		T_RexBurgerSet.amount++;
		//classicCheeseBurgerSet.amount++;
		teriBurgerSet.amount++;
		
		
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
		
		//샀을때 계산하는 메소드
		wagyuEdition2Set.buyHamburgerSet();
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
		System.out.println("구입하기를 눌렀습니다\n");
		
		//totalPrice = totalPrice+price;
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
		
		System.out.println("\n총 가격은: "+totalPrice);
	}
}
