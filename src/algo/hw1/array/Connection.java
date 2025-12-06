package algo.hw1.array;

class Connection {

    private int throughput;
    private int packageLossPercent;

    public Connection(int throughput, int packageLossPercent) {
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

    @Override
    public String toString() {
        return "Connection{" +
                "throughput=" + throughput +
                ", packageLossPercent=" + packageLossPercent +
                '}';
    }
}
