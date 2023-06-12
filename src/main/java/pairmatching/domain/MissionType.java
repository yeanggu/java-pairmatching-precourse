package pairmatching.domain;

public enum MissionType {
    RACING_CAR("자동차 경주"),
    LOTTO("로또"),
    BASEBALL_NUMBER_GAME("숫자야구게임"),
    SHOPPING_BASKET("장바구니"),
    PAYMENT("결제"),
    SUBWAY_MAP("지하철노선도"),
    PERFORMANCE_IMPROVEMENT("성능개선"),
    DISTRIBUTION("배포");

    private String title;

    MissionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
