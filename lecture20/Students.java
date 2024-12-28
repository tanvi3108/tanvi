package lecture20;

public class Students {
    String name;
    int rollNo;
    String classroom_code;
    float cgpa;

    //default constructor
    public Students(){
        this.name="Tanvi";
        this.rollNo=10;
        this.classroom_code="sept";
        this.cgpa=8;
    }
    //custom constructor
    public Students(String n,int r,String c,float cg){
        this.name=n;
        this.rollNo=r;
        this.classroom_code=c;
        this.cgpa=cg;
    }
}
