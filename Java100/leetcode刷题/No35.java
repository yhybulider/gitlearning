class Soultion{
    public int returnnum(int[] nums,int target ){
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                return i ;
            }
        }
        // 整个数组中都不匹配就返回数组长度，就相当于插在了最后一个索引处
        return nums.length;

    }
}