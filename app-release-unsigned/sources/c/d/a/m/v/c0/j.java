package c.d.a.m.v.c0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class j implements d {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    public final k b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Bitmap.Config> f865c;

    /* renamed from: d  reason: collision with root package name */
    public final a f866d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f867f;

    /* renamed from: g  reason: collision with root package name */
    public int f868g;

    /* renamed from: h  reason: collision with root package name */
    public int f869h;

    /* renamed from: i  reason: collision with root package name */
    public int f870i;

    /* renamed from: j  reason: collision with root package name */
    public int f871j;

    public interface a {
    }

    public static final class b implements a {
    }

    public j(long j2) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.e = j2;
        this.b = mVar;
        this.f865c = unmodifiableSet;
        this.f866d = new b();
    }

    @Override // c.d.a.m.v.c0.d
    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || i2 >= 20) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            i(0);
        } else if (i2 >= 20 || i2 == 15) {
            i(this.e / 2);
        }
    }

    @Override // c.d.a.m.v.c0.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0);
    }

    @Override // c.d.a.m.v.c0.d
    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 != null) {
            return h2;
        }
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // c.d.a.m.v.c0.d
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 != null) {
            h2.eraseColor(0);
            return h2;
        }
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // c.d.a.m.v.c0.d
    public synchronized void e(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (!bitmap.isRecycled()) {
            if (bitmap.isMutable()) {
                Objects.requireNonNull((m) this.b);
                if (((long) c.d.a.s.j.d(bitmap)) <= this.e) {
                    if (this.f865c.contains(bitmap.getConfig())) {
                        Objects.requireNonNull((m) this.b);
                        int d2 = c.d.a.s.j.d(bitmap);
                        ((m) this.b).f(bitmap);
                        Objects.requireNonNull((b) this.f866d);
                        this.f870i++;
                        this.f867f += (long) d2;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.b).e(bitmap));
                        }
                        f();
                        i(this.e);
                        return;
                    }
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.b).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f865c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } else {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder f2 = c.c.a.a.a.f("Hits=");
        f2.append(this.f868g);
        f2.append(", misses=");
        f2.append(this.f869h);
        f2.append(", puts=");
        f2.append(this.f870i);
        f2.append(", evictions=");
        f2.append(this.f871j);
        f2.append(", currentSize=");
        f2.append(this.f867f);
        f2.append(", maxSize=");
        f2.append(this.e);
        f2.append("\nStrategy=");
        f2.append(this.b);
        Log.v("LruBitmapPool", f2.toString());
    }

    public final synchronized Bitmap h(int i2, int i3, Bitmap.Config config) {
        Bitmap b2;
        if (Build.VERSION.SDK_INT >= 26) {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        b2 = ((m) this.b).b(i2, i3, config != null ? config : a);
        if (b2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((m) this.b);
                sb.append(m.c(c.d.a.s.j.c(i2, i3, config), config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f869h++;
        } else {
            this.f868g++;
            long j2 = this.f867f;
            Objects.requireNonNull((m) this.b);
            this.f867f = j2 - ((long) c.d.a.s.j.d(b2));
            Objects.requireNonNull((b) this.f866d);
            b2.setHasAlpha(true);
            b2.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((m) this.b);
            sb2.append(m.c(c.d.a.s.j.c(i2, i3, config), config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        f();
        return b2;
    }

    public final synchronized void i(long j2) {
        while (this.f867f > j2) {
            m mVar = (m) this.b;
            Bitmap c2 = mVar.f875g.c();
            if (c2 != null) {
                mVar.a(Integer.valueOf(c.d.a.s.j.d(c2)), c2);
            }
            if (c2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f867f = 0;
                return;
            }
            Objects.requireNonNull((b) this.f866d);
            long j3 = this.f867f;
            Objects.requireNonNull((m) this.b);
            this.f867f = j3 - ((long) c.d.a.s.j.d(c2));
            this.f871j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.b).e(c2));
            }
            f();
            c2.recycle();
        }
    }
}
