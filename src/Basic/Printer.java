package Basic;

public class Printer {
    private int index;
    public Printer(){
        index = 0;
    }
    void print(Object object){
        System.out.println(String.format("{%d},%s",index,object));
        index++;
    }

}
