public class Wrap {
  public static void main(String []args){
    int x = Integer.parseInt("555");
    Integer y = Integer.valueOf("101101",2);
    int value = y.intValue();
    System.out.println(x);
    System.out.println(value);
  }
}
