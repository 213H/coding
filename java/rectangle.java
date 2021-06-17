// test9
// 继承super()调用父类方法
class graph{
    String name;
    int id = 10;
    graph(){
        System.out.println("father");
    }
    graph(String name){
        this.name = name;
    }
    void draw(){
        System.out.println("draw a graph");
    }
}

public class rectangle extends graph {
    int id = 20;
    rectangle(String name){
        super(name);
        System.out.println("son");
    }
    @Override
    void draw(){
        System.out.println("draw a rectangle");
    }
    public static void main(String[] args){
        rectangle obj = new rectangle("rectangle");
        System.out.println(obj.name);
        obj.draw();
    }
}