//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串

  
package com.leetcode.editor.cn;

public class LongestCommonPrefix{
    public static void main(String[] args) {
      Solution solution = new LongestCommonPrefix().new Solution();
      String[] strs = {"flower","flow","flight"};
      System.out.println(solution.longestCommonPrefix(strs));
      System.out.println(longestCommonPrefixOffic(strs));
      }
   //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    /**
     * 二分法
     * @param strs
     * @return java.lang.String
     * @Author FengL
     * @Date 2020/06/02 10:40
     */
    public static String longestCommonPrefixOffic(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (String str: strs) {
            minLen = Math.min(str.length(), minLen);
        }
        int low = 1;
        int high = minLen;
       while(low < high){
           int middle = (low + high) / 2;
           if(isCommonPrefix(strs,middle)){
               low = middle + 1;
           }else{
               high = middle - 1;
           }
       }
        return strs[0].substring(0,(low + high) / 2);
    }

    public static boolean isCommonPrefix(String[] strs,int len){
        String str = strs[0].substring(0,len);
        for (int i = 1; i < strs.length; i++) {
            if(!strs[i].startsWith(str)){
                return false;
            }
        }
        return true;
    }
  }