import java.util.*;
class ElectBill{
	public static void main(String args[]){
            int units;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter no. of Units: ");
            units=sc.nextInt();
            int bill=0;
            if(units<50){
               bill=units*10;
            }
            else if(units>=50 || units<=100){
            	bill=units*15;
            }
            else if(units>100 || units<=200){
            	bill=units*20;
            }
            else if(units>200 || units<=300){
            	bill=units*25;
            }
            else if(units>300){
            	bill=units*30;
            	
            }
            System.out.println("The Bill is:"+ bill);
	}
}