package NestClassStatic;

class Out{
	static int a=12;
	static int b;
	
	static void display(int x){
		b=x;
		System.out.println(a);
		System.out.println(b);
	}
	
	void Invoke(){
		In obj=new In();
		obj.display();
	}
	
	class In{
		void display(){
			System.out.println("Hello World");		}
	}
}

public class NestClassStatic {
	public static void main(String args[]){
		Out obj=new Out();
		obj.Invoke();
		obj.display(1101);
	}

}
