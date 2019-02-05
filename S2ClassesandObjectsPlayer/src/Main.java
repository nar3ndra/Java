import java.util.*;

public class Main {

	public static void main(String[] args) throws InputMismatchException {
		// TODO Auto-generated method stub
		String name,country,skill;
		int fl=1;
        int an;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name");
		name=sc.nextLine();
		System.out.println("Enter the country name");
		country=sc.nextLine();
		System.out.println("Enter the skill");
		skill=sc.nextLine();
		Player pl=new Player();
		pl.setName(name);
		pl.setCountry(country);
		pl.setSkill(skill);
		System.out.println("Player Details");
		System.out.println("Player Name :"+pl.getName());
		System.out.println("Country Name :"+pl.getCountry());
		System.out.println("Skill :"+pl.getSkill());
		System.out.println("Verify and Update Player Details");
		
		while(fl==1){
			int cas=menu();
		switch(cas) {
			case 1:
				System.out.println("The current player name is "+pl.getName()+"\n" + 
						"Enter the player name");
				pl.setName(sc.nextLine());
				break;
			
			case 2: 
				System.out.println("The current country name is "+pl.getCountry()+"\n" + 
						"Enter the country name ");
				pl.setCountry(sc.nextLine());
				break;
			
			case 3:
				System.out.println("The current skill name is "+pl.getSkill()+"\n" + 
						"Enter the skill name ");
				pl.setSkill(sc.nextLine());
				break;
			
			case 4:
				fl=0;
				break;
            default:
                break;
			}
            
	  
            }
		System.out.println("Player Details");
		System.out.println("Player Name :"+pl.getName());
		System.out.println("Country Name :"+pl.getCountry());
		System.out.println("Skill :"+pl.getSkill());
		

		
	}
	public static int menu() {
		
        Scanner bd=new Scanner(System.in);
			System.out.println("Menu\n" + 
					"1.Update Player Name\n" + 
					"2.Update Country Name\n" + 
					"3.Update Skill\n" + 
					"4.All informations Correct/Exit\n" + 
					"Type 1 or 2 or 3 or 4");
			int an=bd.nextInt();
			return an;
	}

		


}
