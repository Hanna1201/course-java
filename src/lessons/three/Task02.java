package lessons.three;

public class Task02 {
    public static void main(String[] args) {
        int numDay = 6;
        if (numDay == 1) {
            System.out.println("Понедельник");
        } else if (numDay == 2) {
            System.out.println("Вторник");
        } else if (numDay == 3) {
            System.out.println("Среда");
        } else if (numDay == 4) {
            System.out.println("Четверг");
        } else if (numDay == 5) {
            System.out.println("Пятница");
        } else if (numDay == 6) {
            System.out.println("Суббота");
        } else if (numDay == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня недели не существует");
        }
    }
}
