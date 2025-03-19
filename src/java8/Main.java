package java8;

public class Main {

    public static void main(String[] args) {

        Thread th=new Thread(()-> {
            try {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Thread" + i);
                }
            } catch (Exception e) {
                System.out.println("Exception");
            }
        });
        th.start();
        }
    }