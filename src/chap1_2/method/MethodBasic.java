package chap1_2.method;


import java.util.Arrays;

public class MethodBasic {

    // 자바는 함수라는 개념이 없음
    // 메서드: 객체가 가진 기능 ~~.~~();
    // 메서드는 정의할 수 있는 위치는 클래스 내부, 메서드 외부
    public static void main(String... args) {
        int result1 = add(20, 30);
        System.out.println("result1 = " + result1);

        int result2 = addAll(new int[]{1,2,3,4}); // 이 부분 gpt 질문
        // int[]{1, 2, 3}같은 배열 리터럴은 선언과 동시에 초기화할 때만 사용 가능
        // 파라미터로 쓸 때는 new int[]{...}처럼 명시적으로 생성
        // int[]{...}만 쓰면 자바 문법상 에러
        System.out.println("result2 = " + result2);

        int result3 = addAll(10, 30, 50, 70);

        System.out.println("result3 = " + result3);

        int[] ints = multiReturn(10, 20);
        System.out.println(Arrays.toString(ints));
    }

    // 함수 만들 때 초보 방법 단계
    // 1. 앞에 일단 void add(n1, n2) {return n1 + n2;}
    // 2. 자바는 파라미터의 타입을 명시해줘야 함 void add(int n1,int n2) {return n1 + n2;}
    // 3. 리턴값의 타입을 void 에다가 집어넣음 int add(int n1, int n2) {return n1 + n2;}

    static int add(int n1, int n2) {
        return n1 + n2;
    }
    int add2(byte n1, byte n2) {
        return n1 + n2;
    }
    int[][] foo() {
        return new int[3][4];
    }
    void bar() {
        System.out.println("hello!!");
    } // 리턴 없으면 void

    // n개의 정수를 전달받아서 싹 더해서 리턴
    // 대괄호 없애고 타입형 뒤에 ... 붙이면 얘가 알아서 배열로 묶어줌
    static int addAll(int... numbers){
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 배열 2개를 전달받을 때 ...하면 어디까지가 nums1 배열인지 모름, 이럴때는 호출하는 쪽에서 확실하게 끊어줘야 함

    static void ticky(int[] nums1, int[] nums2) {
        ticky(new int[]{1,2,3}, new int[]{4,5,6});
    }

    // 여러개를 리턴하고 싶을 때
    static int[] multiReturn(int n1, int n2) {
        return new int[] {n1 + n2, n1 - n2};
    }

}


