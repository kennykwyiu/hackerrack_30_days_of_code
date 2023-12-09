package kenny.thirtydays;

import java.util.Scanner;

public class Day15LinkedList {
    public static Node insert(Node head, int data) {
        //Complete this method
        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.next = head;
        Node curNode = dummy;

        while (curNode.next != null) {
            curNode = curNode.next;
        }
        Node newNode = new Node(data);
        newNode.next = null;
        curNode.next = newNode;

        return dummy.next;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}