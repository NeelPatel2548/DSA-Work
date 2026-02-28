import java.util.Scanner;

public class CountDigit{
    
   public int countDigit(int n) {
    if (n == 0)
        return 1;

    int count = 0;

    while (n != 0) {
        n = n / 10;
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
        System.out.println("Output: " + totCou);
    }
}