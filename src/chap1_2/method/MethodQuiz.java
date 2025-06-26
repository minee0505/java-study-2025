package chap1_2.method;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] yserNames = {"하츄핑", "뽀로로", "파이리"};


    public static void main(String[] args) {

        printFoods();

        push(foods, "라면");
        push(foods, "김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop(foods);
        printFoods();

        remove(foods,"치킨");
        remove(foods, 0);
        printFoods();

        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(foods,1, "파인애플");
        printFoods();

        modify(foods, 2, "닭갈비");
        modify(foods, 10, "닭");
        printFoods();
    }


     static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static String[] copy(int capacity) {
        String[] tempArr = new String[foods.length + capacity];

        // 루프 회전수는 사이즈를 늘릴 때는 원본만큼
        // 줄였을 때는 줄인 만큼 회전
        int loopCount = (capacity >= 0) ? foods.length : tempArr.length;
        for (int i = 0; i < loopCount; i++) {
            tempArr[i] = foods[i];
        }
        return tempArr;
    }

    static void push(String[] arr, String newData) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = newData;

        foods = arr;
    }

    static int indexOf(String foodID){
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(foodID)) {
                index = i;
            }
        }
        boolean isPresent = index != -1;
        return index;
    }

    static void pop(String[] arr) {
        String delTarget = foods[foods.length - 1];

        arr = Arrays.copyOf(arr, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = foods[i];
        }
        foods = arr;
        arr = null;
    }

    static void remove(String[] arr, int delDataId) {
        for (int i = delDataId; i < foods.length - 1 ; i++) {
            foods[i] = foods[i+1];
        }

        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
        temp = null;
    }

    static void remove(String[] arr, String delData) {

        int delId = indexOf(delData);
        for (int i = delId; i < foods.length - 1 ; i++) {
            foods[i] = foods[i+1];
        }
        String[] temp = new String[foods.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = foods[i];
        }
        foods = temp;
        temp = null;
    }

    static boolean include(String foodID){
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(foodID)) {
                index = i;
                break;
            }
        }
        boolean isPresent = index != -1;
        return isPresent;
    }

    static void insert(String[] arr, int insertID, String insertData) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        for (int i = foods.length; i > insertID; i--) {
            temp[i] = temp[i - 1];
        }
        temp[insertID] = insertData;
        foods = temp;
        temp = null;
    }

    static void modify(String[] arr, int modifyID, String modifyData){
        if (modifyID<0 || modifyID> arr.length) {
            System.out.println("없는 인덱스 번호입니다.");
            return;
        }
        arr[modifyID] = modifyData;
    }

}
