import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JLabel firstScene = new JLabel();
	JPanel mainPurchaseScene = new JPanel();
	JPanel packagingDeliveringScene = new JPanel() {
		public void paintComponent(Graphics g) {
			Dimension d = getSize();
			ImageIcon image = new ImageIcon("./otherimages/empty.png");
			g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
		}
	};

	JPanel changeIngredientsScene = new JPanel();

	/*
	 * JPanel paymentCheckScene = new JPanel() { public void paintComponent(Graphics
	 * g) { Dimension d = getSize(); ImageIcon image = new
	 * ImageIcon("./otherimages/결제확인창.png"); g.drawImage(image.getImage(), 0, 0,
	 * d.width, d.height, this); } };
	 */

	// JLabel paymentCheckText = new JLabel();
	JPanel paymentCheckScene = new JPanel();
	JLabel paymentCheckSceneImage = new JLabel();
	JLabel paymentCheckList = new JLabel();
	JLabel cardPaymentSceneImage = new JLabel();
	JLabel insertCardImage = new JLabel();
	JButton isertCardButton = new JButton();
	JButton checkOKButton = new JButton();
	JButton checkCancelButton = new JButton();
	JButton[] ingerdientsMenuImages = new JButton[13];

	static JLabel checkTotalAmount = new JLabel();
	static JLabel checkTotalPrice = new JLabel();

	JButton ingerdientsNextPageButton = new JButton();
	JButton ingerdientsPreviousPageButton = new JButton();
	JButton ingerdientsDessertButton = new JButton();
	JButton ingerdientsDrinkButton = new JButton();

	int buyBurgerSetCount = 0;
	int selectIngerdientsCount = 0;
	String dessertSelect = "";
	String drinkSelect = "";

	JLabel pressKeyText = new JLabel();
	JButton packagingButton = new JButton();
	JButton deliveringButton = new JButton();
	JButton[] menuImages = new JButton[9];
	JButton nextPageButton = new JButton();
	JButton previousPageButton = new JButton();
	JButton goFirstScreenButton = new JButton();
	JButton cancelPageButton = new JButton();
	JButton paymentButton = new JButton();
	JButton hamburgerButton = new JButton();
	JButton hamburgerSetButton = new JButton();
	JButton drinkButton = new JButton();
	JButton dessertButton = new JButton();
	JLabel advertisingImage = new JLabel();
	static JLabel numberText = new JLabel();
	static JLabel amountText = new JLabel();
	JLabel totalOrderDetails = new JLabel();
	JLabel textBackGround = new JLabel();
	JLabel chooseEatingPlaceText = new JLabel();
	// JTextArea textArea = new JTextArea();

	JLabel numberChangeBackGround = new JLabel();
	JLabel howManyAddText = new JLabel();
	static JLabel howManyText = new JLabel();
	JButton oneThing = new JButton();
	JButton fiveThing = new JButton();
	JButton TenThing = new JButton();
	JButton checkButton = new JButton();// 확인버튼
	// JTextArea textArea = new JTextArea();
	static ArrayList<JLabel> OrderStatusText = new ArrayList<>();
	// static ArrayList<JLabel> OrderCheckText = new ArrayList<>();

	ArrayList<JButton> cancelButton = new ArrayList<>();
	ArrayList<JButton> quantityChangeButton = new ArrayList<>(); // 수량변경
	JLabel OrderStatusBackGround = new JLabel();

	static ArrayList<String> orderProductName = new ArrayList<String>(); // 주문한 제품 이름을 받는 배열
	static ArrayList<String> orderProduct = new ArrayList<String>(); // 주문한 제품 이름,갯수,가격을 받는 배열
	ArrayList<String> ingerdientsProductName = new ArrayList<String>();

	int menupage = 0;
	int menuHorizontalLength = 50;
	int menuVerticalLength = 0;
	int menuImageWidth = 150;
	int menuImageHeight = 130;
	int menuHorizontalInterval = 170;

	String hamburgerSet_dessert = "";
	String hamburgerSet_drink = "";

	int ingerdientsPage = 0; // 구성품 페이지
	int ingerdientsMenuHorizontalLength = 50;
	int ingerdientsMenuVerticalLength = 0;
	int ingerdientsMenuImageWidth = 100;
	int ingerdientsMenuImageHeight = 130;
	int ingerdientsMenuHorizontalInterval = 130;

	static int textNumber = 0;
	static int totalAmount = 0; // 주문 총 양
	static int totalPrice = 0; // 주문 총 금액
	// int amount = 0;
	int productNum = 0; // 제품의 수량을 변경할때 어떤 제품인지 판단하기 위한 변수

	String eatingPlace = "";// 매장에서 먹을 건지 포장 할 건지

	int OrderStatusVerticalLength = -40;

	changefirstScene changefirstScene = new changefirstScene(firstScene);

	// 세트메뉴
	Menu wagyuEdition2Set = new Menu("와규에디션2 세트", 7600, 1);
	Menu doubleX2Set = new Menu("더블X2 세트", 7500, 1);
	Menu AZBurgerSet = new Menu("AZ버거 세트", 8300, 1);
	Menu hanwooBulgogiCombo = new Menu("한우불고기 콤보", 8000, 1);
	Menu hanwooBulgogiBurgerSet = new Menu("한우불고기 세트", 8700, 1);
	Menu mozzarellaInTheBurgerSet = new Menu("모짜렐라 인 더 버거 세트", 7700, 1);
	Menu bigBulgogiSet = new Menu("원조빅불 세트", 7600, 1);
	Menu hotCrispyBurgerSet = new Menu("핫크리스피버거 세트", 6700, 1);
	Menu bulgogiBurgerSet = new Menu("불고기버거 세트", 5900, 1);
	Menu riaMiracleBurgerSet = new Menu("리아미라클버거 세트", 7400, 1);
	Menu shrimpBurgerSet = new Menu("새우버거 세트", 5900, 1);
	Menu chickenBurgerSet = new Menu("치킨버거 세트", 5100, 1);
	Menu T_RexBurgerSet = new Menu("T-Rex 버거 세트", 5900, 1);
	Menu classicCheeseBurgerSet = new Menu("클래식치즈버거 세트", 6400, 1);
	Menu teriBurgerSet = new Menu("데리버거 세트", 4900, 1);

	// 햄버거 메뉴
	Menu wagyuEdition2 = new Menu("와규에디션2", 5800, 1);
	Menu doubleX2 = new Menu("더블X2", 5500, 1);
	Menu mozzarellaInTheBurger = new Menu("모짤렐라 인 더 버거", 6000, 1);
	Menu AZBurger = new Menu("AZ버거", 6600, 1);
	Menu bigBulgogi = new Menu("원조빅불", 5800, 1);
	Menu hotCrispyBurger = new Menu("핫크리스피버거", 4900, 1);
	Menu hanwooBulgogi = new Menu("한우 불고기 버거", 7000, 1);
	Menu bulgogiBurger = new Menu("불고기 버거", 3900, 1);
	Menu riaMiracleBurger = new Menu("리아미라클버거", 5600, 1);
	Menu shrimpBurger = new Menu("새우버거", 3900, 1);
	Menu chickenBurger = new Menu("치킨버거", 2900, 1);
	Menu T_RexBurger = new Menu("T-Rex", 3700, 1);
	Menu classicCheeseBurger = new Menu("클래식 치즈버거", 4400, 1);
	Menu teriBurger = new Menu("데리버거", 2500, 1);

	// 디저트
	Menu cheeseInTheEgg = new Menu("치즈인더에그", 3000, 1);
	Menu jipieHabanero_L = new Menu("지파이 하바네로", 4300, 1);
	Menu jipie_S = new Menu("지파이 고소한맛", 3400, 1);
	Menu chickenNugget = new Menu("치킨너겟", 1200, 1);
	Menu longCheeseStick = new Menu("롱 치즈스틱", 1800, 1);
	Menu coneSalad = new Menu("콘샐러드", 1700, 1);
	Menu sundayIceCream = new Menu("선데이아이스크림", 1500, 1);
	Menu shakeShakeChicken = new Menu("쉑쉑치킨", 2500, 1);
	Menu seasoningPotato = new Menu("양념감자", 2000, 1);
	Menu squidRing = new Menu("오징어링", 2200, 1);
	Menu naturalCheeseStick = new Menu("치즈스틱", 2000, 1);
	Menu potato = new Menu("포테이토", 1500, 1);
	Menu chocoCookieTornado = new Menu("토네이도(초코쿠키)", 2300, 1);
	Menu greenTeaTornado = new Menu("토네이도(녹차)", 2300, 1);
	Menu strawberryTornado = new Menu("토네이도(스트로베리)", 2400, 1);
	Menu softCone = new Menu("소프트콘", 700, 1);

	// 음료수
	Menu cider = new Menu("사이다", 1700, 1);
	Menu cola = new Menu("콜라", 1700, 1);
	Menu americano = new Menu("아메리카노", 2000, 1);
	Menu iceAmericano = new Menu("아이스 아메리카노", 2000, 1);
	Menu caffeLatte = new Menu("카페라떼", 2000, 1);
	Menu iceCaffeLatte = new Menu("아이스카페라떼", 2000, 1);

	ChangeSetMenu changeSetMenu = new ChangeSetMenu();

	public Main() {

		frame = new JFrame();
		frame.setBounds(0, 0, 600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("hamburgerKiosk");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);

		firstScene.setBounds(0, 0, 600, 850);
		frame.getContentPane().add(firstScene);
		firstScene.setLayout(null);

		firstScene.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				firstScene.setVisible(false);
				packagingDeliveringScene.setVisible(true);
				isertCardButton.setEnabled(true);
				insertCardImage.setIcon(new ImageIcon("./otherimages/카드투입.png"));
				// restart = "";
			}
		});
