package c.b.a;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public class k implements Callable<s<g>> {
    public final /* synthetic */ WeakReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f689f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f690g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f691h;

    public k(WeakReference weakReference, Context context, int i2, String str) {
        this.e = weakReference;
        this.f689f = context;
        this.f690g = i2;
        this.f691h = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public s<g> call() {
        Context context = (Context) this.e.get();
        if (context == null) {
            context = this.f689f;
        }
        return h.e(context, this.f690g, this.f691h);
    }
}
