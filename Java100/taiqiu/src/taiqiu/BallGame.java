package taiqiu;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("iamges/BALL.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("iamges/desk.jpg");
	
	double x=100;   //С��ĺ�����
	double y=100; //С���������
	boolean right = true;//����
	//�����ڵķ���
	public void paint(Graphics  g) {
		System.out.println("���ڱ�����һ��");
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
	
	//���ڼ���
	void launchFrame() {
		setSize(856,500);
		setLocation(150,250);
		setVisible(true);
		
		//�ػ����ڣ�ÿ�뻭25��
		while(true) {
			repaint();
			try {
				Thread.sleep(10);//40ms,1��=1000����
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//mian�����ǳ���ִ�е����
	public static void main(String[] args) {
		System.out.println(" ������ѧ�ø����������Ӿ��Ŀ�ô�������̵Ŀ�У�Ԣ�����֣�");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
