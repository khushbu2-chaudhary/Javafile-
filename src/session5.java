import java.util.Scanner;

public class session5 {

	public static void main(String[] args) {
		Scanner ui=new Scanner(System.in);
		System.out.println("Give word");
		String a=ui.nextLine();
		//String a="tech";
		String rev="";
		char[] a1=a.toCharArray();
		for(int i=a1.length-1;i>=0;i--) {
			rev=rev+a1[i];
			//System.out.println(a+"="+rev);
		}
		if(a.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}		
		else {
			System.out.println("non palindrome");
		}}

	
		
	}
			
		

	

	
	

	
	


