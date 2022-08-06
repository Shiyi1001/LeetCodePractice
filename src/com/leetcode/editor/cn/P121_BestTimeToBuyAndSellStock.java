/**
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * <p>
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= prices.length <= 10⁵
 * 0 <= prices[i] <= 10⁴
 * <p>
 * <p>
 * Related Topics 数组 动态规划 👍 2483 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 买卖股票的最佳时机
 * @Date 2022-08-06 21:46:15
 */

public class P121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new P121_BestTimeToBuyAndSellStock().new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 太暴力了  超时ing =_=
         */
        public int maxProfit1(int[] prices) {

            int max = 0;
            //第 i天买入股票
            for (int i = 0; i < prices.length - 1; i++) {
                //第j天卖出股票
                for (int j = i + 1; j < prices.length; j++) {
                    int pri = prices[j] - prices[i];
                    if (pri > max) {
                        max = pri;
                    }
                }
            }
            return max;
        }

        public int maxProfit(int[] prices) {

            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < min) {
                    //找出前i天最低价格
                    min = prices[i];
                } else if (prices[i] - min > max) {
                    max = prices[i] - min;
                }
            }
            return max;
        }

        /**
         * 贪心算法
         */
        public int maxProfit2(int[] prices) {

            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int price : prices) {
                min = Math.min(price, min);
                max = Math.max(price - min, max);
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}