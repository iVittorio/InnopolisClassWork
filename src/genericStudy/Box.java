package genericStudy;

/**
 * Created by i.viktor on 02/11/2016.
 */
public class Box<T> {

    private T t; // T stands for "Type"

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
