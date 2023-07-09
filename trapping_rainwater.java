import java.util.*;

public class trapping_rainwater {
    public static void main(String[]args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the total no of heights u want to store ");
       int n =sc.nextInt();
       int height[]=new int[n];
       System.out.println("enter original heights");
       for(int i=0;i<n;i++){
        height[i]=sc.nextInt();
       }
       int left_max[]=new int[n];
       left_max[0]=height[0];
       for (int i=1;i<n;i++){
        left_max[i]=Math.max(height[i],left_max[i-1]);
       }
       int right_max[]=new int[n];
       right_max[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--){
        right_max[i]=Math.max(height[i],right_max[i+1]);
       }
       int trapped_water=0;
       for(int i=0;i<n;i++){
        int waterlevel=Math.min(left_max[i],right_max[i]);
        
        trapped_water+=waterlevel-height[i];
        
        
       }
       
       System.out.println("total trapped water is :"+trapped_water);
       
    }
    
}
