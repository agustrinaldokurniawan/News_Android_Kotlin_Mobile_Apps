package j.n0.j;

import i.s.c.f;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class b extends Enum<b> {
    public static final b e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f3569f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f3570g;

    /* renamed from: h  reason: collision with root package name */
    public static final b f3571h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f3572i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f3573j;

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ b[] f3574k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f3575l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public final int f3576m;

    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        b bVar = new b("NO_ERROR", 0, 0);
        e = bVar;
        b bVar2 = new b("PROTOCOL_ERROR", 1, 1);
        f3569f = bVar2;
        b bVar3 = new b("INTERNAL_ERROR", 2, 2);
        f3570g = bVar3;
        b bVar4 = new b("FLOW_CONTROL_ERROR", 3, 3);
        f3571h = bVar4;
        b bVar5 = new b("REFUSED_STREAM", 7, 7);
        f3572i = bVar5;
        b bVar6 = new b("CANCEL", 8, 8);
        f3573j = bVar6;
        f3574k = new b[]{bVar, bVar2, bVar3, bVar4, new b("SETTINGS_TIMEOUT", 4, 4), new b("STREAM_CLOSED", 5, 5), new b("FRAME_SIZE_ERROR", 6, 6), bVar5, bVar6, new b("COMPRESSION_ERROR", 9, 9), new b("CONNECT_ERROR", 10, 10), new b("ENHANCE_YOUR_CALM", 11, 11), new b("INADEQUATE_SECURITY", 12, 12), new b("HTTP_1_1_REQUIRED", 13, 13)};
    }

    public b(String str, int i2, int i3) {
        this.f3576m = i3;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3574k.clone();
    }
}
