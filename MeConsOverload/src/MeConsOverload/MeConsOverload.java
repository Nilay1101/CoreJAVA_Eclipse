package MeConsOverload;

class Overload{
	int a;
	int b;
	
	Overload(){
		a=10;
		b=11;
		System.out.println("No Constructor Overloading");
		System.out.println("a : " +a);
		System.out.println("b : " +b);
	}
	
	Overload(int x, int y){
		a=x;
		b=y;
		System.out.println("Constructor Overloading");
		System.out.println("a : " +a);
		System.out.println("b : " +b);
	}
	
	void sum()
	{
		int s;
		s=a+b;
		System.out.println("Sum is : " +s);
	}
	
	void sum(int j, int k){
		int s;
		a=j;
		b=k;
		s=a+b;
		System.out.println("Sum is (overloaded) : " +s);
		
	}
}

public class MeConsOverload {
	public static void main(String args[]){
		Overload obj1 = new Overload();
		System.out.println();
		Overload obj2 = new Overload(0,1);
		System.out.println();
		obj1.sum();
		System.out.println();
		obj2.sum(20,21);
		
	}

}
