package c.d.a.m.w;

import android.util.Base64;
import c.d.a.f;
import c.d.a.m.p;
import c.d.a.m.u.d;
import c.d.a.m.w.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public final class e<Model, Data> implements n<Model, Data> {
    public final a<Data> a;

    public interface a<Data> {
    }

    public static final class b<Data> implements d<Data> {
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final a<Data> f994f;

        /* renamed from: g  reason: collision with root package name */
        public Data f995g;

        public b(String str, a<Data> aVar) {
            this.e = str;
            this.f994f = aVar;
        }

        @Override // c.d.a.m.u.d
        public Class<Data> a() {
            Objects.requireNonNull((c.a) this.f994f);
            return InputStream.class;
        }

        @Override // c.d.a.m.u.d
        public void b() {
            try {
                a<Data> aVar = this.f994f;
                Data data = this.f995g;
                Objects.requireNonNull((c.a) aVar);
                data.close();
            } catch (IOException unused) {
            }
        }

        @Override // c.d.a.m.u.d
        public c.d.a.m.a c() {
            return c.d.a.m.a.LOCAL;
        }

        @Override // c.d.a.m.u.d
        public void cancel() {
        }

        @Override // c.d.a.m.u.d
        public void e(f fVar, d.a<? super Data> aVar) {
            try {
                Data data = (Data) ((c.a) this.f994f).a(this.e);
                this.f995g = data;
                aVar.f(data);
            } catch (IllegalArgumentException e2) {
                aVar.d(e2);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {
        public final a<InputStream> a = new a(this);

        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        @Override // c.d.a.m.w.o
        public n<Model, InputStream> b(r rVar) {
            return new e(this.a);
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // c.d.a.m.w.n
    public n.a<Data> a(Model model, int i2, int i3, p pVar) {
        return new n.a<>(new c.d.a.r.b(model), new b(model.toString(), this.a));
    }

    @Override // c.d.a.m.w.n
    public boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
