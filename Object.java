public class Object {
  void function1(int i){
    System.out.println("Object created : Number");
    System.out.println(i);
  }
  public static void main(String[] var1){
    System.out.println("Main function!!");
    Object ob1 = new Object();
    ob1.function1(3);
  }
}
