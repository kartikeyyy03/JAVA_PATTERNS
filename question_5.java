import java.util.Scanner;


public class question_5 {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);

      int N=sc.nextInt();
      if(N<1||N>100){System.out.println("Invalid Input");}
      else{
        for(int row=1;row<=N;row++){
            for(int space=1;space<=N-row;space++){
                System.out.print(" ");

            }
            for(int i=1;i<=row;i++){

            System.out.print("*");}


            System.out.println();
        }






      }
    


    }
}
    

