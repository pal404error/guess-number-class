import java.util.Scanner;
import java.util.Random;
class Number{
	Random r = new Random(100);
	int n = r.nextInt(10);
	public void input(int in)
	{
		if (in == n){
			System.out.print("\n \t HOORAY YOU GUESSED THE NUMBER !!!!! ");
			java.lang.System.exit(0);
			
		}
		if (in > n){
			System.out.print("\n \t A LITTLE HIGHER !!!! "); 
		}
		if (in < n){
			System.out.print("\n \t A LITTLE LOWER !!!! "); 
		}
		else {
			System.out.print("\n \t  ERROR: ENTER NUMBER IN RANGE :( "); 
			java.lang.System.exit(0);
		}
	}
	public int getn(){ return n; }
}
public class guess{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		Number c = new Number();
		System.out.print("\n \t WELCOME TO GUESS THE NUMBER GAME \n \n \t START ENTERING NUMBERS AND REMEMBER RANGE IS 0-9");
		for (int i = 0 ; i<5;i++){
			System.out.print("\n \t ENTER HERE : ");
			int a = s.nextInt();
			c.input(a);
			System.out.println("\n \t Chances left : "+ (5-i));

		}
		//System.out.println(c.getn());
	}
}