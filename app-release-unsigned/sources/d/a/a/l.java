package d.a.a;

import d.a.r0;
import h.a.t.a;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

public final class l {
    public static final boolean a;
    public static final r0 b;

    static {
        l lVar = new l();
        String W = a.W("kotlinx.coroutines.fast.service.loader");
        a = W != null ? Boolean.parseBoolean(W) : true;
        b = lVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final r0 a() {
        MainDispatcherFactory mainDispatcherFactory;
        List<? extends MainDispatcherFactory> b0 = a.b0(a.g(a.b()));
        Iterator it = b0.iterator();
        if (!it.hasNext()) {
            mainDispatcherFactory = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
            mainDispatcherFactory = next;
        }
        MainDispatcherFactory mainDispatcherFactory2 = mainDispatcherFactory;
        if (mainDispatcherFactory2 != null) {
            try {
                r0 createDispatcher = mainDispatcherFactory2.createDispatcher(b0);
                if (createDispatcher != null) {
                    return createDispatcher;
                }
            } catch (Throwable th) {
                mainDispatcherFactory2.hintOnError();
                throw th;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
