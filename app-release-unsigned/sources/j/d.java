package j;

import i.s.c.f;
import i.s.c.h;
import i.x.e;
import java.util.concurrent.TimeUnit;

public final class d {
    public static final a a = new a(null);
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3377c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3378d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3379f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3380g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3381h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3382i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3383j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3384k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3385l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3386m;
    public String n;

    public static final class a {
        public a(f fVar) {
        }

        public final int a(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                if (e.a(str2, str.charAt(i2), false, 2)) {
                    return i2;
                }
                i2++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final j.d b(j.x r27) {
            /*
            // Method dump skipped, instructions count: 418
            */
            throw new UnsupportedOperationException("Method not decompiled: j.d.a.b(j.x):j.d");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h.f(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) Integer.MAX_VALUE);
    }

    public d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str, f fVar) {
        this.b = z;
        this.f3377c = z2;
        this.f3378d = i2;
        this.e = i3;
        this.f3379f = z3;
        this.f3380g = z4;
        this.f3381h = z5;
        this.f3382i = i4;
        this.f3383j = i5;
        this.f3384k = z6;
        this.f3385l = z7;
        this.f3386m = z8;
        this.n = str;
    }

    public String toString() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.b) {
            sb.append("no-cache, ");
        }
        if (this.f3377c) {
            sb.append("no-store, ");
        }
        if (this.f3378d != -1) {
            sb.append("max-age=");
            sb.append(this.f3378d);
            sb.append(", ");
        }
        if (this.e != -1) {
            sb.append("s-maxage=");
            sb.append(this.e);
            sb.append(", ");
        }
        if (this.f3379f) {
            sb.append("private, ");
        }
        if (this.f3380g) {
            sb.append("public, ");
        }
        if (this.f3381h) {
            sb.append("must-revalidate, ");
        }
        if (this.f3382i != -1) {
            sb.append("max-stale=");
            sb.append(this.f3382i);
            sb.append(", ");
        }
        if (this.f3383j != -1) {
            sb.append("min-fresh=");
            sb.append(this.f3383j);
            sb.append(", ");
        }
        if (this.f3384k) {
            sb.append("only-if-cached, ");
        }
        if (this.f3385l) {
            sb.append("no-transform, ");
        }
        if (this.f3386m) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        h.b(sb2, "StringBuilder().apply(builderAction).toString()");
        this.n = sb2;
        return sb2;
    }
}
