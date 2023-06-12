package pairmatching.view;

import pairmatching.domain.ClassType;
import pairmatching.domain.FunctionType;
import pairmatching.domain.LevelType;
import pairmatching.message.MatchingMessage;

import java.util.ArrayList;

public class MatchingView {

    public MatchingView() {}

    // 프로그램 기능 선택 메시지
    public void selectFunctionMessage() {
        System.out.println(MatchingMessage.SELECT_FUNCTION_MESSAGE);
        for (FunctionType type : FunctionType.values()) {
            System.out.println(type.getIndex() + ". " + type.getFunctionName());
        }
    }

    // 과정 & 미션 정보 보여주기
    public void classAndMissionInformation() {
        System.out.println(MatchingMessage.SHARP_MESSAGE);
        classInformation();
        missionInformation();
        System.out.println(MatchingMessage.SHARP_MESSAGE);
    }

    // 과정 정보 보여주기
    public void classInformation() {
        System.out.print(MatchingMessage.CLASS_MESSAGE);
        ArrayList<String> classList = new ArrayList<>();
        for (ClassType type : ClassType.values()) {
            classList.add(type.getClassName());
        }
        System.out.println(String.join(" | ", classList));
    }

    // 미션 정보 보여주기
    public void missionInformation() {
        System.out.println(MatchingMessage.MISSION_MESSAGE);
        for (LevelType type : LevelType.values()) {
            String missionList = String.join(" | ", type.getMissionList());
            System.out.println("  - " + type.getLevelName() + ": " + missionList);
        }
    }
}
