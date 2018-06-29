package Basic;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<5;i++)
            list.add(i);
        while(!list.isEmpty())
            printer.print(list.remove(0));


    }
}
