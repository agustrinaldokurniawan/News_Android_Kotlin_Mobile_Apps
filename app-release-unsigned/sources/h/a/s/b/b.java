package h.a.s.b;

public final class b {
    public static int a(int i2, String str) {
        if (i2 > 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i2);
    }
}
