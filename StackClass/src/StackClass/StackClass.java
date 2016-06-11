package StackClass;

class Stack{
	int stk[]=new int[10];
	int top;
	int item;
	
	Stack()
	{
		top=0;
	}
	
	void push( int a){
		item=a;
		if(top==9){
			stk[top]=item;
		    System.out.println("Item added : " + stk[top]);
			System.out.println("The stack is full!!!!!");
		}
		else{
			stk[top]=item;
		    System.out.println("Item added : " + stk[top]);
		    top++;
	}
	}
	
	void pop(){
		if(top<0)
			System.out.println("The stack is empty!!!!!");
		else{
			System.out.println("Item deleted : " + stk[top]);
			stk[top]='\0';
			top--;
			
	}
	}
	
	void display()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(stk[i]);
		}
	}
	
}

public class StackClass {
	public static void main(String args[])
	{
		Stack obj=new Stack();
		for(int i=0;i<10;i++){
			obj.push(i);
			}
		System.out.println();
		obj.display();
		System.out.println();
		for(int i=0;i<10;i++){
			obj.pop();
			}
		}

}
