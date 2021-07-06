import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen to dau tien ban muon");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {

            if (demo(N)) {
                count++;
                System.out.println(N);
            }
            N++;
        }
    }

    public static boolean demo(int n) {
        boolean check = true;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
            }

        }
        return  true;
    }
}


