package chapter7;

import java.util.Scanner;

public class Grades {
    private static int[] grades;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        System.out.println("How Many grades would you like to enter?:");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.printf("Average: %d %n", calculateAverage());
        System.out.printf("Sum of Grades: %d %n", calculateSum());
        System.out.printf("Highest Grade: %d %n", getHighest());
        System.out.printf("Lowest Grade: %d %n", getLowest());


    }

    public static void getGrades(){
        for (int i=0; i< grades.length; i++){
            System.out.printf("Enter grade #%d %n:", (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for (int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static int calculateAverage() {
        return calculateSum() / grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for (int grade : grades){
            if (grade > highest)
                highest = grade;
        }
        return highest;
    }
    public static int getLowest(){
        int lowest = grades[0];
        for (int grade : grades){
            if (grade < lowest)
                lowest = grade;
        }
        return lowest;
    }
}
