/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * <p>
 * 0 <= k <= arr.length <= 10000
 * 0 <= arr[i] <= 10000
 * <p>
 * <p>
 * Related Topics 数组 分治 快速选择 排序 堆（优先队列） 👍 482 👎 0
 */

package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @Title 剑指 Offer 40_最小的k个数
 * @Date 2022-09-16 21:27:28
 */

public class P_Offer_ZuiXiaoDeKgeShuLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_ZuiXiaoDeKgeShuLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            Arrays.sort(arr);
            int[] res = new int[k];
            for (int i = 0; i < k; i++) {
                res[i] = arr[i];
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}