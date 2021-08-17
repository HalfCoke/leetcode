package leetcode.common.problem146;

public class Solution {
    public static void main(String[] args) {
        LRUCache1 lruCache = new LRUCache1(2);

        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);

//        lruCache.put(2,6);
//        System.out.println(lruCache.get(1));
//        lruCache.put(1,5);
//        lruCache.put(1,2);
//        System.out.println(lruCache.get(1));
//        System.out.println(lruCache.get(2));
    }
}
