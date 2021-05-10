abstract class student{
    String name;
    int age;
    abstract void show();
}
// test10
class college extends student {
    String dept = "Information Management";
    college(){
        this.name = "NULL";
        this.age = 0;
    }
    college(int age){
        this.name = "NULL";
        this.age = age;
    }
    college(String name, int age){
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println(this.name + " " + this.age + " " + this.dept);
    }
}

public class abst{
    public static void main(String[] args){
        college a, b, c;
        a = new college();
        a.show();
        b = new college(19);
        b.show();
        c = new college("chl", 19);
        c.show();
    }
}