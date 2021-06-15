package c.e.a.a.z;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class j implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f1424f;

    public j(h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f1424f = hVar;
        this.e = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f1424f.i()) {
                this.f1424f.f1417i = false;
            }
            h.g(this.f1424f, this.e);
        }
        return false;
    }
}
