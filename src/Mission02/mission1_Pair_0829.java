package Mission02;

public class mission1_Pair_0829<T, U> {
    private T first;
    private U second;

    public mission1_Pair_0829(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public U getSecond() {
        return second;
    }
    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
