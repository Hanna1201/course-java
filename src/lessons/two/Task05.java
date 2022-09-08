package lessons.two;

public class Task05 {
    public static void main(String[] args) {
        var number = 11.05;
        int x = (int) number;
        if ((number - x) > 0) {
            System.out.println("У числа ЕСТЬ вещественная часть");
        } else {
            System.out.println("У числа НЕТ вещественной части");
        }
    }
}
