package AbsClass;

abstract /*final hinders inheritance*/ class Master{
	/* final void fun1() {system.out.println("Hello Lights");}  hinders overriding*/
	abstract void fun1();
	
	void fun2(){
		System.out.println("Hello City");
	}
}

class Slave extends Master /* final doesn't allow inheritance */
{
	void fun1(){
		System.out.println("Hello World");
	}
}

public class AbsClass {
	public static void main(String args[]){
		Slave s = new Slave();
		s.fun1();
		s.fun2();
		
	}

}
