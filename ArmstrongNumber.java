package Abc;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=15,rem=0,sum=0;
		 int n=num;
		 while(n>0) {
			 rem=n%10;
			 sum=(rem*rem*rem)+sum;
			 n=n/10;
		 }
		 if(sum==num ){
			 System.out.println(" the given number is Armstrong:"+num);
		 }
		 else
		 {
			 System.out.println(" the given number is not armstrong:"+num) ;
		 }
	}

}
