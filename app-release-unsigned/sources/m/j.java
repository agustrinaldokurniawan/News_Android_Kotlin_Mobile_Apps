package m;

import java.util.Objects;

public class j extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a0<?> a0Var) {
        super("HTTP " + a0Var.a.f3410h + " " + a0Var.a.f3409g);
        Objects.requireNonNull(a0Var, "response == null");
        int i2 = a0Var.a.f3410h;
    }
}
