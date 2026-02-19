package designPattern.state;

import designPattern.state.inter.DocumentState;

public class DraftState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("document send for review ");
        document.setState(new ReviewState());
    }
}
