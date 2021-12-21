class gcd{
    static int gcdFinder(int n1, int n2){
        if(n2 == 0){
            return n1;
        }
        return gcdFinder(n2, n1 % n2);
    }
    public static void main(String[] args) {
        int n1 = 66;
        int n2 = 66;
        System.out.println(gcdFinder(n1,n2));
    }
}