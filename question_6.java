import java.util.Scanner;

import javax.print.event.PrintEvent;


public class question_6 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        if(N<1||N>100){
            System.out.println("Invalid Input");

        }
        else{

            for(int row=N;row>=1;row--){
                
                for(int column=1;column<=row;column++){

               
                
                  System.out.print(column +" ");
                
                }



                System.out.println();
            }
            



        }

    }
    
}

