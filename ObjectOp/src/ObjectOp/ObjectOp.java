package ObjectOp;

class Object{
	int id;
	
	Object(){
		id=1101;
		System.out.println("Constructor calling.... ID : " + id);
	}
	
	Object(Object obj){
		id=obj.id;
		System.out.println("Copy Constructor calling.... ID : " + id);
	}
	
    Object display(Object obj){
    	obj.id=1102;
    	System.out.println("Passing Object.... Object id : " + obj.id);
    	return obj;
    }
}

public class ObjectOp {
	public static void main(String args[]){
		Object obj=new Object();
		Object obj1=new Object(obj);
		Object obj2;
		obj2=obj.display(obj);
		System.out.println("Passing Object Changes Values.... " +obj2.id);
	}

}
