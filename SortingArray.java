package ArrayList1;

public class SortingArray {
	public static void main(String[] args) {
		int array[]= {2,9,3,8,5,4,7};
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
					
				}
				
			}
			System.out.println(array[i]);
		}
		
	}

}
