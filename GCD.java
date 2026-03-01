public class GCD {
    
    public int GCD(int n1, int n2) {
        int gcd = 0;

        for(int i = 1; i<n2; i++)
        {
            if(n1 % i == 0 && n2 % i == 0){

                System.err.println(i);

            }
        }


        return gcd;
    }

    public static void main(String[] args)
    {
        int n1 = 6, n2 = 12;

        GCD gcd = new GCD();
        int ret = gcd.GCD(n1, n2);
        System.err.println("Return: " + ret);
    }
}
