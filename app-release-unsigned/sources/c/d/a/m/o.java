package c.d.a.m;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Objects;

public final class o<T> {
    public static final b<Object> a = new a();
    public final T b;

    /* renamed from: c  reason: collision with root package name */
    public final b<T> f824c;

    /* renamed from: d  reason: collision with root package name */
    public final String f825d;
    public volatile byte[] e;

    public class a implements b<Object> {
        @Override // c.d.a.m.o.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public o(String str, T t, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f825d = str;
            this.b = t;
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f824c = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T> o<T> a(String str, T t) {
        return new o<>(str, t, a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f825d.equals(((o) obj).f825d);
        }
        return false;
    }

    public int hashCode() {
        return this.f825d.hashCode();
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("Option{key='");
        f2.append(this.f825d);
        f2.append('\'');
        f2.append('}');
        return f2.toString();
    }
}
