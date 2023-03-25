import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("give me a number");
Scanner ui=new Scanner(System.in);
Scanner ui2=new Scanner(System.in);
int num1=ui.nextInt();
System.out.println("give me another number");
int num2=ui.nextInt();
System.out.println("select operation add,sub,mul,div);");
String operation=ui2.nextLine();
if(operation.equalsIgnoreCase("add")) {
	System.out.println("the result:"+add.add(num1, num2));
}
else if(operation.equalsIgnoreCase("sub")) {
	System.out.println("the result:"+sub.sub(num1, num2));
}
else if(operation.equalsIgnoreCase("mul")) {
	mul mul=new mul();
	System.out.println("the result:"+mul.mul(num1, num2));
}
else if(operation.equalsIgnoreCase("div")) {
	div div=new div();
	System.out.println("the result:"+div.div(num1, num2));
	}
else {
	System.out.println("your operation should any of these");
}
}}
