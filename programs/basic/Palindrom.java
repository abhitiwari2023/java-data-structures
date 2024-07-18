package programs.basic;

class Palindrom {

    void checkPalindrom(int num) {
        int temp = num;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }
        if (reverse == temp) {
            System.out.println("Number is Palindrom");
        } else
            System.out.println("Number is not Palindrom");
    }

    public static void main(String[] args) {
        Palindrom obj = new Palindrom();
        obj.checkPalindrom(11211);
    }
}