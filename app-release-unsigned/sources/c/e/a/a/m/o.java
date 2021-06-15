package c.e.a.a.m;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.e.a.a.m.a;
import c.e.a.a.w.g;
import c.e.a.a.w.j;
import com.google.android.material.internal.CheckableImageButton;
import com.tsuga.news.R;
import g.l.b.l;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

public final class o<S> extends l {
    public static final /* synthetic */ int n0 = 0;
    public int A0;
    public TextView B0;
    public CheckableImageButton C0;
    public g D0;
    public Button E0;
    public final LinkedHashSet<q<? super S>> o0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> p0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> q0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> r0 = new LinkedHashSet<>();
    public int s0;
    public d<S> t0;
    public x<S> u0;
    public a v0;
    public g<S> w0;
    public int x0;
    public CharSequence y0;
    public boolean z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Iterator<q<? super S>> it = o.this.o0.iterator();
            while (it.hasNext()) {
                it.next().a(o.this.t0.a());
            }
            o.this.B0(false, false);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            Iterator<View.OnClickListener> it = o.this.p0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            o.this.B0(false, false);
        }
    }

    public class c extends w<S> {
        public c() {
        }

        @Override // c.e.a.a.m.w
        public void a(S s) {
            o oVar = o.this;
            int i2 = o.n0;
            oVar.I0();
            o oVar2 = o.this;
            oVar2.E0.setEnabled(oVar2.t0.f());
        }
    }

    public static int E0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d2 = a0.d();
        d2.set(5, 1);
        Calendar b2 = a0.b(d2);
        b2.get(2);
        b2.get(1);
        int maximum = b2.getMaximum(7);
        b2.getActualMaximum(5);
        b2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean F0(Context context) {
        return G0(context, 16843277);
    }

    public static boolean G0(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.e.a.a.a.s(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), new int[]{i2});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // g.l.b.l
    public final Dialog C0(Bundle bundle) {
        Context o02 = o0();
        Context o03 = o0();
        int i2 = this.s0;
        if (i2 == 0) {
            i2 = this.t0.c(o03);
        }
        Dialog dialog = new Dialog(o02, i2);
        Context context = dialog.getContext();
        this.z0 = F0(context);
        int s = c.e.a.a.a.s(context, R.attr.colorSurface, o.class.getCanonicalName());
        g gVar = new g(j.b(context, null, R.attr.materialCalendarStyle, 2131821203).a());
        this.D0 = gVar;
        gVar.f1340g.b = new c.e.a.a.o.a(context);
        gVar.w();
        this.D0.p(ColorStateList.valueOf(s));
        g gVar2 = this.D0;
        View decorView = dialog.getWindow().getDecorView();
        AtomicInteger atomicInteger = g.h.j.o.a;
        gVar2.o(decorView.getElevation());
        return dialog;
    }

    public final void H0() {
        x<S> xVar;
        Context o02 = o0();
        int i2 = this.s0;
        if (i2 == 0) {
            i2 = this.t0.c(o02);
        }
        d<S> dVar = this.t0;
        a aVar = this.v0;
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f1229h);
        gVar.u0(bundle);
        this.w0 = gVar;
        if (this.C0.isChecked()) {
            d<S> dVar2 = this.t0;
            a aVar2 = this.v0;
            xVar = new r<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dVar2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            xVar.u0(bundle2);
        } else {
            xVar = this.w0;
        }
        this.u0 = xVar;
        I0();
        g.l.b.a aVar3 = new g.l.b.a(j());
        aVar3.e(R.id.mtrl_calendar_frame, this.u0);
        if (!aVar3.f2699g) {
            aVar3.f2700h = false;
            aVar3.q.D(aVar3, false);
            this.u0.B0(new c());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void I0() {
        String b2 = this.t0.b(k());
        this.B0.setContentDescription(String.format(D(R.string.mtrl_picker_announce_current_selection), b2));
        this.B0.setText(b2);
    }

    public final void J0(CheckableImageButton checkableImageButton) {
        this.C0.setContentDescription(checkableImageButton.getContext().getString(this.C0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // g.l.b.m, g.l.b.l
    public final void O(Bundle bundle) {
        super.O(bundle);
        if (bundle == null) {
            bundle = this.f2718k;
        }
        this.s0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.t0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.v0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.x0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.y0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.A0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // g.l.b.m
    public final View R(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.z0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.z0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(E0(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(E0(context), -1));
            Resources resources = o0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i2 = t.e;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i2 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i2) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.B0 = textView;
        AtomicInteger atomicInteger = g.h.j.o.a;
        textView.setAccessibilityLiveRegion(1);
        this.C0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.y0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.x0);
        }
        this.C0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.C0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, g.b.d.a.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], g.b.d.a.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.C0.setChecked(this.A0 != 0);
        g.h.j.o.o(this.C0, null);
        J0(this.C0);
        this.C0.setOnClickListener(new p(this));
        this.E0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.t0.f()) {
            this.E0.setEnabled(true);
        } else {
            this.E0.setEnabled(false);
        }
        this.E0.setTag("CONFIRM_BUTTON_TAG");
        this.E0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // g.l.b.m, g.l.b.l
    public final void d0(Bundle bundle) {
        super.d0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.s0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.t0);
        a.b bVar = new a.b(this.v0);
        s sVar = this.w0.c0;
        if (sVar != null) {
            bVar.e = Long.valueOf(sVar.f1258j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f1234f);
        s l2 = s.l(bVar.f1232c);
        s l3 = s.l(bVar.f1233d);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = bVar.e;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a(l2, l3, cVar, l4 == null ? null : s.l(l4.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.x0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.y0);
    }

    @Override // g.l.b.m, g.l.b.l
    public void e0() {
        super.e0();
        Window window = D0().getWindow();
        if (this.z0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.D0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = z().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.D0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new c.e.a.a.n.a(D0(), rect));
        }
        H0();
    }

    @Override // g.l.b.m, g.l.b.l
    public void f0() {
        this.u0.X.clear();
        this.H = true;
        Dialog dialog = this.i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // g.l.b.l
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.q0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // g.l.b.l
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.r0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
