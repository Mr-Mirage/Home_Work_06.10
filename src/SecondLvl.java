import java.util.Scanner;

public class SecondLvl {
    public static void main(String[] args) {
        //С консоли считывается строка, если эта длина этой строки меньше 6 или последний символ НЕ '!',
        // тогда вывести "Ваш пароль неверный", иначе вывести "пароль принят"
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String str2 = "!";

        int size = str.length();
        boolean checkStr = str.endsWith("!");

        if (size < 6 || str2.equals(checkStr) != checkStr) {
            System.out.println("Your password is not correct");
        } else {
            System.out.println("Password accepted");
        }

    }
}
