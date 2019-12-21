public class test{
	public static void main(String args[]){
		emp ea = new emp();
		emp es = new emp(654);
		System.out.println(ea.getInfo());
		System.out.println(es.getInfo());
		
	}
	class emp{
		private int empno;
		private String ename;
		private double sal;
		private String dept;
		public emp(){
			this(0,"andy"，98.0，"hr");
		}
		public emp(int empno){
			this(empno,"mark"，8.0，"hr");
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
}