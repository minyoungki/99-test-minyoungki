package SpartaPack;

public class Bus extends Transport{

    int maxPassenger;
    int max = 30;
    boolean pull = true;

    public Bus(String number) {
        super(number);
        this.maxPassenger = 30;
    }
    public void takePassenger(int passenger) {
        if(this.passenger + passenger > this.max){
            this.maxPassenger = 30;
            this.passenger = 0;
            pull = false;
        }
        else {
            pull = true;
            this.money += (1000*passenger);
            this.passenger += passenger;
            this.maxPassenger -= passenger;
        }
    }

    public void showInBus() {
        if(pull == false){
            System.out.println("최대 승객 수 초과");
        }else if(oil <= 10) {
            System.out.println("주유량"+this.oil);
            System.out.println("차고지행");
            System.out.println("주유 필요");
        }
        else {
            System.out.println("요금"+this.money);
            System.out.println("잔여 승객 수"+this.maxPassenger);
            System.out.println("탑승 승객 수"+this.passenger);
            System.out.println("주유량"+this.oil);
            System.out.println(state);
        }

    }
    public void showInBusnum(){
        System.out.println("버스 넘버"+this.number);
    }
}
