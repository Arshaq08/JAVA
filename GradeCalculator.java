public class GradeCalculator {  // More descriptive class name

    public static void main(String[] args) {
        int marks; 
        marks = 85;

        String grade = calculateGrade(marks);
        System.out.println("Your grade is: " + grade);
    }

    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
