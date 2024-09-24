import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

         if (inputArr.length != 3) {
            System.out.print("Не правильный формат примера ");
        }
             int a = Integer.parseInt(inputArr[0]);
             char operator = inputArr[1].charAt(0);
             int b = Integer.parseInt(inputArr[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            System.out.print("Диапазон числе должен быть от 1 до 10 ");
        }
        else
        {
            int result = 0;
            switch (operator)
            {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b==0)
                    {
                        System.out.print("На ноль делить нельзя");
                        break;
                    }
                    else
                    {
                        result = a / b;
                        break;
                    }
                default:
                    System.out.print("Не правильная операция ");
                    break;
            }
            System.out.println(result);
        }
    }
}
