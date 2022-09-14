package lessons.four;

public class Task03 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.println(n1 + "\n" + n2);
        int i = 3;
        while (i <= 10) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            i++;
        }
    }
}


