import java.util.Scanner;

public class question_8{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       
       
      int N=sc.nextInt();

      if(N<1||N>100){System.out.println("Invalid input");}
      else{

        for(int row=1;row<=N;row++){

            System.out.print("*");
            
            for(int i=1;i<=N-2;i++){System.out.print(" ");}

            System.out.println("*");


        }





      }



    }
}