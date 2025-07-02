package chapter1_5.member;

import static chapter1_5.member.Gender.*;

/**
 * MemberRepository 클래스는 Member 객체를 관리하는 저장소 역할을 합니다.
 * CRUD 작업을 수행할 수 있는 메서드를 제공하며 회원 추가,
 * 회원 목록 조회, 특정 조건으로 회원 검색 등의 기능을 수행합니다.
 *
 * @author Hong
 * @since 2025.06.27 ~
 * @version 1.0
 */
// 회원들의 CRUD를 담당하는 창고(데이터베이스) 역할
public class MemberRepository {

    // 회원들을 저장할 배열
    // String[] => ['','','']
    // Member[] => [{id: '', memberName: ''}, {}, {}]
    Member[] memberList; // 가입된 회원 배열

    MemberRepository(){
        memberList = new Member[]{
                new Member(15,"abc123@def.com", "1234", "콩자반", FEMALE)
                ,new Member(25,"fff@def.com", "5678", "미니", MALE)
                ,new Member(35,"xxx@def.com", "9876", "지훈이", MALE)
        };
    }

    // 메서드

    // 회원 배열을 리턴하는 메서드
    Member[] gerMembers(){
        return this.memberList;
    }

    /**
     * 현재 회원 목록에 저장된 회원 수를 반환합니다.
     *
     * @return 회원 목록의 총 회원 수
     */
    // 회원 배열을 리턴하는 메서드
    int size(){
        return memberList.length;
    }

    /**
     * 회원 리스트에 새 회원을 추가합니다.
     *
     * @param newMember 추가할 새로운 멤버의 정보를 담고 있는 Member 객체
     */
    void addMember(Member newMember){
        // 배열에 push를 적용
        // 1. 기존배열보다 1개 더 큰 새로운 배열 생성
        Member[] temp = new Member[memberList.length + 1];
        // 2. 기존배열의 데이터를 복사해서 신규배열에 저장
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        // 3. 신규데이터를 마지막 인덱스에 추가
        temp[temp.length - 1] = newMember;
        // 4. 신규배열을 실제 배열로 변경
        memberList = temp;
    }

    /**
     * 회원 목록에서 주어진 이메일 주소로 회원을 검색합니다.
     * 일치하는 이메일을 가진 회원이 발견되면 해당 회원이 반환됩니다.
     * 일치하는 회원이 없으면 null이 반환됩니다.
     *
     * @param targetEmail 검색할 회원의 이메일 주소
     * @return 해당 이메일을 가진 회원 객체,
     * 해당 이메일을 가진 회원이 없는 경우 null
     *
     * @author - Mr.kim
     * @since - 25.06.27
     */
    // 탐색 기능 (회원을 찾는 기능)
    Member findMemberByEmail(String targetEmail){
        int index = findIndexByEmail(targetEmail);
        return index != -1 ? memberList[index] : null; 
    }

    /**
     * 주어진 이메일 주소가 중복되었는지 확인합니다.
     * 이메일이 중복된 경우 true를 반환하고, 그렇지 않으면 false를 반환합니다.
     *
     * @param inputEmail 확인할 이메일 주소
     * @return 이메일이 중복된 경우 true, 중복되지 않은 경우 false
     */
    boolean isDuplicateEmail(String inputEmail){
        return findMemberByEmail(inputEmail) != null;
    }
    
    int findIndexByEmail(String email) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].email.equals(email)) {
                return i;
            }
        }
        return -1;
    }

    public void removeMember(String email) {
        // 삭제 대상의 인덱스를 알아와야 함
        int index = findIndexByEmail(email);
        for (int i = index; i < memberList.length -1 ; i++) {
            memberList[i] = memberList[ i + 1];
        }
        Member[] temp = new Member[memberList.length -1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
    }
}
