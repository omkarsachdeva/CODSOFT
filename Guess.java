import java.util.*;
public class Guess {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int low=1,high=100,i;
        int num=r.nextInt(high-low)+low;
        System.out.println("You got 10 attepts to make a guess!");
        for(i=1;i<10;i++){
            System.out.println("Enter a guess");
            int num1=sc.nextInt();
            if(num==num1){
                System.out.println("Right guess:)");
                System.out.println("Your Score is:"+"" +i);
                break;

            }
            else if(num1>num){
                System.out.println("Make a smaller Guess!!");
            }
            else
            {
                System.out.println("Make a higher guess!!");
            }

        }
        if(i==10)
        System.out.println("Sorry!, You couldnt guess the number in 10 attempts");

    }
    
}
