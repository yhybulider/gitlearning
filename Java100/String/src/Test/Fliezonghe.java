package Test;

import java.io.File;
import java.io.IOException;

public class Fliezonghe {
	public static void main(String[] args) {
		File file = new File("d:/t.txt");//指定一个文件
		boolean flag = file.exists();//判断是否存在
		//存在就删除，不存在就创建
		if(flag) {
			//删除
			boolean flagd = file.delete();
			if(flagd) {
				System.out.println("删除成功");
			}else {
				System.out.println("删除失败");
			}
		}else {
			//创建
			boolean flagn = true;
			try {//目录不存在，先创建目录
				File dir = file.getParentFile();
				dir.mkdir();//创建文件
				flagn = file.createNewFile();
				System.out.println("创建成功");
			}catch(IOException e) {
				System.out.println("创建失败");
				e.printStackTrace();
			}
		}
	}
}
