package by.belyaev.L09_01_2025;

public class Task00 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            int b = 9;
            for (int j = 0; j < 20; j++){
                a = 99;
            }
        }
        int b = 99; //область видимости переменной b, только в цикле for, а переменная a видна везде
    }


}
