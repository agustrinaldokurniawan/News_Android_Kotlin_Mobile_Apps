package g.h.g;

import android.content.Context;
import g.h.g.j;
import java.util.concurrent.Callable;

public class f implements Callable<j.a> {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f2494f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f2495g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f2496h;

    public f(String str, Context context, e eVar, int i2) {
        this.e = str;
        this.f2494f = context;
        this.f2495g = eVar;
        this.f2496h = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public j.a call() {
        return j.a(this.e, this.f2494f, this.f2495g, this.f2496h);
    }
}
