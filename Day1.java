 
//  Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735


public class Day1 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Example array, you can change it to test with different inputs
        
        System.out.println("Second largest element: " + secondLargest(arr));
    }


    static int secondLargest(int[] arr) {
        int maxi1 = -1;
        int maxi2 = -1;
        for(int val:arr){
            if(maxi1 == -1){
                maxi1 = val;
            }
            else if(val > maxi1){
                maxi2 = maxi1;
                maxi1 = val;
            }
            else if(val < maxi1){
                maxi2 = Math.max(maxi2,val);
            }
            else{
                continue;
            }
        }
        return maxi2;
        
    }
}