import java.util.Arrays;

public class ArrayCopyEx {
  public static void main(String[] args) {
    System.out.println("----- 배열 복사하기 -----\n");

//    int a = 10;
//    int b = a;
//    int 타입의 배열 선언과 동시에 데이터 저장
    int[] arr1 = {10, 20, 30};
//    int 타입의 배열 선언하고 배열 arr1을 대입
    int[] arr2 = arr1;

    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    System.out.println();

    for (int i = 0; i < arr2.length; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    System.out.println("\n----- 배열 arr1에 데이터 수정 -----\n");
    arr1[0] = 100;
    arr1[1] = 200;
    arr1[2] = 300;

    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    System.out.println();

    for (int i = 0; i < arr2.length; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    System.out.println("\n----- 배열 arr2에 데이터 수정 -----\n");
    arr2[0] = 1000;
    arr2[1] = 2000;
    arr2[2] = 3000;

    for (int i = 0; i < arr1.length; i++) {
      System.out.println("arr1[" + i + "] : " + arr1[i]);
    }

    System.out.println();

    for (int i = 0; i < arr2.length; i++) {
      System.out.println("arr2[" + i + "] : " + arr2[i]);
    }

    System.out.println("\n ----- for문으로 값 직접 복사 -----\n");

//    원본 배열 데이터
    int[] arr3 = {10, 20, 30};
    int[] arr4 = new int[3]; // 복사받을 배열

    System.out.println("----- 배열 복사 전 배열 내용 -----");
    for (int i = 0; i < arr3.length; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }

    System.out.println();

    for (int i = 0; i < arr4.length; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }

    System.out.println("----- 배열 내용 복사 -----");
    for (int i = 0; i < arr3.length; i++) {
      arr4[i] = arr3[i];
    }

    System.out.println("----- 배열 내용 복사 후 결과 -----");
    for (int i = 0; i < arr3.length; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }

    System.out.println();

    for (int i = 0; i < arr4.length; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }

    arr3[0] = 100;
    arr3[1] = 200;
    arr3[2] = 300;

    System.out.println("----- 원본 배열 내용 수정 후 배열 내용 -----");
    for (int i = 0; i < arr3.length; i++) {
      System.out.println("arr3[" + i + "] : " + arr3[i]);
    }

    System.out.println();
//    원본 배열인 arr3의 데이터가 수정되어도 사본 배열인 arr4의 데이터는 그대로 유지
    for (int i = 0; i < arr4.length; i++) {
      System.out.println("arr4[" + i + "] : " + arr4[i]);
    }

    System.out.println("\n----- arraycopy() 를 사용하여 배열 복사 -----\n");

    int[] arr5 = {10, 20, 30};
    int[] arr6 = new int[3];

    System.out.println("----- 원본 배열 내용 -----");
    for (int i = 0; i < arr5.length; i++) {
      System.out.println("arr5[" + i + "] : " + arr5[i]);
    }

    System.out.println();

    for (int i = 0; i < arr6.length; i++) {
      System.out.println("arr6[" + i + "] : " + arr6[i]);
    }

    System.out.println("----- arraycopy()로 복사 -----");
//    System.arraycopy() : 자바의 System 클래스에서 제공하는 배열 복사 메소드
//    5개의 매개변수를 사용함
//    첫번째 매개변수로 원본 배열을 지정, 두번째 매개변수로 원본 배열에서 복사 시작 index, 세번째 매개변수로 사본 배열을 지정, 네번째 매개변수로 복사를 받을 index를 지정, 다섯번째 매개변수로 복사할 크기를 지정
    System.arraycopy(arr5, 0, arr6, 0, arr5.length);

    System.out.println("----- 복사 후 배열 내용 -----");
    for (int i = 0; i < arr5.length; i++) {
      System.out.println("arr5[" + i + "] : " + arr5[i]);
    }

    System.out.println();

    for (int i = 0; i < arr6.length; i++) {
      System.out.println("arr6[" + i + "] : " + arr6[i]);
    }

    System.out.println("----- 원본 배열 수정 후 배열 내용 -----");
    arr5[0] = 100;
    arr5[1] = 200;
    arr5[2] = 300;

    for (int i = 0; i < arr5.length; i++) {
      System.out.println("arr5[" + i + "] : " + arr5[i]);
    }

    System.out.println();

    for (int i = 0; i < arr6.length; i++) {
      System.out.println("arr6[" + i + "] : " + arr6[i]);
    }

    System.out.println("----- Arrays 클래스를 사용하여 복사 -----\n");
//    copyOf() : 원본의 내용을 지정한 개수만큼 복사, 복사 시작 index는 0으로 지정됨
//    사용법 : int[] 배열명 = Arrays.copyOf(원본배열, 복사할 크기);

//    copyOfRange() : 원본의 내용을 지정한 위치에서 지정한 위치만큼 복사, 복사 시작 index와 복사 완료 index를 지정할 수 있음
//    사용법 : int[] 배열명 = Arrays.copyOfRange(원본배열, 복사 시작 index, 복사 완료 index);

    int[] arr7 = {10, 20, 30};
    int[] arr8 = new int[3];

    System.out.println("----- 원본 배열 내용 -----");
    for (int i = 0; i < arr7.length; i++) {
      System.out.println("arr7[" + i + "] : " + arr7[i]);
    }

    System.out.println();

    for (int i = 0; i < arr8.length; i++) {
      System.out.println("arr8[" + i + "] : " + arr8[i]);
    }
    
    System.out.println("----- copyOf()로 복사 -----");
    arr8 = Arrays.copyOf(arr7, arr7.length);

    System.out.println("----- 복사 후 배열 내용 -----");
    for (int i = 0; i < arr7.length; i++) {
      System.out.println("arr7[" + i + "] : " + arr7[i]);
    }

    System.out.println();

    for (int i = 0; i < arr8.length; i++) {
      System.out.println("arr8[" + i + "] : " + arr8[i]);
    }

    arr7[0] = 100;
    arr7[1] = 200;
    arr7[2] = 300;

    System.out.println("----- 수정 후 배열 내용 -----");
    for (int i = 0; i < arr7.length; i++) {
      System.out.println("arr7[" + i + "] : " + arr7[i]);
    }

    System.out.println();

    for (int i = 0; i < arr8.length; i++) {
      System.out.println("arr8[" + i + "] : " + arr8[i]);
    }

  }
}












