package c.e.a.a.w;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {
    public final float a;

    public a(float f2) {
        this.a = f2;
    }

    @Override // c.e.a.a.w.c
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a == ((a) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
