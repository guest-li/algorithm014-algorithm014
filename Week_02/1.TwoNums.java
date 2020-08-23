
//两数之和
public int[] twoSum(int[] nums, int target) {
        MapInteger,Integer map=new HashMap();
        for (int i=0;inums.length;i++){
            if (map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }