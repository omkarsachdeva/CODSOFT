import java.util.*;
public class Grade {
    public float Totalmarks(float m1,float m2,float m3,float m4,float m5) {
    float sum=m1+m2+m3+m4+m5;
    System.out.println("Total Marks:"+" "+sum);
    return sum;

    }
    public double percentaage(float m1,float m2,float m3,float m4,float m5){
        float sum=m1+m2+m3+m4+m5;
        double per=(sum/5.0);
        System.out.println("Percentage is :"+" "+per+"%");
        if((per)>=90){
           System.out.println("Grade:"+" "+"A"); 
        }
        else if(per>=80 && per<=90){
            System.out.println("Grade:"+" "+"B"); 

        }
        else if(per>=70 && per<=80){
            System.out.println("Grade:"+" "+"C"); 

        }
        else if(per>=60 && per<=70){
            System.out.println("Grade:"+" "+"D"); 

        }
        else if(per>=50 && per<=60){
            System.out.println("Grade:"+" "+"E"); 

        }
        else if(per>=40 && per<=50){
            System.out.println("Grade:"+" "+"F"); 

        }
        return per;
    }
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks of 1st Subject ");
    float marks1=sc.nextInt();
    System.out.println("Enter the marks of 2nd Subject ");
    float marks2=sc.nextInt();
    System.out.println("Enter the marks of 3rd Subject ");
    float marks3=sc.nextInt();
    System.out.println("Enter the marks of 4th Subject ");
    float marks4=sc.nextInt();
    System.out.println("Enter the marks of 5th Subject ");
    float marks5=sc.nextInt();
    Grade obj=new Grade();
    obj.Totalmarks(marks1,marks2,marks3,marks4,marks5);
    obj.percentaage(marks1, marks2, marks3, marks4, marks5);
}




}
