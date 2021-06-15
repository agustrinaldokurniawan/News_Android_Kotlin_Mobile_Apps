package j;

import i.s.c.f;
import j.n0.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import k.h;

public abstract class j0 implements Closeable {
    public static final b e = new b(null);

    /* renamed from: f  reason: collision with root package name */
    public Reader f3436f;

    public static final class a extends Reader {
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public Reader f3437f;

        /* renamed from: g  reason: collision with root package name */
        public final h f3438g;

        /* renamed from: h  reason: collision with root package name */
        public final Charset f3439h;

        public a(h hVar, Charset charset) {
            i.s.c.h.f(hVar, "source");
            i.s.c.h.f(charset, "charset");
            this.f3438g = hVar;
            this.f3439h = charset;
        }

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public void close() {
            this.e = true;
            Reader reader = this.f3437f;
            if (reader != null) {
                reader.close();
            } else {
                this.f3438g.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            Charset charset;
            String str;
            i.s.c.h.f(cArr, "cbuf");
            if (!this.e) {
                Reader reader = this.f3437f;
                if (reader == null) {
                    InputStream a0 = this.f3438g.a0();
                    h hVar = this.f3438g;
                    Charset charset2 = this.f3439h;
                    byte[] bArr = c.a;
                    i.s.c.h.f(hVar, "$this$readBomAsCharset");
                    i.s.c.h.f(charset2, "default");
                    int c0 = hVar.c0(c.f3470d);
                    if (c0 != -1) {
                        if (c0 == 0) {
                            charset = StandardCharsets.UTF_8;
                            str = "UTF_8";
                        } else if (c0 == 1) {
                            charset = StandardCharsets.UTF_16BE;
                            str = "UTF_16BE";
                        } else if (c0 != 2) {
                            if (c0 == 3) {
                                i.x.a aVar = i.x.a.f3334d;
                                charset = i.x.a.f3333c;
                                if (charset == null) {
                                    charset = Charset.forName("UTF-32BE");
                                    i.s.c.h.d(charset, "Charset.forName(\"UTF-32BE\")");
                                    i.x.a.f3333c = charset;
                                }
                            } else if (c0 == 4) {
                                i.x.a aVar2 = i.x.a.f3334d;
                                charset = i.x.a.b;
                                if (charset == null) {
                                    charset = Charset.forName("UTF-32LE");
                                    i.s.c.h.d(charset, "Charset.forName(\"UTF-32LE\")");
                                    i.x.a.b = charset;
                                }
                            } else {
                                throw new AssertionError();
                            }
                            charset2 = charset;
                        } else {
                            charset = StandardCharsets.UTF_16LE;
                            str = "UTF_16LE";
                        }
                        i.s.c.h.b(charset, str);
                        charset2 = charset;
                    }
                    reader = new InputStreamReader(a0, charset2);
                    this.f3437f = reader;
                }
                return reader.read(cArr, i2, i3);
            }
            throw new IOException("Stream closed");
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public abstract long b();

    public abstract a0 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c.c(e());
    }

    public abstract h e();
}
