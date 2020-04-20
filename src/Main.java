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
import javax.swing.JPanel;
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
	// JTextArea textArea = new JTextArea();

	static ArrayList<JLabel> OrderStatusText = new ArrayList<>();
	ArrayList<JButton> cancelButton = new ArrayList<>();
	ArrayList<JButton> quantityChangeButton = new ArrayList<>(); // 수량변경
	JLabel OrderStatusBackGround = new JLabel();

	static ArrayList<String> orderProductName = new ArrayList<String>();

	int menupage = 0;
	int menuHorizontalLength = 50;
	int menuVerticalLength = 0;
	int menuImageWidth = 150;
	int menuImageHeight = 130;
	int menuHorizontalInterval = 170;

	static int textNumber = 0;
	static int totalAmount = 0;
	static int totalPrice = 0;
	// int amount = 0;

	// static String orderProductName = "";

	String eatingPlace = "";// 매장에서 먹을 건지 포장 할 건지

	int OrderStatusVerticalLength = -40;

	changefirstScene changefirstScene = new changefirstScene(firstScene);

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
			}
		});

		/*
		 * Menu[] menu = new Menu[50];
		 * 
		 * // 세트메뉴 menu[0] = new Menu("더블X2 세트", 7500, 1); menu[1] = new
		 * Menu("와규에디션2 세트", 7600, 1); menu[2] = new Menu("AZ버거 세트", 8300, 1); menu[3] =
		 * new Menu("한우불고기 콤보", 8000, 1); menu[4] = new Menu("한우불고기 세트", 8700, 1);
		 * menu[5] = new Menu("모짜렐라 인 더 버거 세트", 7700, 1); menu[6] = new Menu("원조빅불 세트",
		 * 7600, 1); menu[7] = new Menu("핫크리스피버거 세트", 6700, 1); menu[8] = new
		 * Menu("불고기버거 세트", 5900, 1); menu[9] = new Menu("리아미라클버거 세트", 7400, 1);
		 * menu[10] = new Menu("새우버거 세트", 5900, 1); menu[11] = new Menu("치킨버거 세트", 5100,
		 * 1); menu[12] = new Menu("T-Rex 버거 세트", 5900, 1); menu[13] = new
		 * Menu("클래식치즈버거 세트", 6400, 1); menu[14] = new Menu("데리버거 세트", 4900, 1);
		 * 
		 * // 햄버거 메뉴 menu[15] = new Menu("와규에디션2", 5800, 1); menu[16] = new
		 * Menu("더블X2 세트", 7500, 1); menu[17] = new Menu("모짤렐라 인 더 버거", 6000, 1);
		 * menu[18] = new Menu("AZ버거", 6600, 1); menu[19] = new Menu("원조빅불", 5800, 1);
		 * menu[20] = new Menu("핫크리스피버거", 4900, 1); menu[21] = new Menu("한우 불고기 버거",
		 * 7000, 1); menu[22] = new Menu("리아미라클버거", 5600, 1); menu[23] = new
		 * Menu("새우버거", 3900, 1); menu[24] = new Menu("치킨버거", 2900, 1); menu[25] = new
		 * Menu("T-Rex", 3700, 1); menu[26] = new Menu("클래식 치즈버거", 4400, 1); menu[27] =
		 * new Menu("데리버거", 2500, 1);
		 * 
		 * // 디저트 메뉴 menu[28] = new Menu("치즈인더에그", 3000, 1); menu[29] = new
		 * Menu("지파이 하바네로", 4300, 1); menu[30] = new Menu("지파이 고소한맛", 3400, 1); menu[31]
		 * = new Menu("치킨너겟", 1200, 1); menu[32] = new Menu("롱 치즈스틱", 1800, 1); menu[33]
		 * = new Menu("콘샐러드", 1700, 1); menu[34] = new Menu("선데이아이스크림", 1500, 1);
		 * menu[35] = new Menu("쉑쉑치킨", 2500, 1); menu[36] = new Menu("양념감자", 2000, 1);
		 * menu[37] = new Menu("오징어링", 2200, 1); menu[38] = new Menu("치즈스틱", 2000, 1);
		 * menu[39] = new Menu("포테이토", 1500, 1); menu[40] = new Menu("토네이도(초코쿠키)", 2300,
		 * 1); menu[41] = new Menu("토네이도(녹차)", 2300, 1); menu[42] = new
		 * Menu("토네이도(스트로베리)", 2400, 1); menu[43] = new Menu("소프트콘", 700, 1);
		 * 
		 * // 음료수 메뉴 menu[44] = new Menu("아이스 아메리카노", 2000, 1); menu[45] = new
		 * Menu("사이다", 1700, 1); menu[46] = new Menu("콜라", 1700, 1); menu[47] = new
		 * Menu("아메리카노", 2000, 1); menu[48] = new Menu("카페라떼", 2000, 1); menu[49] = new
		 * Menu("아이스카페라떼", 2000, 1);
		 */

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

		packagingDeliveringScene.setBounds(0, 0, 600, 850);
		frame.getContentPane().add(packagingDeliveringScene);
		packagingDeliveringScene.setLayout(null);
		packagingDeliveringScene.setVisible(false);

		mainPurchaseScene.setBounds(0, 0, 600, 850);
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
		packagingButton.setBounds(320, 330, 150, 150);
		packagingButton.setIcon(new ImageIcon("./otherimages/delivery.jpg"));
		packagingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eatingPlace = "매장";

				packagingDeliveringScene.setVisible(false);
				mainPurchaseScene.setVisible(true);
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
				drinkButton.setBackground(Color.gray);
				dessertButton.setBackground(Color.white);

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
				drinkButton.setBackground(Color.white);
				dessertButton.setBackground(Color.gray);

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
					// OrderStatusText.remove(i);
				}

				OrderStatusText.clear();
				textNumber = 0;
				OrderStatusVerticalLength = -40;
				eatingPlace = "";

				System.out.println(OrderStatusText.size());
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

				totalAmount = 0;
				totalPrice = 0;
				numberText.setText(totalAmount + "개");
				amountText.setText(totalPrice + "원");
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
									doubleX2Set.buy();
								} else if (i == 1) {
									wagyuEdition2Set.buy();
								} else if (i == 2) {
									AZBurgerSet.buy();
								} else if (i == 3) {
									hanwooBulgogiCombo.buy();
								} else if (i == 4) {
									hanwooBulgogiBurgerSet.buy();
								} else if (i == 5) {
									mozzarellaInTheBurgerSet.buy();
								} else if (i == 6) {
									bigBulgogiSet.buy();
								} else if (i == 7) {
									hotCrispyBurgerSet.buy();
								} else if (i == 8) {
									bulgogiBurgerSet.buy();
								}
							} else if (menupage == 1) {
								if (i == 0) {
									riaMiracleBurgerSet.buy();
								} else if (i == 1) {
									shrimpBurgerSet.buy();
								} else if (i == 2) {
									chickenBurgerSet.buy();
								} else if (i == 3) {
									T_RexBurgerSet.buy();
								} else if (i == 4) {
									classicCheeseBurgerSet.buy();
								} else if (i == 5) {
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
					quantityChangeButton.get(textNumber).setIcon(new ImageIcon("./otherimages/change.jpg"));

					OrderStatusBackGround.add(OrderStatusText.get(textNumber));
					OrderStatusBackGround.add(cancelButton.get(textNumber));
					OrderStatusBackGround.add(quantityChangeButton.get(textNumber));

					OrderStatusText.get(textNumber).setBounds(5, OrderStatusVerticalLength, 490, 110);
					cancelButton.get(textNumber).setBounds(200, OrderStatusVerticalLength + 43, 20, 20);
					quantityChangeButton.get(textNumber).setBounds(150, OrderStatusVerticalLength + 43, 20, 20);
					OrderStatusVerticalLength = OrderStatusVerticalLength + 20;

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

										// 햄버거 세트 삭제 기능
										for (int j = 0; j < orderProductName.size(); j++) {
											if (orderProductName.get(i).equals(doubleX2Set.productName)) {
												totalAmount -= doubleX2Set.amount;
												totalPrice -= doubleX2Set.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(doubleX2Set.productName);

												System.out.println("더블X2세트 갯수: " + doubleX2Set.amount + "더블X2세트 가격: "
														+ doubleX2Set.price);
												System.out.println(
														"총 가격: " + (totalPrice + doubleX2Set.price) + "에서  더블X2세트 가격: "
																+ doubleX2Set.price + "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(wagyuEdition2Set.productName)) {
												totalAmount -= wagyuEdition2Set.amount;
												totalPrice -= wagyuEdition2Set.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(wagyuEdition2Set.productName);

												System.out.println("와규에디션2세트 갯수: " + wagyuEdition2Set.amount
														+ "와규에디션2세트 가격: " + wagyuEdition2Set.price);
												System.out.println("총 가격: " + (totalPrice + wagyuEdition2Set.price)
														+ "에서  와규에디션2세트 가격: " + wagyuEdition2Set.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(AZBurgerSet.productName)) {
												totalAmount -= AZBurgerSet.amount;
												totalPrice -= AZBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(AZBurgerSet.productName);

												System.out.println("아재버거세트 갯수: " + AZBurgerSet.amount + "아재버거세트 가격: "
														+ AZBurgerSet.price);
												System.out.println(
														"총 가격: " + (totalPrice + AZBurgerSet.price) + "에서  아재버거세트 가격: "
																+ AZBurgerSet.price + "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(hanwooBulgogiCombo.productName)) {
												totalAmount -= hanwooBulgogiCombo.amount;
												totalPrice -= hanwooBulgogiCombo.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(hanwooBulgogiCombo.productName);

												System.out.println("한우불고기 콤보 갯수: " + hanwooBulgogiCombo.amount
														+ "한우불고기 콤보 가격: " + hanwooBulgogiCombo.price);
												System.out.println("총 가격: " + (totalPrice + hanwooBulgogiCombo.price)
														+ "에서  한우불고기 콤보 가격: " + hanwooBulgogiCombo.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i)
													.equals(hanwooBulgogiBurgerSet.productName)) {
												totalAmount -= hanwooBulgogiBurgerSet.amount;
												totalPrice -= hanwooBulgogiBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(hanwooBulgogiBurgerSet.productName);

												System.out.println("한우불고기 세트 갯수: " + hanwooBulgogiBurgerSet.amount
														+ "한우불고기 세트 가격: " + hanwooBulgogiBurgerSet.price);
												System.out
														.println("총 가격: " + (totalPrice + hanwooBulgogiBurgerSet.price)
																+ "에서  한우불고기 세트 가격: " + hanwooBulgogiBurgerSet.price
																+ "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i)
													.equals(mozzarellaInTheBurgerSet.productName)) {
												totalAmount -= mozzarellaInTheBurgerSet.amount;
												totalPrice -= mozzarellaInTheBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(mozzarellaInTheBurgerSet.productName);

												System.out.println("모짜렐라 인 더 버거 세트 갯수: "
														+ mozzarellaInTheBurgerSet.amount + "모짜렐라 인 더 버거 세트 가격: "
														+ mozzarellaInTheBurgerSet.price);
												System.out.println("총 가격: "
														+ (totalPrice + mozzarellaInTheBurgerSet.price)
														+ "에서  모짜렐라 인 더 버거 세트 가격: " + mozzarellaInTheBurgerSet.price
														+ "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(bigBulgogiSet.productName)) {
												totalAmount -= bigBulgogiSet.amount;
												totalPrice -= bigBulgogiSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(bigBulgogiSet.productName);

												System.out.println("원조빅불 세트 갯수: " + bigBulgogiSet.amount
														+ "원조빅불 세트 가격: " + bigBulgogiSet.price);
												System.out.println("총 가격: " + (totalPrice + bigBulgogiSet.price)
														+ "에서  원조빅불 세트 가격: " + bigBulgogiSet.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(hotCrispyBurgerSet.productName)) {
												totalAmount -= hotCrispyBurgerSet.amount;
												totalPrice -= hotCrispyBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(hotCrispyBurgerSet.productName);

												System.out.println("핫크리스피버거 세트 갯수: " + hotCrispyBurgerSet.amount
														+ "핫크리스피버거 세트 가격: " + hotCrispyBurgerSet.price);
												System.out.println("총 가격: " + (totalPrice + hotCrispyBurgerSet.price)
														+ "에서  핫크리스피버거 세트 가격: " + hotCrispyBurgerSet.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(bulgogiBurgerSet.productName)) {
												totalAmount -= bulgogiBurgerSet.amount;
												totalPrice -= bulgogiBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(bulgogiBurgerSet.productName);

												System.out.println("불고기버거 세트 갯수: " + bulgogiBurgerSet.amount
														+ "불고기버거 세트 가격: " + bulgogiBurgerSet.price);
												System.out.println("총 가격: " + (totalPrice + bulgogiBurgerSet.price)
														+ "에서  불고기버거 세트 가격: " + bulgogiBurgerSet.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(riaMiracleBurgerSet.productName)) {
												totalAmount -= riaMiracleBurgerSet.amount;
												totalPrice -= riaMiracleBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(riaMiracleBurgerSet.productName);

												System.out.println("리아미라클버거 세트 갯수: " + riaMiracleBurgerSet.amount
														+ "리아미라클버거 가격: " + riaMiracleBurgerSet.price);
												System.out.println("총 가격: " + (totalPrice + riaMiracleBurgerSet.price)
														+ "에서  리아미라클버거 가격: " + riaMiracleBurgerSet.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(shrimpBurgerSet.productName)) {
												totalAmount -= shrimpBurgerSet.amount;
												totalPrice -= shrimpBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(shrimpBurgerSet.productName);

												System.out.println("새우버거 세트 갯수: " + shrimpBurgerSet.amount
														+ "새우버거 세트 가격: " + shrimpBurgerSet.price);
												System.out.println("총 가격: " + (totalPrice + shrimpBurgerSet.price)
														+ "에서  새우버거 세트 가격: " + shrimpBurgerSet.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(chickenBurgerSet.productName)) {
												totalAmount -= chickenBurgerSet.amount;
												totalPrice -= chickenBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(chickenBurgerSet.productName);

												System.out.println("치킨버거 세트 갯수: " + chickenBurgerSet.amount
														+ "치킨버거 세트 가격: " + chickenBurgerSet.price);
												System.out.println("총 가격: " + (totalPrice + chickenBurgerSet.price)
														+ "에서  치킨버거 세트 가격: " + chickenBurgerSet.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(T_RexBurgerSet.productName)) {
												totalAmount -= T_RexBurgerSet.amount;
												totalPrice -= T_RexBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(T_RexBurgerSet.productName);

												System.out.println("T-Rex 버거 세트 갯수: " + T_RexBurgerSet.amount
														+ "T-Rex 버거 세트 가격: " + T_RexBurgerSet.price);
												System.out.println("총 가격: " + (totalPrice + T_RexBurgerSet.price)
														+ "에서  T-Rex 버거 세트 가격: " + T_RexBurgerSet.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i)
													.equals(classicCheeseBurgerSet.productName)) {
												totalAmount -= classicCheeseBurgerSet.amount;
												totalPrice -= classicCheeseBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(classicCheeseBurgerSet.productName);

												System.out.println("클래식치즈버거 세트 갯수: " + classicCheeseBurgerSet.amount
														+ "클래식치즈버거 세트 가격: " + classicCheeseBurgerSet.price);
												System.out
														.println("총 가격: " + (totalPrice + classicCheeseBurgerSet.price)
																+ "에서  클래식치즈버거 세트 가격: " + classicCheeseBurgerSet.price
																+ "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(teriBurgerSet.productName)) {
												totalAmount -= teriBurgerSet.amount;
												totalPrice -= teriBurgerSet.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(teriBurgerSet.productName);

												System.out.println("데리버거 세트 갯수: " + teriBurgerSet.amount
														+ "데리버거 세트 가격: " + teriBurgerSet.price);
												System.out.println("총 가격: " + (totalPrice + teriBurgerSet.price)
														+ "에서  데리버거 세트 가격: " + teriBurgerSet.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											// 햄버거 삭제 기능
											else if (orderProductName.get(i).equals(wagyuEdition2.productName)) {
												totalAmount -= wagyuEdition2.amount;
												totalPrice -= wagyuEdition2.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(wagyuEdition2.productName);

												System.out.println("와규에디션2 갯수: " + wagyuEdition2.amount
														+ "와규에디션2 가격: " + wagyuEdition2.price);
												System.out.println("총 가격: " + (totalPrice + wagyuEdition2.price)
														+ "에서  와규에디션2세트 가격: " + wagyuEdition2.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}
											
											else if (orderProductName.get(i).equals(doubleX2.productName)) {
												totalAmount -= doubleX2.amount;
												totalPrice -= doubleX2.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(doubleX2.productName);

												System.out.println("더블X2 갯수: " + doubleX2.amount + "더블X2 가격: "
														+ doubleX2.price);
												System.out.println(
														"총 가격: " + (totalPrice + doubleX2.price) + "에서  더블X2 가격: "
																+ doubleX2.price + "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(mozzarellaInTheBurger.productName)) {
												totalAmount -= mozzarellaInTheBurger.amount;
												totalPrice -= mozzarellaInTheBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(mozzarellaInTheBurger.productName);

												System.out.println("모짤렐라 인 더 버거 갯수: " + mozzarellaInTheBurger.amount + "모짤렐라 인 더 버거 가격: "
														+ mozzarellaInTheBurger.price);
												System.out.println(
														"총 가격: " + (totalPrice + mozzarellaInTheBurger.price) + "에서  모짤렐라 인 더 버거 가격: "
																+ mozzarellaInTheBurger.price + "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(AZBurger.productName)) {
												totalAmount -= AZBurger.amount;
												totalPrice -= AZBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(AZBurger.productName);

												System.out.println("AZ버거 갯수: " + AZBurger.amount
														+ "AZ버거 가격: " + AZBurger.price);
												System.out.println("총 가격: " + (totalPrice + AZBurger.price)
														+ "에서  AZ버거 가격: " + AZBurger.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i)
													.equals(bigBulgogi.productName)) {
												totalAmount -= bigBulgogi.amount;
												totalPrice -= bigBulgogi.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(bigBulgogi.productName);

												System.out.println("원조빅불 갯수: " + bigBulgogi.amount
														+ "원조빅불 가격: " + bigBulgogi.price);
												System.out
														.println("총 가격: " + (totalPrice + bigBulgogi.price)
																+ "에서  원조빅불 가격: " + bigBulgogi.price
																+ "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i)
													.equals(hotCrispyBurger.productName)) {
												totalAmount -= hotCrispyBurger.amount;
												totalPrice -= hotCrispyBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(hotCrispyBurger.productName);

												System.out.println("핫크리스피버거 갯수: "
														+ hotCrispyBurger.amount + "핫크리스피버거 가격: "
														+ hotCrispyBurger.price);
												System.out.println("총 가격: "
														+ (totalPrice + hotCrispyBurger.price)
														+ "에서  핫크리스피버거 가격: " + hotCrispyBurger.price
														+ "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(hanwooBulgogi.productName)) {
												totalAmount -= hanwooBulgogi.amount;
												totalPrice -= hanwooBulgogi.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(hanwooBulgogi.productName);

												System.out.println("한우 불고기 버거 갯수: " + hanwooBulgogi.amount
														+ "한우 불고기 버거 가격: " + hanwooBulgogi.price);
												System.out.println("총 가격: " + (totalPrice + hanwooBulgogi.price)
														+ "에서  한우 불고기 버거 가격: " + hanwooBulgogi.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(riaMiracleBurger.productName)) {
												totalAmount -= riaMiracleBurger.amount;
												totalPrice -= riaMiracleBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(riaMiracleBurger.productName);

												System.out.println("리아미라클버거 갯수: " + riaMiracleBurger.amount
														+ "리아미라클버거 가격: " + riaMiracleBurger.price);
												System.out.println("총 가격: " + (totalPrice + riaMiracleBurger.price)
														+ "에서  리아미라클버거 가격: " + riaMiracleBurger.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(shrimpBurger.productName)) {
												totalAmount -= shrimpBurger.amount;
												totalPrice -= shrimpBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(shrimpBurger.productName);

												System.out.println("새우버거 갯수: " + shrimpBurger.amount
														+ "새우버거 가격: " + shrimpBurger.price);
												System.out.println("총 가격: " + (totalPrice + shrimpBurger.price)
														+ "에서  새우버거 가격: " + shrimpBurger.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(chickenBurger.productName)) {
												totalAmount -= chickenBurger.amount;
												totalPrice -= chickenBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(chickenBurger.productName);

												System.out.println("치킨버거 갯수: " + chickenBurger.amount
														+ "치킨버거 가격: " + chickenBurger.price);
												System.out.println("총 가격: " + (totalPrice + chickenBurger.price)
														+ "에서  치킨버거 가격: " + chickenBurger.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(T_RexBurger.productName)) {
												totalAmount -= T_RexBurger.amount;
												totalPrice -= T_RexBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(T_RexBurger.productName);

												System.out.println("T-Rex 갯수: " + T_RexBurger.amount
														+ "T-Rex 가격: " + T_RexBurger.price);
												System.out.println("총 가격: " + (totalPrice + T_RexBurger.price)
														+ "에서  T-Rex 가격: " + T_RexBurger.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(classicCheeseBurger.productName)) {
												totalAmount -= classicCheeseBurger.amount;
												totalPrice -= classicCheeseBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(classicCheeseBurger.productName);

												System.out.println("클래식 치즈버거 갯수: " + classicCheeseBurger.amount
														+ "클래식 치즈버거 가격: " + classicCheeseBurger.price);
												System.out.println("총 가격: " + (totalPrice + classicCheeseBurger.price)
														+ "에서  클래식 치즈버거 가격: " + classicCheeseBurger.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(teriBurger.productName)) {
												totalAmount -= teriBurger.amount;
												totalPrice -= teriBurger.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(teriBurger.productName);

												System.out.println("데리버거 갯수: " + teriBurger.amount
														+ "데리버거 가격: " + teriBurger.price);
												System.out.println("총 가격: " + (totalPrice + teriBurger.price)
														+ "에서  데리버거 가격: " + teriBurger.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}
											
											// 디저트 삭제 기능
											else if (orderProductName.get(i).equals(cheeseInTheEgg.productName)) {
												totalAmount -= cheeseInTheEgg.amount;
												totalPrice -= cheeseInTheEgg.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(cheeseInTheEgg.productName);

												System.out.println("치즈인더에그 갯수: " + cheeseInTheEgg.amount
														+ "치즈인더에그 가격: " + cheeseInTheEgg.price);
												System.out.println("총 가격: " + (totalPrice + cheeseInTheEgg.price)
														+ "에서  치즈인더에그 가격: " + cheeseInTheEgg.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(jipieHabanero_L.productName)) {
												totalAmount -= jipieHabanero_L.amount;
												totalPrice -= jipieHabanero_L.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(jipieHabanero_L.productName);

												System.out.println("지파이 하바네로 갯수: " + jipieHabanero_L.amount + "지파이 하바네로 가격: "
														+ jipieHabanero_L.price);
												System.out.println(
														"총 가격: " + (totalPrice + jipieHabanero_L.price) + "에서  지파이 하바네로 가격: "
																+ jipieHabanero_L.price + "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(jipie_S.productName)) {
												totalAmount -= jipie_S.amount;
												totalPrice -= jipie_S.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(jipie_S.productName);

												System.out.println("지파이 고소한맛 갯수: " + jipie_S.amount
														+ "지파이 고소한맛 가격: " + jipie_S.price);
												System.out.println("총 가격: " + (totalPrice + jipie_S.price)
														+ "에서  지파이 고소한맛 가격: " + jipie_S.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i)
													.equals(chickenNugget.productName)) {
												totalAmount -= chickenNugget.amount;
												totalPrice -= chickenNugget.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(chickenNugget.productName);

												System.out.println("치킨너겟 갯수: " + chickenNugget.amount
														+ "치킨너겟 가격: " + chickenNugget.price);
												System.out
														.println("총 가격: " + (totalPrice + chickenNugget.price)
																+ "에서  치킨너겟 가격: " + chickenNugget.price
																+ "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i)
													.equals(longCheeseStick.productName)) {
												totalAmount -= longCheeseStick.amount;
												totalPrice -= longCheeseStick.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(longCheeseStick.productName);

												System.out.println("롱 치즈스틱 갯수: "
														+ longCheeseStick.amount + "롱 치즈스틱 가격: "
														+ longCheeseStick.price);
												System.out.println("총 가격: "
														+ (totalPrice + longCheeseStick.price)
														+ "에서  롱 치즈스틱 가격: " + longCheeseStick.price
														+ "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(coneSalad.productName)) {
												totalAmount -= coneSalad.amount;
												totalPrice -= coneSalad.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(coneSalad.productName);

												System.out.println("콘샐러드 갯수: " + coneSalad.amount
														+ "콘샐러드 가격: " + coneSalad.price);
												System.out.println("총 가격: " + (totalPrice + coneSalad.price)
														+ "에서  콘샐러드 가격: " + coneSalad.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(sundayIceCream.productName)) {
												totalAmount -= sundayIceCream.amount;
												totalPrice -= sundayIceCream.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(sundayIceCream.productName);

												System.out.println("선데이아이스크림 갯수: " + sundayIceCream.amount
														+ "선데이아이스크림 가격: " + sundayIceCream.price);
												System.out.println("총 가격: " + (totalPrice + sundayIceCream.price)
														+ "에서  선데이아이스크림 가격: " + sundayIceCream.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(shakeShakeChicken.productName)) {
												totalAmount -= shakeShakeChicken.amount;
												totalPrice -= shakeShakeChicken.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(shakeShakeChicken.productName);

												System.out.println("쉑쉑치킨 갯수: " + shakeShakeChicken.amount
														+ "쉑쉑치킨 가격: " + shakeShakeChicken.price);
												System.out.println("총 가격: " + (totalPrice + shakeShakeChicken.price)
														+ "에서  쉑쉑치킨 가격: " + shakeShakeChicken.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(seasoningPotato.productName)) {
												totalAmount -= seasoningPotato.amount;
												totalPrice -= seasoningPotato.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(seasoningPotato.productName);

												System.out.println("양념감자 갯수: " + seasoningPotato.amount
														+ "양념감자 가격: " + seasoningPotato.price);
												System.out.println("총 가격: " + (totalPrice + seasoningPotato.price)
														+ "에서  양념감자 가격: " + seasoningPotato.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(squidRing.productName)) {
												totalAmount -= squidRing.amount;
												totalPrice -= squidRing.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(squidRing.productName);

												System.out.println("오징어링 갯수: " + squidRing.amount
														+ "오징어링 가격: " + squidRing.price);
												System.out.println("총 가격: " + (totalPrice + squidRing.price)
														+ "에서  오징어링 가격: " + squidRing.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(naturalCheeseStick.productName)) {
												totalAmount -= naturalCheeseStick.amount;
												totalPrice -= naturalCheeseStick.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(naturalCheeseStick.productName);

												System.out.println("치즈스틱 갯수: " + naturalCheeseStick.amount
														+ "치즈스틱 가격: " + naturalCheeseStick.price);
												System.out.println("총 가격: " + (totalPrice + naturalCheeseStick.price)
														+ "에서  치즈스틱 가격: " + naturalCheeseStick.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(potato.productName)) {
												totalAmount -= potato.amount;
												totalPrice -= potato.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(potato.productName);

												System.out.println("포테이토 갯수: " + potato.amount
														+ "포테이토 가격: " + potato.price);
												System.out.println("총 가격: " + (totalPrice + potato.price)
														+ "에서  포테이토 가격: " + potato.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i)
													.equals(chocoCookieTornado.productName)) {
												totalAmount -= chocoCookieTornado.amount;
												totalPrice -= chocoCookieTornado.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(chocoCookieTornado.productName);

												System.out.println("토네이도(초코쿠키) 갯수: " + chocoCookieTornado.amount
														+ "토네이도(초코쿠키) 가격: " + chocoCookieTornado.price);
												System.out
														.println("총 가격: " + (totalPrice + chocoCookieTornado.price)
																+ "에서  토네이도(초코쿠키) 가격: " + chocoCookieTornado.price
																+ "을 뺀 값은 " + totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}

											else if (orderProductName.get(i).equals(greenTeaTornado.productName)) {
												totalAmount -= greenTeaTornado.amount;
												totalPrice -= greenTeaTornado.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(greenTeaTornado.productName);

												System.out.println("토네이도(녹차) 갯수: " + greenTeaTornado.amount
														+ "토네이도(녹차) 가격: " + greenTeaTornado.price);
												System.out.println("총 가격: " + (totalPrice + greenTeaTornado.price)
														+ "에서  토네이도(녹차) 가격: " + greenTeaTornado.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}
											
											else if (orderProductName.get(i).equals(strawberryTornado.productName)) {
												totalAmount -= strawberryTornado.amount;
												totalPrice -= strawberryTornado.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(strawberryTornado.productName);

												System.out.println("토네이도(스트로베리) 갯수: " + strawberryTornado.amount
														+ "토네이도(스트로베리) 가격: " + strawberryTornado.price);
												System.out.println("총 가격: " + (totalPrice + strawberryTornado.price)
														+ "에서  토네이도(스트로베리) 가격: " + strawberryTornado.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}
											
											else if (orderProductName.get(i).equals(softCone.productName)) {
												totalAmount -= softCone.amount;
												totalPrice -= softCone.price;
												numberText.setText(totalAmount + "개");
												amountText.setText(totalPrice + "원");
												orderProductName.remove(softCone.productName);

												System.out.println("소프트콘 갯수: " + softCone.amount
														+ "소프트콘 가격: " + softCone.price);
												System.out.println("총 가격: " + (totalPrice + softCone.price)
														+ "에서  소프트콘 가격: " + softCone.price + "을 뺀 값은 "
														+ totalPrice);
												System.out.println(orderProductName.toString());
												break;
											}
										}

										System.out.println("삭제했습니다");

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


									}
								}
							}
						});

						quantityChangeButton.get(i).addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

							}
						});
					}
				}
			});
		}

		OrderStatusBackGround.setBounds(50, 630, 490, 110);
		OrderStatusBackGround.setIcon(new ImageIcon("./otherimages/empty.png"));
		mainPurchaseScene.add(OrderStatusBackGround);

		/*
		 * for (int j = 0; j < orderProductName.size(); j++) {
		 * System.out.println(orderProductName.get(j)); }
		 */

		/*
		 * for(int i = 0; i < menuImages.length; i++) {
		 * 
		 * }
		 */

		changeMenu();
		changefirstScene.start();

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
}
