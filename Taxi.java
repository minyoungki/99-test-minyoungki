package SpartaPack;

public class Taxi extends Transport{

    int maxPassenger;
    int max = 4;
    boolean pull = true;
    String destination = "";
    int km = 1;
    int plusMoney = 0;
    int pay = 0;

    public Taxi(String number) {
        super(number);
        this.maxPassenger = 4;
    }
    public void takeDestination(String destination, int km){
        this.km = km;
        this.destination = destination;
    }
    public void takePassenger(int passenger) {
        if(this.passenger + passenger > this.max){
            this.maxPassenger = 4;
            this.passenger = 0;
            pull = false;
        }
        else {
            pull = true;
            this.money =3000;
            this.passenger += passenger;
            this.maxPassenger -= passenger;
        }
    }
    public int getPlusMoney() {
        plusMoney = this.money + this.km*1000 -1000;
        return plusMoney;
    }

    public int getPay() {
        pay +=plusMoney;
        plusMoney = 0;
        this.maxPassenger = 4;
        this.passenger = 0;
        return pay;
    }

    public void showInTaxi() {
        if(pull == false){
            System.out.println("최대 승객 수 초과");
        }else if(oil <= 10) {
            System.out.println("주유량 ="+this.oil);
            System.out.println("운행 불가");
            System.out.println("주유 필요");
        }
        else {
            System.out.println("요금 ="+this.money);
            System.out.println("잔여 승객 수 ="+this.maxPassenger);
            System.out.println("탑승 승객 수 ="+this.passenger);
            System.out.println("주유량 ="+this.oil);
            System.out.println(destination);
            System.out.println(km + "km");
            System.out.println("지불할 요금 ="+ getPlusMoney());
            System.out.println(state);
        }
    }

    public void showInTaxinum(){
        System.out.println("버스 넘버"+this.number);
    }
    public void showInPay(){

        if(oil <= 10) {
            System.out.println("주유 필요");
            System.out.println("주유량 =" + this.oil);
            System.out.println("누적 요금 =" + getPay());
            System.out.println("운행불가");
        }else {
            System.out.println("주유량 =" + this.oil);
            System.out.println("누적 요금 =" + getPay());
        }
    }


}
