import java.util.Scanner;
public class StarSpace{
       public static void main(String[] args){
              Scanner s=new Scanner(System.in);
              System.out.println("enter a postive number: ");
              int n=s.nextInt();
              if(n==0){
                  System.out.println("Try again");
              }
              else
                  for(int i=1;i<=n;i++){
                        for(int j=1;j<=n-i;j++)
                            
                           System.out.print(" ");

                             for(int k=1;k<=i;k++)
                                   System.out.print("*");
                     System.out.println();
                  }
              
       }
}