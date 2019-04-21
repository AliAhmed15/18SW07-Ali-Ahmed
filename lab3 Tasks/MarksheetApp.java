import java.util.*;
class MarksheetApp{
	public static void main(String [] args){;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter Marks Obtained in C++:");
	 int marks1= sc.nextInt();
	 System.out.println("Enter Marks Obtained in Data Structure:");
	 int marks2= sc.nextInt();
	 System.out.println("Enter Marks Obtained in Operating System:");
	 int marks3 = sc.nextInt();
	 int totalmarks=marks1+marks2+marks3;
	 System.out.println(totalmarks);
	 double percentage=(totalmarks/300f)*100;
	 System.out.println(percentage);
	 if(percentage>90){
	   System.out.println("Grade:A*");
	 }
	 else if (percentage>80 && percentage<90){
	   System.out.println("Grade:A");}
	 else if(percentage>70 && percentage<80){
	   System.out.println("Grade:B");}
	 else if(percentage>60 && percentage<70){
	   System.out.println("Grade:C");

	  }
	   
	  else {
	   System.out.println("Grade:fail");
}
	  

	 
	 	
	 
	}
}