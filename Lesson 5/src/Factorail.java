public class Factorail {
    public static void main(String[] args) {
       // System.out.println(factorail(5));
        System.out.println(factorail2(5));

    }

    private static int factorail(int digit) {
        if (digit == 1){
            return 1;
        }
        return digit * factorail(digit -1);
    }
    private static int factorail2 (int digit) {
        return doFactorail(digit, 1);

    }

    private static int doFactorail(int digit, int acc) {
        if (digit == 1){
            return acc;
        }
        return doFactorail(digit -1, acc *= digit);
    }
    }

