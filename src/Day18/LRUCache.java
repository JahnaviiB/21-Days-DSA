package Day18;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private static class Node{
        int key;
        int value;
        Node prev;
        Node next;

        Node(){}
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private int capacity;
    private Map<Integer,Node> map;
    private final Node head;
    private final Node tail;
    
    public LRUCache(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value){
        Node node = map.get(key);
        if(node != null){
            node.value = value;
            moveToHead(node);
        } else {
            Node newNode = new Node(key, value);
            map.put(key,newNode);
            addToHead(newNode);
        }
        if(map.size() > capacity){
            Node lru = removeTail();
            map.remove(lru.key);
        }
    }
    private void addToHead(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    private void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }
    private Node removeTail(){
        Node lru = tail.prev;
        removeNode(lru);
        return lru;
    }
    private void removeNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    public static void main(String[] args){
        //["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
        //[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
        LRUCache cache = new LRUCache(2);
        System.out.println("null");
        cache.put(1,1);
        System.out.println("null");
        cache.put(2,2);
        System.out.println("null");
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println("null");
        System.out.println(cache.get(2));
        cache.put(4,4);
        System.out.println("null");
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
