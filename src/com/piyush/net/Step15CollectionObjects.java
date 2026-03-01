package com.piyush.net;

import java.util.*;

public class Step15CollectionObjects {

    // ArrayList: Stores a list of names, allows duplicates, keeps order.
    // Production example: Use for ordered lists like displaying recent user activities.
    public void arrayListExample() {
        ArrayList<String> recentActivities = new ArrayList<>();
        recentActivities.add("Login");
        recentActivities.add("Upload");
        recentActivities.add("Login"); // duplicates allowed
        System.out.println(recentActivities); // [Login, Upload, Login]
    }

    // HashSet: Stores unique numbers, no duplicates, order not guaranteed.
    // Production example: Use for storing unique user roles or permissions.
    public void hashSetExample() {
        HashSet<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("ADMIN"); // duplicate ignored
        System.out.println(roles); // [ADMIN, USER]
    }

    // HashMap: Stores key-value pairs, fast lookup by key.
    // Production example: Use for caching user sessions or mapping user IDs to profiles.
    public void hashMapExample() {
        HashMap<Integer, String> userSessions = new HashMap<>();
        userSessions.put(101, "SessionA");
        userSessions.put(102, "SessionB");
        System.out.println(userSessions.get(101)); // SessionA
    }

    // LinkedList: Can be used as a queue (FIFO).
    // Production example: Use for processing tasks in order, like print jobs or message queues.
    public void linkedListExample() {
        LinkedList<String> printQueue = new LinkedList<>();
        printQueue.add("Document1");
        printQueue.add("Document2");
        System.out.println(printQueue.poll()); // Document1
    }

    // PriorityQueue: Retrieves elements by priority (smallest first by default).
    // Production example: Use for scheduling jobs by urgency, like handling support tickets.
    public void priorityQueueExample() {
        PriorityQueue<Integer> ticketPriorities = new PriorityQueue<>();
        ticketPriorities.add(3); // Low
        ticketPriorities.add(1); // High
        ticketPriorities.add(2); // Medium
        System.out.println(ticketPriorities.poll()); // 1 (High priority)
    }
}


/*
The Core Collection "Objects":
---------------------------------------------------------------------------------------------------------------
Collection Object	        Real-Time Use Case	                                Key Characteristic
---------------------------------------------------------------------------------------------------------------
Array                       Fix Size array                                      Fix size - else we get ArrayIndexOutofBounds Error
    e.g. String[] students = new String[30];
         students[0] = "Mark";

ArrayList	                Dynamic Array is created - uses HEAP(RAM memory)    Variable size allowed, Ordered and allows duplicates.
    e.g. ArrayList<String> students = new ArrayList<>();
         students.add("Mark");

        - list.add(1);              add new items to the list
        - list.addAll(newList);     add whole new list to the current list
        - list.get(1);              get item at 1st location in array
        - list.remove(1);           remove 1st item in the list                 || time complexity - big O(n)
        - list.remove(Integer.valueOf(30));  if you know & when you want to remove the actual value
        - list.clear();
        - list.set(2, 100);         set particular value at particular location || time complexity - big O(1)
        - list.contains(50);        true/false
        - iterate list using for loop

        for (i=0; i<=list.size(); i++){
                System.out.println("element is" + list.get(i));
            }

        for (Integer element: list){
                System.out.println("for each element is" + element);
            }

        Iterator -
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                System.out.println("iterator" + it.next());
            }



Stack: (books piled up one above other - LIFO) - StackOverFlowError
        e.g. main() method sits at the bottom of the stack and cannot be cleared until every single method it called is finished.

push(item)  – Add item to stack
pop()       – Remove and return top item
peek()      – Return top item without removing
isEmpty()   – Check if stack is empty
size()      – Number of items in stack

            public class StackDemo {
                public static void main(String[] args) {
                    Stack<Integer> stack = new Stack<>();

                    // push() - Add element to top
                    stack.push(10);
                    stack.push(20);
                    stack.push(30);

                    // pop() - Remove and return top element
                    int popped = stack.pop();

                    // peek() - View top element without removing
                    int top = stack.peek();

                    // isEmpty() - Check if stack is empty
                    boolean empty = stack.isEmpty();

                    // size() - Get number of elements
                    int size = stack.size();
                }
            }


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Interface/Class       	Description/Features                                            Key Implementations/Methods
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
List                  	Ordered, allows duplicates                                     	ArrayList, LinkedList, Stack, Vector; add(), get(), remove(), set(), contains()
Set                   	Unique elements, no duplicates                                	HashSet (unordered), LinkedHashSet (insertion order), TreeSet (sorted); override equals(), hashCode()
Queue                 	FIFO order; add at rear, remove from front                    	LinkedList, PriorityQueue, ArrayDeque; offer(), poll(), peek()
Map                   	Key-value pairs, unique keys                                   	HashMap (unordered), TreeMap (sorted keys); put(), putIfAbsent(), containsKey(), remove(), entrySet()
Iterator              	Traverse collections (hasNext(), next())                      	Available for all collections

ArrayList             	Dynamic array, resizes automatically                          	add(), addAll(), get(), remove(), set(), contains()
Stack                 	LIFO structure                                                	push(), pop(), peek()
LinkedList/Queue      	LinkedList implements List & Queue; Queue is FIFO              	offer(), poll(), peek(), add(), element(), remove()
PriorityQueue         	Heap-based, priority retrieval; default min-heap, max-heap    	offer(), poll(), peek()
ArrayDeque            	Double-ended queue; insert/remove at both ends                 	offerFirst(), offerLast(), peekFirst(), peekLast(), pollFirst(), pollLast()

HashSet               	Unordered, unique elements                                    	Constant time operations
LinkedHashSet         	Maintains insertion order                                     	Useful when order matters
TreeSet               	Sorted set, binary search tree, O(log n) operations           	Sorted order

HashMap               	Unordered key-value pairs                                     	Fast, constant time operations
TreeMap               	Sorted by keys                                                	O(log n) operations

Arrays                	Utility for primitive arrays                                  	sort(), binarySearch(), fill(), parallelSort()
Collections           	Utility for Collection framework objects                      	min(), max(), frequency(), sort()
Custom Sorting        	Sorting custom objects                                        	Implement Comparable or use Comparator
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
