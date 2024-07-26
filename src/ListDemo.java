import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(20);
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(50,60,70,80,90));
        arrayList.add(10);
        arrayList.add(0,5);
        arrayList.addAll(1,arrayList1);
        System.out.println(arrayList.contains(50));
        System.out.println(arrayList.lastIndexOf(70));
        System.out.println(arrayList);
        System.out.println(arrayList.set(6,100));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for(Integer x:arrayList){
            System.out.println(x);
        }

        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(it.next());
        }

        arrayList.forEach(System.out::println);



    }

    void show(int n){
        if(n>60){
            System.out.println(n);
        }
    }
}
