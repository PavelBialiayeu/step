package by.belyaev.L19_12_2024;

public class Task01 {
    public static void main(String[] args) {
        int sec = 186385;
        int day;
        int hourse;
        int minut;
        int second;
        day = sec / 86400;
        hourse = sec % 86400 / 3600;
        minut = sec % 3600 / 60;
        second = sec % 60;
        System.out.println("До Нового года осталось дней " + day + ",часов " + hourse + ",минут " + minut + ",секунд " + second);



    }
}
