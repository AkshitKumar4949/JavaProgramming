import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a = 2;
        while(m>0){
              boolean isprime = true;
              for(int i=2;i*i<=a;i++){
                if(a%i==0){
                  isprime = false;
                  break;
                }
              }
              if(isprime == true){
                System.out.println(a);
                m--;
              }
              a++;
        }
    }
}