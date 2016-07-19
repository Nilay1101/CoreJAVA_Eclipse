package Exception;

import java.util.Random;

public class Exception {
	
	static void FunThrow() {
		try{
			throw new NullPointerException("demo");
		}catch(NullPointerException e){
			System.out.println("Caught locally");
			throw e;
		}
	}
	
	public static void main (String args[]){
    /* int a=0,b=0,c=0;
    Random r=new Random();
    for(int i=0;i<32000;i++){
    	try{
    		b=r.nextInt();
    		c=r.nextInt();
    		a=12345/(b/c);
    	}catch(ArithmeticException e){
    		System.out.println("Exception : " +e);
        }
      } */
	
	try{
		FunThrow();	
	}catch(NullPointerException e){
		System.out.println("Recaught");
	}
	
	
	}
}
