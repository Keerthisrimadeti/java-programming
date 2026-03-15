public class StarPattern1 {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        for(int i=1;i<=n;i++) {
            result *= i;
        }
        System.out.println("Example program: StarPattern1");
        System.out.println("Result value: " + result);
    }
}