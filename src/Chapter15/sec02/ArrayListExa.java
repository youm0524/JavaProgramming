package Chapter15.sec02;

import java.util.List;
import java.util.ArrayList;
public class ArrayListExa {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("1","2","3"));
        list.add(new Board("1","3","4"));

        int size = list.size();
        for(int i = 0; i<size; i++){
            Board b= list.get(i);
            System.out.println(b.getContent());
        }

        for(Board b : list){
            System.out.println(b.getSubject());
        }

    }
}
