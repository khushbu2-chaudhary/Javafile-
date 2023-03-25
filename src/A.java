
public class A {

	public static void main(String[] args) {
	B c1=new C();//create object of class c
	c1.process(2, 2);//call method on object c
    B c2=new C(); //object of integer
    c2.process(10);
    B c3=new C();//object of string
    c3.process("ball");
	}

}
