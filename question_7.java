import java.util.Scanner;

import javax.print.event.PrintEvent;


public class question_7 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        if(N<1||N>100){
            System.out.println("Invalid Input");

        }
        else{

            for(int row=1;row<=N;row++){
                
                for(int column=1;column<=row;column++){

                //  if(row%2==0){System.out.print(" ");}
                    // else{
                
                  System.out.print(column + " ");
                
                }



                System.out.println();
            }
            



        }

    }
    
}

