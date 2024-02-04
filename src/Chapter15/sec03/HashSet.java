package Chapter15.sec03;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); //중복
        set.add("JSP");  //중복
        set.add("youm");

        int size = set.size();
        System.out.println(size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")) {
                //가져온거 제거
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");

        for(String element:set){
            System.out.println(element);
        }

    }
}
