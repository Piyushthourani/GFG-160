
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/insert-interval-1666733333

import java.util.*;
public class Day25 {
    public static void main(String[] args) {
        int intervals[][]= {{1,3}, {4,5}, {6,7}, {8,10}};
        int newInterval[] = {5,6};
        
       ArrayList<int[]> result = insertInterval(intervals, newInterval);
        System.out.print("Merged Intervals: [");
        for (int i = 0; i < result.size(); i++) {
            int[] interval = result.get(i);
            System.out.print("[" + interval[0] + "," + interval[1] + "]");
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
       ArrayList<int[]> al=new ArrayList<>();
        boolean added=false;
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0]<newInterval[0]&&intervals[i][1]<newInterval[0])
            {
                al.add(intervals[i]);
            }
            else if(intervals[i][0]>newInterval[1]&&intervals[i][1]>newInterval[1])
            {
                if(added==false)
                {
                    al.add(newInterval);
                    added=true;
                }
                al.add(intervals[i]);
            }
            else
            {
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }
        if(added==false)
        {
            al.add(newInterval);
        }
        return al;
    }
}
