import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class changeCardPaymentImage extends Thread {

	JLabel insertCardImage;
	JButton insertCardButton;
	boolean running = true;
	
	JLabel advertisingScene;
	JPanel mainPurchaseScene;
	JLabel cardPaymentSceneImage;
	
	public changeCardPaymentImage(JLabel insertCardImage, JButton insertCardButton, JLabel advertisingScene, JPanel mainPurchaseScene, JLabel cardPaymentSceneImage) {
		this.insertCardImage = insertCardImage;
		this.insertCardButton = insertCardButton;
		this.advertisingScene = advertisingScene;
		this.mainPurchaseScene = mainPurchaseScene;
		this.cardPaymentSceneImage = cardPaymentSceneImage;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1; i++) {
			insertCardImage.setIcon(new ImageIcon("./otherimages/카드결제중.png"));
			insertCardButton.setEnabled(false);

			try {
				sleep(3000);
				System.out.println("이미지가 카드결제중으로 변경되었습니다.");
				
				advertisingScene.setVisible(true);
				mainPurchaseScene.setVisible(false);
				
			} catch (InterruptedException e) {
				running = false;
			}
		}

	}
}
