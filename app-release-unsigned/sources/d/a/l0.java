package d.a;

import i.m;
import i.q.f;
import i.s.b.l;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

public interface l0 extends f.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1827d = a.a;

    public static final class a implements f.b<l0> {
        public static final /* synthetic */ a a = new a();

        static {
            int i2 = CoroutineExceptionHandler.f3773c;
        }
    }

    boolean b();

    y e(boolean z, boolean z2, l<? super Throwable, m> lVar);

    CancellationException n();
}
