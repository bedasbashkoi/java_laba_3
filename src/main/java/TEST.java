import java.util.ArrayList;
import java.util.LinkedList;

public class TEST {

    private long time;

    public TEST() {this.time = 0;}

    public long ArrayTestMethod(ArrayList<Collection> Array, int CountRepeat){
        long startTime = System.nanoTime();
        for (int index = 0; index <= CountRepeat; index++) {
            Array.add(new Collection(index));
        }
        long endTime = System.nanoTime();
        time = endTime-startTime;
        return time;
    }

    public long LinkedTestMethod(LinkedList<Collection> Linked, int CountRepeat){
        long startTime = System.nanoTime();
        for (int index = 0; index <= CountRepeat; index++) {
            Linked.add(new Collection(index));
        }
        long time = System.nanoTime();
        return time;
    }
}
