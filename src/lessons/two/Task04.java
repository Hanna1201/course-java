package lessons.two;

public class Task04 {
    public static void main(String[] args) {
        int n = 123;
        int firstNumber = n / 100;
        int secondNumber = (n / 10) % 10;
        int thirdNumber = n % 10;
        int summNumber = firstNumber + secondNumber + thirdNumber;
        System.out.println("Cумма цифр числа n равна " + summNumber);
    }
}
