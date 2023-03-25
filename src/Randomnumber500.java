
public class Randomnumber500 {
	 public static void main(String[] args) {
         int counter;
         Randomnumber500 rnum = new Randomnumber500();
   
         int startcounter=100; 
 
         int endCounter=500; 
         int arraysize = endCounter-startcounter; 
         int numbers[] = new int[arraysize+1]; 
         int n=0; 
         System.out.println("Random Numbers500:");
         System.out.println("***************");
         for (counter = 100; counter <= 500; counter++) {
        	 int c = n++; 
        	 int num = rnum.nextInt(1000); 
        	 numbers[c]= num; 
        	 System.out.println(numbers[c]);  
            
         }
      }

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return i;
	}

	
	}

