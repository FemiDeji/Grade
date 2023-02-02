import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many course(s) would you like to grade?");
        int numOfCourse = sc.nextInt();
        int[] marks = new int[numOfCourse];


        System.out.println("Enter marks of course here");
        for (int i=0; i < numOfCourse; i++){
            System.out.print((i + 1) + ": ");
            marks[i] = sc.nextInt();

        }

        int n = 0;
        while(n < marks.length){
            if (marks[n] >=70) {
                System.out.printf("Grade for course %d. is A\n", n+1);
            }
            else if (marks[n] >=60 && marks[n] < 70) {
                System.out.printf("Grade for course %d. is B\n", n+1);
            }
            else if (marks[n] >=50 & marks[n] < 60) {
                System.out.printf("Grade for course %d. is C\n", n+1);
            }
            else if (marks[n] >=45 && marks[n] < 50) {
                System.out.printf("Grade for course %d. is D\n", n+1);
            }
            else if (marks[n] >=0 && marks[n] <45) {
                System.out.printf("Grade for course %d. is F\n", n+1);
            }
            n++;
        }

        sc.close();
    }
}
