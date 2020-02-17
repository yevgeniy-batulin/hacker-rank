package warmup;

import java.util.HashSet;
import java.util.Set;

// https://www.hackerrank.com/challenges/sock-merchant
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(ar[i])) {
                result++;
                set.remove(ar[i]);
            } else {
                set.add(ar[i]);
            }
        }
        return result;
    }
}
