import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
int yes = 0;
int word=0;
int picture = 0;
int nature = 0;
int math = 0;
int people = 0;
int music = 0;
int self = 0;
int body = 0;
	System.out.println("Intelligences Survey");
	System.out.println("Answer the following questions with 1 for Yes and 2 for No");
	
	System.out.println ("1. I like to write Surveys");
	int response1 = in.nextInt();
	if (response1==1) {
		word++;
	}
	System.out.println ("2. I like to take pictures");
	int response2 = in.nextInt();
	if (response2==1) {
		picture++;
	}
	System.out.println ("3. I like to plant seeds and grow plants");
	int response3 = in.nextInt();
	if (response3==1) {
		nature++;
	}
	
	System.out.println ("4. I like to count");
	int response4 = in.nextInt();
	if (response4==1) {
		math++;
	}
	
	System.out.println ("5. I like to check the weather");
	int response5 = in.nextInt();
	if (response5==1) {
		nature++;
	}
	
	System.out.println ("6. I like to talk to others about ideas");
	int response6 = in.nextInt();
	if (response6==1) {
		people++;
	}
	
	System.out.println ("7. I like to read in my free time");
	int response7 = in.nextInt();
	if (response7==1) {
		word++;
	}
	
	System.out.println ("8. I like to dance");
	int response8 = in.nextInt();
	if (response8==1) {
		music++;
	}
	
	System.out.println ("9. I like to read maps");
	int response9 = in.nextInt();
	if (response9==1) {
		picture++;
	}
	
	System.out.println ("10. I like to figure out patterns");
	int response10 = in.nextInt();
	if (response10==1) {
		math++;
	}
	
	System.out.println ("11. I like to take turns");
	int response11 = in.nextInt();
	if (response11==1) {
		people++;
	}
	
	System.out.println ("12. I like to solve puzzles");
	int response12 = in.nextInt();
		if (response12==1) {
			math++;
	}
	
	System.out.println ("13. I like to sing");
	int response13 = in.nextInt();
	if (response13==1) {
		music++;
	}
	
	System.out.println ("14. I like to ake things with my hands");
	int response14 = in.nextInt();
	if (response14==1) {
		body++;
	}
	
	System.out.println ("15. I like to talk to others");
	int response15 = in.nextInt();
	if (response15==1) {
		people++;
	}
	
	System.out.println ("16. I like poetry and rhyming");
	int response16 = in.nextInt();
	if (response16==1) {
		music++;
	}
	
	System.out.println ("17. I like to be by myself sometimes");
	int response17 = in.nextInt();
	if (response17==1) {
		self++;
	}
	
	System.out.println ("18. I like to touch different materials");
	int response18 = in.nextInt();
	if (response18==1) {
		body++;
	}
	
	System.out.println ("19. I like to move around a lot");
	int response19 = in.nextInt();
	if (response19==1) {
		body++;
	}
	
	System.out.println ("20. I like to play alone");
	int response20 = in.nextInt();
	if (response20==1) {
		self++;
	}
	
	System.out.println ("21. I like to play word games");
	int response21 = in.nextInt();
	if (response21==1) {
		word++;
	}
	
	System.out.println ("22. i like taking care of animals");
	int response22 = in.nextInt();
	if (response22==1) {
		nature++;
	}
	
	System.out.println ("23. I like to draw");
	int response23 = in.nextInt();
	if (response23==1) {
		picture++;
	}
	
	System.out.println ("24. I am wise");
	int response24 = in.nextInt();
	if (response24==1) {
		self++;
	}
  if (self ==1 ) {
	  System.out.println("Your intelligence reflects on Self");
  }
  if (music ==1 ) {
	  System.out.println("Your intelligence reflects on Music");
  }
  if (body ==1 ) {
	  System.out.println("Your intelligence reflects on Body");
  }
  if (nature ==1 ) {
	  System.out.println("Your intelligence reflects on Nautre");
  }
  if (word ==1 ) {
	  System.out.println("Your intelligence reflects on Word");
  }
  if (math ==1 ) {
	  System.out.println("Your intelligence reflects on Math");
  }
  if (people ==1 ) {
	  System.out.println("Your intelligence reflects on People");
  }
  if (picture ==1 ) {
	  System.out.println("Your intelligence reflects on Picture");
  }
	

	in.close();
	}
}
