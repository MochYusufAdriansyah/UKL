import java.util.Random;
import java.util.Scanner;

public class soaluklsedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueQuiz = true;
  
        while (continueQuiz) {
            int num1 = random.nextInt(100) + 1;  
            int num2 = random.nextInt(100) + 1;  
            char operator;
            int correctAnswer = 0;

            switch (random.nextInt(5)) {
                case 0:
                    operator = '*';
                    correctAnswer = num1 * num2;
                    break;
                case 1:
                    operator = '/';
                    num2 = num2 == 0 ? 1 : num2;  
                    correctAnswer = num1 / num2;
                    break;
                case 2:
                    operator = '%';
                    correctAnswer = num1 % num2;
                    break;
                case 3:
                    operator = '+';
                    correctAnswer = num1 + num2;
                    break;
                case 4:
                    operator = '-';
                    correctAnswer = num1 - num2;
                    break;
                default:
                
                    operator = '?';
            }

            System.out.printf("%d %c %d = ", num1, operator, num2);
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah: " + correctAnswer);
            }

            System.out.print("Ingin melanjutkan kuis? (y/n): ");
            String userResponse = scanner.next();
            continueQuiz = userResponse.equalsIgnoreCase("y");
        }

        System.out.println("Terima kasih telah mengikuti kuis!");
    }
}
