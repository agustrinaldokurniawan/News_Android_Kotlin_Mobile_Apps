package c.b.a;

import android.content.Context;
import java.util.concurrent.Callable;

public class j implements Callable<s<g>> {
    public final /* synthetic */ Context e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f687f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f688g;

    public j(Context context, String str, String str2) {
        this.e = context;
        this.f687f = str;
        this.f688g = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public s<g> call() {
        return h.b(this.e, this.f687f, this.f688g);
    }
}
