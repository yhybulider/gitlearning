package Test;

import java.io.File;

public class WenJian {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("user.dir"));
		File f = new File ("a.txt");
		f.createNewFile();//在本项目下的目录建立了a的TXT文本
		File f2 = new File("e:/b.txt");
		f2.createNewFile();//在e盘里已经新建了bTXT文本
}
}
