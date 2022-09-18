package src.binarySearch;

class SearchInRotatedArrayUtility {
    public int findPivot(int[] nums) {

        int left = 0;
        int right = nums.length;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid - 1])
                return mid;
            else if (nums[mid] > nums[left])
                left = mid;
            else
                right = mid;

        }
        return -1;
    }

    public int basicBinary(int[] nums, int target, int left, int right) {

        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid;
            else
                left = mid;

        }
        if(nums[left] == target)
            return target;
        return -1;
    }

    public int findNumber(int[] nums, int target) {

        if (nums.length == 1) return nums[0];
        int pivot = findPivot(nums);
        
        if (pivot != -1) {
            if (nums[pivot] == target) {

                System.out.println("Pivot was searched ");
                return pivot;
            }
            int num = basicBinary(nums, target, 0, pivot - 1);
            if (num != -1)
                return num;
            else
                return basicBinary(nums, target, pivot + 1, nums.length);
        }

        return -1;
    }
}

public class SearchInRotatedArray {
    public static void main(String args[]) {
        SearchInRotatedArrayUtility s = new SearchInRotatedArrayUtility();
        int[] nums = new int[]{4,5,6,7,0,1,2};
       System.out.println(s.findNumber(nums,9));
        SearchInRotatedArrayUtility s2 = new SearchInRotatedArrayUtility();
        int[] nums2 = new int[]{5,4};
        System.out.println(s2.findNumber(nums2, 4));
    }
}
