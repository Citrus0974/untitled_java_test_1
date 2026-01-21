package edu.khityaev.life;

public enum ETemperature {
    COLD( -50, 10),
    NORMAL( 10, 25),
    HOT( 25, 60);
    private final int minDegree;
    private final int maxDegree;

    ETemperature(int minDegree, int maxDegree) {
        this.minDegree = minDegree;
        this.maxDegree = maxDegree;
    }

    public int getMaxDegree() {
        return maxDegree;
    }

    public int getMinDegree() {
        return minDegree;
    }

}
