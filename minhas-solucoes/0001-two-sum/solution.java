class Solution {
    //[2,7,11,15]
    //target = 9
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {
            int exactValue = target - nums[i];
            if(hashMap.containsKey(exactValue)) {
                return new int[] { hashMap.get(exactValue), i };
            }

            hashMap.put(nums[i], i);
        }

        return new int[] {}; //nenhuma solução
    }
}


/*
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) { //evitar a última chamada desnecessária
            for (int j = i + 1; j < nums.length; j++) { //sempre pegar a posição a frente do i
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }


        return new int[] {}; //nenhuma solução
    }
}*/

