package chapter1_9.enum_;

public enum PizzaStatus {

    // 주문완료, 준비완료, 배달완료
    ORDERED("주문 완료", 10),
    READY("준비 완료", 30),
    DELIVERED("배달 완료", 40)
    ;

    // 필드 선언
    private final String description;
    private final int timeToSetup;

    // 생성자 선언
    PizzaStatus(String description, int timeToSetup) {
        this.description = description;
        this.timeToSetup = timeToSetup;
    }

    public String getDescription() {
        return description;
    }

    public int getTimeToSetup() {
        return timeToSetup;
    }
}
