public class test{
	public static void main(String args[]){
		emp ea = new emp();
		emp es = new emp(654);
		System.out.println(ea.getInfo());
		System.out.println(es.getInfo());
		//注意这里的调用范围，注意括号
	}
}
	class emp{
		private int empno;
		private String ename;
		private double sal;
		private String dept;
		public emp(){
			this(0,"andy",98.0,"hr");//调用四参的构造
		}
		public emp(int empno){
			this(empno,"mark",8.0,"hr");//一样调用，只不过这里empno是本身的参数。
		}
		public emp(int empno,String ename,double sal,String  dept){
			this.empno = empno;
			this.ename = ename;
			this.sal = sal;
			this.dept = dept;
		}
		public String getInfo(){
			return "id：" +this.empno + "name:" + this.ename + "工资" + this.sal + "职位" + this.dept;
		}
		
	}
	

/* import java.awt.Point;
 class test
    { int x1=0;
      int y1=0;
      int x2=0;
      int y2=0;
     
     rectangle point(int x,int y,int z,int w)
      {x1= x;
       y1= y;
       x2= z;
       y2= w;
       return this;
       }
     void printrectangle()
       { System.out.print(x1+" "+y1+" "+x2+" "+y2);
        }
      public static void main(String[] args)

       { t experiment = new rectangle();
         experiment.point(1,2,3,4);
         experiment.printrectangle();
       
        }
   
   } */