package g.b.c;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import com.tsuga.news.R;
import g.b.g.k0;
import g.h.j.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class d extends o implements DialogInterface {

    /* renamed from: g  reason: collision with root package name */
    public final AlertController f1866g = new AlertController(getContext(), this, getWindow());

    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(Context context) {
            int c2 = d.c(context, 0);
            this.a = new AlertController.b(new ContextThemeWrapper(context, d.c(context, c2)));
            this.b = c2;
        }

        public d a() {
            d dVar = new d(this.a.a, this.b);
            AlertController.b bVar = this.a;
            AlertController alertController = dVar.f1866g;
            View view = bVar.e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f50d;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f49c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            if (bVar.f52g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.L, (ViewGroup) null);
                int i2 = bVar.f54i ? alertController.N : alertController.O;
                ListAdapter listAdapter = bVar.f52g;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.a, i2, 16908308, null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.f55j;
                if (bVar.f53h != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                }
                if (bVar.f54i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f41g = recycleListView;
            }
            Objects.requireNonNull(this.a);
            dVar.setCancelable(true);
            Objects.requireNonNull(this.a);
            dVar.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.a);
            dVar.setOnCancelListener(null);
            Objects.requireNonNull(this.a);
            dVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.a.f51f;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }
    }

    public d(Context context, int i2) {
        super(context, c(context, i2));
    }

    public static int c(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // g.b.c.o
    public void onCreate(Bundle bundle) {
        boolean z;
        View view;
        ListAdapter listAdapter;
        View findViewById;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.f1866g;
        int i2 = alertController.K;
        alertController.b.setContentView(alertController.J);
        View findViewById2 = alertController.f38c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = alertController.f42h;
        int i3 = 0;
        if (view2 == null) {
            view2 = alertController.f43i != 0 ? LayoutInflater.from(alertController.a).inflate(alertController.f43i, viewGroup, false) : null;
        }
        boolean z2 = view2 != null;
        if (!z2 || !AlertController.a(view2)) {
            alertController.f38c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.f38c.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.f44j, alertController.f45k, alertController.f46l, alertController.f47m);
            }
            if (alertController.f41g != null) {
                ((LinearLayout.LayoutParams) ((k0.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d2 = alertController.d(findViewById6, findViewById3);
        ViewGroup d3 = alertController.d(findViewById7, findViewById4);
        ViewGroup d4 = alertController.d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f38c.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d3.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f40f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f41g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f41g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d3.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) d4.findViewById(16908313);
        alertController.o = button2;
        button2.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.p) || alertController.r != null) {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                int i4 = alertController.f39d;
                drawable.setBounds(0, 0, i4, i4);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            z = true;
        } else {
            alertController.o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) d4.findViewById(16908314);
        alertController.s = button3;
        button3.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.t) || alertController.v != null) {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                int i5 = alertController.f39d;
                drawable2.setBounds(0, 0, i5, i5);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            z |= true;
        } else {
            alertController.s.setVisibility(8);
        }
        Button button4 = (Button) d4.findViewById(16908315);
        alertController.w = button4;
        button4.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.x) || alertController.z != null) {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                int i6 = alertController.f39d;
                drawable3.setBounds(0, 0, i6, i6);
                view = null;
                alertController.w.setCompoundDrawables(alertController.z, null, null, null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            z |= true;
        } else {
            alertController.w.setVisibility(8);
            view = null;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                button = alertController.o;
            } else if (z) {
                button = alertController.s;
            } else if (z) {
                button = alertController.w;
            }
            alertController.b(button);
        }
        if (!(z)) {
            d4.setVisibility(8);
        }
        if (alertController.G != null) {
            d2.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f38c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.f38c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.e)) || !alertController.P) {
                alertController.f38c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                d2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f38c.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i7 = alertController.B;
                if (i7 != 0) {
                    alertController.D.setImageResource(i7);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i8 = (d2 == null || d2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = d4.getVisibility() != 8;
        if (!z4 && (findViewById = d3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i8 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f40f == null && alertController.f41g == null) ? view : d2.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = d3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f41g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z4 || i8 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i8 != 0 ? recycleListView.getPaddingTop() : recycleListView.e, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f48f);
            }
        }
        if (!z3) {
            View view3 = alertController.f41g;
            if (view3 == null) {
                view3 = alertController.A;
            }
            if (view3 != null) {
                if (z4) {
                    i3 = 2;
                }
                View findViewById11 = alertController.f38c.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.f38c.findViewById(R.id.scrollIndicatorDown);
                AtomicInteger atomicInteger = o.a;
                view3.setScrollIndicators(i8 | i3, 3);
                if (findViewById11 != null) {
                    d3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    d3.removeView(findViewById12);
                }
            }
        }
        ListView listView2 = alertController.f41g;
        if (listView2 != null && (listAdapter = alertController.H) != null) {
            listView2.setAdapter(listAdapter);
            int i9 = alertController.I;
            if (i9 > -1) {
                listView2.setItemChecked(i9, true);
                listView2.setSelection(i9);
            }
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1866g.A;
        if (nestedScrollView != null && nestedScrollView.l(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1866g.A;
        if (nestedScrollView != null && nestedScrollView.l(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.app.Dialog, g.b.c.o
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f1866g;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
