/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * <p>
 * 给你一个可能存在 重复 元素值的数组 numbers ，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。请返回旋转数组的最小元素。例如，数组 [3,4
 * ,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为 1。
 * <p>
 * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..
 * ., a[n-2]] 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：numbers = [3,4,5,1,2]
 * 输出：1
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：numbers = [2,2,2,0,1]
 * 输出：0
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * n == numbers.length
 * 1 <= n <= 5000
 * -5000 <= numbers[i] <= 5000
 * numbers 原来是一个升序排序的数组，并进行了 1 至 n 次旋转
 * <p>
 * <p>
 * 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-
 * sorted-array-ii/
 * <p>
 * Related Topics 数组 二分查找 👍 701 👎 0
 */

package com.leetcode.editor.cn.offer;

/**
 * @Title 剑指 Offer 11_旋转数组的最小数字
 * @Date 2022-09-03 23:30:33
 */

public class P_Offer_XuanZhuanShuZuDeZuiXiaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 也就是可重复有序数组旋转后查找最小值
     */
    class Solution {
        public int minArray(int[] numbers) {

            int low = 0, high = numbers.length - 1;
            while (low < high) {
                int mind = (low + high) / 2;
                if (numbers[mind] > numbers[high]) {
                    low = mind + 1;
                } else if (numbers[mind] < numbers[high]) {
                    high = mind;
                } else {
                    high--;
                }
            }
            return numbers[low];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}