
public class arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] n= {24,5,25,65,4,3};
for(int i=0;i<n.length;i++) {
	for(int j=i+1;j<n.length;j++) {
		if (n[i]>n[j]) {
		int temp = n[i];
				
		n[j]=temp;
		
		for(int e:n) {
			
			System.out.println(e);
		}
		
	}
}
	}}}

	


	
	
