import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
int yes = 0;
		
	System.out.println("Intelligences Survey");
	System.out.println("Answer the following questions with 1 for Yes and 2 for No");
	
	System.out.println ("1. I like to write Surveys");
	int response = in.nextInt();
	System.out.println ("2. I like to take pictures");
	System.out.println ("3. I like to plant seeds and grow plants");
	System.out.println ("4. I like to count");
	System.out.println ("5. I like to check the weather");
	System.out.println ("6. I like to talk to others about ideas");
	System.out.println ("7. I like to read in my free time");
	System.out.println ("8. I like to dance");
	System.out.println ("9. I like to read maps");
	System.out.println ("10. I like to figure out patterns");
	System.out.println ("11. I like to take turns");
	System.out.println ("12. I like to solve puzzles");
	System.out.println ("13. I like to sing");
	System.out.println ("14. I like to ake things with my hands");
	System.out.println ("15. I like to talk to others");
	System.out.println ("16. I like poetry and rhyming");
	System.out.println ("17. I like to be by myself sometimes");
	System.out.println ("18. I like to touch different materials");
	System.out.println ("19. I like to move around a lot");
	System.out.println ("20. I like to play alone");
	System.out.println ("21. I like to play word games");
	System.out.println ("22. i like taking care of animals");
	System.out.println ("23. I like to draw");
	System.out.println ("24. I am wise");
		
		if (response ==1) {
			yes++;
		}
	 while (response != 0);
	System.out.println("Total number of yeses: " + yes);
	
	if (yes == 13 ||yes == 16|| yes == 8) {
		System.out.println("Your learning style is Music!");
	}
	else if (yes == 14 ||yes == 18|| yes == 19) {
		System.out.println("Your learning style is Body!");
	}
	else if (yes == 3 ||yes == 22|| yes == 5) {
		System.out.println("Your learning style is Nature!");
	}
	else if (yes == 1 ||yes == 7|| yes == 21) {
		System.out.println("Your learning style is Word!");
	}
	else if (yes == 4 ||yes == 10|| yes == 12) {
		System.out.println("Your learning style is Math!");
	}
	else if (yes == 17 ||yes == 20|| yes == 24) {
		System.out.println("Your learning style is Self!");
	}
	else if (yes == 11 ||yes == 6|| yes == 15) {
		System.out.println("Your learning style is People!");
	}
	else if (yes == 2 ||yes == 9|| yes == 23) {
		System.out.println("Your learning style is Picture!");
		}
	in.close();
	}
}
