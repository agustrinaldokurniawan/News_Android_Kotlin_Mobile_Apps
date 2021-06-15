package c.d.a.m.v.d0;

import c.d.a.m.m;
import c.d.a.s.g;
import c.d.a.s.j;
import c.d.a.s.k.a;
import c.d.a.s.k.d;
import g.h.i.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class k {
    public final g<m, String> a = new g<>(1000);
    public final c<b> b = c.d.a.s.k.a.a(10, new a(this));

    public class a implements a.b<b> {
        public a(k kVar) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // c.d.a.s.k.a.b
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class b implements a.d {
        public final MessageDigest e;

        /* renamed from: f  reason: collision with root package name */
        public final d f893f = new d.b();

        public b(MessageDigest messageDigest) {
            this.e = messageDigest;
        }

        @Override // c.d.a.s.k.a.d
        public d a() {
            return this.f893f;
        }
    }

    public String a(m mVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a(mVar);
        }
        if (a2 == null) {
            b b2 = this.b.b();
            Objects.requireNonNull(b2, "Argument must not be null");
            b bVar = b2;
            try {
                mVar.a(bVar.e);
                byte[] digest = bVar.e.digest();
                char[] cArr = j.b;
                synchronized (cArr) {
                    for (int i2 = 0; i2 < digest.length; i2++) {
                        int i3 = digest[i2] & 255;
                        int i4 = i2 * 2;
                        char[] cArr2 = j.a;
                        cArr[i4] = cArr2[i3 >>> 4];
                        cArr[i4 + 1] = cArr2[i3 & 15];
                    }
                    a2 = new String(cArr);
                }
            } finally {
                this.b.a(bVar);
            }
        }
        synchronized (this.a) {
            this.a.d(mVar, a2);
        }
        return a2;
    }
}
