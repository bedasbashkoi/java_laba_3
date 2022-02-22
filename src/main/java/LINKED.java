import java.util.LinkedList;

public class LINKED {

    private long time_begin;
    private long time_end;
    private LinkedList<Integer> linked = new LinkedList<>();
    private int CountLinkedOperation;
    public LINKED(){}

    public void SetCountIteration (int EnterCount) {
        CountLinkedOperation = EnterCount;
    }

    public void SetArray (int LinkedElement) {
        linked.add(LinkedElement);
    }

    public int GetArray (int LinkedElement) {
        return linked.get(linked.size()-1);
    }

    public int GetNumberIteration () {
        return CountLinkedOperation;
    }

    public void SetNumberIteration (int Number) {
        CountLinkedOperation = Number;
    }

    public int Size () {
        return linked.size();
    }

    public long TestMethodAdd() {
        time_begin = System.nanoTime();
        for (int index = 0; index < CountLinkedOperation; index++) linked.add(index);
        time_end = System.nanoTime();
        return time_end - time_begin;
    }

    public long TestMethodGet() {
        time_begin = System.nanoTime();
        for (int index = 0; index < CountLinkedOperation; index++) linked.get(index);
        time_end = System.nanoTime();
        return time_end - time_begin;
    }

    public long TestMethodRemove() {
        for (int index = 0; index < CountLinkedOperation; index++) linked.add(index);
        time_begin = System.nanoTime();
        for (int index = 0; index < CountLinkedOperation; index++) linked.remove(index);
        time_end = System.nanoTime();
        return time_end - time_begin;
    }
}