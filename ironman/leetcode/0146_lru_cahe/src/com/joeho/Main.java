package com.joeho;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	    LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4

        lRUCache = new LRUCache(2);
        lRUCache.get(2);
        lRUCache.put(2, 6);
        lRUCache.get(1);
        lRUCache.put(1, 5);
        lRUCache.put(1, 2);
        lRUCache.get(1);
        lRUCache.get(2);
    }

    static class LRUCache {

        class Item {
            int value;
            Long timeStamp;

            Item(int value) {
                this.value = value;
                timeStamp = System.nanoTime();
            }

            void update() {
                timeStamp = System.nanoTime();
            }
        }

        int capacity;
        HashMap<Integer, Item> cacheMap = new HashMap<>();
        TreeMap<Long, Integer> sortedItems = new TreeMap<Long, Integer>();
        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            Item item = cacheMap.get(key);
            if (item != null && sortedItems.containsKey(item.timeStamp)) {
                sortedItems.remove(item.timeStamp);
                item.update();
                sortedItems.put(item.timeStamp, key);
                return item.value;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (cacheMap.containsKey(key)) {
                sortedItems.remove(cacheMap.get(key).timeStamp);
            } else if (cacheMap.size() >= capacity) {
                cacheMap.remove(sortedItems.get(sortedItems.firstKey()));
                sortedItems.remove(sortedItems.firstKey());
            }
            Item item = new Item(value);
            cacheMap.put(key, item);
            sortedItems.put(item.timeStamp, key);
        }
    }
}
