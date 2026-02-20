public class trapping_rainwater {
    //given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
       // water level= min(max_left, max_right)
       //trapped water= water level-height[i]
         //auxiliary array / helping array - left max boundry and right max boundary are stored in two arrays
         public static int trappedRainwater(int height[]){
          //calculate left max boundry - array
          int leftMax[]=new int[height.length];
          leftMax[0]=height[0];
          for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
          }
          //calculate right max boundry - array
          int rightMax[]=new int[height.length];
          rightMax[height.length-1]=height[height.length-1];
          for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
          }
          int trappedWater=0;
          //loop
          for(int i=0;i<height.length;i++){
            //water level = min(leftmaxboundry[i], rightmaxboundry[i])
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            //trapped water = water level - height[i]
            trappedWater+=waterLevel - height[i];
          }
          //water level = min(leftmaxboundry[i], rightmaxboundry[i])
          //trapped water = water level - height[i]
          return trappedWater;
         }
    public static void main(String args[]){
      int height[]={4,2,0,6,3,2,5};
      System.out.println("The total trapped rain water is: " + trappedRainwater(height));
        
    }
}
