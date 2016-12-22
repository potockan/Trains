package logic.Trains;

/**
 * Created by npotocka on 15.12.16.
 */
public class Restriction<V> {
    private V min;
    private V max;

    public Restriction(V min, V max){
        this.min = min;
        this.max = max;
    }

    public V getMax() {
        return max;
    }

    public V getMin() {
        return min;
    }

    public void setMax(V max) {
        this.max = max;
    }

    public void setMin(V min) {
        this.min = min;
    }
}
