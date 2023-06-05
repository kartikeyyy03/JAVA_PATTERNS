import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        


     int N =sc.nextInt(); int M = sc.nextInt();

     if(N<2||N>100||M<2||M>100){System.out.println("Invalid Input");}
     else{

        for(int row=1;row<=N;row++){
            
            for(int column=1;column<=M;column++){

                System.out.print("*");

            }
            System.out.println();


        }



     }



    }
}
