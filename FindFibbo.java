public class FindFibbo{
static double fib(double n){
double a=0,b=1,c;
if(n==0)
return a;
for(int i=3;i<=n;i++)
{
c=a+b;
a=b;
b=c;
}
return b;
}

  public static void main(String[] args) {
  double n=100;
    System.out.println(fib(n));
  }
}

