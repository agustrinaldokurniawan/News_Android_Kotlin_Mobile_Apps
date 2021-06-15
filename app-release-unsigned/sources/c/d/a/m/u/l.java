package c.d.a.m.u;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import c.d.a.f;
import c.d.a.m.a;
import c.d.a.m.u.d;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l<T> implements d<T> {
    public final Uri e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f842f;

    /* renamed from: g  reason: collision with root package name */
    public T f843g;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f842f = contentResolver;
        this.e = uri;
    }

    @Override // c.d.a.m.u.d
    public void b() {
        T t = this.f843g;
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
    public final void e(f fVar, d.a<? super T> aVar) {
        try {
            T f2 = f(this.e, this.f842f);
            this.f843g = f2;
            aVar.f(f2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.d(e2);
        }
    }

    public abstract T f(Uri uri, ContentResolver contentResolver);
}
