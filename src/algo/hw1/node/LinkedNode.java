package algo.hw1.node;

import java.util.List;

public class LinkedNode {

    private Node node;
    private List<Connection> connections;

    public LinkedNode(Node node, List<Connection> connections) {
        this.node = node;
        this.connections = connections;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "node=" + node +
                ", connections=" + connections +
                '}';
    }
}
