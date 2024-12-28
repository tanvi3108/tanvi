package lecture20;

public class Instructor {
    String name;
    int code;
    String subject;
    //default constructor
    public Instructor(){
        this.name="John";

    }
    //public constructor
    public Instructor(String n,String s,int c){
        this.name=n;
        this.code=c;
        this.subject=s;
    }
}
