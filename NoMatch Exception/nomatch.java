import java.util.Scanner;
public class nomatch {
    static class NoMatchException extends Exception{
        NoMatchException (String msg){
            super(msg);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        try{
            if(input.equals("India"))throw new NoMatchException("String Matches with India.");
        else{
            System.out.println("Error,String doesn't matches with India");}
        }catch(NoMatchException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
