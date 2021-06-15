package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import c.b.a.c0.e;
import c.b.a.f;
import c.b.a.g;
import c.b.a.h;
import c.b.a.i;
import c.b.a.j;
import c.b.a.k;
import c.b.a.l;
import c.b.a.m;
import c.b.a.o;
import c.b.a.q;
import c.b.a.r;
import c.b.a.u;
import c.b.a.v;
import c.b.a.w;
import c.b.a.x;
import c.b.a.y;
import c.b.a.z;
import com.tsuga.news.R;
import g.b.g.n;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;

public class LottieAnimationView extends n {

    /* renamed from: g  reason: collision with root package name */
    public static final String f1586g = LottieAnimationView.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    public static final o<Throwable> f1587h = new a();
    public g A;

    /* renamed from: i  reason: collision with root package name */
    public final o<g> f1588i = new b();

    /* renamed from: j  reason: collision with root package name */
    public final o<Throwable> f1589j = new c();

    /* renamed from: k  reason: collision with root package name */
    public o<Throwable> f1590k;

    /* renamed from: l  reason: collision with root package name */
    public int f1591l;

    /* renamed from: m  reason: collision with root package name */
    public final m f1592m;
    public boolean n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public x w;
    public final Set<q> x;
    public int y;
    public u<g> z;

