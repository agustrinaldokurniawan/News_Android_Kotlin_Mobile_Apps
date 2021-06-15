package c.b.a;

import java.io.InputStream;
import java.util.concurrent.Callable;

public class l implements Callable<s<g>> {
    public final /* synthetic */ InputStream e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f692f;

    public l(InputStream inputStream, String str) {
        this.e = inputStream;
        this.f692f = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public s<g> call() {
        return h.c(this.e, this.f692f);
    }
}
