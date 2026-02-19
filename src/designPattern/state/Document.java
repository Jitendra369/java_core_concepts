package designPattern.state;

import designPattern.state.inter.DocumentState;

public class Document {

    private DocumentState state;

//    when document start , it is in Draft state
    public Document(){
        state = new DraftState();
    }


    public void setState(DocumentState state) {
        this.state = state;
    }

    public void publish(){
        state.publish(this);
    }
}
