package g.l.b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class z implements LayoutInflater.Factory2 {
    public final b0 e;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ h0 e;

        public a(h0 h0Var) {
            this.e = h0Var;
        }

        public void onViewAttachedToWindow(View view) {
            h0 h0Var = this.e;
            m mVar = h0Var.f2691c;
            h0Var.k();
            x0.f((ViewGroup) mVar.J.getParent(), z.this.e).e();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public z(b0 b0Var) {
        this.e = b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l.b.z.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
