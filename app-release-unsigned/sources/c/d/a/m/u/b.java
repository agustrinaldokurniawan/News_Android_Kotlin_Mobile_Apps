package c.d.a.m.u;

import android.content.res.AssetManager;
import android.util.Log;
import c.d.a.f;
import c.d.a.m.a;
import c.d.a.m.u.d;
import java.io.IOException;

public abstract class b<T> implements d<T> {
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final AssetManager f828f;

    /* renamed from: g  reason: collision with root package name */
    public T f829g;

    public b(AssetManager assetManager, String str) {
        this.f828f = assetManager;
        this.e = str;
    }

    @Override // c.d.a.m.u.d
    public void b() {
        T t = this.f829g;
        if (t != null) {
            try {
                d(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // c.d.a.m.u.d
    public a c() {
        return a.LOCAL;
    }

    @Override // c.d.a.m.u.d
    public void cancel() {
    }

    public abstract void d(T t);

    @Override // c.d.a.m.u.d
    public void e(f fVar, d.a<? super T> aVar) {
        try {
            T f2 = f(this.f828f, this.e);
            this.f829g = f2;
            aVar.f(f2);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.d(e2);
        }
    }

    public abstract T f(AssetManager assetManager, String str);
}
