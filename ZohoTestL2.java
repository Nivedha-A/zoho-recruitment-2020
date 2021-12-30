import java.util.Scanner;


public class ZohoTestL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String input=sc.next();
	if(input.length()%2 == 0) {
		System.out.println("Input odd words");
	}
	else {
		String word= input.substring(input.length()/2) +input.substring(0,input.length()/2) ;
		System.out.println(word);
		for(int i=0;i<input.length();i++) {
			for(int j=input.length()-1;j>=0;j--) {
			
				if(i==j) {
					for(int k= 0 ;k<=i;k++) {
				System.out.print(word.charAt(k));}
				}
				else 
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	}

}
