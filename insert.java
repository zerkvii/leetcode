public class insert {
    public static int searchInsert(int[] nums, int target) {
        int len= nums.length;
        int i=0;
        for ( i = 0; i < len; i++) {
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target)break;
        }
        return i;
    }

    public static void main(String... args) throws Exception {
            int[] nums={1,3,5,6};
           int r= searchInsert(nums,3);
           int k=1;
    }
}
