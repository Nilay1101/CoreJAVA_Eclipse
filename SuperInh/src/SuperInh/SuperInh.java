package SuperInh;

class Master{
	int a;
	int b;
	 Master(){
		 a=10; 
	 }
	 
	 Master(int x){
		 a=x;
	 }
}

class Slave extends Master{
	Slave(){
		int b;
		/*super(); super(13); */
		super.b=11;
		b=12;
		System.out.println("Master a : " +a);
		System.out.println("Master b : " +super.b);
		System.out.println("Slave b : " +b);
		
	}
	
}

public class SuperInh {
	public static void main(String args[]){
		Master obj = new Master();
		Slave obj1 = new Slave();
	}

}
