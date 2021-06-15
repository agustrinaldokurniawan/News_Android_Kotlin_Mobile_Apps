package g.h.i;

import java.util.Objects;

public class b<F, S> {
    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        Objects.requireNonNull((b) obj);
        return Objects.equals(null, null) && Objects.equals(null, null);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "Pair{null null}";
    }
}
