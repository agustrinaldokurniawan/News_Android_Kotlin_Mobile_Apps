package g.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.tsuga.news.R;
import g.b.g.p0;

public final class j {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public static j b;

    /* renamed from: c  reason: collision with root package name */
    public p0 f2105c;

    public class a implements p0.c {
        public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f2106c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f2107d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f2108f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i2) {
            int c2 = u0.c(context, R.attr.colorControlHighlight);
            int b2 = u0.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{u0.b, u0.f2162d, u0.f2161c, u0.f2163f}, new int[]{b2, g.h.d.a.a(c2, i2), g.h.d.a.a(c2, i2), i2});
        }

        public final LayerDrawable c(p0 p0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable e2 = p0Var.e(context, R.drawable.abc_star_black_48dp);
            Drawable e3 = p0Var.e(context, R.drawable.abc_star_half_black_48dp);
            if ((e2 instanceof BitmapDrawable) && e2.getIntrinsicWidth() == dimensionPixelSize && e2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) e2;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e2.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((e3 instanceof BitmapDrawable) && e3.getIntrinsicWidth() == dimensionPixelSize && e3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) e3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                e3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i2) {
            if (i2 == R.drawable.abc_edit_text_material) {
                ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
                return context.getColorStateList(R.color.abc_tint_edittext);
            } else if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                ThreadLocal<TypedValue> threadLocal2 = g.b.d.a.a.a;
                return context.getColorStateList(R.color.abc_tint_switch_track);
            } else if (i2 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d2 = u0.d(context, R.attr.colorSwitchThumbNormal);
                if (d2 == null || !d2.isStateful()) {
                    iArr[0] = u0.b;
                    iArr2[0] = u0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = u0.e;
                    iArr2[1] = u0.c(context, R.attr.colorControlActivated);
                    iArr[2] = u0.f2163f;
                    iArr2[2] = u0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = u0.b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = u0.e;
                    iArr2[1] = u0.c(context, R.attr.colorControlActivated);
                    iArr[2] = u0.f2163f;
                    iArr2[2] = d2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, u0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i2 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i2 == R.drawable.abc_btn_colored_material) {
                    return b(context, u0.c(context, R.attr.colorAccent));
                }
                if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                    ThreadLocal<TypedValue> threadLocal3 = g.b.d.a.a.a;
                    return context.getColorStateList(R.color.abc_tint_spinner);
                } else if (a(this.b, i2)) {
                    return u0.d(context, R.attr.colorControlNormal);
                } else {
                    if (a(this.e, i2)) {
                        ThreadLocal<TypedValue> threadLocal4 = g.b.d.a.a.a;
                        return context.getColorStateList(R.color.abc_tint_default);
                    } else if (a(this.f2108f, i2)) {
                        ThreadLocal<TypedValue> threadLocal5 = g.b.d.a.a.a;
                        return context.getColorStateList(R.color.abc_tint_btn_checkable);
                    } else if (i2 != R.drawable.abc_seekbar_thumb_material) {
                        return null;
                    } else {
                        ThreadLocal<TypedValue> threadLocal6 = g.b.d.a.a.a;
                        return context.getColorStateList(R.color.abc_tint_seek_thumb);
                    }
                }
            }
        }

        public final void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (g0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.a;
            }
            drawable.setColorFilter(j.c(i2, mode));
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (b == null) {
                e();
            }
            jVar = b;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter g2;
        synchronized (j.class) {
            g2 = p0.g(i2, mode);
        }
        return g2;
    }

    public static synchronized void e() {
        synchronized (j.class) {
            if (b == null) {
                j jVar = new j();
                b = jVar;
                jVar.f2105c = p0.c();
                p0 p0Var = b.f2105c;
                a aVar = new a();
                synchronized (p0Var) {
                    p0Var.f2146j = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, x0 x0Var, int[] iArr) {
        PorterDuff.Mode mode = p0.a;
        if (!g0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = x0Var.f2184d;
            if (z || x0Var.f2183c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? x0Var.a : null;
                PorterDuff.Mode mode2 = x0Var.f2183c ? x0Var.b : p0.a;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = p0.g(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable b(Context context, int i2) {
        return this.f2105c.e(context, i2);
    }

    public synchronized ColorStateList d(Context context, int i2) {
        return this.f2105c.h(context, i2);
    }
}
