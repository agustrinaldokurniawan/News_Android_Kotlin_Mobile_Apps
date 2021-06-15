package c.e.a.a.z;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class m {
    public TextInputLayout a;
    public Context b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f1425c;

    public m(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        this.b = textInputLayout.getContext();
        this.f1425c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i2) {
        return true;
    }

    public void c(boolean z) {
    }
}
