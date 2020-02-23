package warmup;

//https://www.hackerrank.com/challenges/repeated-string
public class RepeatedString {
    static long repeatedString(String s, long n) {
        long result = 0;
        for (int i = 0; i < s.length() && i < n; i++) {
            if (s.charAt(i) == 'a') result++;
        }
        if (n > s.length()) {
            result *= n / s.length();
            for (int i = 0; i < n % s.length(); i++) {
                if (s.charAt(i) == 'a') result++;
            }
        }
        return result;
    }
}
