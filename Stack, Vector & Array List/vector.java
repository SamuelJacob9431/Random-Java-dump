import java.util.Vector;
public class vector {
    public static void main(String[] args) {
        System.out.println("Vector Demonstration");
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("Vector after adding:"+vector);
        vector.remove("Banana");
        System.out.println("Final Vector" +vector);
    }
}
