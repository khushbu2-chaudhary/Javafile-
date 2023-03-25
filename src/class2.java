
public class class2 {
	
		
		public class2() { 
			this(5);//call constructor2
			System.out.println("hello I am John");
		
	}
		//parameterized constructor2
		public class2(int c) {
			this(5,5);//call constructor 3
			System.out.println(c);
		}
		//parameterized constructor3
		public class2(int a,int b) {
			this(1,"John");//call constructor4 
			System.out.println(a+b);
		}
		//parameterized constructor 4
		
		public class2(String d)	{
			this();//invokes default constructor
		}
public  class2(int x,String c) {
			
			System.out.println(x+" "+c);
		}
		}
