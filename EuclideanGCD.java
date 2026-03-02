public class EuclideanGCD {

    public int isGCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 %= n2;
                System.out.println("n1 :  " + n1);
            } else {
                n2 %= n1;
                System.out.println("n1 :  " + n2);
            }
        }

        if (n1 == 0) {
            return n2;
        } else {
            return n1;
        }
    }

    public static void main(String[] args) {
        int n = 13, p = 600;

        EuclideanGCD egcd = new EuclideanGCD();

        System.out.println(egcd.isGCD(n, p));
    }

}
