package c.d.a.m.x.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c.d.a.h;
import c.d.a.i;
import c.d.a.m.t;
import c.d.a.m.v.c0.d;
import c.d.a.m.v.k;
import c.d.a.q.f;
import c.d.a.s.e;
import c.d.a.s.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class g {
    public final c.d.a.l.a a;
    public final Handler b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f1090c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final i f1091d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1092f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1093g;

    /* renamed from: h  reason: collision with root package name */
    public h<Bitmap> f1094h;

    /* renamed from: i  reason: collision with root package name */
    public a f1095i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1096j;

    /* renamed from: k  reason: collision with root package name */
    public a f1097k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f1098l;

    /* renamed from: m  reason: collision with root package name */
    public t<Bitmap> f1099m;
    public a n;
    public int o;
    public int p;
    public int q;

    public static class a extends c.d.a.q.j.c<Bitmap> {

        /* renamed from: h  reason: collision with root package name */
        public final Handler f1100h;

        /* renamed from: i  reason: collision with root package name */
        public final int f1101i;

        /* renamed from: j  reason: collision with root package name */
        public final long f1102j;

        /* renamed from: k  reason: collision with root package name */
        public Bitmap f1103k;

        public a(Handler handler, int i2, long j2) {
            this.f1100h = handler;
            this.f1101i = i2;
            this.f1102j = j2;
        }

        @Override // c.d.a.q.j.h
        public void c(Object obj, c.d.a.q.k.b bVar) {
            this.f1103k = (Bitmap) obj;
            this.f1100h.sendMessageAtTime(this.f1100h.obtainMessage(1, this), this.f1102j);
        }

        @Override // c.d.a.q.j.h
        public void g(Drawable drawable) {
            this.f1103k = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                g.this.b((a) message.obj);
                return true;
            } else if (i2 != 2) {
                return false;
            } else {
                g.this.f1091d.l((a) message.obj);
                return false;
            }
        }
    }

    public g(c.d.a.b bVar, c.d.a.l.a aVar, int i2, int i3, t<Bitmap> tVar, Bitmap bitmap) {
        d dVar = bVar.f723g;
        Context baseContext = bVar.f725i.getBaseContext();
        Objects.requireNonNull(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        i f2 = c.d.a.b.b(baseContext).f728l.f(baseContext);
        Context baseContext2 = bVar.f725i.getBaseContext();
        Objects.requireNonNull(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        i f3 = c.d.a.b.b(baseContext2).f728l.f(baseContext2);
        Objects.requireNonNull(f3);
        h<Bitmap> y = new h(f3.f759f, f3, Bitmap.class, f3.f760g).a(i.e).a(((f) ((f) ((f) new f().g(k.a)).w(true)).q(true)).j(i2, i3));
        this.f1091d = f2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = dVar;
        this.b = handler;
        this.f1094h = y;
        this.a = aVar;
        c(tVar, bitmap);
    }

    public final void a() {
        if (this.f1092f && !this.f1093g) {
            a aVar = this.n;
            if (aVar != null) {
                this.n = null;
                b(aVar);
                return;
            }
            this.f1093g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.a.f());
            this.a.d();
            this.f1097k = new a(this.b, this.a.a(), uptimeMillis);
            h<Bitmap> E = this.f1094h.a((f) new f().p(new c.d.a.r.b(Double.valueOf(Math.random())))).E(this.a);
            E.C(this.f1097k, null, E, e.a);
        }
    }

    public void b(a aVar) {
        this.f1093g = false;
        if (this.f1096j) {
            this.b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f1092f) {
            this.n = aVar;
        } else {
            if (aVar.f1103k != null) {
                Bitmap bitmap = this.f1098l;
                if (bitmap != null) {
                    this.e.e(bitmap);
                    this.f1098l = null;
                }
                a aVar2 = this.f1095i;
                this.f1095i = aVar;
                int size = this.f1090c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f1090c.get(size).a();
                }
                if (aVar2 != null) {
                    this.b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public void c(t<Bitmap> tVar, Bitmap bitmap) {
        Objects.requireNonNull(tVar, "Argument must not be null");
        this.f1099m = tVar;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f1098l = bitmap;
        this.f1094h = this.f1094h.a(new f().s(tVar, true));
        this.o = j.d(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
