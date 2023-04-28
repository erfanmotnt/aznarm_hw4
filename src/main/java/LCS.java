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
        for(int i = 0; i < s1.length(); i++) {
            for(int j = i+1; j < s1.length(); j++) {
                for(int k = 0; k < s2.length(); k++) {
                    for(int t = k+1; t < s2.length(); t++) {
                        if(s1.substring(i, j).equals(s2.substring(k, t))) {
                            String s = s1.substring(i, j);
                            if(s.length() > max) {
                                max = s.length();
                                maxsub = s;
                            }
                        }
                    }
                }
            }
        }
        return maxsub;
    }

}
