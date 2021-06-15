package kotlinx.coroutines;

import i.q.f;

public interface CoroutineExceptionHandler extends f.a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f3773c = 0;

    public static final class a implements f.b<CoroutineExceptionHandler> {
        public static final /* synthetic */ a a = new a();
    }

    void handleException(f fVar, Throwable th);
}
