package chapter1_5.message;

public class Main {
    public static void main(String[] args) {
        MessageRelay messageRelay = new MessageRelay();
        User user = new User("김철수");
        Admin admin = new Admin("슈퍼맨");
        System.out.println("--- 유저가 메시지를 보냅니다 ---");
        // 2. MessageRelay를 통해 유저의 메시지를 전달합니다.
        // messageRelay는 user 객체가 User 타입인지 전혀 모르고,
        // 오직 Messenger 타입이라는 것만 압니다.
        messageRelay.relay(user, "안녕하세요! 다형성 실습 재밌네요.");

        System.out.println("\n--- 관리자가 메시지를 보냅니다 ---");
        // 3. MessageRelay를 통해 관리자의 메시지를 전달합니다.
        // 똑같은 relay 메서드지만, 이번엔 Admin 객체가 가진 sendMessage가 호출됩니다.
        messageRelay.relay(admin, "긴급 서버 점검이 10분 뒤에 시작됩니다.");
    }

}
