package Task;

public class Date {
    private int d;
    private int m;
    private int y;

    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%4d", d, m, y);
    }


    public int makeInt() {
        return Integer.parseInt(String.format("%4d%02d%02d", y, m, d));
    }
}
