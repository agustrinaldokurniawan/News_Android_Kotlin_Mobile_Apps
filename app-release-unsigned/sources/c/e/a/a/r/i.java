package c.e.a.a.r;

import android.graphics.Typeface;
import android.text.TextPaint;
import c.e.a.a.t.d;
import java.lang.ref.WeakReference;

public class i {
    public final TextPaint a = new TextPaint(1);
    public final d b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f1310c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1311d = true;
    public WeakReference<b> e = new WeakReference<>(null);

    /* renamed from: f  reason: collision with root package name */
    public c.e.a.a.t.b f1312f;

    public class a extends d {
        public a() {
        }

        @Override // c.e.a.a.t.d
        public void a(int i2) {
            i iVar = i.this;
            iVar.f1311d = true;
            b bVar = iVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // c.e.a.a.t.d
        public void b(Typeface typeface, boolean z) {
            if (!z) {
                i iVar = i.this;
                iVar.f1311d = true;
                b bVar = iVar.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        if (!this.f1311d) {
            return this.f1310c;
        }
        float measureText = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.f1310c = measureText;
        this.f1311d = false;
        return measureText;
    }
}
