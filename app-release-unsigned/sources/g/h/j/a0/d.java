package g.h.j.a0;

import android.view.inputmethod.InputContentInfo;

public final class d {
    public final b a;

    public static final class a implements b {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.a;
        }

        public void b() {
            this.a.requestPermission();
        }
    }

    public interface b {
    }

    public d(b bVar) {
        this.a = bVar;
    }
}
