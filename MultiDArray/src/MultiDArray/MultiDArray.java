package MultiDArray;

public class MultiDArray {
public static void main(String args[]){
	int arr1[][] = new int[4][4];
	int arr2[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	int attention[][] = new int[4][];
	attention[0] = new int[1];
	attention[1] = new int[2];
	attention[2] = new int[3];
	attention[3] = new int[4];
	for(int x=0;x<4;x++)
		for(int y=0;y<4;y++)
		{
			arr1[x][y]=0;
		}
	for(int x=0;x<4;x++)
		for(int y=0;y<x+1;y++)
		{
			attention[x][y]=x;
		}
	
	for(int x=0;x<4;x++)
	{
		for(int y=0;y<4;y++)
		{
			System.out.print(" " +arr1[x][y]);
		}
		System.out.println();
	}
	
	for(int x=0;x<4;x++)
	{
		for(int y=0;y<4;y++)
		{
			System.out.print(" " +arr2[x][y]);
		}
		System.out.println();
	}
	
	for(int x=0;x<4;x++)
	{
		for(int y=0;y<x+1;y++)
		{
			System.out.print(" " +attention[x][y]);
		}
		System.out.println();
	}
	
	
	
	
	
}
}
