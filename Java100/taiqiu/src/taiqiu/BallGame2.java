package taiqiu;

import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("iamges/BALL.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("iamges/desk.jpg");
	
	double x=100;   //С��ĺ�����
	double y=100; //С���������
	
	double degree = 3.14/3;//���ȡ��˴����ǣ�60��
	boolean right = true;//����
	//�����ڵķ���
	public void paint(Graphics  g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x = x+ 10*Math.cos(degree);
		y = y+ 10*Math.sin(degree);
		
		//�������±߽�
		
		if(y>500-40-30||y<40+40){//500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ���ĸ߶�
		
			degree = -degree;
		}
		
		//�������ұ߽�
		if(x<40||x>856-40-30) {
			degree = 3.14 - degree;
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
				Thread.sleep(40);//40ms,1��=1000����
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//mian�����ǳ���ִ�е����
	public static void main(String[] args) {
		System.out.println(" ������ѧ�ø����������Ӿ��Ŀ�ô�������̵Ŀ�У�Ԣ�����֣�");
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}
}