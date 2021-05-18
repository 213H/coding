// test14

public class exce{
    public static void main(String[] args){
        try{
            test();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("main catch");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("main finally");
        }
    }
    public static void test() throws Exception{
        double a = Math.random();
        try{
            if(a > 0.5){
                System.out.println(a);
            }
            else{
                throw new myException("my exception");
            }
        }
        catch(myException e){
            System.out.println("out catch");
            try{
                int b[] = new int[5];
                b[5] = 5;
            }
            catch(ArrayIndexOutOfBoundsException el){
                System.out.println("Array Exception inner catch");
                throw el;
            }
            finally{
                System.out.println("inner finally");
            }
        }
        finally{
            System.out.println("out finally");
            throw new Exception("return value");
        }        
    }
}

class myException extends Exception{
    myException(){
        super();
    }
    myException(String s){
        super(s);
    }
}