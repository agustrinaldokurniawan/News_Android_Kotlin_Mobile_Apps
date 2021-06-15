package c.e.a.a.b0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;

public class f implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector e;

    public f(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.e = gestureDetector;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }
}
