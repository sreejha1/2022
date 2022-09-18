package src.binarySearch;

public class BasicBinary {
        int binarySearch(int[] nums, int target){
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
            //What if it is the first element?
            if(nums[begin] == target)
                return begin;
           //If not found, return the place where it might get inserted..
            System.out.println("Didn't find");
           return -1;
        }

        public static void main(String[] args) {
            BasicBinary sol = new BasicBinary();
            int[] nums = new int[] {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
            
            System.out.println("Length "+nums.length);
            System.out.println("Index of 37 is ---> " + sol.binarySearch(nums, 37));
            System.out.println("Index of 1 is ---> " + sol.binarySearch(nums, 1));
            System.out.println("Index of 59 is ---> " + sol.binarySearch(nums, 59));
            System.out.println("Index of 25 is ---> " + sol.binarySearch(nums, 25));
            System.out.println("Index of 4 is ---> " + sol.binarySearch(nums, 4));
        }
    }

