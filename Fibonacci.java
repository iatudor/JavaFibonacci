public class Fibonacci {

  public static void main(String[] args) {

    int limite = Integer.parseInt(args[0]);

    for (int i = 0; i < limite; i++) {
      Systm.out.print(fibonacci(i) + " ");
    }
  }

  private static int fibonacci(int num) {
    if (num == 0 || num == 1)
      return num;
    else
      return fibonacci(num - 1) + fibonacci(num - 2);
  }
}