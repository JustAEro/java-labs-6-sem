import java.math.BigInteger;

public class Task6 {
    public static void main(String[] args) {
        BigInteger result = factorial(1000);
        System.out.println(result);
    }
    private static BigInteger factorial(int n){
        BigInteger result = new BigInteger("1");
        for (int i = 1; i < n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
