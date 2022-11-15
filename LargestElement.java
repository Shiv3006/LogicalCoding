package javaBasic1;

public class LargestElement {
	 public static void main(String[] args)
     {
    	 int a1[]= {1,5,3,8,6,9};
    	 int b[]= {4,2,8,1,6};
    	 System.out.println("secondlargest:" +getSecondLargest(a1,6));
    	 System.out.println("secondlargest:" +getSecondLargest(b,5));
    	 
     }
	public static int getSecondLargest(int a[],int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-1];
		
   
     }
}
