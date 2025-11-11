package SOE;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    // 計算各位數平方和
    static int next(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    // 遞迴版 isHappy()
    static boolean isHappy(int n) {
        return isHappyHelper(n, new HashSet<>());
    }

    // 遞迴輔助函式：傳遞 seen 集合
    private static boolean isHappyHelper(int n, Set<Integer> seen) {
        if (n == 1)
            return true; // 終止條件：快樂數
        if (seen.contains(n))
            return false; // 終止條件：進入循環

        seen.add(n);
        return isHappyHelper(next(n), seen);
    }

    // 測試
    public static void main(String[] args) {
        int[] nums = {1, 7, 19, 20, 25, 4};

        for (int n : nums) {
            System.out.printf("%d -> %s%n", n, isHappy(n));
        }
    }
}

// Source: https://chatgpt.com/c/69104fa3-4828-8321-ade1-f983f1f8c14c


