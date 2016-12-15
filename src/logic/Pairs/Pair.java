package logic.Pairs;

/**
 * Created by npotocka on 15.12.16.
 */
public class Pair {
    private Integer min;
    private Integer max;

    public Pair(Integer min, Integer max){
        this.min = min;
        this.max = max;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public void setMin(Integer min) {
        this.min = min;
    }
}
