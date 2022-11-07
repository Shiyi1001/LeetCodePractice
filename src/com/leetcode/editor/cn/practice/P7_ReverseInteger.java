//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学


package com.leetcode.editor.cn.practice;

/**
 * @Title 整数反转
 */
public class P7_ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new P7_ReverseInteger().new Solution();
        System.out.println(solution.reverse(534236469));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            long result = 0;
            do {
                result = result * 10 + x % 10;
            } while ((x /= 10) != 0);
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
                return 0;
            }
            return (int) result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}