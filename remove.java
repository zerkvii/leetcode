
public class remove {
    public static void main(String...args)throws Exception{
        int[] nums={1,2,2,2,3,3,55};
        int val=2;
        removeElement(nums,val);

    }
    public static  int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==val){
                n--;
                nums[i]=nums[n];
            } else{
                i++;
            }
        }
        return n;
    }
}
