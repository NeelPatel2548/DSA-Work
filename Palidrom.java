public class Palidrom {
   
    public boolean isPalindrome(int n) {
        
        int rEm = 0, num = n;

        while(n > 0)
        {
            int last = n % 10;
            rEm = (rEm * 10) + last;
            n/=10;
        }
        return rEm == num;

    }

    public static void main(String[] args)
    {
        int num = 313;

        Palidrom pd = new Palidrom();
        if(pd.isPalindrome(num))
        {
            System.out.println("Number is Palidrome");
        }
        else{
            System.out.println("Number is not Palidrome");
            }
    }
}


