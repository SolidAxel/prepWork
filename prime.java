
class primer{
    public static void main(String[] args) {
        int i = 99;
        System.out.printf("%d %b%n", i, primeHelper(99));

    }
    static boolean primeHelper(int n){
        if(n <= 2 || n % 2 == 0)
            return (n == 2);
        return isPrime(n, 3);
    }
    static boolean isPrime(int n, int iter){
        if(iter * iter > n)
            return true;
        if(n % iter == 0)
            return false;
        return isPrime(n, iter+2);
    }
}