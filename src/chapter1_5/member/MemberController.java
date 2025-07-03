package chapter1_5.member;

import java.util.Scanner;

import static chapter1_9.static_.util.InputUtils.promptNumber;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberController {

    // 객체의 협력과 위임
    // 필드: 클래스의 속성 - 부품 속성
    MemberRepository mr;// 의존 관계
    Scanner sc;

    MemberController() {
        mr = new MemberRepository();
        sc = new Scanner(System.in);
    }

    // 프로그램 초기 화면 출력
    void start() {
        while (true) {
            processMenu(showMenu());
        }// end while
    }

     void processMenu(String menuNum) {
        switch (menuNum) {
            case "1":
                signUp();
                break;
            case "2":
                showAllMembers();
                break;
            case "3":
                showDetailMember();
                break;
            case "4":
                changePassword();
                break;
            case "5":
                deleteMember();
                break;
            case "6":
                // hint
                // 1. 배열을 2개 관리함.
                // 2. 논리적 삭제를 구현 (실제로 배열에 지우는게 아니라 지우는 척함)

                restoreMember();
                break;
            case "7":
                System.out.println("\n# 프로그램을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("# 메뉴를 다시 입력해주세요!");
        } // end switch

        prompt("=========계속하시려면 Enter ... ===========");
    }

    void restoreMember() {
        System.out.println("\n# 삭제된 회원 정보를 복구합니다.");
    }

    void deleteMember() {
        // 이메일을 입력받고 있으면 패스워드도 입력받아서 삭제
        System.out.println("\n# 회원 정보를 삭제합니다.");
        Member foundMember = findMember("삭제");

        if (foundMember != null) {
            // 삭제 전에 패스워드를 확인
            String inputPassword = prompt("# 비밀번호: ");
            if (foundMember.isPasswordMatch(inputPassword)) {
                // 실제 삭제 진행
                mr.removeMember(foundMember.email);
                System.out.println("\n# 회원 탈퇴가 완료되었습니다.");
            } else {
                System.out.println("\n# 비밀번호가 틀렸습니다. 삭제를 취소합니다.");
            }
        } else {
            System.out.println("\n# 조회 결과가 없습니다!");
        }

    }

    void changePassword() {
        System.out.println("\n# 회원 정보를 수정합니다.");
        Member foundMember = findMember("수정");
        if (foundMember != null) {
            // 비밀 번호 수정 진행
            String newPassword = prompt("# 새 비밀번호: ");

            // 실질적인 데이터 수정 처리
            foundMember.changeNewPassword(newPassword);

            System.out.println("\n# 변경이 완료되었습니다.");
            System.out.println("foundMember = " + foundMember);
        } else {
            System.out.println("\n# 조회 결과가 없습니다.");
        }


    }

    Member findMember(String message) {
        String email = prompt("# %s 대상의 이메일: ".formatted(message));
        return mr.findMemberByEmail(email);
    }

    void showDetailMember() {
        System.out.println("\n# 개별 회원 정보를 조회합니다.");
        Member foundMember = findMember("조회");
        if (foundMember != null) {
            // 개별정보 출력
            foundMember.inform();
        } else {
            System.out.println("\n# 조회 결과가 없습니다.");
        }
    }

    void signUp() {
        System.out.println("\n# 회원 정보 등록을 시작합니다.");
        String email = checkDuplicateEmail();
        String password = prompt("# 패스워드: ");
        String memberName = prompt("# 이름: ");
        Gender gender = inputCorrectGender();
        int age = promptNumber("# 나이: ");

        // 회원 배열에 추가
        mr.addMember(new Member(
                age,
                email,
                password,
                memberName,
                gender
        ));

        System.out.println("\n# 회원가입에 성공했습니다.");

    }

    /**
     * Validates user input for email and ensures it is not already registered.
     * If the input email is found to be duplicate, the user is prompted to
     * enter a new email. This loop continues until a unique email is provided.
     *
     * @return A unique, non-duplicate email input from the user.
     */
    String checkDuplicateEmail() {

        while (true) {
            String email = prompt("# 이메일: ");
            if (!mr.isDuplicateEmail(email)) {
                // 중복이 아닌 경우
                return email;
            }
            System.out.println("# 이메일이 중복되었습니다.");
        }
    }

    Gender inputCorrectGender() {
        while (true) {
            String genderStr = prompt("# 성별 [M/F] : ");

            switch (genderStr.toUpperCase().charAt(0)) {
                case 'M':
                    return Gender.MALE;
                case 'F':
                    return Gender.FEMALE;
                default:
                    System.out.println("# 성별을 M 또는 F로 입력해주세요!");
            }
        }
    }

    /**
     * Displays all registered members by iterating through an array of Member objects.
     * Each member's information is printed to the standard output.
     * This method does not take any input parameters and does not return any value.
     */
    void showAllMembers() {
        System.out.println("\n# 전체 회원 정보를 조회합니다.");
        Member[] members = mr.gerMembers();
        for (Member member : members) {
            member.inform();
        }
    }

    /**
     * 화면에 회원 관리 시스템 메뉴를 출력하고 사용자의 메뉴 선택을 입력 받는 메서드입니다.
     *
     * @return 사용자가 선택한 메뉴 번호를 문자열로 반환
     */
    String showMenu() {
        System.out.printf("\n#####  회원 관리 시스템 (현재 회원 수: %d명)  #####\n", mr.size());
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 전체 회원 조회하기");
        System.out.println("* 3. 개별 회원 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 회원 정보 복구하기");
        System.out.println("* 7. 프로그램 종료하기");
        System.out.println("================================");

        return prompt(">> ");
    }

    /**
     * 사용자로부터 입력 메시지를 출력하며 데이터를 입력 받는 메서드입니다.
     *
     * @param message 입력을 요청하며 출력할 메시지
     * @return 사용자가 입력한 문자열
     */
    String prompt(String message) {
        System.out.println(message);

        while (true) {

            try {
                String str1 = sc.nextLine(); // 정수를 문자열로 입력
                int n2 = Integer.parseInt(str1); // 문자열을 정수로 변환
                return sc.nextLine();
            } catch (NumberFormatException e) {
//                System.out.println(e.getMessage());
//                e.printStackTrace(); // 예외처리 안했을 때 뜨던 빨간메시지를 보여줌
                System.out.println("정수로만 입력하세요!");
            } catch (Exception e) { // 마지막에는 그냥 Exception e 상위니까 위로 순서 올라가면 자식이 무시당함 (보통 RuntimeException 사용)
                System.out.println("알 수 없는 에러 발생! 조치 후 점검 하겠습니다!");
            }
        }
    }
}
