/**
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数
 * 不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
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
 * <p>
 * <p>
 * 进阶：
 * <p>
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * <p>
 * <p>
 * Related Topics 数组 哈希表 双指针 二分查找 排序 👍 860 👎 0
 */

package com.leetcode.editor.cn.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title 两个数组的交集 II
 * @Date 2022-11-14 11:25:11
 */

public class P350_IntersectionOfTwoArraysIi {
    public static void main(String[] args) {
        Solution solution = new P350_IntersectionOfTwoArraysIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums1) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int[] res = new int[Math.min(nums1.length, nums2.length)];
            int index = 0;
            for (int num : nums2) {
                if (map.containsKey(num) && map.get(num) > 0) {
                    res[index++] = num;
                    map.put(num, map.get(num) - 1);
                }
            }
            // 去掉多余的元素
            return Arrays.copyOfRange(res, 0, index);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}