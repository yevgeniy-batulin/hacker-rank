package warmup;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds
public class JumpingOnTheClouds {
    static int jumpingOnClouds(int[] c) {
        int result = 0;
        int i = 1;
        while (i < c.length) {
            if (i + 1 < c.length && c[i + 1] == 0) {
                i += 2;
            } else {
                i++;
            }
            result++;
        }
        return result;
    }
}