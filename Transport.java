package SpartaPack;

public class Transport {
    String number;
    int passenger;
    int maxPassenger;
    int money;
    int oil = 100;
    int speed = 0;
    String state = "운행중";
    boolean pull = true;
    int max = 0;

    public Transport(String number ) {
        this.number = number;
    }

    public void changspeed(){

    }

    public void takestate(String state) {
        this.state = state;
    }

    public void takePassenger(int passenger) {
        if(this.passenger + passenger > max){
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
    public void takeoil(int oil) {
        this.oil -= oil;
    }
    public void getoil(int oil) {
        this.oil += oil;
    }


}
