package technical;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        char [] chars1 = str1.toCharArray();;
        char [] chars2 = str2.toCharArray();

        boolean flag = false;
        for (int j = 0; j < str1.length() ; j++) {
            for (int k = 0; k < str2.length() ; k++) {
                if(Character.toLowerCase(chars1[j]) == Character.toLowerCase(chars2[k]))
                    flag = true;
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
