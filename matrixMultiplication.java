import java.util.Scanner;

public class matrixMultiplication {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = 3;
    int m = 2;
    int p = 3;
    int[][] arr1 = new int[n][m];
    int[][] arr2 = new int[m][p];
    int[][] arr3 = new int[n][p];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int element = input.nextInt();
        arr1[i][j] = element;
      }
    }
    for (int i = 0; i < n; i++) {
      
      for (int j = 0; j < m; j++) {
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < p; j++) {
        int element = input.nextInt();
        arr2[i][j] = element;
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < p; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }
    input.close();
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        for(int k=0;k<m;k++){
          arr3[i][j] += arr1[i][k] * arr2[k][j];
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < p; j++) {
        System.out.print(arr3[i][j] + " ");
      }
      System.out.println();
    }
  }

}
