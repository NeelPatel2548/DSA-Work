public class RevNum {
    public int reverse(int n) {
    
    String rev = "";

     while (n != 0) {
        
        rev = rev.concat(String.valueOf(n%10));
        n = n / 10;
    }
    System.out.println("REv: " + rev);
    return Integer.parseInt(rev);
    }

    public static void main(String[] args)
    {
        int num = 123;

        RevNum rv = new RevNum();
        int ret = rv.reverse(num);
        System.out.println(ret);
    }
}
