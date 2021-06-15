package g.n;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class v {
    public final HashMap<String, t> a = new HashMap<>();

    public final void a() {
        for (t tVar : this.a.values()) {
            tVar.b = true;
            Map<String, Object> map = tVar.a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : tVar.a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            tVar.a();
        }
        this.a.clear();
    }
}
