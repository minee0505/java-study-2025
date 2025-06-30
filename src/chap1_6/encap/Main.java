package chap1_6.encap;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("모닝");
        // 시동 걸기 위해서 먼저 엔진오일 분사 ->
        // 시동버튼 누르고 -> 시동 걸기 -> 실린더 작동

        myCar.pressButton();

//        myCar.model = "페라리488 스파이더";

        // 기어 변속
        myCar.setMode("DDD");
        System.out.println("현재 모드: "+myCar.getMode());
        System.out.println("모델명: "+myCar.getModel());

    }
}
