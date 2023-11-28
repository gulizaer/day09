import java.util.Scanner;

public class GraderRaport {
    public static void main(String[] args) {
        Scanner report = new Scanner(System.in);
        System.out.println("Enter your score");
        int number = report.nextInt();

        String result = "Invalid score ";

        if (number>=0 && number<=100) {
            if (number>=90){
                result= "A";
            } else if (number>=80) {
                result = "B";
            } else if (number>=70) {
                result = "C";
            } else if (number>=60) {
                result = "D";
            }else {
                result = "F";
            }
        }
        System.out.println(result);







        /*
         Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
         */
    }
}
