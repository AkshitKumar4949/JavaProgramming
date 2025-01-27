import java.util.Scanner;
public class Pattern {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    // for(int i=0;i<n;i++){
    //   for(int j=0;j<i;j++){
    //     System.out.print(" ");
    //   }
    //   for(int k=0;k<2*(n-i)-1;k++){
    //     if(k==0||k==2*(n-i-1)||i==0){
    //       System.out.print("*");
    //     }
    //     else{
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }
    // int f = 1;
    // for(int i=1;i<=2*n;i++){
    //   if(i%2==0){
    //     f*=-1;
    //   }
    //   for(int j=1;j<=n;j++){
    //     if(f==1){
    //       System.out.print("- - ");
    //     }
    //     else{
    //       System.out.print("# # ");
    //     }
    //     f *= -1;
    //   }
    //   f *= -1;
    //   System.out.println();
    // }
    int f=1;
    for ( int i =1; i <=2*n ;i++)
        {
            if (i%2==0)
            {
                f*=0;
            }
            for ( int j =1; j <=n ;j++)
            {   
                if (f==1)
                {
                    System.out.print("..");
                    f=0;
                }
                else
                {
                    System.out.print("##");
                    f=1;
                }
            }
            f=f+1;
            System.out.println();
        }

  }
}
