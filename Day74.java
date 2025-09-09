
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/linked-list-gfg-160/problem/lru-cache

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Day74 {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        LRUCache.put(1,10);
        LRUCache.put(2,20);
        System.out.println(LRUCache.get(1)); // 10
        LRUCache.put(3,30); // evicts 2
        System.out.println(LRUCache.get(2)); // -1
        LRUCache.put(4,40); // evicts 1
        System.out.println(LRUCache.get(1)); // -1
        System.out.println(LRUCache.get(3)); // 30
        System.out.println(LRUCache.get(4)); // 40
    }
    static class LRUCache {
    private static int capacity;
    private static Map<Integer,Integer> cachemap;
    private static LinkedList<Integer> lrulist;

    LRUCache(int cap) {
        // code here
        this.capacity=cap;
        this.cachemap=new HashMap<>();
        this.lrulist=new LinkedList<>();
        
    }

    public static int get(int key) {

        if(!cachemap.containsKey(key))
        {
            return -1;
        }
        lrulist.remove(Integer.valueOf(key));
        lrulist.addFirst(key);
        return cachemap.get(key);
        // your code here
    }

        
    public static void put(int key, int value) {
        // your code here
        if(cachemap.containsKey(key))
        {
            cachemap.put(key,value);
            lrulist.remove(Integer.valueOf(key));
        }
        else
        {
            if(cachemap.size()>=capacity)
            {
                int leastusedkey=lrulist.removeLast();
                cachemap.remove(leastusedkey);
            }
            cachemap.put(key,value);
            
        }
        lrulist.addFirst(key);
    }
}
}
