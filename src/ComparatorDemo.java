import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        Integer a[] = {2,4,6,8,1,3,5,7};
        Arrays.sort(a, new My());
        for(Integer x: a){
            System.out.println(x);
        }
    }
}

class My implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2){
            return 1;
        }
        if(o1>o2){
            return -1;
        }
        return 0;
    }
}
