package leetcode.common.problem146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache1 {
    BothList bothList;
    Map<Integer, Integer> keyMap;
    int capacity;

    public LRUCache1(int capacity) {
        bothList = new BothList();
        keyMap = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (keyMap.containsKey(key)) {
            bothList.delete(key);
            bothList.add(key);
            return keyMap.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (keyMap.containsKey(key)) {
            bothList.delete(key);
        }
        bothList.add(key);
        keyMap.put(key, value);
        if (keyMap.size() > capacity) {
            int i = bothList.deleteOldest();
            keyMap.remove(i);
        }
    }


    class BothList {

        Node head;
        Node tail;

        Map<Integer, Node> nodeMap;

        BothList() {
            head = new Node(-1);
            tail = new Node(-1);
            nodeMap = new HashMap<>();
            head.next = tail;
            head.pre = tail;
            tail.next = head;
            tail.pre = head;
        }

        void delete(int value) {
            Node node = nodeMap.remove(value);
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        void add(int value) {
            Node node = new Node(value);
            nodeMap.put(value, node);
            node.next = tail;
            node.pre = tail.pre;
            tail.pre.next = node;
            tail.pre = node;
        }

        int deleteOldest() {
            Node node = head.next;
            head.next = node.next;
            node.next.pre = head;
            nodeMap.remove(node.val);
            return node.val;
        }
    }

    class Node {
        Node next;
        Node pre;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
}
