package c.e.b.a0;

public class x extends y {
    @Override // c.e.b.a0.y
    public <T> T b(Class<T> cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls);
    }
}
