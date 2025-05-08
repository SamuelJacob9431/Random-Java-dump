
public class tc {
    public static void main(String[] args) {
           try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            if(args.length > 0){
                System.out.println("You have entered 2 numbers");
                int c = a/b;
                System.out.println(c);
            }
                
            } catch (Exception e) {
             System.out.println(e);
            }
    }
}
