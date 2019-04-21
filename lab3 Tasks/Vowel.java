import java.util.*;
class Vowel{
	public static void main(String args[]){
		Scanner i=new Scanner(System.in);
		System.out.println("Enter a Letter:");
		char v=i.next().charAt(0);
		if(v == 'a'|| v== 'e' || v=='i' || v=='o' || v=='u'){
			System.out.println(v + "  "+ "is a vowel");
		}
			else{ 
				System.out.println(v + "  "+ "is a consonant");
		}
	}
}
