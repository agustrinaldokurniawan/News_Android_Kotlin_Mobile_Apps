package c.e.a.a.w;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;

public class j {
    public d a;
    public d b;

    /* renamed from: c  reason: collision with root package name */
    public d f1357c;

    /* renamed from: d  reason: collision with root package name */
    public d f1358d;
    public c e;

    /* renamed from: f  reason: collision with root package name */
    public c f1359f;

    /* renamed from: g  reason: collision with root package name */
    public c f1360g;

    /* renamed from: h  reason: collision with root package name */
    public c f1361h;

    /* renamed from: i  reason: collision with root package name */
    public f f1362i;

    /* renamed from: j  reason: collision with root package name */
    public f f1363j;

    /* renamed from: k  reason: collision with root package name */
    public f f1364k;

    /* renamed from: l  reason: collision with root package name */
    public f f1365l;

    public j() {
        this.a = new i();
        this.b = new i();
        this.f1357c = new i();
        this.f1358d = new i();
        this.e = new a(0.0f);
        this.f1359f = new a(0.0f);
        this.f1360g = new a(0.0f);
        this.f1361h = new a(0.0f);
        this.f1362i = new f();
        this.f1363j = new f();
        this.f1364k = new f();
        this.f1365l = new f();
    }

    public static b a(Context context, int i2, int i3, c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, c.e.a.a.b.x);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            c c2 = c(obtainStyledAttributes, 5, cVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            b bVar = new b();
            d c7 = c.e.a.a.a.c(i5);
            bVar.a = c7;
            b.b(c7);
            bVar.e = c3;
            d c8 = c.e.a.a.a.c(i6);
            bVar.b = c8;
            b.b(c8);
            bVar.f1368f = c4;
            d c9 = c.e.a.a.a.c(i7);
            bVar.f1366c = c9;
            b.b(c9);
            bVar.f1369g = c5;
            d c10 = c.e.a.a.a.c(i8);
            bVar.f1367d = c10;
            b.b(c10);
            bVar.f1370h = c6;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.e.a.a.b.r, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public boolean d(RectF rectF) {
        boolean z = this.f1365l.getClass().equals(f.class) && this.f1363j.getClass().equals(f.class) && this.f1362i.getClass().equals(f.class) && this.f1364k.getClass().equals(f.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f1359f.a(rectF) > a2 ? 1 : (this.f1359f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f1361h.a(rectF) > a2 ? 1 : (this.f1361h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f1360g.a(rectF) > a2 ? 1 : (this.f1360g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof i) && (this.a instanceof i) && (this.f1357c instanceof i) && (this.f1358d instanceof i));
    }

    public j e(float f2) {
        b bVar = new b(this);
        bVar.c(f2);
        return bVar.a();
    }

    public static final class b {
        public d a = new i();
        public d b = new i();

        /* renamed from: c  reason: collision with root package name */
        public d f1366c = new i();

        /* renamed from: d  reason: collision with root package name */
        public d f1367d = new i();
        public c e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f1368f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public c f1369g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f1370h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public f f1371i = new f();

        /* renamed from: j  reason: collision with root package name */
        public f f1372j = new f();

        /* renamed from: k  reason: collision with root package name */
        public f f1373k = new f();

        /* renamed from: l  reason: collision with root package name */
        public f f1374l = new f();

        public b() {
        }

        public static float b(d dVar) {
            Object obj;
            if (dVar instanceof i) {
                obj = (i) dVar;
            } else if (!(dVar instanceof e)) {
                return -1.0f;
            } else {
                obj = (e) dVar;
            }
            Objects.requireNonNull(obj);
            return -1.0f;
        }

        public j a() {
            return new j(this, null);
        }

        public b c(float f2) {
            this.e = new a(f2);
            this.f1368f = new a(f2);
            this.f1369g = new a(f2);
            this.f1370h = new a(f2);
            return this;
        }

        public b d(float f2) {
            this.f1370h = new a(f2);
            return this;
        }

        public b e(float f2) {
            this.f1369g = new a(f2);
            return this;
        }

        public b f(float f2) {
            this.e = new a(f2);
            return this;
        }

        public b g(float f2) {
            this.f1368f = new a(f2);
            return this;
        }

        public b(j jVar) {
            this.a = jVar.a;
            this.b = jVar.b;
            this.f1366c = jVar.f1357c;
            this.f1367d = jVar.f1358d;
            this.e = jVar.e;
            this.f1368f = jVar.f1359f;
            this.f1369g = jVar.f1360g;
            this.f1370h = jVar.f1361h;
            this.f1371i = jVar.f1362i;
            this.f1372j = jVar.f1363j;
            this.f1373k = jVar.f1364k;
            this.f1374l = jVar.f1365l;
        }
    }

    public j(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f1357c = bVar.f1366c;
        this.f1358d = bVar.f1367d;
        this.e = bVar.e;
        this.f1359f = bVar.f1368f;
        this.f1360g = bVar.f1369g;
        this.f1361h = bVar.f1370h;
        this.f1362i = bVar.f1371i;
        this.f1363j = bVar.f1372j;
        this.f1364k = bVar.f1373k;
        this.f1365l = bVar.f1374l;
    }
}
