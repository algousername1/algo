package algo.hw1.node;

public class Connection {

    private Node nodeTo;
    private int throughput;
    private int packageLossPercent;

    public Connection(Node nodeTo, int throughput, int packageLossPercent) {
        this.nodeTo = nodeTo;
        this.throughput = throughput;
        this.packageLossPercent = packageLossPercent;
    }

    public int getThroughput() {
        return throughput;
    }

    public void setThroughput(int throughput) {
        this.throughput = throughput;
    }

    public int getPackageLossPercent() {
        return packageLossPercent;
    }

    public void setPackageLossPercent(int packageLossPercent) {
        this.packageLossPercent = packageLossPercent;
    }

    public Node getNodeTo() {
        return nodeTo;
    }

    public void setNodeTo(Node nodeTo) {
        this.nodeTo = nodeTo;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "nodeTo=" + nodeTo +
                ", throughput=" + throughput +
                ", packageLossPercent=" + packageLossPercent +
                '}';
    }
}
