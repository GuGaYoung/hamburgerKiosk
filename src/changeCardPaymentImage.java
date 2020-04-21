import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class changeCardPaymentImage extends Thread {

	JLabel insertCardImage;
	JButton isertCardButton;
	boolean running = true;

	public changeCardPaymentImage(JLabel insertCardImage, JButton isertCardButton) {
		this.insertCardImage = insertCardImage;
		this.isertCardButton = isertCardButton;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1; i++) {
			insertCardImage.setIcon(new ImageIcon("./otherimages/카드결제중.png"));
			isertCardButton.setEnabled(false);

			try {
				sleep(1000);
				System.out.println("이미지가 교체되었나용");

			} catch (InterruptedException e) {
				running = false;
			}
		}

	}
}
