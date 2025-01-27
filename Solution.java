class Solution {
  public int diagonalSum(int[][] mat) {
      int sum = 0;
      int mat[3][3] = {[1,2,3],[4,5,6],[7,8,9]};
      for(int i=0;i<mat.length;i++){
          for(int j=0;j<mat.length;j++){
              if(i==j){
                  sum += mat[i][j];
              }
          }
      }
      return sum;
  }
}