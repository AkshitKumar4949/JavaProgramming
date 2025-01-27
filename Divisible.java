public class Divisible {
  public static void main(String[] args){
    int count =0;
    for(int i=1;i<=100;i++){
      if(i%3==0 || i%5==0){
        count ++;
        System.out.println(i + " count " + count);
        
      }
      if(count==10){
        break;
      }
    }
  }
}
