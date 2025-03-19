public class fibonacci {
    public static void main(String[] args) {

        fibonacci f= new fibonacci();
        System.out.println(f.fib(3));

    }

    int fib(int n){
        int a=0,b=1;

        if(n==0) return 0;
        if(n==1) return 1;
        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
