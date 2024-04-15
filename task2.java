package codsoft;
import java.util.*;
public class task2 {
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the number of your subjects:");
            int number = input.nextInt();
            int mark;
            int arr[] = new int[number];
            for(int i = 0 ; i < number ; i++){
                System.out.println("enter the mark of subject #"+(i+1)+": ");
                mark = input.nextInt();
                arr[i] = mark;
            }

            int sum = Arrays.stream(arr).sum();
            double avg = sum/number ;
            char grade = calculateGrade(avg);

            System.out.println("the total mark of " + number + " subjects= " + sum);
            System.out.println("the avarage percentage of " + number + " subjects= " + avg+"%");
            System.out.println("the grade of this student = " + grade);
            

        }
    }
}
