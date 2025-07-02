

public class Main {
    public static void main(String[] args) {

    }

    public static void tapsiriq5(){
        for (int i=1;i<=4;i++){
            for (int j = 1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*(4-i+1) - 1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tapsiriq4(){
        for (int i=4;i>=1;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tapsiriq3(){
        for (int i=1;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tapsiriq1(){
        for (int i=0;i<5;i++){
            System.out.print("*");
        }
    }
    public static void tapsiriq2(){
        for (int j=0;j<4;j++){
            for (int i=0;i<5;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}