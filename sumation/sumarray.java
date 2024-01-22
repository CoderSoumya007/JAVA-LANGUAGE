package sumation;

class sumarray {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 7, 9, 1, 2,3 };
        int target = 10;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                    return;
                }

            }
        }
    }

}
