import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("privet moy drug");
        System.out.println();

        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>());
        arrayList.get(0).add("AAAAAA");
        System.out.println(arrayList.get(0).get(0));
        System.out.println();


        System.out.format("%s  :  %s  :  %s", "Me", "NotMe", "AnotherShit");




    }
}
