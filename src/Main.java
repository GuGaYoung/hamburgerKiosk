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

	JLabel advertisingScene = new JLabel(); // 광고이미지 바꾸는 씬
	JPanel mainPurchaseScene = new JPanel();
	JPanel packagingDeliveringScene = new JPanel() {
		public void paintComponent(Graphics g) {
			Dimension d = getSize();
			ImageIcon image = new ImageIcon("./otherimages/empty.png");
			g.drawImage(image.getImage(), 0, 0, d.width, d.height, this);
		}
	};

	JPanel changeIngredientsScene = new JPanel(); //햄버거 세트의 추가구성 바꾸는 씬

	JPanel paymentCheckScene = new JPanel(); // 지불 확인 씬
	JLabel paymentCheckSceneImage = new JLabel();
	JLabel cardPaymentSceneImage = new JLabel();
	JLabel insertCardImage = new JLabel();
	JButton insertCardButton = new JButton();
	JButton checkOKButton = new JButton();
	JButton checkCancelButton = new JButton();
	JButton[] ingerdientsMenuImages = new JButton[13];

	static JLabel finalTotalAmount = new JLabel();	
	static JLabel finalTotalPrice = new JLabel();

	JButton ingerdientsNextPageButton = new JButton();
	JButton ingerdientsPreviousPageButton = new JButton();
	JButton ingerdientsDessertButton = new JButton();
	JButton ingerdientsDrinkButton = new JButton();

	int buyBurgerSetCount = 0;
	int selectIngerdientsCount = 0;
	
	String hamburgerSetDessert = "";
	String hamburgerSetDrink = "";

	JLabel pressKeyText = new JLabel();
	JButton packagingButton = new JButton();
	JButton deliveringButton = new JButton();
	JButton[] menuImages = new JButton[9];
	JButton nextPageButton = new JButton();
	JButton previousPageButton = new JButton();
	JButton goAdvertisingSceneButton = new JButton();
	JButton cancelPageButton = new JButton();
	JButton paymentButton = new JButton();
	JButton hamburgerButton = new JButton();
	JButton hamburgerSetButton = new JButton();
	JButton drinkButton = new JButton();
	JButton dessertButton = new JButton();
	JLabel topAdvertisingImage = new JLabel(); // 상단 광고 이미지
	static JLabel amountText = new JLabel();
	static JLabel priceText = new JLabel();
	JLabel orderDetailsText = new JLabel(); // 총 주문 내역
	JLabel orderDetailsBackGround = new JLabel();
	JLabel chooseEatingPlaceText = new JLabel();

	JLabel orderSituationBackGround = new JLabel();
	JLabel howManyAddText = new JLabel();
	static JLabel howManyText = new JLabel();
	JButton oneThing = new JButton();
	JButton fiveThing = new JButton();
	JButton tenThing = new JButton();
	JButton checkButton = new JButton();// 확인버튼
	JButton cancelAddButton = new JButton(); //수량추가를 취소
	
	static ArrayList<JLabel> orderStatusText = new ArrayList<>();

	ArrayList<JButton> removeButton = new ArrayList<>(); //cancel -> remove
	ArrayList<JButton> quantityChangeButton = new ArrayList<>(); // 수량변경
	JLabel orderStatusBackGround = new JLabel();

	static ArrayList<String> orderProductName = new ArrayList<String>(); // 주문한 제품 이름을 받는 배열
	static ArrayList<String> orderProduct = new ArrayList<String>(); // 주문한 제품 이름,갯수,가격을 받는 배열
	ArrayList<String> ingerdientsProductName = new ArrayList<String>();

	// TODO 왜 값이 그 숫자들인지 증명해야함
	int menupage = 0;
	int menuHorizontalLength = 50;
	int menuVerticalLength = 0;
	int menuImageWidth = 150;
	int menuImageHeight = 130;
	int menuHorizontalInterval = 170;

	// TODO 왜 값이 그 숫자들인지 증명해야함
	int ingerdientsPage = 0; // 구성품 페이지
	int ingerdientsMenuHorizontalLength = 50;
	int ingerdientsMenuVerticalLength = 0;
	int ingerdientsMenuImageWidth = 100;
	int ingerdientsMenuImageHeight = 130;
	int ingerdientsMenuHorizontalInterval = 130;

	static int orderStatusTextNumber = 0; // 주문상황 텍스트 수
	static int totalAmount = 0; // 주문 총 양
	static int totalPrice = 0; // 주문 총 금액

	int productNum = 0; // 제품의 수량을 변경할때 어떤 제품인지 판단하기 위한 변수
	int addProductNum = 0; //몇개를 수량 추가 했는지 
	String eatingPlace = "";// 매장에서 먹을 건지 포장 할 건지

	// TODO 왜 값이 -40 증명해야함
	int OrderStatusVerticalLength = -40;

	ChangeAdvertisingScene changeAdvertisingScene = new ChangeAdvertisingScene(advertisingScene);

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
	
	static Menu selectedSetMenu;

	ChangeSetMenu changeSetMenu = new ChangeSetMenu();

	public Main() {

		frame = new JFrame();
		frame.setBounds(0, 0, 600, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("hamburgerKiosk");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);

		advertisingScene.setBounds(0, 0, 600, 850);
		frame.getContentPane().add(advertisingScene);
		advertisingScene.setLayout(null);

		advertisingScene.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				advertisingScene.setVisible(false);
				packagingDeliveringScene.setVisible(true);
				insertCardButton.setEnabled(true);	//결제 후 비활성화 된 카드 투입버튼을 광고창이 나타날때 활성화 시킴
				//insertCardImage.setIcon(new ImageIcon("./otherimages/카드투입.png"));
				// restart = "";
			}
		});

		JScrollPane scrollBar = new JScrollPane();
		scrollBar.setBounds(68, 201, 450, 200);
		scrollBar.getVerticalScrollBar().setValue(scrollBar.getVerticalScrollBar().getMaximum());
		paymentCheckSceneImage.add(scrollBar);

		JTextArea textArea = new JTextArea();
		scrollBar.setViewportView(textArea);
		textArea.setEditable(false);
		textArea.setVisible(false);
		textArea.setFont((new Font("굴림체", Font.BOLD, 15)));

		// 매장에서 먹을건지 포장할건지 고르는 화면
		packagingDeliveringScene.setBounds(0, 0, 600, 850);
		frame.getContentPane().add(packagingDeliveringScene);
		packagingDeliveringScene.setLayout(null);
		packagingDeliveringScene.setVisible(false);

		// 주문 상태 배경화면
		orderSituationBackGround.setBounds(50, 300, 490, 190);
		orderSituationBackGround.setIcon(new ImageIcon("./otherimages/empty.png"));
		mainPurchaseScene.add(orderSituationBackGround);
		orderSituationBackGround.setVisible(false);

		// 메인 구매 화면
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
		advertisingScene.add(pressKeyText);

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

				packagingDeliveringScene.setVisible(false);
				mainPurchaseScene.setVisible(true);
				insertCardButton.setVisible(false);
				
			}
		});
		packagingDeliveringScene.add(packagingButton);

		deliveringButton.setBounds(110, 330, 150, 150);
		deliveringButton.setIcon(new ImageIcon("./otherimages/store.jpg"));
		deliveringButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				packagingDeliveringScene.setVisible(false);
				mainPurchaseScene.setVisible(true);
				insertCardButton.setVisible(false);
				
			}
		});
		packagingDeliveringScene.add(deliveringButton);

		// 구매화면
		topAdvertisingImage.setBounds(0, 0, 600, 140);
		topAdvertisingImage.setIcon(new ImageIcon("./otherimages/T-rax버거광고(구입창).jpg"));
		mainPurchaseScene.add(topAdvertisingImage);

		// 햄버거 세트 버튼을 누르면 햄버거 세트를 고를 수 있는 페이지로 넘어간다.
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

		// 햄버거 버튼을 누르면 햄버거를 고를 수 있는 페이지로 넘어간다.
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

		// 디저트 버튼을 누르면 디저트를 고를 수 있는 페이지로 넘어간다.
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

		// 음료 버튼을 누르면 음료를 고를 수 있는 페이지로 넘어간다.
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

		goAdvertisingSceneButton.setBounds(110, 750, 100, 40);
		goAdvertisingSceneButton.setText("첫화면으로");
		goAdvertisingSceneButton.setFont(new Font("굴림", Font.BOLD, 10));
		goAdvertisingSceneButton.setBackground(Color.LIGHT_GRAY);
		goAdvertisingSceneButton.setBorderPainted(false);
		goAdvertisingSceneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				advertisingScene.setVisible(true);
				mainPurchaseScene.setVisible(false);

				for (int i = 0; i < orderStatusText.size(); i++) {
					orderStatusText.get(i).setLocation(1000, 1000);
					removeButton.get(i).setLocation(1000, 1000);
					quantityChangeButton.get(i).setLocation(1000, 1000);
					// orderStatusText.remove(i);
				}

				orderStatusText.clear();
				orderStatusTextNumber = 0;
				OrderStatusVerticalLength = -40;

				orderProductName.clear();
				totalAmount = 0;
				totalPrice = 0;
				amountText.setText(totalAmount + "개");
				priceText.setText(totalPrice + "원");

				finalTotalAmount.setText("총 개수 : +totalAmount+ 개");
				finalTotalPrice.setText("총  +totalPrice 원");

				hamburgerSetDessert = "";
				hamburgerSetDrink  = "";
				selectIngerdientsCount = 0;
				buyBurgerSetCount = 0;

				System.out.println(orderStatusText.size());
				System.out.println(orderProductName.toString());

				textArea.selectAll();
				textArea.replaceSelection("");
			}
		});
		mainPurchaseScene.add(goAdvertisingSceneButton);

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

				for (int i = 0; i < orderStatusText.size(); i++) {
					orderStatusText.get(i).setLocation(1000, 1000);
					removeButton.get(i).setLocation(1000, 1000);
					quantityChangeButton.get(i).setLocation(1000, 1000);
					// orderStatusText.remove(i);

					orderStatusTextNumber = 0;
				}

				orderStatusText.clear();
				orderStatusTextNumber = 0;
				OrderStatusVerticalLength = -40;

				orderProductName.clear();
				orderProduct.clear();
				totalAmount = 0;
				totalPrice = 0;
				amountText.setText(totalAmount + "개");
				priceText.setText(totalPrice + "원");
				
				finalTotalAmount.setText("총 개수 : "+totalAmount+" 개");
				finalTotalPrice.setText("총 "+totalPrice+" 원");
				
				textArea.selectAll();
				textArea.replaceSelection("");
				
				System.out.println(orderProductName.toString());
				System.out.println("전체 취소했습니다.");
			}
		});
		mainPurchaseScene.add(cancelPageButton);

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
					paymentCheckScene.setVisible(true);
					insertCardButton.setVisible(true);
					
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

				if (hamburgerSetDessert != "") {
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

				if (hamburgerSetDessert != "") {
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
			}
		});
		mainPurchaseScene.add(ingerdientsNextPageButton);

		//메뉴 이미지 버튼 초기화
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

		// 세트 구성 이미지 버튼 초기화
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

		orderDetailsText.setBounds(90, 570, 200, 100);
		orderDetailsText.setText("총주문내역");
		orderDetailsText.setHorizontalAlignment(SwingConstants.CENTER);
		orderDetailsText.setFont(new Font("굴림", Font.BOLD, 15));
		mainPurchaseScene.add(orderDetailsText);

		amountText.setBounds(210, 570, 200, 100);
		amountText.setText("0개");
		amountText.setHorizontalAlignment(SwingConstants.CENTER);
		amountText.setFont(new Font("굴림", Font.BOLD, 15));
		mainPurchaseScene.add(amountText);

		priceText.setBounds(320, 570, 200, 100);
		priceText.setText("0원");
		priceText.setHorizontalAlignment(SwingConstants.CENTER);
		priceText.setFont(new Font("굴림", Font.BOLD, 15));
		mainPurchaseScene.add(priceText);

		orderDetailsBackGround.setBounds(50, 607, 490, 20);
		orderDetailsBackGround.setIcon(new ImageIcon("./otherimages/empty.png"));
		mainPurchaseScene.add(orderDetailsBackGround);

		// 메뉴 버튼을 누르면 선택한 메뉴들이 주문내역에 출력된다
		for (int i = 0; i < menuImages.length; i++) {
			menuImages[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					orderStatusText.add(new JLabel());
					removeButton.add(new JButton());
					quantityChangeButton.add(new JButton());

					for (int i = 0; i < menuImages.length; i++) {
						if (e.getSource() == menuImages[i]) {
							if (menupage == 0) {
								if (i == 0) {
									changeIngredientsScene();
									doubleX2Set.buy();
									selectedSetMenu = doubleX2Set;
									
								} else if (i == 1) {
									changeIngredientsScene();
									wagyuEdition2Set.buy();
									selectedSetMenu = wagyuEdition2Set;
									
								} else if (i == 2) {
									changeIngredientsScene();
									AZBurgerSet.buy();
									selectedSetMenu = AZBurgerSet;
									
								} else if (i == 3) {
									changeIngredientsScene();
									hanwooBulgogiCombo.buy();
									selectedSetMenu = hanwooBulgogiCombo;
									
								} else if (i == 4) {
									changeIngredientsScene();
									hanwooBulgogiBurgerSet.buy();
									selectedSetMenu = hanwooBulgogiBurgerSet;
									
								} else if (i == 5) {
									changeIngredientsScene();
									mozzarellaInTheBurgerSet.buy();
									selectedSetMenu = mozzarellaInTheBurgerSet;
									
								} else if (i == 6) {
									changeIngredientsScene();
									bigBulgogiSet.buy();
									selectedSetMenu = bigBulgogiSet;
									
								} else if (i == 7) {
									changeIngredientsScene();
									hotCrispyBurgerSet.buy();
									selectedSetMenu = hotCrispyBurgerSet;
									
								} else if (i == 8) {
									changeIngredientsScene();
									bulgogiBurgerSet.buy();
									selectedSetMenu = bulgogiBurgerSet;
									
								}
							} else if (menupage == 1) {
								if (i == 0) {
									changeIngredientsScene();
									riaMiracleBurgerSet.buy();
									selectedSetMenu = riaMiracleBurgerSet;
									
								} else if (i == 1) {
									changeIngredientsScene();
									shrimpBurgerSet.buy();
									selectedSetMenu = shrimpBurgerSet;
									
								} else if (i == 2) {
									changeIngredientsScene();
									chickenBurgerSet.buy();
									selectedSetMenu = chickenBurgerSet;
									
								} else if (i == 3) {
									changeIngredientsScene();
									T_RexBurgerSet.buy();
									selectedSetMenu = T_RexBurgerSet;
									
								} else if (i == 4) {
									changeIngredientsScene();
									classicCheeseBurgerSet.buy();
									selectedSetMenu = classicCheeseBurgerSet;
									
								} else if (i == 5) {
									changeIngredientsScene();
									teriBurgerSet.buy();
									selectedSetMenu = teriBurgerSet;
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

					orderStatusText.get(orderStatusTextNumber).setFont((new Font("굴림체", Font.BOLD, 12)));

					removeButton.get(orderStatusTextNumber).setIcon(new ImageIcon("./otherimages/cancel.jpg"));
					quantityChangeButton.get(orderStatusTextNumber).setIcon(new ImageIcon("./otherimages/plus.jpg"));

					orderStatusBackGround.add(orderStatusText.get(orderStatusTextNumber));
					orderStatusBackGround.add(removeButton.get(orderStatusTextNumber));
					orderStatusBackGround.add(quantityChangeButton.get(orderStatusTextNumber));

					OrderStatusVerticalLength = -40;
					if (orderStatusTextNumber != 0) {
						for (int i = 0; i < orderStatusTextNumber; i++) {
							OrderStatusVerticalLength = OrderStatusVerticalLength + 20;
						}
					}
					System.out.println("orderStatusTextNumber" + orderStatusTextNumber);
					System.out.println(OrderStatusVerticalLength);

					orderStatusText.get(orderStatusTextNumber).setBounds(5, OrderStatusVerticalLength, 490, 110);
					removeButton.get(orderStatusTextNumber).setBounds(460, OrderStatusVerticalLength + 43, 20, 20);
					quantityChangeButton.get(orderStatusTextNumber).setBounds(430, OrderStatusVerticalLength + 43, 20, 20);

					orderStatusTextNumber++;

					for (int i = 0; i < orderStatusText.size(); i++) {
						removeButton.get(i).addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								for (int i = 0; i < orderStatusText.size(); i++) {
									if (e.getSource() == removeButton.get(i)) {
										orderStatusText.get(i).setLocation(1000, 1000);
										removeButton.get(i).setLocation(1000, 1000);
										quantityChangeButton.get(i).setLocation(1000, 1000);

										orderStatusText.remove(i);
										removeButton.remove(i);
										quantityChangeButton.remove(i);

										orderStatusTextNumber--;

										if (orderStatusText.size() == 0) {

										} else {
											// x버튼을 누르면 한칸씩 당겨진다.
											for (int j = 0; j < orderStatusText.size(); j++) {
												if (i + j < orderStatusText.size()) {
													orderStatusText.get(i + j).setLocation(
															orderStatusText.get(i + j).getX(),
															orderStatusText.get(i + j).getY() - 20);
													removeButton.get(i + j).setLocation(removeButton.get(i + j).getX(),
															removeButton.get(i + j).getY() - 20);
													quantityChangeButton.get(i + j).setLocation(
															quantityChangeButton.get(i + j).getX(),
															quantityChangeButton.get(i + j).getY() - 20);
												}
											}
										}

										System.out.println("삭제했습니다.");

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

						// TODO 확인해보기 
						quantityChangeButton.get(i).addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								for (int i = 0; i < orderStatusText.size(); i++) {
									if (e.getSource() == quantityChangeButton.get(i)) {
										orderSituationBackGround.setVisible(true);
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

		// 세트메뉴 추가구성 버튼 초기화
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
									hamburgerSetDessert = "포테이토";
								} else if (j == 1) {
									System.out.println("콘샐러드");
									ingerdientsNextPage();
									ingerdientsProductName.add("콘샐러드");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "콘샐러드";
								} else if (j == 2) {
									System.out.println("롱치즈스틱");
									ingerdientsNextPage();
									ingerdientsProductName.add("롱치즈스틱");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "롱치즈스틱";
								} else if (j == 3) {
									System.out.println("양념감자");
									ingerdientsNextPage();
									ingerdientsProductName.add("양념감자");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "양념감자";
								} else if (j == 4) {
									System.out.println("오징어링");
									ingerdientsNextPage();
									ingerdientsProductName.add("오징어링");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "오징어링";
								} else if (j == 5) {
									System.out.println("치즈스틱");
									ingerdientsNextPage();
									ingerdientsProductName.add("치즈스틱");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "치즈스틱";
								} else if (j == 6) {
									System.out.println("지파이 고소한맛");
									ingerdientsNextPage();
									ingerdientsProductName.add("지파이 고소한맛");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "지파이 고소한맛";
								} else if (j == 7) {
									System.out.println("지파이 하바네로");
									ingerdientsNextPage();
									ingerdientsProductName.add("지파이 하바네로");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "지파이 하바네로";
								} else if (j == 8) {
									System.out.println("쉑쉑치킨");
									ingerdientsNextPage();
									ingerdientsProductName.add("쉑쉑치킨");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "쉑쉑치킨";
								} else if (j == 9) {
									System.out.println("치즈인더에그");
									ingerdientsNextPage();
									ingerdientsProductName.add("치즈인더에그");
									System.out.println(ingerdientsProductName.toString());
									hamburgerSetDessert = "치즈인더에그";
								}
							} else if (ingerdientsPage == 1) {
								if (j == 0) {
									System.out.println("콜라");
									ingerdientsProductName.add("콜라");
									System.out.println(ingerdientsProductName.toString());
									changeMainPurchaseScene();
									hamburgerSetDrink  = "콜라";
								} else if (j == 1) {
									System.out.println("사이다");
									ingerdientsProductName.add("사이다");
									System.out.println(ingerdientsProductName.toString());
									changeMainPurchaseScene();
									hamburgerSetDrink  = "사이다";
								} else if (j == 2) {
									System.out.println("아메리카노");
									ingerdientsProductName.add("아메리카노");
									System.out.println(ingerdientsProductName.toString());
									changeMainPurchaseScene();
									hamburgerSetDrink  = "아메리카노";
								} else if (j == 3) {
									System.out.println("아이스 아메리카노");
									ingerdientsProductName.add("아이스 아메리카노");
									System.out.println(ingerdientsProductName.toString());
									changeMainPurchaseScene();
									hamburgerSetDrink  = "아이스 아메리카노";
								} else if (j == 4) {
									System.out.println("카페라떼");
									ingerdientsProductName.add("카페라떼");
									System.out.println(ingerdientsProductName.toString());
									changeMainPurchaseScene();
									hamburgerSetDrink  = "카페라떼";
								} else if (j == 5) {
									System.out.println("아이스 카페라떼");
									ingerdientsProductName.add("아이스 카페라떼");
									System.out.println(ingerdientsProductName.toString());
									changeMainPurchaseScene();
									hamburgerSetDrink  = "아이스 카페라떼";
								}
							}
						}
					}
					
					if (hamburgerSetDessert != "" && hamburgerSetDrink  != "") {
						selectIngerdientsCount++;
						System.out.println("디저트 선택 이름: " + hamburgerSetDessert);
						System.out.println("드링크 선택 이름: " + hamburgerSetDrink );
						System.out.println("버거선택횟수" + buyBurgerSetCount);
						System.out.println("추가구성세트 선택 횟수" + selectIngerdientsCount);
					
						//선택된 햄버거세트의 음료, 드링크를 설정
						changeSetMenu.changeSetMenu(selectedSetMenu , hamburgerSetDrink, hamburgerSetDessert);
					}
				}
			});
		}

		orderStatusBackGround.setBounds(50, 630, 490, 110);
		orderStatusBackGround.setIcon(new ImageIcon("./otherimages/empty.png"));
		mainPurchaseScene.add(orderStatusBackGround);

		howManyAddText.setBounds(140, -20, 300, 100);
		howManyAddText.setText("몇개 추가하시겠습니까?");
		howManyAddText.setFont(new Font("굴림", Font.BOLD, 20));
		orderSituationBackGround.add(howManyAddText);

		howManyText.setBounds(210, 80, 300, 100);
		howManyText.setText("현재 : 1 개");
		howManyText.setFont(new Font("굴림", Font.BOLD, 15));
		orderSituationBackGround.add(howManyText);

		oneThing.setText("1개");
		oneThing.setFont(new Font("굴림", Font.BOLD, 20));
		oneThing.setBounds(70, 60, 100, 50);
		orderSituationBackGround.add(oneThing);

		fiveThing.setText("5개");
		fiveThing.setFont(new Font("굴림", Font.BOLD, 20));
		fiveThing.setBounds(200, 60, 100, 50);
		orderSituationBackGround.add(fiveThing);

		tenThing.setText("10개");
		tenThing.setFont(new Font("굴림", Font.BOLD, 20));
		tenThing.setBounds(330, 60, 100, 50);
		orderSituationBackGround.add(tenThing);

		checkButton.setText("확인");
		checkButton.setFont(new Font("굴림", Font.BOLD, 20));
		checkButton.setBounds(140, 150, 100, 30);
		orderSituationBackGround.add(checkButton);

		cancelAddButton.setText("취소");
		cancelAddButton.setFont(new Font("굴림", Font.BOLD, 20));
		cancelAddButton.setBounds(260, 150, 100, 30);
		orderSituationBackGround.add(cancelAddButton);
		
		// 각 해당되는 버튼을 누르면 그 숫자만큼 제품 수가 추가됌
		oneThing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProducts(1);
			}
		});
		fiveThing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProducts(5);
			}
		});
		tenThing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProducts(10);
			}
		});
		
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderSituationBackGround.setVisible(false);
			}
		});
		
		cancelAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderSituationBackGround.setVisible(false);
				
				//추가한 수 만큼 제품을 뺀다
				/*
				selectedSetMenu.amount = selectedSetMenu.amount - addProductNum;
				System.out.println("selectedSetMenu.amount" + selectedSetMenu.amount);
				System.out.println("addProductNum" + addProductNum);
				
				totalPrice = totalPrice - selectedSetMenu.price*(selectedSetMenu.amount - addProductNum - 1);
				totalAmount = totalAmount - addProductNum;
				priceText.setText(totalPrice + "원");
				amountText.setText(totalAmount + "개");
				
				addProductNum  = 0;
				*/
			}
		});

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

		finalTotalAmount.setBounds(350, 400, 100, 20);
		finalTotalAmount.setText("총 개수 : " + totalAmount + " 개");
		finalTotalAmount.setLayout(null);
		finalTotalAmount.setVisible(true);
		paymentCheckSceneImage.add(finalTotalAmount);

		finalTotalPrice.setBounds(450, 400, 100, 20);
		finalTotalPrice.setText("총 " + totalPrice + " 원");
		finalTotalPrice.setLayout(null);
		finalTotalPrice.setVisible(true);
		paymentCheckSceneImage.add(finalTotalPrice);

		checkOKButton.setBounds(150, 500, 100, 30);
		checkOKButton.setText("결제하기");
		checkOKButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				paymentCheckSceneImage.setVisible(false);
				cardPaymentSceneImage.setVisible(true);
				insertCardButton.setVisible(true);
				//insertCardButton.setEnabled(true);
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

		insertCardImage.setBounds(100, 220, 400, 300);
		insertCardImage.setIcon(new ImageIcon("./otherimages/카드투입.png"));
		insertCardImage.setLayout(null);
		insertCardImage.setVisible(true);
		cardPaymentSceneImage.add(insertCardImage);

		insertCardButton.setBounds(100, 520, 400, 100);
		insertCardButton.setText("카드 투입");
		insertCardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				changeCardPaymentImage changeCardPaymentImage = new changeCardPaymentImage(insertCardImage,
						insertCardButton, advertisingScene, mainPurchaseScene, cardPaymentSceneImage);
				changeCardPaymentImage.start();

				insertCardButton.setVisible(false);

				for (int i = 0; i < orderStatusText.size(); i++) {
					orderStatusText.get(i).setLocation(1000, 1000);
					removeButton.get(i).setLocation(1000, 1000);
					quantityChangeButton.get(i).setLocation(1000, 1000);
					// orderStatusText.remove(i);
				}

				orderStatusText.clear();
				orderStatusTextNumber = 0;
				OrderStatusVerticalLength = -40;
				eatingPlace = "";

				orderProductName.clear();
				totalAmount = 0;
				totalPrice = 0;
				amountText.setText(totalAmount + "개");
				priceText.setText(totalPrice + "원");

				finalTotalAmount.setText("총 개수 : " + totalAmount + " 개");
				finalTotalPrice.setText("총  " + totalPrice + " 원");

			}
		});
		cardPaymentSceneImage.add(insertCardButton);
		
		changeMenu();
		changeAdvertisingScene.start();
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

	// 몇개를 추가할 것인지
	public void addProducts(int addNum) {
		
		addProductNum = addProductNum + addNum;
		
		if (orderProductName.get(productNum).equals(doubleX2Set.productName)) {
			doubleX2Set.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		} else if (orderProductName.get(productNum).equals(wagyuEdition2Set.productName)) {
			wagyuEdition2Set.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		} else if (orderProductName.get(productNum).equals(AZBurgerSet.productName)) {
			AZBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		} else if (orderProductName.get(productNum).equals(hanwooBulgogiCombo.productName)) {
			hanwooBulgogiCombo.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);
		}

		else if (orderProductName.get(productNum).equals(hanwooBulgogiBurgerSet.productName)) {
			hanwooBulgogiBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(mozzarellaInTheBurgerSet.productName)) {
			mozzarellaInTheBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(bigBulgogiSet.productName)) {
			bigBulgogiSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(hotCrispyBurgerSet.productName)) {
			hotCrispyBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(bulgogiBurgerSet.productName)) {
			bulgogiBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(riaMiracleBurgerSet.productName)) {
			riaMiracleBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(shrimpBurgerSet.productName)) {
			shrimpBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(chickenBurgerSet.productName)) {
			chickenBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(T_RexBurgerSet.productName)) {
			T_RexBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(classicCheeseBurgerSet.productName)) {
			classicCheeseBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

		}

		else if (orderProductName.get(productNum).equals(teriBurgerSet.productName)) {
			teriBurgerSet.addNumOfHamburgerSet(addNum, productNum, hamburgerSetDrink, hamburgerSetDessert);

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
		cancelPageButton.setEnabled(false);
		changeIngerdientsMenu();
		buyBurgerSetCount++;

		hamburgerSetDessert = "";
		hamburgerSetDrink  = "";

		// 세트 구성을 추가할 때는 수량조절,삭제버튼을 활성화 시킴
		for (int i = 0; i < orderStatusText.size(); i++) {
			// orderStatusText.get(i).setEditable(false);
			removeButton.get(i).setEnabled(false);
			quantityChangeButton.get(i).setEnabled(false);
			// orderStatusText.remove(i);
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
		cancelPageButton.setEnabled(true);
		
		// 세트 구성을 추가할 때는 수량조절,삭제버튼을 활성화 시킴
		for (int i = 0; i < orderStatusText.size(); i++) {
			// orderStatusText.get(i).setEditable(false);
			removeButton.get(i).setEnabled(true);
			quantityChangeButton.get(i).setEnabled(true);
			// orderStatusText.remove(i);
		}

		ingerdientsPage = 0;
		ingerdientsProductName.clear();
		System.out.println(ingerdientsProductName.toString());

		// 페이지 0은 디저트 페이지 , 페이지 1은 드링크 페이지
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

		// 페이지 0은 디저트 페이지 , 페이지 1은 드링크 페이지
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

		// 페이지 0은 디저트 페이지 , 페이지 1은 드링크 페이지
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