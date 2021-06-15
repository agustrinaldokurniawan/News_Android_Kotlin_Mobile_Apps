package g.h.g;

import android.content.Context;
import g.h.g.j;
import java.util.concurrent.Callable;

public class h implements Callable<j.a> {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f2497f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f2498g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f2499h;

    public h(String str, Context context, e eVar, int i2) {
        this.e = str;
        this.f2497f = context;
        this.f2498g = eVar;
        this.f2499h = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public j.a call() {
        return j.a(this.e, this.f2497f, this.f2498g, this.f2499h);
    }
}
