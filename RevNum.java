public class RevNum {
    public int reverse(int n) {
    int rev = 0;

    while (n != 0) {
        int last = n % 10;  // generate last number

        //to check it stayus within Integer range or not
        if (rev > Integer.MAX_VALUE / 10 ||   
            rev < Integer.MIN_VALUE / 10) {
            return 0;
        }
        rev = rev * 10 + last;  // main logic for reverse number 
        n /= 10; // remove last number
    }

    return rev;
}
    public static void main(String[] args)
    {
        int num = 123;

        RevNum rv = new RevNum();
        int ret = rv.reverse(num);
        System.out.println(ret);
    }
}

