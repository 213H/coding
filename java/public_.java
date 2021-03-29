
// test5
class public__{
    public int a = 20;
}

class private_{
    private int b = 10;
    public void show(){
        System.out.println(b);
    }
}

class protected_{
    protected int c = 40;
}

class firendly{
    int d = 60;
}
public class public_{
    public static void main(String[] args){
        change1();
        change2();
        change3();
        change4();
    }
    static void change1(){
        public__ pub = new public__();
        pub.a = 12;
        System.out.println(pub.a);
    }
    static void change2(){
        private_ pri = new private_();
        pri.show();
    }
    static void change3(){
        protected_ pro = new protected_();
        pro.c = 41;
        System.out.println(pro.c);
    }
    static void change4(){
        firendly fir = new firendly();
        fir.d = 77;
        System.out.println(fir.d);
    }
}