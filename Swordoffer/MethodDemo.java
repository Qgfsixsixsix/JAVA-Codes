/*
 *The BinarySearch method is used to iterate over each row.
 *
 */
public class MethodDemo{
	public static boolean Solution(int[][] arr,int target){
		for(int i = 0; i < arr.length; i++){
			int low = 0;
			int higt = arr[i].length-1;
			while (low <= higt){
				int mid = (low + higt) / 2;
				if (arr[i][mid] < target){
					low = mid + 1;
				}
				else if (arr[i][mid] > target){
					higt = mid - 1;
				}
				else 
					return true;
			}
		}
		return false;
	}
    public static void main(String[] agrs){
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean result = Solution(arr,15);
		System.out.println(result);
    }
}
