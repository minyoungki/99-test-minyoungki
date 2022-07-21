package SpartaPack;

public class Test {
    public static void main(String[] args) {
        Bus n1 = new Bus("001");
        Bus n2 = new Bus("002");

        Taxi n3 = new Taxi("01");
        Taxi n4 = new Taxi("02");

//        n1.showInBusnum();         //버스 번호
//        n2.showInBusnum();         //버스 번호
//
//        n1.takePassenger(2);      //승객 추가
//        n1.takeoil(50);          //기름 사용
//        n1.showInBus();
//
//        n1.takestate("차고지행");  //상태 변경
//        n1.showInBus();
//
//        n1.getoil(10);
//        n1.takestate("운행중");
//        n1.showInBus();
//
//        n1.takePassenger(45);
//        n1.showInBus();         // 최대 승개 수 초과
//
//        n1.takePassenger(5);
//        n1.showInBus();
//
//        n1.takeoil(55);         // 주유필요, 상태변경
//        n1.showInBus();


        n3.showInTaxinum();
        n4.showInTaxinum();         //택시번호

        n3.takePassenger(2);         //승객추가
        n3.takeDestination("서울역",2);     //도착지, 거리
        n3.showInTaxi();            //현재 택시 정보

        n3.takeoil(80);
        n3.showInPay();            // 요금 결제

        n3.takePassenger(5);         //승객 수 초과
        n3.showInTaxi();

        n3.takePassenger(3);         //승객추가
        n3.takeDestination("구로디지털단지역",12);     //도착지, 거리
        n3.showInTaxi();

        n3.takeoil(20);
        n3.showInPay();
    }
}
