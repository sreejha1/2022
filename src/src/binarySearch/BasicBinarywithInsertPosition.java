package src.binarySearch;

public class BasicBinarywithInsertPosition {
    
        int searchInsert(int[] nums, int target){
            int begin = 0;
            int end = nums.length; //+1 of the actual length
            while(begin +1 < end){
                int mid = (begin+end)/2;
                System.out.println("BEGIN END: " +begin +" "+end+" MID = "+mid +" NUM"+nums[mid] );
                if(target == nums[mid])
                    return mid;
                else if(nums[mid] < target)
                    begin = mid;
                else
                    end = mid;
                System.out.println("** BEGIN END: " +begin +" "+end+" MID = "+mid +" NUM"+nums[mid] );
            }
            if(nums[begin] == target)
                return begin;
            //If not found, return the place where it might get inserted..
            System.out.println("Didn't find");
            if(target > nums[begin])
                return end;
            return begin;
            // return -1;
        }

        public static void main(String[] args) {
            src.binarySearch.BasicBinarywithInsertPosition sol = new src.binarySearch.BasicBinarywithInsertPosition();
            // int[] nums = new int[] {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
            int[] nums = new int[] {1, 5, 8, 9, 11, 13, 15, 19, 21};

            System.out.println("Index of 9 is ---> " + sol.searchInsert(nums, 9));
            System.out.println("Index of 12 is ---> " + sol.searchInsert(nums, 12));
            System.out.println("Index of -4 is ---> " + sol.searchInsert(nums, -4));
            System.out.println("Index of 27 is ---> " + sol.searchInsert(nums, 27));

            System.out.println("Length "+nums.length);
           
        }
    }
