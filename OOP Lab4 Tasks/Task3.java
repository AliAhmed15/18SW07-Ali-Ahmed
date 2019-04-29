import java.util.*;
class Task3
{
	public static void main(String []abcd)
	{
		Scanner in=new Scanner(System.in);
		int x;
		System.out.print("Enter the ending no: ");
		x=in.nextInt();
		int result=0;
		for(int i=0; i<=x; i++){
				result+=i;
		}
		System.out.println("Sum is "+result);
	}
}