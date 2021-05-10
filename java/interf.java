// test11
interface area{
    double Area();
}

interface circum{
    double Circum();
}

class graph {
    double area;
    double circum;
}

class square extends graph implements area, circum {
    double e;
    square(double e){
        this.e = e;
    }
    public double Area(){
        area = e * e;
        return area;
    }
    public double Circum(){
        circum = 4 * e;
        return circum;
    }
}

class circle extends graph implements area, circum{
    double e;
    circle(double e){
        this.e = e;
    }
    public double Area(){
        area = Math.PI * e * e;
        return area;
    }
    public double Circum(){
        circum = 2 * Math.PI * e;
        return circum;
    }
}

public class interf{
    public static void main(String[] args){
        square sq = new square(3);
        circle ci = new circle(4);
        System.out.println("square: area = " + sq.Area() + ", circum = " + sq.Circum());
        System.out.println("circle: area = " + ci.Area() + ", circum = " + ci.Circum());
    }
}