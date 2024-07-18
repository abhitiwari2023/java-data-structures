package programs.basic;

public class ArmstrongNumber {
    static void checkArmstrong(int num) {
        int temp = num, last, digits = 0, sum = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("Nember is Armstrong Number");
        } else
            System.out.println("Number is Not Armstrong Number");
    }

    public static void main(String[] args) {
        ArmstrongNumber.checkArmstrong(153);
    }
}
