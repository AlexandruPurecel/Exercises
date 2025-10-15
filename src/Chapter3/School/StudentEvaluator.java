package Chapter3.School;

import java.util.Scanner;

public class StudentEvaluator {

    private float calculateAverage(float ...grades){
        /*
               Calculate average from Student received grades
         */
        float average = 0;
        for (float grade : grades){
            average += grade;
        }
        return average / grades.length;
    }

    private String evaluateStudent(float average, int attendance){
        /*
        Check if the student pass, fail or need to re exam the subject
         */

        return average < 50 ? "FAIL" :  average > 70 && attendance >= 75 ? "PASS" : "RE-EXAM";
    }

    private String convertGradesToLetters(float average){
        /*
        Convert the numeric grade in letter grade
         */
        return switch ((int)average/10){
            case 10,9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6,5  -> "D";
            default -> "F";
        };
    }

    void main(){
        /*
        User interaction
         */
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter student name (or 'exit' to stop): ");
            String name = input.nextLine();
            if(name.equals("exit")){
                System.out.println("Program terminated");
                break;
            }
            System.out.print("Enter 3 test scores: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            float average =  calculateAverage(a,b,c);
            System.out.print("Enter attendance percentage: ");
            int attendance = input.nextInt();
            input.nextLine();
            String result =  evaluateStudent(average,attendance);
            String grade =  convertGradesToLetters(average);
            System.out.println("Average: " + average + " Grade: " + grade + " -> " + result);
        }

        input.close();

    }
}
