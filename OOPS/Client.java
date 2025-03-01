package OOPS;
//example AC-----------
class AC {
    //state 
    int temp=10;
    boolean fanMode;
    int fanSpeed;

    //behaviour
    public void increaseTemp(){
        temp++;
    }
    public void decreaseTemp(){
        temp--;
    }
}
public class Client {
    public static void main(String[] args) {
        //class_name  object_name = new class_name();
        AC Voltas = new AC();
        System.out.println(Voltas.temp);
        //period use hota h state or behaviour access krne ke liye, like, voltas ka temp
        System.out.println(Voltas.fanSpeed);
        Voltas.increaseTemp();
        System.out.println(Voltas.temp);

        AC Haier=new AC();
        System.out.println(Haier.temp);

    }
}
