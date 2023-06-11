package pairmatching.view;

import pairmatching.domain.FunctionType;
import pairmatching.message.MatchingMessage;

public class MatchingView {

    public MatchingView() {}

    // 프로그램 기능 선택 메시지
    public void selectFunctionMessage() {
        System.out.println(MatchingMessage.SELECT_FUNCTION_MESSAGE);
        for (FunctionType type : FunctionType.values()) {
            System.out.println(type.getIndex() + ". " + type.getFunctionName());
        }
    }
}
