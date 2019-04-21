 import java.util.*;
class MultiOperators
{
	public static void main(String args[])
	{
		int num1,num2,num3=0;
		char op;
		num1=Integer.parseInt(args[0]);
		op=args[1].charAt(0);
		num2=Integer.parseInt(args[2]);

		switch(op)
		{
			case '+':
			num3=num1+num2;
			break;
	
			case '*':
			num3=num1*num2;
			break;
	
			case '-':
			num3=num1-num2;
			break;
	
			case '/':
			num3=num1/num2;
			break;

			default:
			break;
		}
		System.out.print(num3);
	}
}