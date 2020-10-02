import java.util.Scanner;
/**
 *
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		//prompts user for input
		System.out.println("Please enter an integer to count down to");
		//get input from user
		int countNumber = input.nextInt();
		//set the value fo int as 100
		int count = 100;
		System.out.println("Count Down:");
		//subtracts 5 from 100 until it getrs the closes to the original number
		do {
			System.out.println(count);
			count = count - 5; 
		}while (countNumber <= count);
  }
}
