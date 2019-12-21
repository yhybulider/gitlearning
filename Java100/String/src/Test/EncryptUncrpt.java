package Test;
/*
 * 这篇不是很懂，要回来继续看。
 */

public class EncryptUncrpt {
	public static String EAndU(String value,char secret) {//对value加密，secret密文字符
		
		byte[] bt = value.getBytes();//将需要加密的内容转换成字节数组
		for(int i = 0;i<bt.length;i++) {
		
			bt[i] = (byte)(bt[i]^(int) secret);//通过异或运算进行加密
		}
		return new String(bt,0,bt.length);
	}
	public static void main(String[] args) {
		String value = "我爱Java";
		char secret = '祈';
		System.out.println("源字符串是："+ value);
		String encrypt = EncryptUncrpt.EAndU(value,secret);//加密
		System.out.println("源字符串为：" + encrypt);
		String uncrypt = EncryptUncrpt.EAndU(encrypt,secret);//解密
		System.out.println("解密后的值："+ uncrypt);
	}
	
}
