package designPattern.state;

import designPattern.state.inter.DocumentState;

public class PublishState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("document is already published ");
    }
}