    public class a implements o<Throwable> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // c.b.a.o
        public void a(Throwable th) {
            Throwable th2 = th;
            ThreadLocal<PathMeasure> threadLocal = c.b.a.f0.g.a;
            if ((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException)) {
                c.b.a.f0.c.c("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    }

    public class b implements o<g> {
        public b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // c.b.a.o
        public void a(g gVar) {
            LottieAnimationView.this.setComposition(gVar);
        }
    }

    public class c implements o<Throwable> {
        public c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // c.b.a.o
        public void a(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i2 = lottieAnimationView.f1591l;
            if (i2 != 0) {
                lottieAnimationView.setImageResource(i2);
            }
            o<Throwable> oVar = LottieAnimationView.this.f1590k;
            if (oVar == null) {
                String str = LottieAnimationView.f1586g;
                oVar = LottieAnimationView.f1587h;
            }
            oVar.a(th2);
        }
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public String e;

        /* renamed from: f  reason: collision with root package name */
        public int f1593f;

        /* renamed from: g  reason: collision with root package name */
        public float f1594g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1595h;

        /* renamed from: i  reason: collision with root package name */
        public String f1596i;

        /* renamed from: j  reason: collision with root package name */
        public int f1597j;

        /* renamed from: k  reason: collision with root package name */
        public int f1598k;

        public class a implements Parcelable.Creator<d> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d(Parcel parcel, a aVar) {
            super(parcel);
            this.e = parcel.readString();
            this.f1594g = parcel.readFloat();
            this.f1595h = parcel.readInt() != 1 ? false : true;
            this.f1596i = parcel.readString();
            this.f1597j = parcel.readInt();
            this.f1598k = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.e);
            parcel.writeFloat(this.f1594g);
            parcel.writeInt(this.f1595h ? 1 : 0);
            parcel.writeString(this.f1596i);
            parcel.writeInt(this.f1597j);
            parcel.writeInt(this.f1598k);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        boolean z2 = false;
        this.f1591l = 0;
        m mVar = new m();
        this.f1592m = mVar;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = x.AUTOMATIC;
        this.x = new HashSet();
        this.y = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, w.a, R.attr.lottieAnimationViewStyle, 0);
        this.v = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
            if (obtainStyledAttributes.getBoolean(0, false)) {
                this.s = true;
                this.u = true;
            }
            if (obtainStyledAttributes.getBoolean(8, false)) {
                mVar.f694g.setRepeatCount(-1);
            }
            if (obtainStyledAttributes.hasValue(13)) {
                setRepeatMode(obtainStyledAttributes.getInt(13, 1));
            }
            if (obtainStyledAttributes.hasValue(12)) {
                setRepeatCount(obtainStyledAttributes.getInt(12, -1));
            }
            if (obtainStyledAttributes.hasValue(15)) {
                setSpeed(obtainStyledAttributes.getFloat(15, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(7));
            setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
            boolean z3 = obtainStyledAttributes.getBoolean(3, false);
            if (mVar.r != z3) {
                mVar.r = z3;
                if (mVar.f693f != null) {
                    mVar.c();
                }
            }
            if (obtainStyledAttributes.hasValue(2)) {
                int resourceId2 = obtainStyledAttributes.getResourceId(2, -1);
                Context context2 = getContext();
                ThreadLocal<TypedValue> threadLocal = g.b.d.a.a.a;
                mVar.a(new e("**"), r.E, new c.b.a.g0.c(new y(context2.getColorStateList(resourceId2).getDefaultColor())));
            }
            if (obtainStyledAttributes.hasValue(14)) {
                mVar.f695h = obtainStyledAttributes.getFloat(14, 1.0f);
            }
            if (obtainStyledAttributes.hasValue(11)) {
                int i2 = obtainStyledAttributes.getInt(11, 0);
                x.values();
                setRenderMode(x.values()[i2 >= 3 ? 0 : i2]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(6, false));
            obtainStyledAttributes.recycle();
            Context context3 = getContext();
            ThreadLocal<PathMeasure> threadLocal2 = c.b.a.f0.g.a;
            Boolean valueOf = Boolean.valueOf(Settings.Global.getFloat(context3.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f ? true : z2);
            Objects.requireNonNull(mVar);
            mVar.f696i = valueOf.booleanValue();
            d();
            this.n = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    private void setCompositionTask(u<g> uVar) {
        this.A = null;
        this.f1592m.d();
        c();
        uVar.b(this.f1588i);
        uVar.a(this.f1589j);
        this.z = uVar;
    }

    public void buildDrawingCache(boolean z2) {
        this.y++;
        super.buildDrawingCache(z2);
        if (this.y == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z2) == null) {
            setRenderMode(x.HARDWARE);
        }
        this.y--;
        c.b.a.d.a("buildDrawingCache");
    }

    public final void c() {
        u<g> uVar = this.z;
        if (uVar != null) {
            o<g> oVar = this.f1588i;
            synchronized (uVar) {
                uVar.b.remove(oVar);
            }
            u<g> uVar2 = this.z;
            o<Throwable> oVar2 = this.f1589j;
            synchronized (uVar2) {
                uVar2.f716c.remove(oVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r0 != 1) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r6 = this;
            c.b.a.x r0 = r6.w
            int r0 = r0.ordinal()
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x000e
            if (r0 == r2) goto L_0x0030
        L_0x000c:
            r1 = r2
            goto L_0x0030
        L_0x000e:
            c.b.a.g r0 = r6.A
            r3 = 0
            if (r0 == 0) goto L_0x001e
            boolean r4 = r0.n
            if (r4 == 0) goto L_0x001e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L_0x001e
            goto L_0x002e
        L_0x001e:
            if (r0 == 0) goto L_0x0026
            int r0 = r0.o
            r4 = 4
            if (r0 <= r4) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            if (r0 != r4) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x000c
        L_0x0030:
            int r0 = r6.getLayerType()
            if (r1 == r0) goto L_0x003a
            r0 = 0
            r6.setLayerType(r1, r0)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.d():void");
    }

    public boolean e() {
        return this.f1592m.j();
    }

    public void f() {
        this.u = false;
        this.s = false;
        this.r = false;
        this.q = false;
        m mVar = this.f1592m;
        mVar.f699l.clear();
        mVar.f694g.l();
        d();
    }

    public void g() {
        if (isShown()) {
            this.f1592m.k();
            d();
            return;
        }
        this.q = true;
    }

    public g getComposition() {
        return this.A;
    }

    public long getDuration() {
        g gVar = this.A;
        if (gVar != null) {
            return (long) gVar.b();
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.f1592m.f694g.f658j;
    }

    public String getImageAssetsFolder() {
        return this.f1592m.o;
    }

    public float getMaxFrame() {
        return this.f1592m.f();
    }

    public float getMinFrame() {
        return this.f1592m.g();
    }

    public v getPerformanceTracker() {
        g gVar = this.f1592m.f693f;
        if (gVar != null) {
            return gVar.a;
        }
        return null;
    }

    public float getProgress() {
        return this.f1592m.h();
    }

    public int getRepeatCount() {
        return this.f1592m.i();
    }

    public int getRepeatMode() {
        return this.f1592m.f694g.getRepeatMode();
    }

    public float getScale() {
        return this.f1592m.f695h;
    }

    public float getSpeed() {
        return this.f1592m.f694g.f655g;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        m mVar = this.f1592m;
        if (drawable2 == mVar) {
            super.invalidateDrawable(mVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.u || this.s) {
            g();
            this.u = false;
            this.s = false;
        }
    }

    public void onDetachedFromWindow() {
        if (e()) {
            this.s = false;
            this.r = false;
            this.q = false;
            m mVar = this.f1592m;
            mVar.f699l.clear();
            mVar.f694g.cancel();
            d();
            this.s = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        String str = dVar.e;
        this.o = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.o);
        }
        int i2 = dVar.f1593f;
        this.p = i2;
        if (i2 != 0) {
            setAnimation(i2);
        }
        setProgress(dVar.f1594g);
        if (dVar.f1595h) {
            g();
        }
        this.f1592m.o = dVar.f1596i;
        setRepeatMode(dVar.f1597j);
        setRepeatCount(dVar.f1598k);
    }

    public Parcelable onSaveInstanceState() {
        boolean z2;
        d dVar = new d(super.onSaveInstanceState());
        dVar.e = this.o;
        dVar.f1593f = this.p;
        dVar.f1594g = this.f1592m.h();
        if (!this.f1592m.j()) {
            AtomicInteger atomicInteger = g.h.j.o.a;
            if (isAttachedToWindow() || !this.s) {
                z2 = false;
                dVar.f1595h = z2;
                m mVar = this.f1592m;
                dVar.f1596i = mVar.o;
                dVar.f1597j = mVar.f694g.getRepeatMode();
                dVar.f1598k = this.f1592m.i();
                return dVar;
            }
        }
        z2 = true;
        dVar.f1595h = z2;
        m mVar2 = this.f1592m;
        dVar.f1596i = mVar2.o;
        dVar.f1597j = mVar2.f694g.getRepeatMode();
        dVar.f1598k = this.f1592m.i();
        return dVar;
    }

    public void onVisibilityChanged(View view, int i2) {
        if (this.n) {
            if (isShown()) {
                if (this.r) {
                    if (isShown()) {
                        this.f1592m.l();
                        d();
                    } else {
                        this.q = false;
                        this.r = true;
                    }
                } else if (this.q) {
                    g();
                }
                this.r = false;
                this.q = false;
            } else if (e()) {
                f();
                this.r = true;
            }
        }
    }

    public void setAnimation(int i2) {
        u<g> uVar;
        u<g> uVar2;
        this.p = i2;
        this.o = null;
        if (isInEditMode()) {
            uVar = new u<>(new c.b.a.e(this, i2), true);
        } else {
            if (this.v) {
                Context context = getContext();
                String h2 = h.h(context, i2);
                uVar2 = h.a(h2, new k(new WeakReference(context), context.getApplicationContext(), i2, h2));
            } else {
                Context context2 = getContext();
                Map<String, u<g>> map = h.a;
                uVar2 = h.a(null, new k(new WeakReference(context2), context2.getApplicationContext(), i2, null));
            }
            uVar = uVar2;
        }
        setCompositionTask(uVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(h.a(null, new l(new ByteArrayInputStream(str.getBytes()), null)));
    }

    public void setAnimationFromUrl(String str) {
        u<g> uVar;
        if (this.v) {
            Context context = getContext();
            Map<String, u<g>> map = h.a;
            String q2 = c.c.a.a.a.q("url_", str);
            uVar = h.a(q2, new i(context, str, q2));
        } else {
            uVar = h.a(null, new i(getContext(), str, null));
        }
        setCompositionTask(uVar);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.f1592m.w = z2;
    }

    public void setCacheComposition(boolean z2) {
        this.v = z2;
    }

    public void setComposition(g gVar) {
        float f2;
        float f3;
        this.f1592m.setCallback(this);
        this.A = gVar;
        boolean z2 = true;
        this.t = true;
        m mVar = this.f1592m;
        if (mVar.f693f == gVar) {
            z2 = false;
        } else {
            mVar.y = false;
            mVar.d();
            mVar.f693f = gVar;
            mVar.c();
            c.b.a.f0.d dVar = mVar.f694g;
            boolean z3 = dVar.n == null;
            dVar.n = gVar;
            if (z3) {
                f3 = (float) ((int) Math.max(dVar.f660l, gVar.f672k));
                f2 = Math.min(dVar.f661m, gVar.f673l);
            } else {
                f3 = (float) ((int) gVar.f672k);
                f2 = gVar.f673l;
            }
            dVar.o(f3, (float) ((int) f2));
            float f4 = dVar.f658j;
            dVar.f658j = 0.0f;
            dVar.m((float) ((int) f4));
            dVar.d();
            mVar.v(mVar.f694g.getAnimatedFraction());
            mVar.f695h = mVar.f695h;
            Iterator it = new ArrayList(mVar.f699l).iterator();
            while (it.hasNext()) {
                m.o oVar = (m.o) it.next();
                if (oVar != null) {
                    oVar.a(gVar);
                }
                it.remove();
            }
            mVar.f699l.clear();
            gVar.a.a = mVar.u;
            Drawable.Callback callback = mVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(mVar);
            }
        }
        this.t = false;
        d();
        if (getDrawable() != this.f1592m || z2) {
            if (!z2) {
                boolean e = e();
                setImageDrawable(null);
                setImageDrawable(this.f1592m);
                if (e) {
                    this.f1592m.l();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (q qVar : this.x) {
                qVar.a(gVar);
            }
        }
    }

    public void setFailureListener(o<Throwable> oVar) {
        this.f1590k = oVar;
    }

    public void setFallbackResource(int i2) {
        this.f1591l = i2;
    }

    public void setFontAssetDelegate(c.b.a.a aVar) {
        c.b.a.b0.a aVar2 = this.f1592m.q;
    }

    public void setFrame(int i2) {
        this.f1592m.m(i2);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.f1592m.f697j = z2;
    }

    public void setImageAssetDelegate(c.b.a.b bVar) {
        m mVar = this.f1592m;
        mVar.p = bVar;
        c.b.a.b0.b bVar2 = mVar.n;
        if (bVar2 != null) {
            bVar2.f523d = bVar;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f1592m.o = str;
    }

    @Override // g.b.g.n
    public void setImageBitmap(Bitmap bitmap) {
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // g.b.g.n
    public void setImageDrawable(Drawable drawable) {
        c();
        super.setImageDrawable(drawable);
    }

    @Override // g.b.g.n
    public void setImageResource(int i2) {
        c();
        super.setImageResource(i2);
    }

    public void setMaxFrame(int i2) {
        this.f1592m.n(i2);
    }

    public void setMaxFrame(String str) {
        this.f1592m.o(str);
    }

    public void setMaxProgress(float f2) {
        this.f1592m.p(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.f1592m.r(str);
    }

    public void setMinFrame(int i2) {
        this.f1592m.s(i2);
    }

    public void setMinFrame(String str) {
        this.f1592m.t(str);
    }

    public void setMinProgress(float f2) {
        this.f1592m.u(f2);
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        m mVar = this.f1592m;
        if (mVar.v != z2) {
            mVar.v = z2;
            c.b.a.c0.l.c cVar = mVar.s;
            if (cVar != null) {
                cVar.q(z2);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        m mVar = this.f1592m;
        mVar.u = z2;
        g gVar = mVar.f693f;
        if (gVar != null) {
            gVar.a.a = z2;
        }
    }

    public void setProgress(float f2) {
        this.f1592m.v(f2);
    }

    public void setRenderMode(x xVar) {
        this.w = xVar;
        d();
    }

    public void setRepeatCount(int i2) {
        this.f1592m.f694g.setRepeatCount(i2);
    }

    public void setRepeatMode(int i2) {
        this.f1592m.f694g.setRepeatMode(i2);
    }

    public void setSafeMode(boolean z2) {
        this.f1592m.f698k = z2;
    }

    public void setScale(float f2) {
        this.f1592m.f695h = f2;
        if (getDrawable() == this.f1592m) {
            boolean e = e();
            setImageDrawable(null);
            setImageDrawable(this.f1592m);
            if (e) {
                this.f1592m.l();
            }
        }
    }

    public void setSpeed(float f2) {
        this.f1592m.f694g.f655g = f2;
    }

    public void setTextDelegate(z zVar) {
        Objects.requireNonNull(this.f1592m);
    }

    public void unscheduleDrawable(Drawable drawable) {
        m mVar;
        if (!this.t && drawable == (mVar = this.f1592m) && mVar.j()) {
            f();
        } else if (!this.t && (drawable instanceof m)) {
            m mVar2 = (m) drawable;
            if (mVar2.j()) {
                mVar2.f699l.clear();
                mVar2.f694g.l();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimation(String str) {
        u<g> uVar;
        u<g> uVar2;
        this.o = str;
        this.p = 0;
        if (isInEditMode()) {
            uVar = new u<>(new f(this, str), true);
        } else {
            if (this.v) {
                Context context = getContext();
                Map<String, u<g>> map = h.a;
                String q2 = c.c.a.a.a.q("asset_", str);
                uVar2 = h.a(q2, new j(context.getApplicationContext(), str, q2));
            } else {
                Context context2 = getContext();
                Map<String, u<g>> map2 = h.a;
                uVar2 = h.a(null, new j(context2.getApplicationContext(), str, null));
            }
            uVar = uVar2;
        }
        setCompositionTask(uVar);
    }
}
