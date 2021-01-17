import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.util.concurrent.TimeUnit;
class Quiz implements InterfaceQuiz{
        private String luserid;
        private User[] tusers;
        private double tscore;
        public Quiz(String luid, User[] users) {
            luserid = luid;
            tusers = users;
        }

		private String[][] q = new String[][]{
			{"What is the capital of bangladesh?", "A Rajshahi" , "B Dhaka ", "C Chottogram" , "B"},
			{"What is the national fruit of bangladesh?", "A Jackfruit" , "B Mango ", "C Apple" , "A"},
			{"What is the national animal of bangladesh?", "A Dog " , "B Tiger", "C Cat" , "B"}
		};
		
		private double point = 0.0;
		private int row = q.length -1;
		private int column =   q[0].length - 2;

        public void checkAnswer(String correctAnswer) {
            	Scanner sc = new Scanner(System.in);
                
                // Checking Answer Method
                System.out.print("Enter Answer (A/B/C): " );
                
                String answer = sc.nextLine().toUpperCase();
                if(correctAnswer.equals(answer)){
                    point++;
                    System.out.println("Correct Answer!");
                }
                else{
                    point = point - 0.25;
                    System.out.println("Wrong Answer!");
                }
        }

        // Printing Questions Method
        public void printQuestions() {

            System.out.println("\n-- QUIZ --");
            System.out.println("Welcome, " + luserid + "\n");

            // Checks Row
            for(int i=0; i<= row; i++){
                // Checks Column
                for(int j=0; j<= column; j++){
                    System.out.println(q[i][j]); //printing all the questions and answers
                }
                
                // Calling Check Answer
                // also takes user input
                checkAnswer(q[i][4]);


                System.out.println();
            }
        }

        // Priting Score Method
        public void printScore() {
            for(int i = 0; i < tusers.length; i++) {
                if(tusers[i] != null) {
                    String tid = tusers[i].getId();
                    if(tid.equals(luserid)) {

                        // SETS SCORE INSIDE THE USER OBJECT
                        tusers[i].setScore(point);
                        System.out.println("Your Score: " + tusers[i].getScore() + "\n");

                        tscore = tusers[i].getScore();
 
                        break;
                    }
                }
            }

            writeLeaderboard();
        }

        public void writeLeaderboard() {
            String currentLeaderboard = "";

            try {
                File myObj = new File("leaderboard.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                     currentLeaderboard = currentLeaderboard + myReader.nextLine() + "\n";

                }
                myReader.close();

                currentLeaderboard = currentLeaderboard + luserid + " => " + tscore;

                FileWriter myWriter = new FileWriter("leaderboard.txt");
                myWriter.write(currentLeaderboard);
                myWriter.close();
            }
            catch(Exception e) {
                 System.out.println(e);
            }

        }





}