package org.example;

public class StrategySwapper {

    ConnectionStrategy connectionStrategy;

    public void setConnectionStrategy(ConnectionStrategy connectionStrategy) {
        this.connectionStrategy = connectionStrategy;
    }

    public void connect(String user) {
        connectionStrategy.connectTo(user);
    }
}
