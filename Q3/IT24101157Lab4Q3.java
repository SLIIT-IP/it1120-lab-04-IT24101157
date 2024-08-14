import java.util.Scanner;

public class IT24101157Lab4Q3{
   public static void main(String[] args){

    Scanner input=new Scanner(System.in);
    int number;
    System.out.print("Enter a number:");
    number = input.nextInt();
    
    String num=number>0?
"Positive":(number<0?"Negative":"Zero");
    System.out.print("The number is"+num);
     }
}
