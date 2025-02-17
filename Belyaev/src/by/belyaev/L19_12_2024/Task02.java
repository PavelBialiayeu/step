package by.belyaev.L19_12_2024;

public class Task02 {
    public static void main(String[] args) {
        int h = 174;
        int m = 89;
        int c = h - 110;
        if (m > c) {
            int d = m - c;
            System.out.print("Вам надо похудеть на " + d + " килограмм");
        }
        else {
            int e = m + c;
            System.out.print("Вам надо поправиться на " + e + " килограмм");
        }
    }
}
