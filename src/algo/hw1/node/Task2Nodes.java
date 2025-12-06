package algo.hw1.node;

import java.util.List;

public class Task2Nodes {

    public static void main(String[] args) {

        Node node1 = new Node( "A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");
        Node node5 = new Node("E");
        Node node6 = new Node("F");

        Connection node1connection2 = new Connection(node2,1500,90); // a - b
        Connection node2connection2 = new Connection(node1,1500,90);// b - a

        Connection node1connection3 = new Connection(node3,2000,10); // a - c
        Connection node3connection1 = new Connection(node1,2000,10); // c - a

        Connection node1connection4 = new Connection(node4,1000,50); // a - d
        Connection node4connection1 = new Connection(node1,1000,50); // d - a

        Connection node2connection1 = new Connection(node6,1500,60); // b - f
        Connection node6connection2 = new Connection(node2,1500,60); // f - b

        Connection node3connection6 = new Connection(node6,500,20); // c - F
        Connection node6connection3 = new Connection(node3, 500,20); // f - c

        Connection node3connection5 = new Connection(node5,900,5); // c - e
        Connection node5connection3 = new Connection(node3,900,5); // e - c

        Connection node5connection6 = new Connection(node6,300,85); // e - f
        Connection node6connection5 = new Connection(node5,300,85); // f - e

        Connection node5connection4 = new Connection(node4,2500,1); // e - d
        Connection node4connection5 = new Connection(node5,2500,1); // d - e

        LinkedNode linkedNodeA = new LinkedNode(node1, List.of(node1connection2,node1connection3, node1connection4));
        LinkedNode linkedNodeB = new LinkedNode(node2, List.of(node2connection2, node2connection1));
        LinkedNode linkedNodeC = new LinkedNode(node3, List.of(node3connection5, node3connection1, node3connection6));
        LinkedNode linkedNodeD = new LinkedNode(node4, List.of(node4connection5, node4connection1));
        LinkedNode linkedNodeE = new LinkedNode(node5, List.of(node5connection3, node5connection6, node5connection4));
        LinkedNode linkedNodeF = new LinkedNode(node6, List.of(node6connection2, node6connection3, node6connection5));

        System.out.println(linkedNodeA);
    }
}
