import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
//        int big = 0;
//        int small = 0;
//        if(a>b){
//            big = a;
//            small= b;
//        }
//        else{
//            big = b;
//            small = a;
//        }
//        System.out.println("big:"+big+"small:"+small);
//         int ans = 0;
//         if(big%small==0){
//             ans = small;
//         }else {
//             for (int i = 1; i <= small; i++) {
//                 if (big % i == 0 && small%i==0)
//                     ans = i;
//             }
//         }
        System.out.println(gcd(a,b));

    }

    static int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
