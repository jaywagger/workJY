package FreeExercise;
import java.util.Scanner;

public class PrintfAndScanf {
	public static void main(String[] args) {
		System.out.println(20000);
		System.out.println("¿Ã∏∏");
		System.out.println("________________");
		
		System.out.println("What is your name? ");
		Scanner key = new Scanner(System.in);
		String name = key.nextLine();
		System.out.println("Hi I am "+name);
		System.out.println();
		
		System.out.println("What do you do for living? ");
		String job = key.nextLine();
		System.out.println("I do "+job);
		System.out.println();
		
		System.out.println("How old are you? ");
		int age = key.nextInt();
		System.out.println("I am "+" years old.");
		
		
		
		
	}
}
