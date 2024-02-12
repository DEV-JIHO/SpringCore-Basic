package hello.core.singleton;

public class StatefulService {
    //private int price; // 상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + "price = " + price);
        //this.price = price; //여기가 문제 이렇게 설계 하면 안된다 , 값을 공유하게된다
        return price;
    }
//    public int getPrice() {
//        return price;
//    }


}
