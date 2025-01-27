public class setter {
  private int x;
  int Setter(){
    x = 4;
    return x;
  }
  public static void main(String[] args){

    setter a = new setter();
    System.out.println("Value of x is :");
    int result = a.Setter();
    System.out.println(result);
  }
}
