class Solution {
    public String reverseWords(String s) {
        // write your code here
        if (s.length() == 0 || s == null) {
            return "";
        }
        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        //从后往前遍历array，在sb中插入单词
        for (int i = array.length - 1; i >= 0; i--) {
            if(!array[i].equals("")) {
                // 判断是否是第一个放入sb，如果不是，需要跟前面的单词加一个空格分隔
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }
}
