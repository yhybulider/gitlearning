public class five {
	public static void main(String args[]){
		int i,min,max;
		int A[]={15,54,24,68};
		min=max=A[0];
		System.out.println("SHUZU");
		for(i=0;i<A.length;i++){
			System.out.println(A[i]+" ");
			if(A[i]>max){
				max=A[i];
			}
			if(A[i]<min){
				min=A[i];
			}
		}
		System.out.println("\nBIGONE"+max);
		System.out.println("SMALLONE"+min);
	}
}