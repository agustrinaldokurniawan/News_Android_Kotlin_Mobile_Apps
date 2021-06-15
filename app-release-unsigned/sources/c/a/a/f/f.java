package c.a.a.f;

import androidx.lifecycle.LiveData;
import c.a.a.b.b.n;
import c.a.a.b.d.a.a;
import c.a.a.b.d.c.b;
import g.n.m;
import g.n.t;
import i.s.c.h;
import java.util.List;

public final class f extends t {

    /* renamed from: c  reason: collision with root package name */
    public final b f407c;

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<n<List<a>>> f408d;

    public f(b bVar) {
        h.e(bVar, "newsUseCase");
        this.f407c = bVar;
        m mVar = new m(bVar.a());
        h.d(mVar, "fromPublisher(newsUseCase.getAllNews())");
        this.f408d = mVar;
    }
}
