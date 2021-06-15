package c.d.a.m.w;

import c.d.a.m.m;
import c.d.a.m.p;
import c.d.a.m.u.d;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public interface n<Model, Data> {

    public static class a<Data> {
        public final m a;
        public final List<m> b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f1009c;

        public a(m mVar, d<Data> dVar) {
            List<m> emptyList = Collections.emptyList();
            Objects.requireNonNull(mVar, "Argument must not be null");
            this.a = mVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.f1009c = dVar;
        }
    }

    a<Data> a(Model model, int i2, int i3, p pVar);

    boolean b(Model model);
}
