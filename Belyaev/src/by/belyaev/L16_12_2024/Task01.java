package by.belyaev.L16_12_2024;

//Объявление переменных
public class Task01 {
    public static void main(String[] args) {
        int var1;//объявили переменную типа int название переменной var1
        var1 = 1;//присвоили значение переменной
        int var2 = 2;//Инициализация переменной
        var1 = var2;
        int i = var1 / 2;
        int i1 = i * 7;
        int b = i1 + 5;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(b);
        System.out.println("Мы присвоили переменной b значение: " + b);
    }
}
