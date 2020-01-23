package video;

import java.util.Objects;

/**
 * @author yhy
 * 这是定义一个学生类，完成各种信息功能，用来满足后面的泛型输出，用到了两个参数而已
 * @date 1/15
 */
public class Student {
    private String name;
    private String age;
    private Integer age1;

    private String num;
    private String address;

    public Student() {
        System.out.println("欢迎来到学生管理系统！");
    }

    public Student(String name, String age, String num, String address) {
        this.name = name;
        this.age = age;
        this.num = num;
        this.address = address;
    }
    public Student(String name, Integer age){
        this.name = name;
        this.age1 = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge1(Integer age1) {
        this.age1 = age1;
    }

    public Integer getAge1() {
        return age1;
    }
/**
     * @return 原本输入的
     * 重写了该办法
     */



    /**
     * @return 原本输入的
     * 重写了该办法,只输出了两个变量
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age1=" + age1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age1, student.age1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age1);
    }
}
