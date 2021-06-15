package g.b.g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

public class i {
    public final CompoundButton a;
    public ColorStateList b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f2102c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2103d = false;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2104f;

    public i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable buttonDrawable = this.a.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.f2103d || this.e) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.f2103d) {
                mutate.setTintList(this.b);
            }
            if (this.e) {
                mutate.setTintMode(this.f2102c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g.i.b(android.util.AttributeSet, int):void");
    }
}
