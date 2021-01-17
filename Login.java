import java.util.Scanner;

class Login {

    public void login(User[] users) {
        Scanner sc = new Scanner(System.in);
        String tuserid; // temporary variable for storing userid
        String tuserpass; // temporary variable for storing userpass

        int flag = 0; // flag for checking user account availability
        System.out.println("\n-- LOGIN --");
        System.out.print("Enter UserID: ");
        tuserid = sc.nextLine();

        System.out.print("Enter Password: ");
        tuserpass = sc.nextLine();
        


        // as usual array traverse
        for(int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                String tid = users[i].getId();
                String tpass = users[i].getPass();

                if(tid.equals(tuserid) && tpass.equals(tuserpass)) {
                    // if matches set flag = 1
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 1) {
            Quiz quiz = new Quiz(tuserid, users);
            quiz.printQuestions();
            quiz.printScore();
        } else {
            System.out.println("\nUserID or Password is Wrong! Please try again!\n");
        }
    }
}