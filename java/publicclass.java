
// test5
class test{
    public int a = 10;
    int b = 20;
    protected int c = 30; 
}


public class publicclass extends test{
    static private int d = 40;
    public static void main(String[] args){
        test ob = new test();
        ob.a = 11;
        ob.b = 22;
        ob.c = 33;
        System.out.println("a = " + ob.a + ", b = " + ob.b + ", c = " + ob.c + ", d = " + d);
    }
}