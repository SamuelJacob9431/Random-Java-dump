public class basic{
    public static void main(String[] args) {
        Thread threadA = new Thread (new Runnable(){
        @Override
        public void run(){
            for(int i = 0; i <10; i++){
                System.out.println("a");
            }
        }
        });
        Thread threadB = new Thread (new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i <10; i++){
                    System.out.println("b");
                }
            }
            });
            Thread threadC = new Thread (new Runnable(){
                @Override
                public void run(){
                    for(int i = 1; i <=100; i++){
                        System.out.println(" " + i);
                    }
                }
            });
        
        threadA.start();
        threadB.start();
        threadC.start();
    }
}