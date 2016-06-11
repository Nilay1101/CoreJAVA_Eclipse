package ClassMethodReturn;
 
class Volume{
	float length;
	float breadth;
	float height;
	
	float compute( float a, float b, float c){
		length=a;
		breadth=b;
		height=c;
		
		return length*breadth*height;
		
	}
	
}

public class ClassMethodReturn {
	public static void main(String args[]){
	
	Volume obj = new Volume();
	float vol;
	
	vol=obj.compute(10,5,8);
	System.out.println("Volume computed is : " + vol);

}
}
