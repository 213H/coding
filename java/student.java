// test7

class stu{
    String name, num;
    int grade;
    stu(String name_, String num_, int grade_){
        name = name_;
        num = num_;
        grade = grade_;
    }
    stu(){
        this("ChenHongliang", "00000", 0);
    }
    void show(){
        System.out.println("name = " + name + ", num = " + num + ", grade = " + grade);
    }
}
public class student{
    public static void main(String[] args){
        stu ob = new stu("chenhongliang", "201905190410", 90);
        stu obj = new stu();
        ob.show();
        obj.show();
    }
}