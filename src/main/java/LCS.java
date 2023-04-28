import static java.lang.Math.floor;
import static java.lang.Math.random;

public class LCS {
    public static void main(String[] args)
    {

        String s1 = get_random_string(100000);
        System.out.println(s1);

        String s2 = get_random_string(10000);
        System.out.println(s2);

        String s3 = longest_common_substring(s1, s2);
        System.out.println(s3);
    }
    public static String get_random_string(int size) {
        String s = "";
        for(int i = 0; i < size; i++) {

            char a = (char) (floor(random() * 25) + 97);
            s = s + a;
        }
        return s;
    }
    public static String longest_common_substring(String s1, String s2) {
        int max = -1;
        String maxsub = "";
        int[][] LCSuff = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i <= s1.length(); i++) {
            for(int k = 0; k <= s2.length(); k++) {
                if(i ==0 || k ==0) {
                    LCSuff[i][k] = 0;
                }
                else if(s1.charAt(i-1) == s2.charAt(k-1)) {
                    LCSuff[i][k] = LCSuff[i - 1][k - 1] + 1;
                    if(LCSuff[i][k] > max) {
                        max = LCSuff[i][k];
                        maxsub = s1.substring(i - max,i);
                    }
                }
            }
        }
        return maxsub;
    }

}
