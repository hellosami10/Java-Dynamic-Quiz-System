import java.util.Scanner;

class Main{
	
	public static Registration r = new Registration();

	public static void main(String[] args){

		Leaderboard lb = new Leaderboard();
		Scanner sc = new Scanner(System.in);
		Login l = new Login();

		System.out.print("-- Main Menu --\n1. Login\n2. Registration\n3. See Score-Board\n4. Show User List\n5. Show First 3 User Scores\n\nPlease Input: ");

		int n = sc.nextInt();

		switch(n) {
			case 1:
				l.login( r.getUserList() ); // r.getUserList() returns users array
				main(null); // calls main method
				break;
			case 2:
				r.registerUser();
				main(null);
				break;
			case 3:
				lb.showLeaderboard();
				main(null);
				break;
			case 4:
				r.showUsers();
				main(null);
				break;
			case 5:
				// method overloading
				lb.showLeaderboard(3);
				main(null);
				break;
			default:
				System.out.println("Enter Valid Input: 1 - 5");
		}

	}


}