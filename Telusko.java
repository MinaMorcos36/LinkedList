
package com.mycompany.singlelinkedlist;

public class Telusko {
    public static class Node
    {
        int data;
        Node next;
    }
    public static class LinkedList
    {
        Node head; // first node
        
        
        public void insertEnd(int data)
        {
            Node node = new Node();
            node.data = data;
            node.next = null;
            
            if (head == null)
            {
                head = node;
            }
            else
            {
               Node n = head;
               while(n.next != null)
               {
                   n = n.next;
               }
               n.next = node;
            }
            
        }
        
        
        public void insertStart(int data)
        {
            Node node = new Node();
            node.data = data;
            node.next = head;
            head = node;
        }
        
        public void insertAt(int index, int data)
        {
            Node node = new Node();
            node.data = data;
            node.next = null;
            
            if(index == 0)
            {
                insertStart(data);
            }
            else
            {
            Node n = head;
            for(int i = 0; i < index - 1; i++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            }
        }
        
        public void delete(int index)
        {
            if(index == 0)
            {
                head = head.next;
            }
            else
            {
               Node n = head;
               Node n1 = null;
               for(int i = 0; i < index - 1; i++)
               {
                n = n.next;
               n1 = n.next;
               n.next = n1.next; 
               }
            }
        }
        
        public boolean search(int searchkey)
        {
            if(head == null)
            {
                return false;
            }
            Node node = head;
            while(node != null)
            {
                if(node.data == searchkey)
                {
                    return true;
                }
                node = node.next;
            }
            return false;
        }
        
        public void show()
        {
            Node node = head;
            
            while(node.next != null)
            {
                System.out.println(node.data); 
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertEnd(18);
        list.insertEnd(45);
        list.insertEnd(12);
        list.insertStart(25);
        
        list.insertAt(0, 55);
        
        list.delete(2);
        
        
        
        list.show();
        
        
        
        if(list.search(2) == true)
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found!");
        }
    }
}