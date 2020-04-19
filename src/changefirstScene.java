import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class changefirstScene extends Thread{
	
	JLabel firstScene;
	boolean running = true;
	
	public changefirstScene(JLabel firstScene){
		this.firstScene = firstScene;
	}
	
	@Override
	public synchronized void run() {
		while (running) {
			try {
				
				firstScene.setIcon(new ImageIcon("./otherimages/더블x2버거광고.jpg"));
				sleep(5000);
				
				firstScene.setIcon(new ImageIcon("./otherimages/착한점심광고.png"));
				sleep(5000);
				
				firstScene.setIcon(new ImageIcon("./otherimages/지파이광고.jpg"));
				sleep(5000);
				
			} catch (InterruptedException e) {
				running = false;
			}
		}
	}
}
