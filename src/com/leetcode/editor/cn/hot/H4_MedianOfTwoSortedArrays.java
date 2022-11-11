/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10⁶ <= nums1[i], nums2[i] <= 10⁶
 * <p>
 * <p>
 * Related Topics 数组 二分查找 分治 👍 6059 👎 0
 */

package com.leetcode.editor.cn.hot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Title 寻找两个正序数组的中位数
 * @Date 2022-11-11 11:08:30
 */

public class H4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new H4_MedianOfTwoSortedArrays().new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
            List<Integer> list1 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
            list.addAll(list1);
            Collections.sort(list);
            int size = list.size();
            if (size % 2 != 0) {
                return list.get(size / 2);
            } else {
                return (list.get(size / 2 - 1) + list.get(size / 2)) / 2.0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}