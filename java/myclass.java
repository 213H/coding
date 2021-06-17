// test4
// 创建类
public class myclass{
    public static void main(String[] args){
        stu s = new stu(201, "chenhongliang", 100);
        s.num();
        s.name();
        s.exp();
    }
}
class stu{
    int num;
    String name;
    int exp_grade;
    stu(int num_, String name_, int exp_grade_){
        num = num_;
        name = name_;
        exp_grade = exp_grade_;
    }
    void num(){
        System.out.println("The num of the student is " + num);
    }
    void name(){
        System.out.println("The name of the student is " + name);
    }
    void exp(){
        System.out.println("The expect Java grade of the student is " + exp_grade);
    }
}