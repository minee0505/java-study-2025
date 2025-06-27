package chapter1_5.member;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

//        Member m1 = new Member(30, "abc1234@gmail.com", "1234", "말포이", Gender.MALE);
//        System.out.println(m1);

        // 클래스 안에 있는 데이터는 반드시 객체생성을 통해 접근함.
        MemberRepository mr = new MemberRepository();

        // 멤버 추가 테스트
        mr.addMember(new Member(80, "oldman@gmailcom", "9988", "kim", Gender.MALE));
        System.out.println(Arrays.toString(mr.gerMembers()));
        System.out.println(mr.size());

        System.out.println("=====================");

        Member foundMember = mr.findMemberByEmail("abc123@def.com");
        System.out.println("foundMember = " + foundMember);

        System.out.println("================");
        boolean flag = mr.isDuplicateEmail("oldman@gmailcom");
        System.out.println("flag = " + flag);


    }
}
