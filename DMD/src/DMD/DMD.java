package DMD;

class student{
	void info(){
		System.out.println("Name : Nilay");
	}
}

class entry extends student{
	void info(){
		System.out.println("Entryno. : 14BCS033");
	}
}

class major extends student{
	void info(){
		System.out.println("Major : Computer Science & Engineering");
	}
}

public class DMD {
	public static void main(String args[]){
		student o0 = new student();
		entry o1 = new entry();
		major o2 = new major();
		student r;
		r=o0;
		r.info();
		r=o1;
		r.info();
		r=o2;
		r.info();
	}

}
