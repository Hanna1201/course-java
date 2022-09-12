package lessons.three;

public class Task04 {
    public static void main(String[] args) {
        int time = 11;
        switch (time) {
            case 0, 1, 2, 3, 4, 5:
                System.out.println("Спокойной ночи!");
                break;
            case 6, 7, 8, 9, 10, 11:
                System.out.println("Доброе утро!");
                break;
            case 12, 13, 14, 15, 16, 17:
                System.out.println("Добрый день!");
                break;
            case 18, 19, 20, 21, 22, 23:
                System.out.println("Добрый вечер!");
                break;
            default:
                System.out.println("Такого времени не существует");
        }
    }
}
