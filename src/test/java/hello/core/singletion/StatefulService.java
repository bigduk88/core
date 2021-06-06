package hello.core.singletion;

public class StatefulService {

//    private int price; //상태를 유지하는
    // 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + " price " + price);
//        this.price = prince; // durlrk answp!
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
