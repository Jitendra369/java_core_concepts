package designPattern.state.inter;

import designPattern.state.Document;

public interface DocumentState {
    void publish(Document document);
}
