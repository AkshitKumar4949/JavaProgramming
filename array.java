import java.util.Arrays;
import java.util.Scanner;
public class array {
  public static void main(String[] args){
    // int arr[] = new int[5];
    // int array[] = {1,2,3,4,5};
    // int i = array.length-1;
    // while(i>=0){
    //   System.out.println(array[i]);
    //   i--;
    // }
    // i = 4;
    // do{
    //   System.out.println(array[i]);
    //   i--;
    // }while(i>=0);
    // Scanner input = new Scanner(System.in);
    // int array[][] = new int[4][3]; 
    // for(int i=0;i<4;i++){
    //   for(int j=0;j<3;j++){
    //     int num = input.nextInt();
    //     array[i][j] = num;
    //   }
    // }
    // for(int i=0;i<4;i++){
    //   for(int j=0;j<3;j++){
    //     System.out.print(array[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    int sum = 0;
    int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        sum += array[i][j];
      }
      System.out.println(sum);
      sum = 0;
    }
    int max = 0;
    int array1[][] = {{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        max = Math.max(max,array1[i][j]);
      }
      System.out.println(max);
      max = 0;
    }
  }
}
