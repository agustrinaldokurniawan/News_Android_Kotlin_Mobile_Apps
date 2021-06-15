package c.e.a.a.r;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class p extends ImageButton {
    public int e;

    public final void b(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.e = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.e;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.e = i2;
    }
}
