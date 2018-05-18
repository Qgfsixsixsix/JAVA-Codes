public class Solution {
    public static int Add(int num1,int num2) {
        while (num1 != 0){
			int temp = num1 ^ num2;
			int sum = (num1 & num2) << 1;
			num2 = temp;
			num1 = sum;
        }
		return num2;
    }
}
