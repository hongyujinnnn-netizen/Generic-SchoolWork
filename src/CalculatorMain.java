import java.util.Scanner;

    public class CalculatorMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculator<Integer, Integer> cal = new Calculator<>(90, 80);
            do {
                System.out.print("Enter operator: ");
                String op = scanner.nextLine();
                Integer result = switch (op) {
                    case "+" -> cal.getValue1() + cal.getValue2();
                    case "-" -> cal.getValue1() - cal.getValue2();
                    case "*" -> cal.getValue1() * cal.getValue2();
                    case "/" -> cal.getValue1() / cal.getValue2();
                    default -> throw new IllegalStateException();
                };

                System.out.println("Result = " + result);
            } while (true);

        }
    }

