package taiqiu;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("iamges/BALL.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("iamges/desk.jpg");
	
	double x=100;   //小球的横坐标
	double y=100; //小球的纵坐标
	boolean right = true;//方向
	//画窗口的方法
	public void paint(Graphics  g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		if(right) {
			x = x +10;
			
		}else {
			x = x - 10;
		}
		
		if(x>856-40-30) {
			right = false;
		}
		
		if(x<40) {
			right = true;
		}
	}
	
	//窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(150,250);
		setVisible(true);
		
		//重画窗口，每秒画25次
		while(true) {
			repaint();
			try {
				Thread.sleep(10);//40ms,1秒=1000毫秒
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//mian方法是程序执行的入口
	public static void main(String[] args) {
		System.out.println(" 我是尚学堂高启，这个游泳项目让大家体验编程的快感，寓教于乐！");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
