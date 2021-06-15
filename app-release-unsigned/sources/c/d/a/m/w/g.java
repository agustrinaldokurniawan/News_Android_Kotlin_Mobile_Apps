package c.d.a.m.w;

import android.net.Uri;
import android.text.TextUtils;
import c.d.a.m.m;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

public class g implements m {
    public final h b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f998c;

    /* renamed from: d  reason: collision with root package name */
    public final String f999d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public URL f1000f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f1001g;

    /* renamed from: h  reason: collision with root package name */
    public int f1002h;

    public g(String str) {
        h hVar = h.a;
        this.f998c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f999d = str;
            Objects.requireNonNull(hVar, "Argument must not be null");
            this.b = hVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @Override // c.d.a.m.m
    public void a(MessageDigest messageDigest) {
        if (this.f1001g == null) {
            this.f1001g = c().getBytes(m.a);
        }
        messageDigest.update(this.f1001g);
    }

    public String c() {
        String str = this.f999d;
        if (str != null) {
            return str;
        }
        URL url = this.f998c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public URL d() {
        if (this.f1000f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String str = this.f999d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f998c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f1000f = new URL(this.e);
        }
        return this.f1000f;
    }

    @Override // c.d.a.m.m
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.b.equals(gVar.b);
    }

    @Override // c.d.a.m.m
    public int hashCode() {
        if (this.f1002h == 0) {
            int hashCode = c().hashCode();
            this.f1002h = hashCode;
            this.f1002h = this.b.hashCode() + (hashCode * 31);
        }
        return this.f1002h;
    }

    public String toString() {
        return c();
    }

    public g(URL url) {
        h hVar = h.a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f998c = url;
        this.f999d = null;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.b = hVar;
    }
}
