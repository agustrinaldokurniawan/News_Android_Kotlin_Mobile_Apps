package g.h.j;

import c.c.a.a.a;
import java.util.Objects;

public final class d {
    public final Object a;

    public d(Object obj) {
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((d) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder f2 = a.f("DisplayCutoutCompat{");
        f2.append(this.a);
        f2.append("}");
        return f2.toString();
    }
}
