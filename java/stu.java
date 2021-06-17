// test6
// 学生类 student class
public class stu{
    public static void main(String[] args){
        student stu_ = new student();
        stu_.setName("Chen Hongliang");
        stu_.showName();
    }
}

class student{
    String name;
    String num;
    int grade;
    void setName(String name_){
        name = name_;
    }
    void showName(){
        System.out.println(name);
    }
}