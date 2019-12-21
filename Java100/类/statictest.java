public class statictest {//考察这个代码的打印情况
    //3 第三步
    Person person = new Person("Test");
    //这里是第一个person参数：test 5运行完4后就开始通过构造器来生成对象，这里Person没有加载过，去找Person
    static {
    //3有static块，直接运行这一步。所以一开始打印这一句
        System.out.println("test static");
    }

    public statictest() {
        System.out.println("test constructor");
    //7打印第五句
    }

    public static void main(String[] args) {
    //1主方法入口，第一先读取这里
        new MyClass();
    
    }
}

class Person {
    //6过来就运行static块，打印第三句
    static {
        System.out.println("person static");
    }

    public Person(String str) {
    //6打印第一个参数test，第四句
        System.out.println("person " + str);
    }
}

class MyClass extends statictest {
    //2继承的是statictest类，所以先看上面的statictest
    Person person = new Person("MyClass");
    //8运行完stasictest，开始打印这里的person
    static{
    //4加载statictest完，回来加载MyClass，发现static，直接第二步打印
        System.out.println("myclass static");
    }
     
    public MyClass() {
        System.out.println("myclass constructor");
    //9最后运行到这一步，打印出最后一句
    }
}

/*答案
test static
myclass static
person static
person Test
test constructor
person MyClass
myclass constructor
*/