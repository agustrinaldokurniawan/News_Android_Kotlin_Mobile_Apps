package g.b.g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import g.b.a;
import g.h.b.d;

public class h extends CheckedTextView {
    public static final int[] e = {16843016};

    /* renamed from: f  reason: collision with root package name */
    public final z f2092f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        w0.a(context);
        u0.a(this, getContext());
        z zVar = new z(this);
        this.f2092f = zVar;
        zVar.e(attributeSet, 16843720);
        zVar.b();
        z0 q = z0.q(getContext(), attributeSet, e, 16843720, 0);
        setCheckMarkDrawable(q.g(0));
        q.b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        z zVar = this.f2092f;
        if (zVar != null) {
            zVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.e(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(g.b.d.a.a.a(getContext(), i2));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d.C(this, callback));
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        z zVar = this.f2092f;
        if (zVar != null) {
            zVar.f(context, i2);
        }
    }
}
