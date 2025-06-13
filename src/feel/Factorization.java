package feel;

import java.math.BigInteger;
import java.util.*;

public class Factorization {
    static final Random rand = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        sc.close();

        List<BigInteger> factors = new ArrayList<>();
        factor(n, factors);

        Collections.sort(factors);
        for (BigInteger p : factors) {
            System.out.println(p);
        }
    }

    static void factor(BigInteger n, List<BigInteger> factors) {
        if (n.compareTo(BigInteger.ONE) <= 0) return;
        if (n.isProbablePrime(30)) {
            factors.add(n);
        } else {
            BigInteger d = pollardsRho(n);
            factor(d, factors);
            factor(n.divide(d), factors);
        }
    }

    static BigInteger pollardsRho(BigInteger n) {
        if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO))
            return BigInteger.TWO;

        // 무작위 초기값 x, y, 상수 c
        BigInteger x = new BigInteger(n.bitLength(), rand).mod(n);
        BigInteger y = x;
        BigInteger c = new BigInteger(n.bitLength(), rand).mod(n);
        // c가 0이면 1로 설정
        if (c.equals(BigInteger.ZERO)) {
            c = BigInteger.ONE;
        }

        BigInteger d = BigInteger.ONE;
        // f(z) = z^2 + c (mod n)
        while (d.equals(BigInteger.ONE)) {
            x = x.multiply(x).mod(n).add(c).mod(n);
            y = y.multiply(y).mod(n).add(c).mod(n);
            y = y.multiply(y).mod(n).add(c).mod(n);
            d = x.subtract(y).abs().gcd(n);
            // 실패 시 재시도
            if (d.equals(n)) {
                return pollardsRho(n);
            }
        }
        return d;
    }
}
