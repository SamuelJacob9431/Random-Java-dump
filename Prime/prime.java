
public class prime {
    public static void main(String[] args) {
    int n = 9;
    boolean prime = true;{

    if (n<=0){
        System.out.println("Negative or zero number");
    }else if (n == 1){
        System.out.println("It is not a prime or composite number");
    }
    for( int i = 2; i <= n/2; i++ ){
     if( n % i == 0){ prime = false;
    }
    }
    if( prime == true){
        System.out.println(n + " is Prime.");
    }else{
        System.out.println(n +" is not a Prime");
    }
}
}
}
