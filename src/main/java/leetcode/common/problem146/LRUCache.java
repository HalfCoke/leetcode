package leetcode.common.problem146;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    Map<Integer, Node<Integer, Integer>> data;
    DoubleList p;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.data = new HashMap<>();
        this.p = new DoubleList();
    }

    public int get(int key) {
        if (data.containsKey(key)) {
            Node<Integer, Integer> node = p.deleteNode(data.get(key));
            p.addNode(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (data.containsKey(key)) {
            Node<Integer, Integer> node = p.deleteNode(data.get(key));
            data.remove(node.key);
        } else if (data.size() >= capacity) {
            Node<Integer, Integer> node = p.deleteNode(p.head.next);
            data.remove(node.key);
        }
        Node<Integer, Integer> node = new Node<>(key, value);
        p.addNode(node);
        data.put(key, node);
    }

    static class DoubleList {
        Node<Integer, Integer> head;
        Node<Integer, Integer> tail;

        DoubleList() {
            head = new Node<>(-1, -1);
            tail = new Node<>(-1, -1);
            head.next = tail;
            head.pre = tail;
            tail.pre = head;
            tail.next = head;
        }

        Node<Integer, Integer> deleteNode(Node<Integer, Integer> node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
            return node;
        }

        void addNode(Node<Integer, Integer> node) {
            tail.pre.next = node;
            node.next = tail;
            node.pre = tail.pre;
            tail.pre = node;
        }
    }


    static class Node<K, V> {
        Node<K, V> pre;
        Node<K, V> next;
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
