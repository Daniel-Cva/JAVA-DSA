import java.util.*;
public class ListEX {
    public static void main(String[]args) {
    List<Integer> dani = new ArrayList<>();
    dani.add(1); //adding elements in List
    dani.add(0);
    dani.add(2);
    dani.add(3);
    dani.add(4);
    dani.add(5);
    dani.add(7);
    dani.add(5);
    int FirstIndex = dani.indexOf(5);//Search an element
    int LastIndex = dani.lastIndexOf(5);
    System.out.println("List Elements: "+dani);//Display list elements
    System.out.println("First occourence of 5 at index : " + FirstIndex);
    System.out.println("Last occourence of 5 is at index : " + LastIndex);
    System.out.println("List Size: " + dani.size());//Display size of list
    dani.remove(7);//Removing element from list
    System.out.println("Remove 7th Index:" + dani);
    }
}
