import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class changeCardPaymentImage extends Thread {

	JLabel insertCardImage;
	JButton isertCardButton;
	boolean running = true;
	
	JLabel firstScene;
	JPanel mainPurchaseScene;
	JPanel paymentCheckScene;
	JLabel cardPaymentSceneImage;
	
	public changeCardPaymentImage(JLabel insertCardImage, JButton isertCardButton, JLabel firstScene, JPanel mainPurchaseScene, JPanel paymentCheckScene, JLabel cardPaymentSceneImage) {
		this.insertCardImage = insertCardImage;
		this.isertCardButton = isertCardButton;
		this.firstScene = firstScene;
		this.mainPurchaseScene = mainPurchaseScene;
		this.paymentCheckScene = paymentCheckScene;
		this.cardPaymentSceneImage = cardPaymentSceneImage;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1; i++) {
			insertCardImage.setIcon(new ImageIcon("./otherimages/카드결제중.png"));
			isertCardButton.setEnabled(false);

			try {
				sleep(1000);
				System.out.println("이미지가 카드결제중으로 변경되었습니다.");
				
				firstScene.setVisible(true);
				mainPurchaseScene.setVisible(false);
				
			} catch (InterruptedException e) {
				running = false;
			}
		}

	}
}
