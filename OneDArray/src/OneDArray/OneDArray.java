package OneDArray;

public class OneDArray {
public static void main(String args[]) {
	char arrs[] = {'N','I','L','A','Y'};
	char arrd[];
	arrd = new char[5];
	arrd[0]='N';
	arrd[1]='I';
	arrd[2]='L';
	arrd[3]='A';
	arrd[4]='Y';
	for(int x=0;x<5;x++)
	{
		System.out.print(arrs[x]);
	}
	System.out.println();
	for(int x=0;x<5;x++)
	{
		System.out.print(arrd[x]);
	}
}
}
