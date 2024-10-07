import java.util.Scanner;

public class GreadCalculator
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of subject: ");
        int subjects = sc.nextInt();

        int Total_Marks=0;

        for(int i=1;i<=subjects;i++)
        {
            System.out.println("Enter the marks in each subject" + i + ": ");
            int Marks = sc.nextInt();
            Total_Marks += Marks;
        }
        double Avg_Percentage=(double) Total_Marks /(subjects*100)*100;

        
        char Gread;
        if(Avg_Percentage>=90)
        { 
            Gread='O';
           }
           else if(Avg_Percentage>=80)
           {
            Gread='E';
           }
           else if(Avg_Percentage>=70)
           {
            Gread='A';
           }
           else if(Avg_Percentage>=60)
           {
            Gread='B';
           }
           else if(Avg_Percentage>=50)
           {
            Gread='C';
           }
           else
           {
            Gread='F';
           }


           System.out.println("Total Marks: "+ Total_Marks);
           System.out.println("Average Percentage: "+ Avg_Percentage+"%");
           System.out.println("Gread: "+Gread);
    }
}