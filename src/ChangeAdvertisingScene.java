import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChangeAdvertisingScene extends Thread{
	
	JLabel advertisingScene; // 광고이미지 바꾸는 씬
	boolean running = true;
	
	public ChangeAdvertisingScene(JLabel advertisingScene){
		this.advertisingScene = advertisingScene;
	}
	
	@Override
	public synchronized void run() {
		while (running) {
			try {
				
				advertisingScene.setIcon(new ImageIcon("./otherimages/더블x2버거광고.jpg"));
				sleep(5000);
				
				advertisingScene.setIcon(new ImageIcon("./otherimages/착한점심광고.png"));
				sleep(5000);
				
				advertisingScene.setIcon(new ImageIcon("./otherimages/지파이광고.jpg"));
				sleep(5000);
				
			} catch (InterruptedException e) {
				running = false;
			}
		}
	}
}
