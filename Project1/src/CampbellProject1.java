import java.util.*;
public class CampbellProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "";
		while(!name.equals("end") && !name.equals("stop")){
		Scanner scan = new Scanner(System.in);
		
		//Code below is for first and last name	
		System.out.println("What is your full name?");
		name = scan.nextLine().toLowerCase();
		
			double vowels = 0;
			
			for(int i=0; i < name.length(); i++){
				switch(name.charAt(i)){
				case 'a':
					vowels++;
					break;
				case 'e':
					vowels++;
					break;
				case 'i':
					vowels++;
					break;
				case 'o':
					vowels++;
					break;
				case 'u':
					vowels++;
					break;
				}
			}
		
			double percentageVow = (vowels/name.length()) *100; 
			System.out.println("Your name is "+ percentageVow+ "% vowels");
			
			//User letter grade is to be entered below
			System.out.println("What is your letter grade?");
			String letterGrade = scan.next().toLowerCase();
			
			switch(letterGrade){
			case "a":
				System.out.println("You have an A: 100-90");
				break;
			case "b":
				System.out.println("You have a B: 89-80");
				break;
			case "c":
				System.out.println("You have a C: 79-70");
				break;
			case "d":
				System.out.println("You have a D: 69-60");
				break;
			case "f":
				System.out.println("You have a F: 59-0");
				break;
			default:
				System.out.println("Not a valid grade");
				break;
			}
		
			//3 sides of triangle below
			System.out.println("Enter three sides for a triangle");
			System.out.println("Side 1?");
			int triside1 = scan.nextInt();
			
			System.out.println("Side 2?");
			int triside2 = scan.nextInt();
			
			System.out.println("Side 3?");
			int triside3 = scan.nextInt();
			
			if(triside1 + triside2 < triside3 || triside1 + triside3 < triside2 || triside3 + triside2 < triside1){
				System.out.println("Not a trianagle");
			} else {
				System.out.println("The perimeter is " + (triside1+triside2+triside3));
			}
		}
	}
}