package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tsuga.news.R;
import g.b.b;
import g.b.f.i.i;
import g.b.f.i.n;
import g.b.g.z0;
import g.h.j.o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    public i e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f61f;

    /* renamed from: g  reason: collision with root package name */
    public RadioButton f62g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f63h;

    /* renamed from: i  reason: collision with root package name */
    public CheckBox f64i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f65j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f66k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f67l;

    /* renamed from: m  reason: collision with root package name */
    public LinearLayout f68m;
    public Drawable n;
    public int o;
    public Context p;
    public boolean q;
    public Drawable r;
    public boolean s;
    public LayoutInflater t;
    public boolean u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z0 q2 = z0.q(getContext(), attributeSet, b.q, R.attr.listMenuViewStyle, 0);
        this.n = q2.g(5);
        this.o = q2.l(1, -1);
        this.q = q2.a(7, false);
        this.p = context;
        this.r = q2.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.s = obtainStyledAttributes.hasValue(0);
        q2.b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f66k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f64i = checkBox;
        LinearLayout linearLayout = this.f68m;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f67l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f67l.getLayoutParams();
            rect.top = this.f67l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f62g = radioButton;
        LinearLayout linearLayout = this.f68m;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void c(boolean z) {
        String str;
        int i2;
        int i3 = (!z || !this.e.m()) ? 8 : 0;
        if (i3 == 0) {
            TextView textView = this.f65j;
            i iVar = this.e;
            char e2 = iVar.e();
            if (e2 == 0) {
                str = "";
            } else {
                Resources resources = iVar.n.b.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar.n.b).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = iVar.n.n() ? iVar.f2006k : iVar.f2004i;
                i.c(sb, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                i.c(sb, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                i.c(sb, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                i.c(sb, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                i.c(sb, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                i.c(sb, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e2 == '\b') {
                    i2 = R.string.abc_menu_delete_shortcut_label;
                } else if (e2 == '\n') {
                    i2 = R.string.abc_menu_enter_shortcut_label;
                } else if (e2 != ' ') {
                    sb.append(e2);
                    str = sb.toString();
                } else {
                    i2 = R.string.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i2));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f65j.getVisibility() != i3) {
            this.f65j.setVisibility(i3);
        }
    }

    @Override // g.b.f.i.n.a
    public void d(i iVar, int i2) {
        this.e = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.e);
        setCheckable(iVar.isCheckable());
        boolean m2 = iVar.m();
        iVar.e();
        c(m2);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    @Override // g.b.f.i.n.a
    public i getItemData() {
        return this.e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.n;
        AtomicInteger atomicInteger = o.a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f63h = textView;
        int i2 = this.o;
        if (i2 != -1) {
            textView.setTextAppearance(this.p, i2);
        }
        this.f65j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f66k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.r);
        }
        this.f67l = (ImageView) findViewById(R.id.group_divider);
        this.f68m = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i2, int i3) {
        if (this.f61f != null && this.q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f61f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f62g != null || this.f64i != null) {
            if (this.e.h()) {
                if (this.f62g == null) {
                    b();
                }
                compoundButton2 = this.f62g;
                compoundButton = this.f64i;
            } else {
                if (this.f64i == null) {
                    a();
                }
                compoundButton2 = this.f64i;
                compoundButton = this.f62g;
            }
            if (z) {
                compoundButton2.setChecked(this.e.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f64i;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f62g;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.e.h()) {
            if (this.f62g == null) {
                b();
            }
            compoundButton = this.f62g;
        } else {
            if (this.f64i == null) {
                a();
            }
            compoundButton = this.f64i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.u = z;
        this.q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f67l;
        if (imageView != null) {
            imageView.setVisibility((this.s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.e.n);
        boolean z = this.u;
        if (z || this.q) {
            ImageView imageView = this.f61f;
            if (imageView != null || drawable != null || this.q) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.f61f = imageView2;
                    LinearLayout linearLayout = this.f68m;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.q) {
                    ImageView imageView3 = this.f61f;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f61f.getVisibility() != 0) {
                        this.f61f.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f61f.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.f63h.setText(charSequence);
            if (this.f63h.getVisibility() != 0) {
                textView = this.f63h;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.f63h.getVisibility() != 8) {
                textView = this.f63h;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
