import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class changeCardPaymentImage extends Thread{
	
	JLabel insertCardImage;
	JButton isertCardButton;
	boolean running = true;
	
	public changeCardPaymentImage(JLabel insertCardImage, JButton isertCardButton){
		this.insertCardImage = insertCardImage;
		this.isertCardButton = isertCardButton;
	}

	@Override
	public void run() {
		while (running) {
			try {
				insertCardImage.setIcon(new ImageIcon("./otherimages/카드결제중.png"));
				isertCardButton.setEnabled(false);
				sleep(1000);
			}catch (InterruptedException e) {
				running = false;
			}
		}
	}
}

