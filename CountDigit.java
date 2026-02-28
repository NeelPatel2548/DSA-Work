import java.util.Scanner;

public class CountDigit{
    
    public int countDigit(int n) {
        int last, rem, count = 0;

        String len = String.valueOf(n);
        for(int i =0; i<=len.length(); i++)
        {
             last = n%10;
            rem = n/10;
            len = String.valueOf(rem);
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        CountDigit cd = new CountDigit();
        // cd.countDigit(num);
        int totCou = cd.countDigit(num);
        System.out.println(totCou);
    }
}