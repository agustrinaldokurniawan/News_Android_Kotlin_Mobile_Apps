package c.a.a.e;

import androidx.lifecycle.LiveData;
import c.a.a.b.b.n;
import c.a.a.b.d.a.a;
import c.a.a.b.d.c.b;
import g.n.m;
import g.n.t;
import i.s.c.h;
import java.util.List;

public final class c extends t {

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<n<List<a>>> f400c;

    public c(b bVar) {
        h.e(bVar, "newsUseCase");
        m mVar = new m(bVar.a());
        h.d(mVar, "fromPublisher(newsUseCase.getAllNews())");
        this.f400c = mVar;
    }
}
