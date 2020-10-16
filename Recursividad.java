package clases;

/
 *
 * @author coss7
 */
public class facto {

    /
     * @param n
     /
    public long facto1(int n){
        if(n<=1)
            return 1;
        else
            return nfacto1(n-1);
    }
    public long facto2(int n){
        if(n<=1)
            return 1;
        else
            return n*facto2(n+1);
    }
    public long fibonacci(long n){
        if(n==0||n==1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public void hanoi(int n, int o, int a, int d){
        if(n==1)
            System.out.println("Mover disco de torre "+ o + " a torre " + d);
        else{
            hanoi(n-1,o,d,a);
            System.out.println("Mover disco de torre " + o + " a torre " + d);
            hanoi(n-1,a,o,d);
        }
    }
    public static void main(String[] args) {

        facto x= new facto();
        System.out.println(x.facto1(4));

        System.out.println(x.fibonacci(3));
        x.hanoi(3,2,1,3);
    }

}