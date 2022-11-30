import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(text());
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                }
                if (num == 1) {
                    System.out.println(cube());
                    continue;
                }
                if (num == 2) {
                    formula();
                }
                continue;
                //aqeruqrtujafgjnafgjmaf
            }
            String line = scanner.nextLine();
            if (line.equals("Stop")) {
                break;
            }
        }
    }

    public static String text() {
        return """
                Выберите один из пунктов:
                1. Куб числа
                2. Расчет по формуле
                0. Выход из программы""";
    }

    //cube
    public static int cube() {
        System.out.print("Введите число: ");
        Scanner scannerCube = new Scanner(System.in);
        int a = scannerCube.nextInt();
        return a * a * a;
    }

    //formula
    public static void formula() {
        System.out.println("Введите 4 числa: ");
        Scanner scannerFor = new Scanner(System.in);
        int a = scannerFor.nextInt();
        int b = scannerFor.nextInt();
        int c = scannerFor.nextInt();
        int d = scannerFor.nextInt();
        if (b > 0 && c < 0) {
            double result = Math.sqrt(b + c) / d * a;
            System.out.println(result);
            //return (result);
        } else if (b < 0) {
            System.out.println("Второе число не должно быть меньше 0");
        } else if (c > 0) {
            System.out.println("Третье число не должно быть больше 0");
        }
    }
}