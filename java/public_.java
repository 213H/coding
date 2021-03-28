
// test5
class private_{
    private int a = 10;
}

class public__{
    public int b = 20;
}

class protected_{
    protected int c = 40;
}

class firendly{
    int d = 60;
}
public class public_{
    void change1(){
        public__ pub = new public__();
        pub.a = 12;
        System.out.println(pub.a);
    }
    void change2(){
        private_ pri = new private_();
    }
    void change3(){
        protected_ pro = new protected_();
        
    }
    void change4(){
        firendly fir = new firendly();
    }
}