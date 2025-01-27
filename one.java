class one{
  static void fn1(){
    System.out.println("Hello bhai fn1");
  }
  static void fn2(){
    System.out.println("Hello bhai fn2");
  }
  public static void main(String[] var){
    fn2();
    System.out.println("Hello bhai main");
    Area.fn1(); //Calling function declared in another class
  }
}
class Area{
  static void fn1(){
    System.out.println("Hello bhai Area(fn1)");
  }
  static void fn2(){
    System.out.println("Hello bhai Area(fn2)");
  }
}