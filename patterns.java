import java.util.Scanner;
public class patterns {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    //    *
    //   ***
    //  *****
    // *******
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print(" ");
    //   }
    //   for(int k=1;k<=2*i-1;k++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    //    *
    //   * *
    //  *   *
    // *     *    
    // for(int i=1;i<=n;i++){
    //   for(int j=1;j<=n-i;j++){
    //     System.out.print(" ");
    //   }
    //   for(int st=1;st<=2*i-1;st++){
    //     if(st==1||st==2*i-1)
    //     System.out.print("*");
    //     else
    //     System.out.print(" ");
    //   }
    //   System.out.println();
    // }
// *
// * *
// * * *
// * * * *
// * * * * *
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
// *****
// *****
// *****
// *****
// *****
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
