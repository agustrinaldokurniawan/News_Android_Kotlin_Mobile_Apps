package c.e.a.a.w;

import android.graphics.RectF;
import java.util.Arrays;

public final class h implements c {
    public final float a;

    public h(float f2) {
        this.a = f2;
    }

    @Override // c.e.a.a.w.c
    public float a(RectF rectF) {
        return rectF.height() * this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.a == ((h) obj).a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
