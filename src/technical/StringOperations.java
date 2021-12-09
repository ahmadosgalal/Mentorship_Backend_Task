package technical;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hi";
        String str2 = "World";
        //System.out.println(str1.length());
        //System.out.println(str2.length());
        char [] chars1 = new char[str1.length()];
        char [] chars2 = new char[str2.length()];
        chars1 = str1.toCharArray();
        chars2 = str2.toCharArray();

        boolean flag = false;
        for (int j = 0; j < str1.length() ; j++) {
            for (int k = 0; k < str2.length() ; k++) {
                if(Character.toLowerCase(chars1[j]) == Character.toLowerCase(chars2[k]))
                {
                    flag = true;
                    //System.out.println(chars1[j]);
                }
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
