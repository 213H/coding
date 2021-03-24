import java.util.*;

// test3
public class yanghui{
    public static void main(String[] args){
        Scanner oj = new Scanner(System.in);
        int l = oj.nextInt();
        int a[][] = new int[l][l+1];
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l + 1; j++){
                a[i][j] = 0;
            }
        }
        a[0][1] = 1;
        for(int i = 1; i < l; i++){
            for(int j = 1; j < l + 1; j++){
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        for(int i = 0; i < l; i++){
            space(l-i-1);
            for(int j = 1; j < i + 2; j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static void space(int a){
        for(int i = 0; i < a; i++){
            System.out.printf(" ");
        }   
    }
}