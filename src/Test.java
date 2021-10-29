import java.io.*;
import java.util.Scanner;

public class Test {
    String test ;
    static BufferedReader Reader;

    public static void main(String[] args) {
         Test main = new Test();
            main.listenForMessages();
            main.method2();







    }


    public void listenForMessages(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("Enter Your Name!");
                    Scanner scanner = new Scanner(System.in);
                    scanner.nextLine();
                }

            }
        }).start();
    }

    public void method2(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

public void run(){
    while(true){
        System.out.println("Enter Your Name");
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
    }
}
}
