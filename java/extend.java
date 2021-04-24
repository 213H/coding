// test8
class stu{
    String name;
    String num;
    public void setname(String name){
        this.name = name;
    }
    public void setnum(String num){
        this.num = num;
    }
    public String getname(){
        return name;
    }
    public String getnum(){
        return num;
    }
}

class undergraduate extends stu{
    String major;
    
    void setmajor(String major){
        this.major = major;
    }
    String getmajor(){
        return major;
    }
}

public class extend{
    public static void main(String[] args) {
        undergraduate obj = new undergraduate();
        obj.setname("chl");
        obj.setnum("2019");
        obj.setmajor("inform mangement");
        System.out.println(obj.getname() +" " + obj.getnum() + " " + obj.getmajor());
    }   
}