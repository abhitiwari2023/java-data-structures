package oops;

public class ThisKeyword {
     ThisKeyword(){
        this(10);
    }
    ThisKeyword(int c){
        System.out.println(c);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
    }
}
