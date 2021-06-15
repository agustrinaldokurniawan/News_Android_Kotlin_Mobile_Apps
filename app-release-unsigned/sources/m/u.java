package m;

import javax.annotation.Nullable;

public class u extends w<Iterable<T>> {
    public final /* synthetic */ w a;

    public u(w wVar) {
        this.a = wVar;
    }

    @Override // m.w
    public void a(y yVar, @Nullable Object obj) {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object obj2 : iterable) {
                this.a.a(yVar, obj2);
            }
        }
    }
}
