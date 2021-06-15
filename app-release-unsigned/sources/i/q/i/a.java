package i.q.i;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class a extends Enum<a> {
    public static final a e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ a[] f3304f;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        e = aVar;
        f3304f = new a[]{aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
    }

    public a(String str, int i2) {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3304f.clone();
    }
}
