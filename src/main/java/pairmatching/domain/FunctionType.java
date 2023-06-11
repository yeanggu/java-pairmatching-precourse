package pairmatching.domain;

public enum FunctionType {
    PAIR_MATCHING("1", "페어 매칭"),
    PAIR_CHECK("2", "페어 조회"),
    PAIR_RESET("3", "페어 초기화"),
    PAIR_END("Q", "종료");

    private final String index;
    private final String functionName;

    FunctionType(String index, String functionName) {
        this.index = index;
        this.functionName = functionName;
    }

    public String getIndex() {
        return index;
    }

    public String getFunctionName() {
        return functionName;
    }
}
