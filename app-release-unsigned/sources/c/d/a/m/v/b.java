package c.d.a.m.v;

import c.d.a.m.v.a;
import java.util.Objects;

public class b implements Runnable {
    public final /* synthetic */ a e;

    public b(a aVar) {
        this.e = aVar;
    }

    public void run() {
        a aVar = this.e;
        Objects.requireNonNull(aVar);
        while (true) {
            try {
                aVar.b((a.b) aVar.f849c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
