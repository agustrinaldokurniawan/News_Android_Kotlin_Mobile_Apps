package c.e.a.a.t;

import android.graphics.Typeface;
import android.text.TextPaint;

public class c extends d {
    public final /* synthetic */ TextPaint a;
    public final /* synthetic */ d b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f1329c;

    public c(b bVar, TextPaint textPaint, d dVar) {
        this.f1329c = bVar;
        this.a = textPaint;
        this.b = dVar;
    }

    @Override // c.e.a.a.t.d
    public void a(int i2) {
        this.b.a(i2);
    }

    @Override // c.e.a.a.t.d
    public void b(Typeface typeface, boolean z) {
        this.f1329c.d(this.a, typeface);
        this.b.b(typeface, z);
    }
}
