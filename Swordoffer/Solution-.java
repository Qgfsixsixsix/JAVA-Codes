public class Solution {
    public String replaceSpace(StringBuffer str) {
        return (new String(str)).replaceAll(" ","%20");
    }
}
