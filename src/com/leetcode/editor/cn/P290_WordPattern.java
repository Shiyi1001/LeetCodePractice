/**
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 * <p>
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
 * <p>
 * <p>
 * <p>
 * 示例1:
 * <p>
 * <p>
 * 输入: pattern = "abba", s = "dog cat cat dog"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入:pattern = "abba", s = "dog cat cat fish"
 * 输出: false
 * <p>
 * 示例 3:
 * <p>
 * <p>
 * 输入: pattern = "aaaa", s = "dog cat cat dog"
 * 输出: false
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 1 <= pattern.length <= 300
 * pattern 只包含小写英文字母
 * 1 <= s.length <= 3000
 * s 只包含小写英文字母和 ' '
 * s 不包含 任何前导或尾随对空格
 * s 中每个单词都被 单个空格 分隔
 * <p>
 * <p>
 * Related Topics 哈希表 字符串 👍 495 👎 0
 */

package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 单词规律
 * @Date 2022-08-27 19:44:01
 */

public class P290_WordPattern {
    public static void main(String[] args) {
        Solution solution = new P290_WordPattern().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            Map<Object, Integer> map = new HashMap<>();

            String[] words = s.split(" ");
            if (words.length != pattern.length()) {
                return false;
            }
            //int [-128,127] 使用的是缓冲对象 == 判断一致  可以选择equels判断或改成Integer
            for (Integer i = 0; i < words.length; i++) {
                //map 中如果存在key则 覆盖旧value 并返回旧value
                if (map.put(pattern.charAt(i), i) != map.put(words[i], i)) {
                    return false;
                }
            }
            return true;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}