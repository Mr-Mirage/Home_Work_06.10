/*� ������� ����������� �����. ���� ��� ����� ����� 0 - ����� �������� �� ����� "������ �� ����������",
 ���� ����� �� ����� 0, ����� �������� ��� ��������� "ERROR"
 */
import java.util.Scanner;

public class FirstLvl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("No errors found");
        }else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }

    }
}