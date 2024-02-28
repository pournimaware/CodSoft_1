import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Number of Subjects:");
        int numOfSubjects = scanner.nextInt();
        int totalMarks = 0;

        for(int i=0; i<numOfSubjects; i++){
            System.out.println("Enter marks obtained in subject" + i + " : ");

            int marks = scanner.nextInt();
            totalMarks +=marks;
        }

        double averagePercentage = (double) totalMarks / numOfSubjects;
        System.out.println("total/Marks:" + totalMarks);
        System.out.println("AveragePercentage:" + averagePercentage);

        String grade;
        if(averagePercentage>=90){
            grade ="A";
        } else if (averagePercentage>=80){
            grade="B";
        }else if (averagePercentage>=70){
            grade="C";
        }else if (averagePercentage>=60){
            grade="D";
        }else if (averagePercentage>=50){
            grade="E";
        }else{
            grade="F";
        }
        System.out.println("Grade:"+ grade);
        scanner.close();
    }
}