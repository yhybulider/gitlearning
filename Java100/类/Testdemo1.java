class Book{  //定义新的类
    String name;
    double prices;

    public void getInfo(){
        System.out.println("书的名字"+ name);
    }

    public static void println(){
        getInfo();
    }
}

public class Testdemo1{ //下面是在主类中使用book类
    public static void main(String args[]){
        Book bk = new Book();
        bk.name = "diyihangdaima";  //操作属性
        bk.prices = 111;
        bk.getInfo();  //调用book中的方法
    }

}