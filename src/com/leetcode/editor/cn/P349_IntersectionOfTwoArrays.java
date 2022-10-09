/**
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * 解释：[4,9] 也是可通过的
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * <p>
 * <p>
 * Related Topics 数组 哈希表 双指针 二分查找 排序 👍 640 👎 0
 */

package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @Title 349_两个数组的交集
 * @Date 2022-10-09 21:39:40
 */

public class P349_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new P349_IntersectionOfTwoArrays().new Solution();
        System.out.println(solution.intersection(new int[]{1,}, new int[]{1, 2}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int[] n1 = Arrays.stream(nums1).distinct().toArray();
            int[] n2 = Arrays.stream(nums2).distinct().toArray();

            int[] result = new int[n1.length + n2.length];
            int index1 = 0, index2 = 0,index = 0;
            while (index1 < n1.length && index2 < n2.length) {
                if (index1 < n1.length && n1[index1] < n2[index2]) {
                    index1++;
                } else if (index2 < n2.length && n1[index1] > n2[index2]) {
                    index2++;
                } else {
                    result[index ++] = n1[index1];
                    index1++;
                    index2++;
                }
            }
            return Arrays.copyOfRange(result,0,index);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}