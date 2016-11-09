package genericStudy;

/**
 * Created by i.viktor on 02/11/2016.
 */
public class PairImpl<K, V> implements Pair<K, V> {
    private final K key;
    private final V value;

    @Override
    public String toString() {
        return "PairImpl{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public PairImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
