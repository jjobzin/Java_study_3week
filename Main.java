public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (n <= 1000) {
            if (n % 3 == 0) {
                sum += n;
            }
            n++;
        }
        System.out.println(sum);

    }
}