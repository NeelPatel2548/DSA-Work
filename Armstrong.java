import java.util.*;
class Armstrong
{
    public static void main(String[] args)
    {
        int n = 153, count = 0, last = 0, copy = n;
        double sum = 0;

        while(n > 0)
        {
            count ++;
            n /= 10;  
        }
        n = copy;
        while(copy > 0)
        {
            last = copy % 10;
            sum = Math.pow(last, count) + sum;
            System.out.println(sum);
            copy /= 10;
        }

        System.out.println(n == sum);
    }
}

// ----------------- OPTIMIZED BY GPT -------------------------


// import java.util.*;

// class Armstrong {
//     public static void main(String[] args) {

//         int n = 153;
//         int original = n;
//         int count = 0;
//         int sum = 0;

//         // Count digits
//         int temp = n;
//         while (temp > 0) {
//             count++;
//             temp /= 10;
//         }

//         // Calculate Armstrong sum
//         temp = n;
//         while (temp > 0) {
//             int digit = temp % 10;

//             // Calculate digit^count manually
//             int power = 1;
//             for (int i = 0; i < count; i++) {
//                 power *= digit;
//             }

//             sum += power;
//             temp /= 10;
//         }

//         System.out.println(original == sum);
//     }
// }