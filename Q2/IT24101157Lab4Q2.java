import java.util.Scanner;

public class  IT24101157Lab4Q2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double examMarks = getValidatedMarks(scanner, "exam");
        
        double labMarks = getValidatedMarks(scanner, "lab submission");
        
        double examPercentage = getValidatedPercentage(scanner, "exam");
        double labPercentage = getValidatedPercentage(scanner, "lab submission");
        
        validatePercentages(examPercentage, labPercentage);
        double finalMark = calculateFinalMark(examMarks, labMarks, examPercentage, labPercentage);
        
        System.out.printf("The final mark is: %.2f%n", finalMark);
    }
    
    private static double getValidatedMarks(Scanner scanner, String type) {
        double marks;
        while (true) {
            System.out.print("Enter the " + type + " marks (out of 100): ");
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            }
        }
        return marks;
    }
    
    private static double getValidatedPercentage(Scanner scanner, String type) {
        double percentage;
        while (true) {
            System.out.print("Enter the percentage for " + type + " marks: ");
            percentage = scanner.nextDouble();
            if (percentage >= 0 && percentage <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Percentage should be between 0 and 100.");
            }
        }
        return percentage;
    }
    
    private static void validatePercentages(double examPercentage, double labPercentage) {
        if (Math.abs((examPercentage + labPercentage) - 100) > 1e-2) {
            throw new IllegalArgumentException("The total percentage must add up to 100.");
        }
    }
    
    private static double calculateFinalMark(double examMarks, double labMarks, double examPercentage, double labPercentage) {
        return (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));
    }
}