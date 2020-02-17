package warmup;

// https://www.hackerrank.com/challenges/counting-valleys/
public class CountingValleys {
    private static int countingValleys(String s) {
        int level = upOrDown(s.charAt(0));
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            int nextLevel = level + upOrDown(s.charAt(i));
            if (level < 0 && nextLevel == 0) count++;
            level = nextLevel;
        }
        return count;
    }

    private static int upOrDown(char c) {
        return c == 'U' ? 1 : -1;
    }
}
