class Solution { public int[] smallerNumbersThanCurrent(int[] nums) {
  int[] count = new int[101]; 
  int[] res = new int[nums.length]; 
                                                // Count occurrences 
  for (int num : nums) { 
    count[num]++;
  }
  // Convert count into number of smaller elements 
  int smaller = 0;
  for (int i = 0; i <= 100; i++) { 
    int temp = count[i];
    count[i] = smaller; 
    smaller += temp;
  } 
                                                                     // Build result 
  for (int i = 0; i < nums.length; i++) {
    res[i] = count[nums[i]]; 
  } 
  return res; 
}
}


// time complexity O(n) 
//generall way to solve this ques is nested loop but it will have time complexity O(n^2)
//Getting the correct solution is the first step. After that, check the constraints and think about whether the time complexity can be improved.
