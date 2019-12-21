package Test;

/*abstract class Abstract {//有抽象方法只能定义为抽象类
	abstract public void shout();//抽象方法
}
class Dog extends Abstract{//子类必须实现父类的抽象方法，否则编译错误
	public void shout() {
		System.out.println("汪汪！");
		
	}
	public void seeDoor() {
		System.out.println("看门中。。。");
	}
}
//测试抽象类
 public  class TestAbstractClass{
	public static void main(String[] args) {
		Dog a = new Dog();
		a.shout();
		a.seeDoor();
	}
}*/
class Animal {
	public void shout() {
		System.out.println("叫了一声！");
	
	}
}

class Dog extends Animal {
	public void shout() {
		System.out.println("旺旺旺！");
	}

	public void seeDoor() {
		System.out.println("看门中....");
	}
}

class Cat extends Animal {
	public void shout() {
		System.out.println("喵喵喵喵！");
	}
}

public class Abstract {
public static void main(String[] args) {
	Animal a1 = new Cat(); // 向上可以自动转型
//传的具体是哪一个类就调用哪一个类的方法。大大提高了程序的可扩展性。
	animalCry(a1);
	Animal a2 = new Dog();
	animalCry(a2);//a2为编译类型，Dog对象才是运行时类型。
 
//编写程序时，如果想调用运行时类型的方法，只能进行强制类型转换。
// 否则通不过编译器的检查。
	Dog dog = (Dog)a2;//向下需要强制类型转换
	dog.seeDoor();
	}

// 有了多态，只需要让增加的这个类继承Animal类就可以了。
static void animalCry(Animal a) {
	a.shout();
}
}

/////* 如果没有多态，我们这里需要写很多重载的方法。
//* 每增加一种动物，就需要重载一种动物的喊叫方法。非常麻烦。
//static void animalCry(Dog d) {
//d.shout();
//}
//static void animalCry(Cat c) {
//c.shout();
//}
//}