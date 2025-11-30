package LinkedList;

import java.util.HashMap;
import java.util.Map;

class Lnode
{
    int key;
    int value;
    Lnode prev;
    Lnode next;
    Lnode(int key,int value)
    {
        this.key=key;
        this.value=value;
        prev=null;
        next=null;
    }
}
public class LRUCache {
	Map<Integer,Lnode> map;
	Lnode head;
	Lnode tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head= new Lnode(0,0);
        tail= new Lnode(0,0);
        head.next=tail;
        tail.prev=head;
        map= new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
        	Lnode valNode= map.get(key);
            deleteNode(valNode);
            insertAfterHead(valNode);
            return valNode.value;
        }
            return -1;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
        	  Lnode valNode= map.get(key);
            valNode.value=value;
            insertAfterHead(valNode);
        }
        else
        {
            if(map.size()==capacity)
            {
            	Lnode valNode= tail.prev;
                map.remove(valNode.key);
                deleteNode(valNode);
            }
            Lnode newNode= new Lnode(key,value);
            map.put(key, newNode);
            insertAfterHead(newNode);
        }
        
    }

    public void deleteNode(Lnode node)
    {
    	Lnode prevNode= node.prev;
    	Lnode nextNode= node.next;
         prevNode.next=nextNode;
         nextNode.prev=prevNode;

    }
    public void insertAfterHead(Lnode node)
    {
    	Lnode dummy= head.next;
         head.next=node;
         node.next=dummy;
         node.prev=head;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache lru= new LRUCache(5);
		System.out.println(lru.get(2));
		lru.put(1,10);
		System.out.println(lru.get(1));
		lru.put(2,20);
		lru.put(3,30);
		System.out.println(lru.get(2));
		System.out.println(lru.get(1));
	}

}
