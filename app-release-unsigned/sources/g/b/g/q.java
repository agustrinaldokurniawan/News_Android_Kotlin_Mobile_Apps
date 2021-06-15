package g.b.g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import g.h.d.k.a;

public class q {
    public static final int[] a = {16843067, 16843068};
    public final ProgressBar b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f2147c;

    public q(ProgressBar progressBar) {
        this.b = progressBar;
    }

    public void a(AttributeSet attributeSet, int i2) {
        z0 q = z0.q(this.b.getContext(), attributeSet, a, i2, 0);
        Drawable h2 = q.h(0);
        if (h2 != null) {
            ProgressBar progressBar = this.b;
            if (h2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) h2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable b2 = b(animationDrawable.getFrame(i3), true);
                    b2.setLevel(10000);
                    animationDrawable2.addFrame(b2, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                h2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(h2);
        }
        Drawable h3 = q.h(1);
        if (h3 != null) {
            this.b.setProgressDrawable(b(h3, false));
        }
        q.b.recycle();
    }

    public final Drawable b(Drawable drawable, boolean z) {
        if (drawable instanceof a) {
            a aVar = (a) drawable;
            Drawable a2 = aVar.a();
            if (a2 != null) {
                aVar.b(b(a2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                int id = layerDrawable.getId(i2);
                drawableArr[i2] = b(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                layerDrawable2.setId(i3, layerDrawable.getId(i3));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2147c == null) {
                this.f2147c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
