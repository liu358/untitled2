package JAVA.Practice;

public class Vehicle1 {
    double speed;
    int power;
    void speedUp(int s) {
        if(this.speed+s>200)
            System.out.println("加速后不能速度超过200");
        else
            this.speed=this.speed+s;
        speed = speed + s;

    }
    void speedDown(int d) {

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

