package g.p.u;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import g.l.b.b0;
import g.p.j;
import g.p.q;
import java.util.ArrayDeque;
import java.util.Iterator;

@q.b("fragment")
public class a extends q<C0091a> {
    public final Context a;
    public final b0 b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2881c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayDeque<Integer> f2882d = new ArrayDeque<>();

    /* renamed from: g.p.u.a$a  reason: collision with other inner class name */
    public static class C0091a extends j {

        /* renamed from: m  reason: collision with root package name */
        public String f2883m;

        public C0091a(q<? extends C0091a> qVar) {
            super(qVar);
        }

        @Override // g.p.j
        public void e(Context context, AttributeSet attributeSet) {
            super.e(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, c.b);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f2883m = string;
            }
            obtainAttributes.recycle();
        }

        @Override // g.p.j
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f2883m;
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public static final class b implements q.a {
    }

    public a(Context context, b0 b0Var, int i2) {
        this.a = context;
        this.b = b0Var;
        this.f2881c = i2;
    }

    /* Return type fixed from 'g.p.j' to match base method */
    @Override // g.p.q
    public C0091a a() {
        return new C0091a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g.p.j, android.os.Bundle, g.p.o, g.p.q$a] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019d  */
    @Override // g.p.q
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g.p.j b(g.p.u.a.C0091a r9, android.os.Bundle r10, g.p.o r11, g.p.q.a r12) {
        /*
        // Method dump skipped, instructions count: 439
        */
        throw new UnsupportedOperationException("Method not decompiled: g.p.u.a.b(g.p.j, android.os.Bundle, g.p.o, g.p.q$a):g.p.j");
    }

    @Override // g.p.q
    public void c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            this.f2882d.clear();
            for (int i2 : intArray) {
                this.f2882d.add(Integer.valueOf(i2));
            }
        }
    }

    @Override // g.p.q
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f2882d.size()];
        Iterator<Integer> it = this.f2882d.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // g.p.q
    public boolean e() {
        if (this.f2882d.isEmpty()) {
            return false;
        }
        if (this.b.S()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        b0 b0Var = this.b;
        b0Var.A(new b0.m(f(this.f2882d.size(), this.f2882d.peekLast().intValue()), -1, 1), false);
        this.f2882d.removeLast();
        return true;
    }

    public final String f(int i2, int i3) {
        return i2 + "-" + i3;
    }
}
