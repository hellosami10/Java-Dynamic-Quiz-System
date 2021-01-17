import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

class Leaderboard {
    public void showLeaderboard() {
            
        try {
            System.out.println("\n-- Score Board --\n");
            File myObj = new File("leaderboard.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            System.out.println(); // line break;
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    public void showLeaderboard(int n) {
        System.out.println("\n-- First " + n +" Users --\n");
        try {
            File myObj = new File("leaderboard.txt");
            Scanner myReader = new Scanner(myObj);


            for(int i = 0; i < n; i++) {
                if(myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                } else {
                    break;
                }
            }
            
            System.out.println(); // line break

        }
        catch (Exception e) {
            System.out.println(e);
        }

    }




}