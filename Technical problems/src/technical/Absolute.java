package technical;

import java.util.Scanner;
import java.lang.*;

public class Absolute {
    public static int AbsoluteMinimum(int [] inArr, int n)
    {
        if(n < 2)
            return 0;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int abs = Math.abs(inArr[i]-inArr[j]);
                if (abs < min)
                    min = abs;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //Size of array
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //Declaring the array
        int [] arr = new int[n];
        scanner = new Scanner(System.in);
        //Array initialization
        int x;
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            arr[i] = x;
        }
        //function call
        int out = AbsoluteMinimum(arr, n);
        System.out.println(out);
    }
}
