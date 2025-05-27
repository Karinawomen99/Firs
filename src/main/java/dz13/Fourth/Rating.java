package dz13.Fourth;

public class Rating < T extends Number>{
    private final T value;

    public Rating(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
