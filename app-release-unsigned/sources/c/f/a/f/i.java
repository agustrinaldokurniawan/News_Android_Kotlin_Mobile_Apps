package c.f.a.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import i.s.c.h;

public final class i {
    public static final void a(View view, Drawable drawable, Drawable drawable2) {
        h.f(view, "$this$setCustomRipple");
        h.f(drawable, "selectedBackground");
        h.f(drawable2, "mask");
        Context context = view.getContext();
        h.b(context, "context");
        h.f(context, "$this$getValueFromAttr");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843820, typedValue, true);
        ColorStateList valueOf = ColorStateList.valueOf(typedValue.data);
        h.b(valueOf, "ColorStateList.valueOf(highlightColor)");
        Drawable rippleDrawable = new RippleDrawable(valueOf, null, drawable2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        view.setBackground(stateListDrawable);
        view.setForeground(rippleDrawable);
    }
}
