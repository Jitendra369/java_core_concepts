package designPattern.state;

import designPattern.state.inter.DocumentState;

public class ReviewState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("document is publish ");
        document.setState(new PublishState());
    }
}
