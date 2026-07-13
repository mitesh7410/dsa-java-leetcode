class Solution {
    public int[] sortArray(int[] nums) {
       

    int max = Arrays.stream(nums).max().getAsInt();
    int min = Arrays.stream(nums).min().getAsInt();
    int n = nums.length;

    List<List<Integer>> buckets = new ArrayList<>();
    for (int i = 0; i < n; i++) buckets.add(new ArrayList<>());

    for (int num : nums) {
        int idx = (max == min) ? 0 : (int)((long)(num - min) * (n - 1) / (max - min));
        buckets.get(idx).add(num);
    }

    for (List<Integer> bucket : buckets) {
        Collections.sort(bucket);
    }

    int index = 0;
    for (List<Integer> bucket : buckets) {
        for (int num : bucket) {
             nums[index++] = num;
        } 
    }
    return nums;
    }
}