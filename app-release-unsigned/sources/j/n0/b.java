package j.n0;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3468f;

    public b(String str, boolean z) {
        this.e = str;
        this.f3468f = z;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.e);
        thread.setDaemon(this.f3468f);
        return thread;
    }
}
