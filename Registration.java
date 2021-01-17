import java.util.Scanner;
class Registration {
    // Registration Class extends User Class

		// private String name;
		// private String userid;
		// private String userpass;

    private User[] users = new User[5]; // registered users

    public Registration() {

    }

    public Registration(String n, String uid, String upass) {
        
        
    }

    // returns users array
    public User[] getUserList() {
        return users;
    }

    public void registerUser() {
        Scanner sc = new Scanner(System.in);

        String tname;
        String tuserid;
        String tuserpass;
        System.out.println("\n-- REGISTRATION --");

        System.out.print("Name: ");
        tname = sc.nextLine();

        System.out.print("UserID: ");
        tuserid = sc.nextLine();

        System.out.print("Password: ");
        tuserpass = sc.nextLine();

        User u = new User(tname, tuserid, tuserpass);

        createUser(u); // adds user to the array
    }

    // adds user to the array
    public void createUser(User a) {
        for( int i=0; i < users.length; i++){ 
            if (users[i] == null){ 
                users[i] = a; 
                System.out.println("\nAccount Created!\n");
                break; 
            } 
        }
    }

    public void showUsers() {
		System.out.println("\n-- Show Users --\n");
        int flag = 0;

        for( int i=0; i < users.length; i++) { 
            if(users[i] != null) {
                System.out.println(users[i].getName());
                flag = 1;
            }
        }


        if(flag == 0) {
            System.out.println("No User!\n");
        } else {
            System.out.println(); // line break;
        }
    }


}