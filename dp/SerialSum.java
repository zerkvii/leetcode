public class SerialSum {

    public static void main(String... args)throws Exception{
        int[] nums={-2, 0, 3, -5, 2, -1};
        NumArray obj=new NumArray(nums);
       System.out.println(obj.sumRange(2,5));
    }
}
class NumArray {
    int arr[];
    public NumArray(int[] nums) {
        int len=nums.length;
        arr=new int[len];
        if(len>0) {
            arr[0] = nums[0];
            for (int i = 1; i < len; i++) {
                arr[i] = arr[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        return i==0?arr[j]:arr[j]-arr[i-1];
    }
}