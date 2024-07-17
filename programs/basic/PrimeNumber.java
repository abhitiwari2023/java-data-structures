package programs.basic;

public class PrimeNumber {
    void checkPrime(int num){
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            int m = num / 2;
            for (int i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    break;
                } else {
                    System.out.println(num + " is prime number");
                    break;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.checkPrime(100);
    }
}
