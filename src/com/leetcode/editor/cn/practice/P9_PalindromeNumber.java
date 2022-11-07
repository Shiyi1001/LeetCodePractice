//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学


package com.leetcode.editor.cn.practice;

public class P9_PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new P9_PalindromeNumber().new Solution();
        System.out.println(solution.isPalindrome(12214));
    }

    /**
     * 反转存在溢出情况 可以考虑反转一半 进行比较
     *
     * @param x
     * @return boolean
     * @Author FengL
     * @Date 2020/05/29 14:33
     */
    public boolean isPalindromeOffic(int x) {
        //负数和尾数为0 的肯定不是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseNumber = 0;
        while (x > reverseNumber) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }
        //当输入为奇数的时候 中位数不影响反转结果 可以通过 reverseNumber / 10 去掉中位数
        //例如 12321
        return x == reverseNumber || x == reverseNumber / 10;
    }
//leetcode submit region end(Prohibit modification and deletion)

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            //负数和尾数为0 的肯定不是回文数
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int temp = x;
            long reverseNumber = 0;
            while (temp > 0) {
                reverseNumber = reverseNumber * 10 + temp % 10;
                temp /= 10;
            }
            return x == (int) reverseNumber;
        }
    }
}