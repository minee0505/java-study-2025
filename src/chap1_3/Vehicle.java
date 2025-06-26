package chap1_3;

// 자동차 설계도
public class Vehicle {

    // 속성 (필드)
    // 일반 속성 - 일반적으로 잘 안바뀜
    // 제조사
    String company;

    // 모델명
    String model;

    // 상태 속성 - 수시로 변하는 속성
    // 현재 속도
    int currentSpeed;
    // 연료 잔량
    int fuel;

    // 복합 속성 (부품 속성) alt + enter
    Owner owner; // 자동차 주인
    /*
        {
            company: "현대",
            model: "포터",
            currentSpeed: 0,
            isOn: false,
            owner: {
                name: '홍길동',
                registerDate: '2024-11-30'
            }
        }
     */

    // 시동 걸린 여부
    boolean isOn;

    // 생성자 (객체의 초기화)
    // 기본생성자 - 파라미터 없는 생성자
    // JVM이 컴파일 시에 자동으로 생성해줌,
    // 단, 다른 생성자가 1개라도 있으면 안만들어줌
    // 사용하려면 수동으로 만들어줘야 함
//    Vehicle() {}


    public Vehicle(String company, String model, int currentSpeed, int fuel, Owner owner, boolean isOn) {
        this.company = company;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.fuel = fuel;
        this.owner = owner;
        this.isOn = isOn;
    }

    // String 2개를 받아서 초기화하는 생성자
    Vehicle(String c, String m) {
        company = c;
        model = m;
    }


    // 기능 (메서드)
    void info(){
        System.out.println("자동차 주인 = " + owner.name);
        System.out.println("자동차 모델명 = " + model);
        System.out.println("자동차 등록일 = " + owner.registerDate);
    }

    // 시동을 켜는 기능
    void powerOn() {
        if (isOn) {
            System.out.println("시동이 이미 걸려있습니다.");
            return;
        }
        isOn = true;
        System.out.println(model + "의 시동이 걸렸습니다.");
    }

    // 시동을 끄는 기능
    void powerOff() {
        if (!isOn) {
            System.out.println("시동이 걸려있지 않습니다.");
            return;
        }
        isOn = false;
        System.out.println("시동이 꺼졌습니다.");
    }
    // 주행기능
    void accelerate() {
        System.out.printf("%s 자동차가 주행을 시작합니다.\n", model);
        currentSpeed += 20;
        System.out.printf("현재 속도: %dkm/h\n", currentSpeed);
    }

}
