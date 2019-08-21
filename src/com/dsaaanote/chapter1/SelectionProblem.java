package com.dsaaanote.chapter1;

/**
 * @Description:一组N个数确定其中第k个最大者
 * @Auther: houpeng
 * @Date: 2019-08-21
 */
public class SelectionProblem {
    public static void main(String[] args) {
        int i = plan1(new int[]{14, 21, 32, 5, 6, 13, 25}, 2);
        System.out.println(i);
    }

    /**
     * 复杂度
     *
     * @param arr
     * @param k
     * @return
     */
    public static int plan1(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        return arr[k - 1];
    }
}