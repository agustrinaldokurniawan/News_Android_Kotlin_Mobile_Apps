package c.b.a;

import c.b.a.f0.c;
import java.util.ArrayList;
import java.util.Iterator;

public class t implements Runnable {
    public final /* synthetic */ u e;

    public t(u uVar) {
        this.e = uVar;
    }

    public void run() {
        if (this.e.e != null) {
            s<T> sVar = this.e.e;
            V v = sVar.a;
            if (v != null) {
                u uVar = this.e;
                synchronized (uVar) {
                    Iterator it = new ArrayList(uVar.b).iterator();
                    while (it.hasNext()) {
                        ((o) it.next()).a(v);
                    }
                }
                return;
            }
            u uVar2 = this.e;
            Throwable th = sVar.b;
            synchronized (uVar2) {
                ArrayList arrayList = new ArrayList(uVar2.f716c);
                if (arrayList.isEmpty()) {
                    c.c("Lottie encountered an error but no failure listener was added:", th);
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((o) it2.next()).a(th);
                    }
                }
            }
        }
    }
}
