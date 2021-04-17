package JAVA.Practice;

public class Vehicle2 {
    double speed;
    int power;
    void speedUp(int s) {

        speed = speed + s;

    }
    void speedDown(int d) {
        if(this.speed-d>0)
            System.out.println("减速后速度不能低于0");
        else
            this.speed=this.speed-d;
        speed = speed - d;
    }
    void setPower(int p) {
        power = p;
    }
    int getPower(){
        return power;

    }
    double getSpeed(){
        return speed;
    }
}

