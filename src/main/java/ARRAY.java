import java.util.ArrayList;

public class ARRAY {

    private long time_begin;
    private long time_end;
    private ArrayList<Integer> array = new ArrayList<>();
    private int array_count;
    public ARRAY(){}

    public void SetCountIteration (int EnterCount) {
        array_count = EnterCount;
    }

    public void SetArray (int ArrayElement) {
        array.add(ArrayElement);
    }

    public int GetArray (int ArrayElement) {
        return array.get(array.size()-1);
    }

    public int GetNumberIteration () {
        return array_count;
    }

    public void SetNumberIteration (int Number) {
        array_count = Number;
    }

    public int GetArraySize () {
        return array.size();
    }

    public long TestMethodAdd() {
        time_begin = System.nanoTime();
        for (int index = 0; index < array_count; index++) array.add(index);
        time_end = System.nanoTime();
        return time_end - time_begin;
    }

    public long TestMethodRemove() {
        for (int index = 0; index < array_count; index++) array.add(index);
        time_begin = System.nanoTime();
        for (int index = 0; index < array_count; index++) array.remove(index);
        time_end = System.nanoTime();
        return time_end - time_begin;
    }

    public long TestMethodGet() {
        time_begin = System.nanoTime();
        for (int index = 0; index < array_count; index++) array.get(index);
        time_end = System.nanoTime();
        return time_end - time_begin;
    }

}