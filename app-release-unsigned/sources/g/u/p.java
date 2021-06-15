package g.u;

import android.view.View;
import c.c.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p {
    public final Map<String, Object> a = new HashMap();
    public View b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<h> f3058c = new ArrayList<>();

    @Deprecated
    public p() {
    }

    public p(View view) {
        this.b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.b == pVar.b && this.a.equals(pVar.a);
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder f2 = a.f("TransitionValues@");
        f2.append(Integer.toHexString(hashCode()));
        f2.append(":\n");
        StringBuilder h2 = a.h(f2.toString(), "    view = ");
        h2.append(this.b);
        h2.append("\n");
        String q = a.q(h2.toString(), "    values:");
        for (String str : this.a.keySet()) {
            q = q + "    " + str + ": " + this.a.get(str) + "\n";
        }
        return q;
    }
}
