package pairmatching.domain;

public enum ClassType {
    FRONT_END("프론트엔드", "frontend-crew.md"),
    BACK_END("백엔드", "backend-crew.md");

    private final String className;
    private final String fileName;

    ClassType(String className, String fileName) {
        this.className = className;
        this.fileName = fileName;
    }

    public String getClassName() {
        return className;
    }

    public String getFileName() {
        return fileName;
    }
}
