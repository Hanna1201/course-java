package lessons.three;

public class Task03 {
    public static void main(String[] args) {
        int time = 11;
        if (time >= 0 && time < 6) {
            System.out.println("Спокойной ночи!");
        } else if (time >= 6 && time < 12) {
            System.out.println("Доброе утро!");
        } else if (time >= 12 && time < 18) {
            System.out.println("Добрый день!");
        } else if (time >= 18 && time < 24) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Такого времени не существует");
        }
    }
}
