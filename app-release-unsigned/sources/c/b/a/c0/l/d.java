package c.b.a.c0.l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import c.b.a.a0.c.a;
import c.b.a.a0.c.p;
import c.b.a.b0.b;
import c.b.a.f0.g;
import c.b.a.g0.c;
import c.b.a.m;
import c.b.a.n;
import c.b.a.r;
import java.io.IOException;

public class d extends b {
    public final Rect A = new Rect();
    public final Rect B = new Rect();
    public a<ColorFilter, ColorFilter> C;
    public final Paint z = new c.b.a.a0.a(3);

    public d(m mVar, e eVar) {
        super(mVar, eVar);
    }

    @Override // c.b.a.a0.b.e, c.b.a.c0.l.b
    public void a(RectF rectF, Matrix matrix, boolean z2) {
        super.a(rectF, matrix, z2);
        Bitmap t = t();
        if (t != null) {
            rectF.set(0.0f, 0.0f, g.c() * ((float) t.getWidth()), g.c() * ((float) t.getHeight()));
            this.f608m.mapRect(rectF);
        }
    }

    @Override // c.b.a.c0.f, c.b.a.c0.l.b
    public <T> void f(T t, c<T> cVar) {
        this.v.c(t, cVar);
        if (t != r.E) {
            return;
        }
        if (cVar == null) {
            this.C = null;
        } else {
            this.C = new p(cVar, null);
        }
    }

    @Override // c.b.a.c0.l.b
    public void l(Canvas canvas, Matrix matrix, int i2) {
        Bitmap t = t();
        if (t != null && !t.isRecycled()) {
            float c2 = g.c();
            this.z.setAlpha(i2);
            a<ColorFilter, ColorFilter> aVar = this.C;
            if (aVar != null) {
                this.z.setColorFilter(aVar.e());
            }
            canvas.save();
            canvas.concat(matrix);
            this.A.set(0, 0, t.getWidth(), t.getHeight());
            this.B.set(0, 0, (int) (((float) t.getWidth()) * c2), (int) (((float) t.getHeight()) * c2));
            canvas.drawBitmap(t, this.A, this.B, this.z);
            canvas.restore();
        }
    }

    public final Bitmap t() {
        b bVar;
        n nVar;
        Bitmap bitmap;
        String str;
        Throwable e;
        Bitmap bitmap2;
        String str2 = this.o.f612g;
        m mVar = this.n;
        if (mVar.getCallback() == null) {
            bVar = null;
        } else {
            b bVar2 = mVar.n;
            if (bVar2 != null) {
                Drawable.Callback callback = mVar.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                if (!((context == null && bVar2.b == null) || bVar2.b.equals(context))) {
                    mVar.n = null;
                }
            }
            if (mVar.n == null) {
                mVar.n = new b(mVar.getCallback(), mVar.o, mVar.p, mVar.f693f.f666d);
            }
            bVar = mVar.n;
        }
        if (bVar == null || (nVar = bVar.e.get(str2)) == null) {
            return null;
        }
        Bitmap bitmap3 = nVar.e;
        if (bitmap3 != null) {
            return bitmap3;
        }
        c.b.a.b bVar3 = bVar.f523d;
        if (bVar3 != null) {
            bitmap = bVar3.a(nVar);
            if (bitmap == null) {
                return bitmap;
            }
        } else {
            String str3 = nVar.f705d;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                try {
                    if (!TextUtils.isEmpty(bVar.f522c)) {
                        try {
                            bitmap2 = g.e(BitmapFactory.decodeStream(bVar.b.getAssets().open(bVar.f522c + str3), null, options), nVar.a, nVar.b);
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            str = "Unable to decode image.";
                            c.b.a.f0.c.c(str, e);
                            return null;
                        }
                    } else {
                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                    }
                } catch (IOException e3) {
                    e = e3;
                    str = "Unable to open asset.";
                    c.b.a.f0.c.c(str, e);
                    return null;
                }
            } else {
                try {
                    byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                    bitmap2 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    str = "data URL did not have correct base64 format.";
                    c.b.a.f0.c.c(str, e);
                    return null;
                }
            }
            bitmap = bitmap2;
        }
        bVar.a(str2, bitmap);
        return bitmap;
    }
}
