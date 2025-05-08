import java.util.ArrayList;
public class AL {
    public static void main(String[] args) {
        System.out.println("Array List Demonstration");
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        System.out.println("Array List current:" +arraylist);
        arraylist.remove(0);
        System.out.println("New Array List:" + arraylist);
    }

}
