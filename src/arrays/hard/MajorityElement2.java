package arrays.hard;

import java.util.Arrays;

public class MajorityElement2 {
  static void main(String[] args) {
    int[] nums = {5,5,5,1,2};
    int firstMajorityElement =Integer.MIN_VALUE;
    int secondMajorityElement = Integer.MIN_VALUE;
    int firstMajorityCount =0;
    int secondMajorityCount = 0;
     for(int i =0; i< nums.length;i++){
       if(firstMajorityCount==0 && secondMajorityElement!=nums[i]){
         firstMajorityCount=1;
         firstMajorityElement=nums[i];
       } else if (secondMajorityCount==0 && firstMajorityElement!=nums[i]) {
         secondMajorityCount=1;
         secondMajorityElement=nums[i];
       } else if (firstMajorityElement==nums[i]) {
         firstMajorityCount++;
       } else if (secondMajorityElement==nums[i]) {
         secondMajorityCount++;

       }
       else {
         firstMajorityCount--;
         secondMajorityCount--;
       }
     }

    int finalFirstMajorityElement = firstMajorityElement;
    long actualFirstElementCount = Arrays.stream(nums).filter(arrayElement -> arrayElement== finalFirstMajorityElement).count();
    int finalSecondMajorityElement = secondMajorityElement;
    long actualSecondElementCCount = Arrays.stream(nums).filter(arrayElement -> arrayElement== finalSecondMajorityElement).count();

    if (actualFirstElementCount > (nums.length/3)){
      System.out.println("First Majority Element: "+ finalFirstMajorityElement);
    }
    if(actualSecondElementCCount> (nums.length/3)){
      System.out.println("Second Majority Element: "+ secondMajorityElement);

    }

  }
}
