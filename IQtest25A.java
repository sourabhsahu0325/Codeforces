import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        for (int i = 0; i < n; i++) {
            if (evenCount == 1 && arr[i] % 2 == 0) {
                System.out.println(i + 1);
                break;
            }
            if (oddCount == 1 && arr[i] % 2 != 0) {
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}
