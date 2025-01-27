public class target {
  public static void main(String[] args){
    int arr[][] = {{1,2,3},{4,5},{6,7,8}};
    int target = 78;
    boolean ispresent = false;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(arr[i][j] == target){
          ispresent = true;
        }
      }
    }
    if(ispresent){
      System.out.println("Yes target present");
    }
    else{
      System.out.println("Target Not present");
    }
  }
}
