package chap1_2;

public class DataType {

    public static void main(String[] args) {

        // 정적 타이핑 언어
        int age = 20;

        double pi = 3.14;

        char c = 'A';

        String greeting = "안뇽~";

        boolean flag = true;

        // 정수 타입 (byte; 1, short: 2, int: 3, long: 4)
        // 1byte == 8bit -> 10진수 정수 8 => 0 0001000
        // -128 ~ 127
        // 2byte == 16bit -> 10진수 정수 1000 => 0 11111001000
        // -32768 ~ 32767
        byte x1 = 127;
        short x2 = -32768;
        int x3 = 2147483647;
        long x4 = 2147483648L;

        // === 실수 타입 === //
        float f1 = 3.123123123F; // 4byte -7자리
        double f2 = 3.123123123; // 8byte -15자리

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // === 논리 타입 === //
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;

        // === 문자 타입 === //
        char c1 = 'A';  // 2byte - 0 ~ 65535
        char c2 = 44032;
        System.out.println("c2 = " + c2);

        char [] cArr = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(cArr);
        System.out.println("str = " + str);

        // === 문자열 타입 === //
        String str2 = "안녕하세요";

        // 자바 17부터 지원
        String str3 = """
                안녕 
                메롱
                잘가
                ㅋㅋㅋ
                """;
        System.out.println("str3 = " + str3);

        // 동적 타이핑 지원 (java 9)
        var z = 100;
        var v = "qqqq";

    }

}
