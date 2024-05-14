public class trappingrainwater {
    public static int trappedRainWater(int height[]) {
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }
        int righmax[]=new int[height.length];
        righmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
      righmax[i]=Math.max(height[i],righmax[i+1] );
        }
        int trappedWater=0;
        int waterlevel=0;

        for(int i=0;i<height.length;i++){
        waterlevel=Math.min(leftmax[i],righmax[i] );
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;
        // return righmax[5];
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
       System.out.print( trappedRainWater(height));

    }

}
