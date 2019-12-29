# ArrayList 与数组的“纠缠不清”的暧昧

[TOC]

[前言](#1)

[是什么](#2)

[有什么用](#3)



## <div id = 1>前言</div>

能不能有一种数组可以在删除掉某些元素自动缩小就好了。可是话说哪里学的Java?数组能删除元素吗？今天讲一下一个特殊对象——ArrayList，它的出现与存在和数组有着几分类似。下面按照它是什么-有什么用-怎么用来讲？再讲讲与数组的区别?

## 正话（个人的见解，有误请多指教）

### <div id = 2>惯例先明白它是什么？</div>

* 源码搞上！！！<E>表示泛型(只能引用类型)，也就是装在集合当中的所有元素，全都是统一的什么类型. 很明显它是一个类，继承(extends)了AbstractList,实现(implements)了List、RandomAcess等。（*extends可以理解为全盘继承了父类的功能。implements可以理解为为这个类附加一些额外的功能*）。它是一个容量可以自动增长的动态数组（并非数组），可以支持删除操作。
* ![image.png](https://i.loli.net/2019/12/15/g3inT2s8DdpjzO9.png)
* ![image.png](https://i.loli.net/2019/12/15/JfeIDxX7PE6luZW.png)
* 它的初始容量为10。下面的构造方法第一个就是构造容量为10的。要想改变这个容量，就像第二个的构造方法那样就可以了。第三个是构造一个包含指定集合的元素的列表，按照他们由集合的迭代器返回的顺序。
* ![image.png](https://i.loli.net/2019/12/15/rhu9EzO46fmKFpI.png)
* 值得一提的是，Java集合框架中定义了List接口，而且只有两个实现，除了这个ArrayList还有LinkedList。在数据结构与算法分析书上有着这么两句结论，具体得到是在书中通过了算法得来的。LinkedList在Java和C#中实际上是在使用双链表。
  * ArrayList优势是在末尾添加，删除，获取和设置（set and get）。
  * LinkedList优势是从开头添加级删除开头元素。
* 数组表（ArrayList）和数组很相似在于，读取的时候为O（1），在插入时候就变为O（n）了，不同在于这个数组表可以增加长度，在添加时候，只需表尾编号加一便可以确定新元素了。
* ArrayList不是线程安全的。**线程安全是说一个对象可以完全被多个线程同时使用，不出问题。**这个在后面的深入学习虚拟机会经常遇到——使用多线程之间同步synchronized或使用锁(lock)可以解决。



### <div id =3>基本用法</div>

- 动态的增加和减少元素，实现了ICollection和list接口。当然还可以灵活得选择数组的大小。


1. 常用方法

   ![image.png](https://i.loli.net/2019/12/15/2dPnz9GAHgTweyi.png)

2. 删除作用，可以实现数组不能的删除</br>

   <div><img src="https://i.loli.net/2019/12/15/L18TVydzQEfMwSo.png" alt="image.png" width="800" height="300" /></div>

3. 实现添加整个容量，添加元素</br>![image.png](https://i.loli.net/2019/12/15/rlvCPUWqksK3oTf.png )

### 怎么用

1. 想要存储数字，也就是基本数据类型，就可以使用包装类(位于java.lang下)。

   * | 基本类型 | 包装类    |
     | -------- | --------- |
     | int      | Integer   |
     | byte     | Byte      |
     | short    | Short     |
     | long     | Long      |
     | float    | Float     |
     | doublr   | Double    |
     | char     | Character |
     | boolean  | Boolean   |

   * ```java
     ArrayList<Integer> list = new ArrayList<>;//这样创建不会报错了
     ```

   

2. 实例：生成1-30之间的随机数，添加到集合里，存储5个

   * ```java
     //主代码
     ArrayList<Integer> list2= new ArrayList();
     Random r = new Random();
     for(int i = 0; i < 5; i++){
         int num = r.nextInt(30) + 1;
         list.add(num);
     }
     ```

     

3. 

4. 

   * 