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
        if (n.isProbablePrime(30)){
            factors.add(n);
        } else {
            BigInteger d = pollardsRho(n);
            factor(d, factors);
            factor(n.divide(d), factors);
        }
    }

    static BigInteger pollardsRho(BigInteger n) {
        if(n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) return BigInteger.TWO;
        BigInteger x = new BigInteger(n.bitLength(), rand).mod(n);
        BigInteger y =x;
        BigInteger c = new BigInteger(n.bitLength(), rand).mod(n);
        if(c.equals(BigInteger.ZERO)) return BigInteger.ONE;
        BigInteger d = BigInteger.ONE;

        while (d.equals(BigInteger.ONE)){
            x = x.multiply(x).mod(n).add(n).mod(n);
            y = y.multiply(y).mod(n).add(n).mod(n);
            y = y.multiply(y).mod(n).add(n).mod(n);
            d = x.subtract(y).abs().gcd(n);
            if(d.equals(n)) return  pollardsRho(n);
        }
        return  d;
    }
}
