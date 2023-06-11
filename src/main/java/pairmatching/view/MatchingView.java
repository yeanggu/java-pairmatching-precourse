package pairmatching.view;

public class MatchingView {

    public MatchingView() {}

    // 프로그램 기능 선택 메시지
    public void selectFunctionMessage() {
        System.out.println("기능을 선택하세요.");
        System.out.println("1. 페어 매칭");
        System.out.println("2. 페어 조회");
        System.out.println("3. 페어 초기화");
        System.out.println("Q. 종료");
    }
}
