package programs.basic;

public class Factorial {
    static int checkFactorial(int num){
        int factorial = 1;
        for(int i=num;i>0;i--){
            factorial = factorial*i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        System.out.println(Factorial.checkFactorial(25));
    }
}
