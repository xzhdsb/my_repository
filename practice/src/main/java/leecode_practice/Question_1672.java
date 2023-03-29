package leecode_practice;

import java.util.Arrays;

/**
 * @author zihao.Xu
 * @version 1.0
 */

public class Question_1672 {
    public static void main(String[] args) {
        int[][] accounts = {{3,3,3},{1,2,1}};
        System.out.println(maximinWealth(accounts));
    }

    public static int maximinWealth(int[][] accounts){
        int[] userSums = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                userSums[i] += accounts[i][j];
            }
        }
        Arrays.sort(userSums);
        return userSums[userSums.length - 1];
    }
}