/*
		// 세트메뉴
		Menu wagyuEdition2Set = new Menu("와규에디션2 세트", 7600, 1);
		Menu doubleX2Set = new Menu("더블X2 세트", 7500, 1);
		Menu AZBurgerSet = new Menu("AZ버거 세트", 8300, 1);
		Menu hanwooBulgogiCombo = new Menu("한우불고기 콤보", 8000, 1);
		Menu hanwooBulgogiBurgerSet = new Menu("한우불고기 세트", 8700, 1);
		Menu mozzarellaInTheBurgerSet = new Menu("모짜렐라 인 더 버거 세트", 7700, 1);
		Menu bigBulgogiSet = new Menu("원조빅불 세트", 7600, 1);
		Menu hotCrispyBurgerSet = new Menu("핫크리스피버거 세트", 6700, 1);
		Menu bulgogiBurgerSet = new Menu("불고기버거 세트", 5900, 1);
		Menu riaMiracleBurgerSet = new Menu("리아미라클버거 세트", 7400, 1);
		Menu shrimpBurgerSet = new Menu("새우버거 세트", 5900, 1);
		Menu chickenBurgerSet = new Menu("치킨버거 세트", 5100, 1);
		Menu T_RexBurgerSet = new Menu("T-Rex 버거 세트", 5900, 1);
		Menu classicCheeseBurgerSet = new Menu("클래식치즈버거 세트", 6400, 1);
		Menu teriBurgerSet = new Menu("데리버거 세트", 4900, 1);

		// 햄버거 메뉴
		Menu wagyuEdition2 = new Menu("와규에디션2", 5800, 1);
		Menu doubleX2 = new Menu("더블X2", 5500, 1);
		Menu mozzarellaInTheBurger = new Menu("모짜렐라 인 더 버거", 6000, 1);
		Menu AZBurger = new Menu("AZ버거", 6600, 1);
		Menu bigBulgogi = new Menu("원조빅불", 5800, 1);
		Menu hotCrispyBurger = new Menu("핫크리스피버거", 4900, 1);
		Menu hanwooBulgogi = new Menu("한우 불고기 버거", 7000, 1);
		Menu bulgogiBurger = new Menu("불고기 버거", 3900, 1);
		Menu riaMiracleBurger = new Menu("리아미라클버거", 5600, 1);
		Menu shrimpBurger = new Menu("새우버거", 3900, 1);
		Menu chickenBurger = new Menu("치킨버거", 2900, 1);
		Menu T_RexBurger = new Menu("T-Rex", 3700, 1);
		Menu classicCheeseBurger = new Menu("클래식 치즈버거", 4400, 1);
		Menu teriBurger = new Menu("데리버거", 2500, 1);

		// 디저트
		Menu cheeseInTheEgg = new Menu("치즈인더에그", 3000, 1);
		Menu jipieHabanero_L = new Menu("지파이 하바네로", 4300, 1);
		Menu jipie_S = new Menu("지파이 고소한맛", 3400, 1);
		Menu chickenNugget = new Menu("치킨너겟", 1200, 1);
		Menu longCheeseStick = new Menu("롱 치즈스틱", 1800, 1);
		Menu coneSalad = new Menu("콘샐러드", 1700, 1);
		Menu sundayIceCream = new Menu("선데이아이스크림", 1500, 1);
		Menu shakeShakeChicken = new Menu("쉑쉑치킨", 2500, 1);
		Menu seasoningPotato = new Menu("양념감자", 2000, 1);
		Menu squidRing = new Menu("오징어링", 2200, 1);
		Menu naturalCheeseStick = new Menu("치즈스틱", 2000, 1);
		Menu potato = new Menu("포테이토", 1500, 1);
		Menu chocoCookieTornado = new Menu("토네이도(초코쿠키)", 2300, 1);
		Menu greenTeaTornado = new Menu("토네이도(녹차)", 2300, 1);
		Menu strawberryTornado = new Menu("토네이도(스트로베리)", 2400, 1);
		Menu softCone = new Menu("소프트콘", 700, 1);

		// 음료수
		Menu cider = new Menu("사이다", 1700, 1);
		Menu cola = new Menu("콜라", 1700, 1);
		Menu americano = new Menu("아메리카노", 2000, 1);
		Menu iceAmericano = new Menu("아이스 아메리카노", 2000, 1);
		Menu caffeLatte = new Menu("카페라떼", 2000, 1);
		Menu iceCaffeLatte = new Menu("아이스카페라떼", 2000, 1);
*/
		JScrollPane scrollBar = new JScrollPane();
		scrollBar.setBounds(68, 201, 450, 200);
		scrollBar.getVerticalScrollBar().setValue(scrollBar.getVerticalScrollBar().getMaximum());
		paymentCheckSceneImage.add(scrollBar);

		JTextArea textArea = new JTextArea();
		scrollBar.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setVisible(false);
		textArea.setFont((new Font("굴림체", Font.BOLD, 15)));

		packagingDeliveringScene.setBounds(0, 0, 600, 850);
		frame.getContentPane().add(packagingDeliveringScene);
		packagingDeliveringScene.setLayout(null);
		packagingDeliveringScene.setVisible(false);

		numberChangeBackGround.setBounds(50, 300, 490, 190);
		numberChangeBackGround.setIcon(new ImageIcon("./otherimages/empty.png"));
		mainPurchaseScene.add(numberChangeBackGround);
		numberChangeBackGround.setVisible(false);

		mainPurchaseScene.setBounds(0, 0, 600, 850);
		frame.getContentPane().add(mainPurchaseScene);
		mainPurchaseScene.setLayout(null);
		mainPurchaseScene.setVisible(false);

		// 디저트 구성 교환 화면
		changeIngredientsScene.setBounds(0, 0, 600, 850);
		frame.getContentPane().add(mainPurchaseScene);
		mainPurchaseScene.setLayout(null);
		mainPurchaseScene.setVisible(false);

		// 처음 화면 (광고화면)
		pressKeyText.setBounds(0, 730, 600, 100);
		pressKeyText.setLayout(null);
		pressKeyText.setText("화면 터치해 주세요");
		pressKeyText.setHorizontalAlignment(SwingConstants.CENTER);
		pressKeyText.setFont(new Font("굴림", Font.BOLD, 30));
		pressKeyText.setForeground(Color.white);
		firstScene.add(pressKeyText);

		// 매장에서 먹을 것인지 포장인지 선택하는 방법
		chooseEatingPlaceText.setText("어디서 드시겠습니까?");
		chooseEatingPlaceText.setBounds(0, 150, 600, 100);
		chooseEatingPlaceText.setHorizontalAlignment(SwingConstants.CENTER);
		chooseEatingPlaceText.setFont(new Font("굴림", Font.BOLD, 30));
		packagingDeliveringScene.add(chooseEatingPlaceText);

		packagingButton.setBounds(320, 330, 150, 150);
		packagingButton.setIcon(new ImageIcon("./otherimages/delivery.jpg"));
		packagingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eatingPlace = "매장";

				packagingDeliveringScene.setVisible(false);
				mainPurchaseScene.setVisible(true);
				isertCardButton.setVisible(false);
			}
		});
		packagingDeliveringScene.add(packagingButton);

		deliveringButton.setBounds(110, 330, 150, 150);
		deliveringButton.setIcon(new ImageIcon("./otherimages/store.jpg"));
		deliveringButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eatingPlace = "포장";

				packagingDeliveringScene.setVisible(false);
				mainPurchaseScene.setVisible(true);
				isertCardButton.setVisible(false);
			}
		});
		packagingDeliveringScene.add(deliveringButton);

		// 구매화면
		advertisingImage.setBounds(0, 0, 600, 140);
		advertisingImage.setIcon(new ImageIcon("./otherimages/T-rax버거광고(구입창).jpg"));
		mainPurchaseScene.add(advertisingImage);

		hamburgerSetButton.setBounds(90, 150, 100, 40);
		hamburgerSetButton.setText("햄버거 세트");
		hamburgerSetButton.setFont(new Font("굴림", Font.BOLD, 10));
		hamburgerSetButton.setBackground(Color.gray);
		hamburgerSetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamburgerSetButton.setBackground(Color.gray);
				hamburgerButton.setBackground(Color.white);
				drinkButton.setBackground(Color.white);
				dessertButton.setBackground(Color.white);

				menupage = 0;
				changeMenu();
			}
		});
		mainPurchaseScene.add(hamburgerSetButton);

		hamburgerButton.setBounds(190, 150, 100, 40);
		hamburgerButton.setText("햄버거");
		hamburgerButton.setFont(new Font("굴림", Font.BOLD, 10));
		hamburgerButton.setBackground(Color.white);
		hamburgerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamburgerSetButton.setBackground(Color.white);
				hamburgerButton.setBackground(Color.gray);
				drinkButton.setBackground(Color.white);
				dessertButton.setBackground(Color.white);

				menupage = 2;
				changeMenu();
			}
		});
		mainPurchaseScene.add(hamburgerButton);

		dessertButton.setBounds(290, 150, 100, 40);
		dessertButton.setText("디저트");
		dessertButton.setFont(new Font("굴림", Font.BOLD, 10));
		dessertButton.setBackground(Color.white);
		dessertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamburgerSetButton.setBackground(Color.white);
				hamburgerButton.setBackground(Color.white);
				drinkButton.setBackground(Color.white);
				dessertButton.setBackground(Color.gray);

				menupage = 4;
				changeMenu();
			}
		});
		mainPurchaseScene.add(dessertButton);

		drinkButton.setBounds(390, 150, 100, 40);
		drinkButton.setText("음료");
		drinkButton.setFont(new Font("굴림", Font.BOLD, 10));
		drinkButton.setBackground(Color.white);
		drinkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hamburgerSetButton.setBackground(Color.white);
				hamburgerButton.setBackground(Color.white);
				drinkButton.setBackground(Color.gray);
				dessertButton.setBackground(Color.white);

				menupage = 6;
				changeMenu();
			}
		});
		mainPurchaseScene.add(drinkButton);

		goFirstScreenButton.setBounds(110, 750, 100, 40);
		goFirstScreenButton.setText("첫화면으로");
		goFirstScreenButton.setFont(new Font("굴림", Font.BOLD, 10));
		goFirstScreenButton.setBackground(Color.LIGHT_GRAY);
		goFirstScreenButton.setBorderPainted(false);
		goFirstScreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstScene.setVisible(true);
				mainPurchaseScene.setVisible(false);

				for (int i = 0; i < OrderStatusText.size(); i++) {
					OrderStatusText.get(i).setLocation(1000, 1000);
					cancelButton.get(i).setLocation(1000, 1000);
					quantityChangeButton.get(i).setLocation(1000, 1000);
					// OrderStatusText.remove(i);
				}

				OrderStatusText.clear();
				textNumber = 0;
				OrderStatusVerticalLength = -40;
				eatingPlace = "";

				orderProductName.clear();
				totalAmount = 0;
				totalPrice = 0;
				numberText.setText(totalAmount + "개");
				amountText.setText(totalPrice + "원");

				checkTotalAmount.setText("총 개수 : +totalAmount+ 개");
				checkTotalPrice.setText("총  +totalPrice 원");

				dessertSelect = "";
				drinkSelect = "";
				selectIngerdientsCount = 0;
				buyBurgerSetCount = 0;

				System.out.println(OrderStatusText.size());
				System.out.println(orderProductName.toString());

				textArea.selectAll();
				textArea.replaceSelection("");

			}
		});
		mainPurchaseScene.add(goFirstScreenButton);

		cancelPageButton.setBounds(247, 750, 100, 40);
		cancelPageButton.setText("취소하기");
		cancelPageButton.setFont(new Font("굴림", Font.BOLD, 10));
		cancelPageButton.setBackground(Color.LIGHT_GRAY);
		cancelPageButton.setBorderPainted(false);
		cancelPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 세트메뉴 고르다 취소하기 누를시 세트메뉴 추가구성 페이지에서 메인구메창으로 바꿈
				for (int i = 0; i < menuImages.length; i++) {
					menuImages[i].setVisible(true);
				}

				for (int i = 0; i < ingerdientsMenuImages.length; i++) {
					ingerdientsMenuImages[i].setVisible(false);
				}

				hamburgerSetButton.setVisible(true);
				hamburgerButton.setVisible(true);
				drinkButton.setVisible(true);
				dessertButton.setVisible(true);
				nextPageButton.setVisible(true);
				previousPageButton.setVisible(true);

				changeIngredientsScene.setVisible(false);
				ingerdientsNextPageButton.setVisible(false);
				ingerdientsPreviousPageButton.setVisible(false);
				ingerdientsDessertButton.setVisible(false);
				ingerdientsDrinkButton.setVisible(false);

				for (int i = 0; i < OrderStatusText.size(); i++) {
					OrderStatusText.get(i).setLocation(1000, 1000);
					cancelButton.get(i).setLocation(1000, 1000);
					quantityChangeButton.get(i).setLocation(1000, 1000);
					// OrderStatusText.remove(i);

					textNumber = 0;
				}

				OrderStatusText.clear();
				textNumber = 0;
				OrderStatusVerticalLength = -40;

				orderProductName.clear();
				totalAmount = 0;
				totalPrice = 0;
				numberText.setText(totalAmount + "개");
				amountText.setText(totalPrice + "원");
				checkTotalAmount.setText("총 개수 : +totalAmount+ 개");
				checkTotalPrice.setText("총  +totalPrice 원");

				System.out.println(orderProductName.toString());
				System.out.println("전체 취소했습니다.");
			}
		});
		mainPurchaseScene.add(cancelPageButton);

		/*
		 * JScrollPane scrollBar = new JScrollPane(); scrollBar.setBounds(68, 201, 450,
		 * 200);
		 * scrollBar.getVerticalScrollBar().setValue(scrollBar.getVerticalScrollBar().
		 * getMaximum()); paymentCheckSceneImage.add(scrollBar);
		 * 
		 * JTextArea textArea = new JTextArea(); scrollBar.setViewportView(textArea);
		 * textArea.setEditable(false); textArea.setVisible(false);
		 * textArea.setFont((new Font("굴림체", Font.BOLD, 15)));
		 */

		paymentButton.setBounds(385, 750, 100, 40);
		paymentButton.setText("결제하기");
		paymentButton.setFont(new Font("굴림", Font.BOLD, 10));
		paymentButton.setBackground(Color.LIGHT_GRAY);
		paymentButton.setBorderPainted(false);
		paymentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// paymentCheckSceneImage.setVisible(true);

				if (selectIngerdientsCount == buyBurgerSetCount) {
					mainPurchaseScene.setVisible(false);
					// cardPaymentSceneImage.setVisible(true);
					paymentCheckScene.setVisible(true);
					isertCardButton.setVisible(true);
					// 결제확인 창에 출력됌
					textArea.setVisible(true);

					for (int i = 0; i < orderProduct.size(); i++) {
						textArea.append(orderProduct.get(i) + "\n");
						System.out.println(orderProduct.get(i) + "\n");
					}
					System.out.println("버거선택횟수" + buyBurgerSetCount);
					System.out.println("추가구성세트 선택 횟수" + selectIngerdientsCount);
				} else {
					JOptionPane.showMessageDialog(frame, "세트 구성품을 선택하지 않았습니다.", "SYSTEM",
							JOptionPane.INFORMATION_MESSAGE);
					System.out.println("버거선택횟수" + buyBurgerSetCount);
					System.out.println("추가구성세트 선택 횟수" + selectIngerdientsCount);
				}
			}
		});
		mainPurchaseScene.add(paymentButton);

		nextPageButton.setBounds(537, 360, 50, 80);
		nextPageButton.setBorderPainted(false);
		nextPageButton.setContentAreaFilled(false);
		nextPageButton.setFocusPainted(false);
		nextPageButton.setIcon(new ImageIcon("./otherimages/nextButton.png"));
		nextPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (menupage < 6) {

					menupage++;
					changeMenu();

					if (menupage == 0 || menupage == 1) {
						hamburgerSetButton.setBackground(Color.gray);
						hamburgerButton.setBackground(Color.white);
						drinkButton.setBackground(Color.white);
						dessertButton.setBackground(Color.white);

					} else if (menupage == 2 || menupage == 3) {
						hamburgerSetButton.setBackground(Color.white);
						hamburgerButton.setBackground(Color.gray);
						drinkButton.setBackground(Color.white);
						dessertButton.setBackground(Color.white);

					} else if (menupage == 4 || menupage == 5) {
						hamburgerSetButton.setBackground(Color.white);
						hamburgerButton.setBackground(Color.white);
						drinkButton.setBackground(Color.white);
						dessertButton.setBackground(Color.gray);

					} else if (menupage == 6) {
						hamburgerSetButton.setBackground(Color.white);
						hamburgerButton.setBackground(Color.white);
						drinkButton.setBackground(Color.gray);
						dessertButton.setBackground(Color.white);

					}
				}
			}
		});
		mainPurchaseScene.add(nextPageButton);

		previousPageButton.setBounds(3, 360, 50, 80);
		previousPageButton.setBorderPainted(false);
		previousPageButton.setContentAreaFilled(false);
		previousPageButton.setFocusPainted(false);
		previousPageButton.setIcon(new ImageIcon("./otherimages/previousButton.png"));
		previousPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (menupage > 0) {

					menupage--;
					changeMenu();

					if (menupage == 0 || menupage == 1) {
						hamburgerSetButton.setBackground(Color.gray);
						hamburgerButton.setBackground(Color.white);
						drinkButton.setBackground(Color.white);
						dessertButton.setBackground(Color.white);

					} else if (menupage == 2 || menupage == 3) {
						hamburgerSetButton.setBackground(Color.white);
						hamburgerButton.setBackground(Color.gray);
						drinkButton.setBackground(Color.white);
						dessertButton.setBackground(Color.white);

					} else if (menupage == 4 || menupage == 5) {
						hamburgerSetButton.setBackground(Color.white);
						hamburgerButton.setBackground(Color.white);
						drinkButton.setBackground(Color.white);
						dessertButton.setBackground(Color.gray);

					} else if (menupage == 6) {
						hamburgerSetButton.setBackground(Color.white);
						hamburgerButton.setBackground(Color.white);
						drinkButton.setBackground(Color.gray);
						dessertButton.setBackground(Color.white);
					}
				}
			}
		});
		mainPurchaseScene.add(previousPageButton);

		// 세트 구성관련 코드들
		ingerdientsPreviousPageButton.setBounds(3, 360, 50, 80);
		ingerdientsPreviousPageButton.setBorderPainted(false);
		ingerdientsPreviousPageButton.setContentAreaFilled(false);
		ingerdientsPreviousPageButton.setFocusPainted(false);
		ingerdientsPreviousPageButton.setIcon(new ImageIcon("./otherimages/previousButton.png"));
		ingerdientsPreviousPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("디저트 페이지 출력");
				if (ingerdientsPage > 0) {

					ingerdientsPage--;
					changeIngerdientsMenu();

					if (ingerdientsPage == 0) {
						ingerdientsDessertButton.setBackground(Color.gray);
						ingerdientsDrinkButton.setBackground(Color.white);
						System.out.println("디저트 페이지 출력");
					} else if (ingerdientsPage == 1) {
						ingerdientsDessertButton.setBackground(Color.white);
						ingerdientsDrinkButton.setBackground(Color.gray);
						System.out.println("드렁크 페이지 출력");
					}
				}
			}
		});
		mainPurchaseScene.add(ingerdientsPreviousPageButton);

		ingerdientsDessertButton.setBounds(90, 150, 100, 40);
		ingerdientsDessertButton.setText("세트_디저트");
		ingerdientsDessertButton.setFont(new Font("굴림", Font.BOLD, 10));
		ingerdientsDessertButton.setBackground(Color.gray);
		ingerdientsDessertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingerdientsDessertButton.setBackground(Color.gray);
				ingerdientsDrinkButton.setBackground(Color.white);

				ingerdientsPage = 0;
				changeIngerdientsMenu();
			}
		});
		mainPurchaseScene.add(ingerdientsDessertButton);

		ingerdientsDrinkButton.setBounds(190, 150, 100, 40);
		ingerdientsDrinkButton.setText("세트_드링크");
		ingerdientsDrinkButton.setFont(new Font("굴림", Font.BOLD, 10));
		ingerdientsDrinkButton.setBackground(Color.white);
		ingerdientsDrinkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (dessertSelect != "") {
					ingerdientsDessertButton.setBackground(Color.white);
					ingerdientsDrinkButton.setBackground(Color.gray);

					ingerdientsPage = 1;
					changeIngerdientsMenu();
				} else {
					JOptionPane.showMessageDialog(frame, "세트_디저트 부터 선택하세요.", "SYSTEM", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		mainPurchaseScene.add(ingerdientsDrinkButton);

		ingerdientsNextPageButton.setBounds(537, 360, 50, 80);
		ingerdientsNextPageButton.setBorderPainted(false);
		ingerdientsNextPageButton.setContentAreaFilled(false);
		ingerdientsNextPageButton.setFocusPainted(false);
		ingerdientsNextPageButton.setIcon(new ImageIcon("./otherimages/nextButton.png"));
		ingerdientsNextPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("드링크 페이지 출력");

				if (dessertSelect != "") {
					if (ingerdientsPage < 2) {

						ingerdientsPage++;
						changeIngerdientsMenu();

						if (ingerdientsPage == 0) {
							ingerdientsDessertButton.setBackground(Color.gray);
							ingerdientsDrinkButton.setBackground(Color.white);
							System.out.println("디저트 페이지 출력");
						} else if (ingerdientsPage == 1) {
							ingerdientsDessertButton.setBackground(Color.white);
							ingerdientsDrinkButton.setBackground(Color.gray);
							System.out.println("드렁크 페이지 출력");
						}
					}
				} else {
					JOptionPane.showMessageDialog(frame, "세트_디저트 부터 선택하세요.", "SYSTEM", JOptionPane.INFORMATION_MESSAGE);
				}
				/*
				 * if (ingerdientsPage < 2) {
				 * 
				 * ingerdientsPage++; changeIngerdientsMenu();
				 * 
				 * if (ingerdientsPage == 0) {
				 * ingerdientsDessertButton.setBackground(Color.gray);
				 * ingerdientsDrinkButton.setBackground(Color.white);
				 * System.out.println("디저트 페이지 출력"); } else if (ingerdientsPage == 1) {
				 * ingerdientsDessertButton.setBackground(Color.white);
				 * ingerdientsDrinkButton.setBackground(Color.gray);
				 * System.out.println("드렁크 페이지 출력"); } }
				 */
			}
		});
		mainPurchaseScene.add(ingerdientsNextPageButton);

		for (int i = 0; i < menuImages.length; i++) {
			mainPurchaseScene.add(menuImages[i] = new JButton());

			menuImages[i].setHorizontalAlignment(SwingConstants.CENTER);

			if (i < 3) {
				menuVerticalLength = 190;
				menuImages[i].setBounds(menuHorizontalLength, menuVerticalLength, menuImageWidth, menuImageHeight);

			} else if ((i >= 3) && (i < 6)) {
				menuVerticalLength = 330;
				menuImages[i].setBounds(menuHorizontalLength, menuVerticalLength, menuImageWidth, menuImageHeight);

			} else if ((i >= 6) && (i < 9)) {
				menuVerticalLength = 470;
				menuImages[i].setBounds(menuHorizontalLength, menuVerticalLength, menuImageWidth, menuImageHeight);

			}

			menuHorizontalLength = menuHorizontalInterval + menuHorizontalLength;

			if ((i + 1) % 3 == 0) {
				menuHorizontalLength = 50;
			}

			menuImages[i].setBorderPainted(false);
			menuImages[i].setContentAreaFilled(false);
			menuImages[i].setFocusPainted(false);
		}

		// 세트 구성
		for (int i = 0; i < ingerdientsMenuImages.length; i++) {
			mainPurchaseScene.add(ingerdientsMenuImages[i] = new JButton());

			ingerdientsMenuImages[i].setHorizontalAlignment(SwingConstants.CENTER);

			if (i < 4) {
				ingerdientsMenuVerticalLength = 190;
				ingerdientsMenuImages[i].setBounds(ingerdientsMenuHorizontalLength, ingerdientsMenuVerticalLength,
						ingerdientsMenuImageWidth, ingerdientsMenuImageHeight);

			} else if ((i >= 4) && (i < 8)) {
				ingerdientsMenuVerticalLength = 330;
				ingerdientsMenuImages[i].setBounds(ingerdientsMenuHorizontalLength, ingerdientsMenuVerticalLength,
						ingerdientsMenuImageWidth, ingerdientsMenuImageHeight);

			} else if ((i >= 8) && (i < 12)) {
				ingerdientsMenuVerticalLength = 470;
				ingerdientsMenuImages[i].setBounds(ingerdientsMenuHorizontalLength, ingerdientsMenuVerticalLength,
						ingerdientsMenuImageWidth, ingerdientsMenuImageHeight);

			}

			ingerdientsMenuHorizontalLength = ingerdientsMenuHorizontalInterval + ingerdientsMenuHorizontalLength;

			if ((i + 1) % 4 == 0) {
				ingerdientsMenuHorizontalLength = 50;
			}

			ingerdientsMenuImages[i].setBorderPainted(false);
			ingerdientsMenuImages[i].setContentAreaFilled(false);
			ingerdientsMenuImages[i].setFocusPainted(false);
		}

		totalOrderDetails.setBounds(90, 570, 200, 100);
		totalOrderDetails.setText("총주문내역");
		totalOrderDetails.setHorizontalAlignment(SwingConstants.CENTER);
		totalOrderDetails.setFont(new Font("굴림", Font.BOLD, 15));
		mainPurchaseScene.add(totalOrderDetails);

		numberText.setBounds(210, 570, 200, 100);
		numberText.setText("0개");
		numberText.setHorizontalAlignment(SwingConstants.CENTER);
		numberText.setFont(new Font("굴림", Font.BOLD, 15));
		mainPurchaseScene.add(numberText);

		amountText.setBounds(320, 570, 200, 100);
		amountText.setText("0원");
		amountText.setHorizontalAlignment(SwingConstants.CENTER);
		amountText.setFont(new Font("굴림", Font.BOLD, 15));
		mainPurchaseScene.add(amountText);

		textBackGround.setBounds(50, 607, 490, 20);
		textBackGround.setIcon(new ImageIcon("./otherimages/empty.png"));
		mainPurchaseScene.add(textBackGround);
		/*
		 * textArea.setFont((new Font("굴림체", Font.BOLD, 15))); textArea.setBounds(50,
		 * 630, 490, 110); mainPurchaseScene.add(textArea);
		 */

		// 메뉴 버튼을 누르면 선택한 메뉴들이 주문내역에 출력된다
		for (int i = 0; i < menuImages.length; i++) {
			menuImages[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					OrderStatusText.add(new JLabel());
					cancelButton.add(new JButton());
					quantityChangeButton.add(new JButton());

					for (int i = 0; i < menuImages.length; i++) {
						if (e.getSource() == menuImages[i]) {
							if (menupage == 0) {
								if (i == 0) {
									changeIngredientsScene();
									doubleX2Set.buy();
									// changeSetMenu.changeSetMenu(doubleX2Set , hamburgerSet_drink,
									// hamburgerSet_dessert);
								} else if (i == 1) {
									changeIngredientsScene();
									wagyuEdition2Set.buy();
								} else if (i == 2) {
									changeIngredientsScene();
									AZBurgerSet.buy();
								} else if (i == 3) {
									changeIngredientsScene();
									hanwooBulgogiCombo.buy();
								} else if (i == 4) {
									changeIngredientsScene();
									hanwooBulgogiBurgerSet.buy();
								} else if (i == 5) {
									changeIngredientsScene();
									mozzarellaInTheBurgerSet.buy();
								} else if (i == 6) {
									changeIngredientsScene();
									bigBulgogiSet.buy();
								} else if (i == 7) {
									changeIngredientsScene();
									hotCrispyBurgerSet.buy();
								} else if (i == 8) {
									changeIngredientsScene();
									bulgogiBurgerSet.buy();
								}
							} else if (menupage == 1) {
								if (i == 0) {
									changeIngredientsScene();
									riaMiracleBurgerSet.buy();
								} else if (i == 1) {
									changeIngredientsScene();
									shrimpBurgerSet.buy();
								} else if (i == 2) {
									changeIngredientsScene();
									chickenBurgerSet.buy();
								} else if (i == 3) {
									changeIngredientsScene();
									T_RexBurgerSet.buy();
								} else if (i == 4) {
									changeIngredientsScene();
									classicCheeseBurgerSet.buy();
								} else if (i == 5) {
									changeIngredientsScene();
									teriBurgerSet.buy();
								}
							} else if (menupage == 2) {
								if (i == 0) {
									wagyuEdition2.buy();
								} else if (i == 1) {
									doubleX2.buy();
								} else if (i == 2) {
									mozzarellaInTheBurger.buy();
								} else if (i == 3) {
									AZBurger.buy();
								} else if (i == 4) {
									bigBulgogi.buy();
								} else if (i == 5) {
									hotCrispyBurger.buy();
								} else if (i == 6) {
									hanwooBulgogi.buy();
								} else if (i == 7) {
									riaMiracleBurger.buy();
								} else if (i == 8) {
									shrimpBurger.buy();
								}
							} else if (menupage == 3) {
								if (i == 0) {
									chickenBurger.buy();
								} else if (i == 1) {
									T_RexBurger.buy();
								} else if (i == 2) {
									classicCheeseBurger.buy();
								} else if (i == 3) {
									teriBurger.buy();
								}
							} else if (menupage == 4) {
								if (i == 0) {
									cheeseInTheEgg.buy();
								} else if (i == 1) {
									jipieHabanero_L.buy();
								} else if (i == 2) {
									jipie_S.buy();
								} else if (i == 3) {
									chickenNugget.buy();
								} else if (i == 4) {
									longCheeseStick.buy();
								} else if (i == 5) {
									coneSalad.buy();
								} else if (i == 6) {
									sundayIceCream.buy();
								} else if (i == 7) {
									shakeShakeChicken.buy();
								} else if (i == 8) {
									seasoningPotato.buy();
								}
							} else if (menupage == 5) {
								if (i == 0) {
									squidRing.buy();
								} else if (i == 1) {
									naturalCheeseStick.buy();
								} else if (i == 2) {
									potato.buy();
								} else if (i == 3) {
									chocoCookieTornado.buy();
								} else if (i == 4) {
									greenTeaTornado.buy();
								} else if (i == 5) {
									strawberryTornado.buy();
								} else if (i == 6) {
									softCone.buy();
								}
							} else if (menupage == 6) {
								if (i == 0) {
									iceAmericano.buy();
								} else if (i == 1) {
									cider.buy();
								} else if (i == 2) {
									cola.buy();
								} else if (i == 3) {
									americano.buy();
								} else if (i == 4) {
									caffeLatte.buy();
								} else if (i == 5) {
									iceCaffeLatte.buy();
								}
							}
						}
					}

					// OrderStatusText.get(textNumber).setText("AZ버거 1개 6300원");
					OrderStatusText.get(textNumber).setFont((new Font("굴림체", Font.BOLD, 15)));

					cancelButton.get(textNumber).setIcon(new ImageIcon("./otherimages/cancel.jpg"));
					quantityChangeButton.get(textNumber).setIcon(new ImageIcon("./otherimages/plus.jpg"));

					OrderStatusBackGround.add(OrderStatusText.get(textNumber));
					OrderStatusBackGround.add(cancelButton.get(textNumber));
					OrderStatusBackGround.add(quantityChangeButton.get(textNumber));

					OrderStatusVerticalLength = -40;
					if (textNumber != 0) {
						for (int i = 0; i < textNumber; i++) {
							OrderStatusVerticalLength = OrderStatusVerticalLength + 20;
						}
					}
					System.out.println("textNumber" + textNumber);
					System.out.println(OrderStatusVerticalLength);

					OrderStatusText.get(textNumber).setBounds(5, OrderStatusVerticalLength, 490, 110);
					cancelButton.get(textNumber).setBounds(400, OrderStatusVerticalLength + 43, 20, 20);
					quantityChangeButton.get(textNumber).setBounds(350, OrderStatusVerticalLength + 43, 20, 20);

					textNumber++;

					for (int i = 0; i < OrderStatusText.size(); i++) {
						cancelButton.get(i).addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								for (int i = 0; i < OrderStatusText.size(); i++) {
									if (e.getSource() == cancelButton.get(i)) {
										OrderStatusText.get(i).setLocation(1000, 1000);
										cancelButton.get(i).setLocation(1000, 1000);
										quantityChangeButton.get(i).setLocation(1000, 1000);

										OrderStatusText.remove(i);
										cancelButton.remove(i);
										quantityChangeButton.remove(i);

										textNumber--;

										if (OrderStatusText.size() == 0) {

										} else {
											for (int j = 0; j < OrderStatusText.size(); j++) {
												if (i + j < OrderStatusText.size()) {
													OrderStatusText.get(i + j).setLocation(
															OrderStatusText.get(i + j).getX(),
															OrderStatusText.get(i + j).getY() - 20);
													cancelButton.get(i + j).setLocation(cancelButton.get(i + j).getX(),
															cancelButton.get(i + j).getY() - 20);
													quantityChangeButton.get(i + j).setLocation(
															quantityChangeButton.get(i + j).getX(),
															quantityChangeButton.get(i + j).getY() - 20);
												}
											}
										}

										System.out.println("삭제했습니다.");
										System.out.print("판매할 ");

										// 햄버거 세트 삭제 기능

										if (orderProductName.get(i).equals(doubleX2Set.productName)) {
											doubleX2Set.cancel();
											break;

										} else if (orderProductName.get(i).equals(wagyuEdition2Set.productName)) {
											wagyuEdition2Set.cancel();
											break;

										} else if (orderProductName.get(i).equals(AZBurgerSet.productName)) {
											AZBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(hanwooBulgogiCombo.productName)) {
											hanwooBulgogiCombo.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(hanwooBulgogiBurgerSet.productName)) {
											hanwooBulgogiBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(mozzarellaInTheBurgerSet.productName)) {
											mozzarellaInTheBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(bigBulgogiSet.productName)) {
											bigBulgogiSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(hotCrispyBurgerSet.productName)) {
											hotCrispyBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(bulgogiBurgerSet.productName)) {
											bulgogiBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(riaMiracleBurgerSet.productName)) {
											riaMiracleBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(shrimpBurgerSet.productName)) {
											shrimpBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(chickenBurgerSet.productName)) {
											chickenBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(T_RexBurgerSet.productName)) {
											T_RexBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(classicCheeseBurgerSet.productName)) {
											classicCheeseBurgerSet.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(teriBurgerSet.productName)) {
											teriBurgerSet.cancel();
											break;
										}

										// 햄버거 삭제 기능
										else if (orderProductName.get(i).equals(wagyuEdition2.productName)) {
											wagyuEdition2.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(doubleX2.productName)) {
											doubleX2.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(mozzarellaInTheBurger.productName)) {
											mozzarellaInTheBurger.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(AZBurger.productName)) {
											AZBurger.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(bigBulgogi.productName)) {
											bigBulgogi.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(hotCrispyBurger.productName)) {
											hotCrispyBurger.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(hanwooBulgogi.productName)) {
											hanwooBulgogi.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(riaMiracleBurger.productName)) {
											riaMiracleBurger.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(shrimpBurger.productName)) {
											shrimpBurger.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(chickenBurger.productName)) {
											chickenBurger.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(T_RexBurger.productName)) {
											T_RexBurger.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(classicCheeseBurger.productName)) {
											classicCheeseBurger.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(teriBurger.productName)) {
											teriBurger.cancel();
											break;
										}

										// 디저트 삭제 기능
										else if (orderProductName.get(i).equals(cheeseInTheEgg.productName)) {
											cheeseInTheEgg.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(jipieHabanero_L.productName)) {
											jipieHabanero_L.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(jipie_S.productName)) {
											jipie_S.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(chickenNugget.productName)) {
											chickenNugget.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(longCheeseStick.productName)) {
											longCheeseStick.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(coneSalad.productName)) {
											coneSalad.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(sundayIceCream.productName)) {
											sundayIceCream.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(shakeShakeChicken.productName)) {
											shakeShakeChicken.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(seasoningPotato.productName)) {
											seasoningPotato.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(squidRing.productName)) {
											squidRing.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(naturalCheeseStick.productName)) {
											naturalCheeseStick.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(potato.productName)) {
											potato.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(chocoCookieTornado.productName)) {
											chocoCookieTornado.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(greenTeaTornado.productName)) {
											greenTeaTornado.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(strawberryTornado.productName)) {
											strawberryTornado.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(softCone.productName)) {
											softCone.cancel();
											break;
										}

										// 드링크 삭제 기능
										else if (orderProductName.get(i).equals(iceAmericano.productName)) {
											iceAmericano.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(cider.productName)) {
											cider.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(cola.productName)) {
											cola.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(americano.productName)) {
											americano.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(caffeLatte.productName)) {
											caffeLatte.cancel();
											break;
										}

										else if (orderProductName.get(i).equals(iceCaffeLatte.productName)) {
											iceCaffeLatte.cancel();
											break;
										}
									}
								}
							}
						});

						quantityChangeButton.get(i).addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								for (int i = 0; i < OrderStatusText.size(); i++) {
									if (e.getSource() == quantityChangeButton.get(i)) {
										numberChangeBackGround.setVisible(true);
										howManyText.setText("현재  : 1 개");
										productNum = i;
									}
								}
							}
						});
					}

				}
			});
		}

		// 세트메뉴 추가 버튼
		for (int i = 0; i < ingerdientsMenuImages.length; i++) {
			ingerdientsMenuImages[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					for (int j = 0; j < ingerdientsMenuImages.length; j++) {
						if (e.getSource() == ingerdientsMenuImages[j]) {
							if (ingerdientsPage == 0) {
								if (j == 0) {
									System.out.println("포테이토");
									ingerdientsNextPage();
									ingerdientsProductName.add("포테이토");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "포테이토 선택완료";
								} else if (j == 1) {
									System.out.println("콘샐러드");
									ingerdientsNextPage();
									ingerdientsProductName.add("콘샐러드");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "콘샐러드 선택완료";
								} else if (j == 2) {
									System.out.println("롱치즈스틱");
									ingerdientsNextPage();
									ingerdientsProductName.add("롱치즈스틱");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "롱치즈스틱 선택완료";
								} else if (j == 3) {
									System.out.println("양념감자");
									ingerdientsNextPage();
									ingerdientsProductName.add("양념감자");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "양념감자 선택완료";
								} else if (j == 4) {
									System.out.println("오징어링");
									ingerdientsNextPage();
									ingerdientsProductName.add("오징어링");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "오징어링 선택완료";
								} else if (j == 5) {
									System.out.println("치즈스틱");
									ingerdientsNextPage();
									ingerdientsProductName.add("치즈스틱");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "치즈스틱 선택완료";
								} else if (j == 6) {
									System.out.println("지파이 고소한맛");
									ingerdientsNextPage();
									ingerdientsProductName.add("지파이 고소한맛");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "지파이 고소한맛 선택완료";
								} else if (j == 7) {
									System.out.println("지파이 하바네로");
									ingerdientsNextPage();
									ingerdientsProductName.add("지파이 하바네로");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "지파이 하바네로 선택완료";
								} else if (j == 8) {
									System.out.println("쉑쉑치킨");
									ingerdientsNextPage();
									ingerdientsProductName.add("쉑쉑치킨");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "쉑쉑치킨 선택완료";
								} else if (j == 9) {
									System.out.println("치즈인더에그");
									ingerdientsNextPage();
									ingerdientsProductName.add("치즈인더에그");
									System.out.println(ingerdientsProductName.toString());
									dessertSelect = "치즈인더에그 선택완료";
								}
							} else if (ingerdientsPage == 1) {
								if (j == 0) {
									System.out.println("콜라");
									ingerdientsProductName.add("콜라");
									System.out.println(ingerdientsProductName.toString());
									// OrderStatusText.get(textNumber).setText("세트메뉴에 콜라 추가");
									changeMainPurchaseScene();
									drinkSelect = "콜라 선택완료";
									// ingerdientsProductName.clear();
									// System.out.println(ingerdientsProductName.toString());
								} else if (j == 1) {
									System.out.println("사이다");
									ingerdientsProductName.add("사이다");
									System.out.println(ingerdientsProductName.toString());
									// OrderStatusText.get(textNumber).setText("세트메뉴에 사이다 추가");
									changeMainPurchaseScene();
									drinkSelect = "사이다 선택완료";
									// ingerdientsProductName.clear();
									// System.out.println(ingerdientsProductName.toString());
								} else if (j == 2) {
									System.out.println("아메리카노");
									ingerdientsProductName.add("아메리카노");
									System.out.println(ingerdientsProductName.toString());
									// OrderStatusText.get(textNumber).setText("세트메뉴에 아메리카노 추가");
									changeMainPurchaseScene();
									drinkSelect = "아메리카노 선택완료";
									// ingerdientsProductName.clear();
									// System.out.println(ingerdientsProductName.toString());
								} else if (j == 3) {
									System.out.println("아이스 아메리카노");
									ingerdientsProductName.add("아이스 아메리카노");
									System.out.println(ingerdientsProductName.toString());
									// OrderStatusText.get(textNumber).setText("세트메뉴에 아이스 아메리카노 추가");
									changeMainPurchaseScene();
									drinkSelect = "아이스 아메리카노 선택완료";
									// ingerdientsProductName.clear();
									// System.out.println(ingerdientsProductName.toString());
								} else if (j == 4) {
									System.out.println("카페라떼");
									ingerdientsProductName.add("카페라떼");
									System.out.println(ingerdientsProductName.toString());
									// OrderStatusText.get(textNumber).setText("세트메뉴에 카페라떼 추가");
									changeMainPurchaseScene();
									drinkSelect = "카페라떼 선택완료";
									// ingerdientsProductName.clear();
									// System.out.println(ingerdientsProductName.toString());
								} else if (j == 5) {
									System.out.println("아이스 카페라떼");
									ingerdientsProductName.add("아이스 카페라떼");
									System.out.println(ingerdientsProductName.toString());
									// OrderStatusText.get(textNumber).setText("세트메뉴에 아이스 카페라떼 추가");
									changeMainPurchaseScene();
									drinkSelect = "아이스 카페라떼 선택완료";
									// ingerdientsProductName.clear();
									// System.out.println(ingerdientsProductName.toString());
								}
							}
						}
					}
					System.out.println("디저트 선택 이름: " + dessertSelect);
					System.out.println("드링크 선택 이름: " + drinkSelect);
					if (dessertSelect != "" && drinkSelect != "") {
						selectIngerdientsCount++;
						System.out.println("디저트 선택 이름: " + dessertSelect);
						System.out.println("드링크 선택 이름: " + drinkSelect);
						System.out.println("버거선택횟수" + buyBurgerSetCount);
						System.out.println("추가구성세트 선택 횟수" + selectIngerdientsCount);
					}
				}
			});
		}

		OrderStatusBackGround.setBounds(50, 630, 490, 110);
		OrderStatusBackGround.setIcon(new ImageIcon("./otherimages/empty.png"));
		mainPurchaseScene.add(OrderStatusBackGround);

		howManyAddText.setBounds(140, -20, 300, 100);
		howManyAddText.setText("몇개 추가하시겠습니까?");
		howManyAddText.setFont(new Font("굴림", Font.BOLD, 20));
		numberChangeBackGround.add(howManyAddText);

		howManyText.setBounds(210, 80, 300, 100);
		howManyText.setText("현재 : 1 개");
		howManyText.setFont(new Font("굴림", Font.BOLD, 15));
		numberChangeBackGround.add(howManyText);

		oneThing.setText("1개");
		oneThing.setFont(new Font("굴림", Font.BOLD, 20));
		oneThing.setBounds(70, 60, 100, 50);
		numberChangeBackGround.add(oneThing);

		fiveThing.setText("5개");
		fiveThing.setFont(new Font("굴림", Font.BOLD, 20));
		fiveThing.setBounds(200, 60, 100, 50);
		numberChangeBackGround.add(fiveThing);

		TenThing.setText("10개");
		TenThing.setFont(new Font("굴림", Font.BOLD, 20));
		TenThing.setBounds(330, 60, 100, 50);
		numberChangeBackGround.add(TenThing);

		checkButton.setText("확인");
		checkButton.setFont(new Font("굴림", Font.BOLD, 20));
		checkButton.setBounds(200, 150, 100, 30);
		numberChangeBackGround.add(checkButton);

		oneThing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(americano.price);
				addProducts(1);
				System.out.println(americano.price);
			}
		});
		fiveThing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProducts(5);
			}
		});
		TenThing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProducts(10);
			}
		});
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberChangeBackGround.setVisible(false);
			}
		});

		numberChangeBackGround.add(checkButton);

		changeMenu();
		changefirstScene.start();

		// 결제하기 전 체크 창
		paymentCheckScene.setBounds(0, 0, 600, 850);
		paymentCheckScene.setLayout(null);
		paymentCheckScene.setVisible(false);
		frame.getContentPane().add(paymentCheckScene);

		paymentCheckSceneImage.setBounds(0, 0, 600, 850);
		paymentCheckSceneImage.setLayout(null);
		paymentCheckSceneImage.setVisible(true);
		paymentCheckSceneImage.setIcon(new ImageIcon("./otherimages/결제확인창.png"));
		paymentCheckScene.add(paymentCheckSceneImage);

		// 결제하기 눌렀을때 카드 결제창
		cardPaymentSceneImage.setBounds(0, 0, 600, 850);
		cardPaymentSceneImage.setLayout(null);
		cardPaymentSceneImage.setVisible(false);
		cardPaymentSceneImage.setIcon(new ImageIcon("./otherimages/카드삽입창.png"));
		paymentCheckScene.add(cardPaymentSceneImage);

		checkTotalAmount.setBounds(350, 400, 100, 20);
		checkTotalAmount.setText("총 개수 : " + totalAmount + " 개");
		// checkTotalAmount.setBackground(Color.blue);
		// checkTotalAmount.setOpaque(true);
		checkTotalAmount.setLayout(null);
		checkTotalAmount.setVisible(true);
		paymentCheckSceneImage.add(checkTotalAmount);

		checkTotalPrice.setBounds(450, 400, 100, 20);
		checkTotalPrice.setText("총 " + totalPrice + " 원");
		// checkTotalAmount.setBackground(Color.blue);
		// checkTotalAmount.setOpaque(true);
		checkTotalPrice.setLayout(null);
		checkTotalPrice.setVisible(true);
		paymentCheckSceneImage.add(checkTotalPrice);

		checkOKButton.setBounds(150, 500, 100, 30);
		checkOKButton.setText("결제하기");
		checkOKButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				paymentCheckSceneImage.setVisible(false);
				cardPaymentSceneImage.setVisible(true);
				isertCardButton.setVisible(true);
				isertCardButton.setEnabled(true);
				// System.out.println("restart 값은 : " + restart);
			}
		});
		paymentCheckSceneImage.add(checkOKButton);

		checkCancelButton.setBounds(350, 500, 100, 30);
		checkCancelButton.setText("이전으로");
		checkCancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paymentCheckScene.setVisible(false);
				mainPurchaseScene.setVisible(true);

				textArea.selectAll();
				textArea.replaceSelection("");
			}
		});
		paymentCheckSceneImage.add(checkCancelButton);

		/*
		 * paymentCheckList.setBounds(100, 220, 400, 250);
		 * paymentCheckList.setBackground(Color.pink); paymentCheckList.setOpaque(true);
		 * // 레이블 백그라운드 색이 보여지기 위해서 필요함 paymentCheckList.setLayout(null);
		 * paymentCheckList.setVisible(true); //paymentCheckList.add(OrderStatusText));
		 * paymentCheckSceneImage.add(paymentCheckList);
		 */

		insertCardImage.setBounds(100, 220, 400, 300);
		insertCardImage.setIcon(new ImageIcon("./otherimages/카드투입.png"));
		insertCardImage.setLayout(null);
		insertCardImage.setVisible(true);
		cardPaymentSceneImage.add(insertCardImage);

		isertCardButton.setBounds(100, 520, 400, 100);
		isertCardButton.setText("카드 투입");
		isertCardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				changeCardPaymentImage changeCardPaymentImage = new changeCardPaymentImage(insertCardImage,
						isertCardButton, firstScene, mainPurchaseScene, paymentCheckScene, cardPaymentSceneImage);
				changeCardPaymentImage.start();
				// 세트 추가 구입 UI 구현 후 나중에 스레드 수정해야함

				// frame = new JFrame();

				isertCardButton.setVisible(false);

				for (int i = 0; i < OrderStatusText.size(); i++) {
					OrderStatusText.get(i).setLocation(1000, 1000);
					cancelButton.get(i).setLocation(1000, 1000);
					quantityChangeButton.get(i).setLocation(1000, 1000);
					// OrderStatusText.remove(i);
				}

				OrderStatusText.clear();
				textNumber = 0;
				OrderStatusVerticalLength = -40;
				eatingPlace = "";

				orderProductName.clear();
				totalAmount = 0;
				totalPrice = 0;
				numberText.setText(totalAmount + "개");
				amountText.setText(totalPrice + "원");

				checkTotalAmount.setText("총 개수 : " + totalAmount + " 개");
				checkTotalPrice.setText("총  " + totalPrice + " 원");

			}
		});
		cardPaymentSceneImage.add(isertCardButton);
	}

	public void changeMenu() {
		// 햄버거 세트메뉴
		if (menupage == 0) {
			menuImages[0].setIcon(new ImageIcon("./hamburgerSetimages/더블x2세트.png"));
			menuImages[1].setIcon(new ImageIcon("./hamburgerSetimages/와규에디션2세트.png"));
			menuImages[2].setIcon(new ImageIcon("./hamburgerSetimages/AZ버거세트.png"));
			menuImages[3].setIcon(new ImageIcon("./hamburgerSetimages/한우불고기콤보.png"));
			menuImages[4].setIcon(new ImageIcon("./hamburgerSetimages/한우불고기세트.png"));
			menuImages[5].setIcon(new ImageIcon("./hamburgerSetimages/모짜렐라인더버거베이컨세트.png"));
			menuImages[6].setIcon(new ImageIcon("./hamburgerSetimages/원조빅불세트.png"));
			menuImages[7].setIcon(new ImageIcon("./hamburgerSetimages/핫크리스피세트.png"));
			menuImages[8].setIcon(new ImageIcon("./hamburgerSetimages/불고기버거세트.png"));
		}

		else if (menupage == 1) {
			menuImages[0].setIcon(new ImageIcon("./hamburgerSetimages/리아미라클버거세트.png"));
			menuImages[1].setIcon(new ImageIcon("./hamburgerSetimages/새우버거세트.png"));
			menuImages[2].setIcon(new ImageIcon("./hamburgerSetimages/치킨버거세트.png"));
			menuImages[3].setIcon(new ImageIcon("./hamburgerSetimages/T-Rax버거세트.png"));
			menuImages[4].setIcon(new ImageIcon("./hamburgerSetimages/클래식치즈버거세트.png"));
			menuImages[5].setIcon(new ImageIcon("./hamburgerSetimages/데리버거세트.png"));
			menuImages[6].setIcon(new ImageIcon());
			menuImages[7].setIcon(new ImageIcon());
			menuImages[8].setIcon(new ImageIcon());
		}

		// 햄버거
		else if (menupage == 2) {
			menuImages[0].setIcon(new ImageIcon("./hamburgerimages/와규에디션2.png"));
			menuImages[1].setIcon(new ImageIcon("./hamburgerimages/더블x2.png"));
			menuImages[2].setIcon(new ImageIcon("./hamburgerimages/모짜렐라인더버거베이컨.png"));
			menuImages[3].setIcon(new ImageIcon("./hamburgerimages/AZ버거.png"));
			menuImages[4].setIcon(new ImageIcon("./hamburgerimages/원조빅불.png"));
			menuImages[5].setIcon(new ImageIcon("./hamburgerimages/핫크리스피버거.png"));
			menuImages[6].setIcon(new ImageIcon("./hamburgerimages/한우불고기.png"));
			menuImages[7].setIcon(new ImageIcon("./hamburgerimages/리아미라클버거.png"));
			menuImages[8].setIcon(new ImageIcon("./hamburgerimages/새우버거.png"));
		}

		else if (menupage == 3) {
			menuImages[0].setIcon(new ImageIcon("./hamburgerimages/치킨버거.png"));
			menuImages[1].setIcon(new ImageIcon("./hamburgerimages/T-Rax.png"));
			menuImages[2].setIcon(new ImageIcon("./hamburgerimages/클래식치즈버거.png"));
			menuImages[3].setIcon(new ImageIcon("./hamburgerimages/데리버거.png"));
			menuImages[4].setIcon(new ImageIcon());
			menuImages[5].setIcon(new ImageIcon());
			menuImages[6].setIcon(new ImageIcon());
			menuImages[7].setIcon(new ImageIcon());
			menuImages[8].setIcon(new ImageIcon());
		}

		// 디저트
		else if (menupage == 4) {
			menuImages[0].setIcon(new ImageIcon("./dessertimages/치즈인더에그.png"));
			menuImages[1].setIcon(new ImageIcon("./dessertimages/지파이하비네로.png"));
			menuImages[2].setIcon(new ImageIcon("./dessertimages/지파이고소한맛.png"));
			menuImages[3].setIcon(new ImageIcon("./dessertimages/치킨너겟.png"));
			menuImages[4].setIcon(new ImageIcon("./dessertimages/롱치즈스틱.png"));
			menuImages[5].setIcon(new ImageIcon("./dessertimages/콘샐러드.png"));
			menuImages[6].setIcon(new ImageIcon("./dessertimages/선데아이스크림.png"));
			menuImages[7].setIcon(new ImageIcon("./dessertimages/쉑쉑치킨.png"));
			menuImages[8].setIcon(new ImageIcon("./dessertimages/양념감자.png"));
		}

		else if (menupage == 5) {
			menuImages[0].setIcon(new ImageIcon("./dessertimages/오징어링.png"));
			menuImages[1].setIcon(new ImageIcon("./dessertimages/치즈스틱.png"));
			menuImages[2].setIcon(new ImageIcon("./dessertimages/포테이토.png"));
			menuImages[3].setIcon(new ImageIcon("./dessertimages/토네이도(초코쿠키).png"));
			menuImages[4].setIcon(new ImageIcon("./dessertimages/토네이도(녹차).png"));
			menuImages[5].setIcon(new ImageIcon("./dessertimages/토네이도(스트로베리).png"));
			menuImages[6].setIcon(new ImageIcon("./dessertimages/소프트콘.png"));
			menuImages[7].setIcon(new ImageIcon());
			menuImages[8].setIcon(new ImageIcon());
		}

		// 드링크
		else if (menupage == 6) {
			menuImages[0].setIcon(new ImageIcon("./drinkimages/아이스아메리카노.png"));
			menuImages[1].setIcon(new ImageIcon("./drinkimages/사이다.png"));
			menuImages[2].setIcon(new ImageIcon("./drinkimages/콜라.png"));
			menuImages[3].setIcon(new ImageIcon("./drinkimages/아메리카노.png"));
			menuImages[4].setIcon(new ImageIcon("./drinkimages/카페라떼.png"));
			menuImages[5].setIcon(new ImageIcon("./drinkimages/아이스카페라떼.png"));
			menuImages[6].setIcon(new ImageIcon());
			menuImages[7].setIcon(new ImageIcon());
			menuImages[8].setIcon(new ImageIcon());
		}
	}

	public void addProducts(int addNum) {
		System.out.println("americano" + americano.price);
		System.out.println("americano" + americano.originalPrice);
		
		if (orderProductName.get(productNum).equals(doubleX2Set.productName)) {
			doubleX2Set.addNumOfProduct_hamburgerSet(addNum, productNum, hamburgerSet_drink, hamburgerSet_dessert);

		} else if (orderProductName.get(productNum).equals(wagyuEdition2Set.productName)) {
			wagyuEdition2Set.addNumOfProduct(addNum, productNum);

		} else if (orderProductName.get(productNum).equals(AZBurgerSet.productName)) {
			AZBurgerSet.addNumOfProduct(addNum, productNum);

		} else if (orderProductName.get(productNum).equals(hanwooBulgogiCombo.productName)) {
			hanwooBulgogiCombo.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(hanwooBulgogiBurgerSet.productName)) {
			hanwooBulgogiBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(mozzarellaInTheBurgerSet.productName)) {
			mozzarellaInTheBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(bigBulgogiSet.productName)) {
			bigBulgogiSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(hotCrispyBurgerSet.productName)) {
			hotCrispyBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(bulgogiBurgerSet.productName)) {
			bulgogiBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(riaMiracleBurgerSet.productName)) {
			riaMiracleBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(shrimpBurgerSet.productName)) {
			shrimpBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(chickenBurgerSet.productName)) {
			chickenBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(T_RexBurgerSet.productName)) {
			T_RexBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(classicCheeseBurgerSet.productName)) {
			classicCheeseBurgerSet.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(teriBurgerSet.productName)) {
			teriBurgerSet.addNumOfProduct(addNum, productNum);

		}

		// 햄버거 삭제 기능
		else if (orderProductName.get(productNum).equals(wagyuEdition2.productName)) {
			wagyuEdition2.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(doubleX2.productName)) {
			doubleX2.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(mozzarellaInTheBurger.productName)) {
			mozzarellaInTheBurger.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(AZBurger.productName)) {
			AZBurger.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(bigBulgogi.productName)) {
			bigBulgogi.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(hotCrispyBurger.productName)) {
			hotCrispyBurger.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(hanwooBulgogi.productName)) {
			hanwooBulgogi.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(riaMiracleBurger.productName)) {
			riaMiracleBurger.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(shrimpBurger.productName)) {
			shrimpBurger.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(chickenBurger.productName)) {
			chickenBurger.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(T_RexBurger.productName)) {
			T_RexBurger.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(classicCheeseBurger.productName)) {
			classicCheeseBurger.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(teriBurger.productName)) {
			teriBurger.addNumOfProduct(addNum, productNum);

		}

		// 디저트 삭제 기능
		else if (orderProductName.get(productNum).equals(cheeseInTheEgg.productName)) {
			cheeseInTheEgg.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(jipieHabanero_L.productName)) {
			jipieHabanero_L.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(jipie_S.productName)) {
			jipie_S.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(chickenNugget.productName)) {
			chickenNugget.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(longCheeseStick.productName)) {
			longCheeseStick.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(coneSalad.productName)) {
			coneSalad.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(sundayIceCream.productName)) {
			sundayIceCream.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(shakeShakeChicken.productName)) {
			shakeShakeChicken.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(seasoningPotato.productName)) {
			seasoningPotato.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(squidRing.productName)) {
			squidRing.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(naturalCheeseStick.productName)) {
			naturalCheeseStick.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(potato.productName)) {
			potato.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(chocoCookieTornado.productName)) {
			chocoCookieTornado.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(greenTeaTornado.productName)) {
			greenTeaTornado.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(strawberryTornado.productName)) {
			strawberryTornado.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(softCone.productName)) {
			softCone.addNumOfProduct(addNum, productNum);

		}

		// 드링크 삭제 기능
		else if (orderProductName.get(productNum).equals(iceAmericano.productName)) {
			iceAmericano.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(cider.productName)) {
			cider.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(cola.productName)) {
			cola.addNumOfProduct(addNum, productNum);

		}

		else if (orderProductName.get(productNum).equals(americano.productName)) {
			americano.addNumOfProduct(addNum, productNum);
		}

		else if (orderProductName.get(productNum).equals(caffeLatte.productName)) {
			caffeLatte.addNumOfProduct(addNum, productNum);
		}

		else if (orderProductName.get(productNum).equals(iceCaffeLatte.productName)) {
			iceCaffeLatte.addNumOfProduct(addNum, productNum);
		}
	}

	public void changeIngredientsScene() {
		changeIngerdientsMenu();
		buyBurgerSetCount++;

		dessertSelect = "";
		drinkSelect = "";

		// 세트 구성을 추가할 때는 수량조절,삭제버튼을 활성화 시킴
		for (int i = 0; i < OrderStatusText.size(); i++) {
			// OrderStatusText.get(i).setEditable(false);
			cancelButton.get(i).setEnabled(false);
			quantityChangeButton.get(i).setEnabled(false);
			// OrderStatusText.remove(i);
		}

		for (int i = 0; i < menuImages.length; i++) {
			menuImages[i].setVisible(false);
		}

		for (int i = 0; i < ingerdientsMenuImages.length; i++) {
			ingerdientsMenuImages[i].setVisible(true);
		}

		hamburgerSetButton.setVisible(false);
		hamburgerButton.setVisible(false);
		drinkButton.setVisible(false);
		dessertButton.setVisible(false);
		nextPageButton.setVisible(false);
		previousPageButton.setVisible(false);

		changeIngredientsScene.setVisible(true);
		ingerdientsNextPageButton.setVisible(true);
		ingerdientsPreviousPageButton.setVisible(true);
		ingerdientsDessertButton.setVisible(true);
		ingerdientsDrinkButton.setVisible(true);
	}

	public void changeMainPurchaseScene() {

		// 세트 구성을 추가할 때는 수량조절,삭제버튼을 활성화 시킴
		for (int i = 0; i < OrderStatusText.size(); i++) {
			// OrderStatusText.get(i).setEditable(false);
			cancelButton.get(i).setEnabled(true);
			quantityChangeButton.get(i).setEnabled(true);
			// OrderStatusText.remove(i);
		}

		ingerdientsPage = 0;
		ingerdientsProductName.clear();
		System.out.println(ingerdientsProductName.toString());

		if (ingerdientsPage == 0) {
			ingerdientsDessertButton.setBackground(Color.gray);
			ingerdientsDrinkButton.setBackground(Color.white);
			System.out.println("디저트 페이지 출력");
		} else if (ingerdientsPage == 1) {
			ingerdientsDessertButton.setBackground(Color.white);
			ingerdientsDrinkButton.setBackground(Color.gray);
			System.out.println("드렁크 페이지 출력");
		}

		for (int i = 0; i < menuImages.length; i++) {
			menuImages[i].setVisible(true);
		}

		for (int i = 0; i < ingerdientsMenuImages.length; i++) {
			ingerdientsMenuImages[i].setVisible(false);
		}

		hamburgerSetButton.setVisible(true);
		hamburgerButton.setVisible(true);
		drinkButton.setVisible(true);
		dessertButton.setVisible(true);
		nextPageButton.setVisible(true);
		previousPageButton.setVisible(true);

		changeIngredientsScene.setVisible(false);
		ingerdientsNextPageButton.setVisible(false);
		ingerdientsPreviousPageButton.setVisible(false);
		ingerdientsDessertButton.setVisible(false);
		ingerdientsDrinkButton.setVisible(false);
	}

	public void changeIngerdientsMenu() {

		if (ingerdientsPage == 0) {
			ingerdientsMenuImages[0].setIcon(new ImageIcon("./ingerdientsDessertImages/포테이토(세트구성).png"));
			ingerdientsMenuImages[1].setIcon(new ImageIcon("./ingerdientsDessertImages/콘셀러드(세트구성).png"));
			ingerdientsMenuImages[2].setIcon(new ImageIcon("./ingerdientsDessertImages/롱치즈스틱(세트구성).png"));
			ingerdientsMenuImages[3].setIcon(new ImageIcon("./ingerdientsDessertImages/양념감자(세트구성).png"));
			ingerdientsMenuImages[4].setIcon(new ImageIcon("./ingerdientsDessertImages/오징어링(세트구성).png"));
			ingerdientsMenuImages[5].setIcon(new ImageIcon("./ingerdientsDessertImages/치즈스틱(세트구성).png"));
			ingerdientsMenuImages[6].setIcon(new ImageIcon("./ingerdientsDessertImages/지파이 고소한맛(세트구성).png"));
			ingerdientsMenuImages[7].setIcon(new ImageIcon("./ingerdientsDessertImages/지파이 하바네로(세트구성).png"));
			ingerdientsMenuImages[8].setIcon(new ImageIcon("./ingerdientsDessertImages/쉑쉑치킨(세트구성).png"));
			ingerdientsMenuImages[9].setIcon(new ImageIcon("./ingerdientsDessertImages/치즈인더에그(세트구성).png"));
			ingerdientsMenuImages[10].setIcon(new ImageIcon());
			ingerdientsMenuImages[11].setIcon(new ImageIcon());
			ingerdientsMenuImages[12].setIcon(new ImageIcon());
		}

		else if (ingerdientsPage == 1) {
			ingerdientsMenuImages[0].setIcon(new ImageIcon("./ingerdientsDrinkImages/콜라(세트구성).png"));
			ingerdientsMenuImages[1].setIcon(new ImageIcon("./ingerdientsDrinkImages/사이다(세트구성).png"));
			ingerdientsMenuImages[2].setIcon(new ImageIcon("./ingerdientsDrinkImages/아메리카노(세트구성).png"));
			ingerdientsMenuImages[3].setIcon(new ImageIcon("./ingerdientsDrinkImages/아이스아메리카노(세트구성).png"));
			ingerdientsMenuImages[4].setIcon(new ImageIcon("./ingerdientsDrinkImages/카페라떼(세트구성).png"));
			ingerdientsMenuImages[5].setIcon(new ImageIcon("./ingerdientsDrinkImages/아이스카페라떼(세트구성).png"));
			ingerdientsMenuImages[6].setIcon(new ImageIcon());
			ingerdientsMenuImages[7].setIcon(new ImageIcon());
			ingerdientsMenuImages[8].setIcon(new ImageIcon());
			ingerdientsMenuImages[9].setIcon(new ImageIcon());
			ingerdientsMenuImages[10].setIcon(new ImageIcon());
			ingerdientsMenuImages[11].setIcon(new ImageIcon());
			ingerdientsMenuImages[12].setIcon(new ImageIcon());
		}
	}

	public void ingerdientsPreviousPage() {
		ingerdientsPage--;
		changeIngerdientsMenu();

		if (ingerdientsPage == 0) {
			ingerdientsDessertButton.setBackground(Color.gray);
			ingerdientsDrinkButton.setBackground(Color.white);
			System.out.println("디저트 페이지 출력");
		} else if (ingerdientsPage == 1) {
			ingerdientsDessertButton.setBackground(Color.white);
			ingerdientsDrinkButton.setBackground(Color.gray);
			System.out.println("드렁크 페이지 출력");
		}
	}

	public void ingerdientsNextPage() {
		ingerdientsPage++;
		changeIngerdientsMenu();

		if (ingerdientsPage == 0) {
			ingerdientsDessertButton.setBackground(Color.gray);
			ingerdientsDrinkButton.setBackground(Color.white);
			System.out.println("디저트 페이지 출력");
		} else if (ingerdientsPage == 1) {
			ingerdientsDessertButton.setBackground(Color.white);
			ingerdientsDrinkButton.setBackground(Color.gray);
			System.out.println("드렁크 페이지 출력");
		}
	}
}
