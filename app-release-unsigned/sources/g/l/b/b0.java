package g.l.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentContainerView;
import com.tsuga.news.R;
import g.l.b.j0;
import g.l.b.m;
import g.l.b.q0;
import g.n.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ArrayList<a> F;
    public ArrayList<Boolean> G;
    public ArrayList<m> H;
    public ArrayList<n> I;
    public e0 J;
    public Runnable K = new g();
    public final ArrayList<l> a = new ArrayList<>();
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f2642c = new i0();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f2643d;
    public ArrayList<m> e;

    /* renamed from: f  reason: collision with root package name */
    public final z f2644f = new z(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f2645g;

    /* renamed from: h  reason: collision with root package name */
    public final g.a.b f2646h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f2647i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f2648j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, ?> f2649k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public Map<m, HashSet<g.h.f.a>> f2650l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final q0.a f2651m = new d();
    public final a0 n = new a0(this);
    public final CopyOnWriteArrayList<f0> o = new CopyOnWriteArrayList<>();
    public int p = -1;
    public y<?> q;
    public v r;
    public m s;
    public m t;
    public x u = new e();
    public y0 v = new f(this);
    public g.a.e.c<Intent> w;
    public g.a.e.c<?> x;
    public g.a.e.c<String[]> y;
    public ArrayDeque<k> z = new ArrayDeque<>();

    public class a implements g.a.e.b<g.a.e.a> {
        public a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // g.a.e.b
        public void a(g.a.e.a aVar) {
            StringBuilder sb;
            g.a.e.a aVar2 = aVar;
            k pollFirst = b0.this.z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
            } else {
                String str = pollFirst.e;
                int i2 = pollFirst.f2653f;
                m e = b0.this.f2642c.e(str);
                if (e == null) {
                    sb = c.c.a.a.a.h("Intent Sender result delivered for unknown Fragment ", str);
                } else {
                    e.J(i2, aVar2.e, aVar2.f1844f);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class b implements g.a.e.b<Map<String, Boolean>> {
        public b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // g.a.e.b
        @SuppressLint({"SyntheticAccessor"})
        public void a(Map<String, Boolean> map) {
            String str;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            k pollFirst = b0.this.z.pollFirst();
            if (pollFirst == null) {
                str = "No permissions were requested for " + this;
            } else {
                String str2 = pollFirst.e;
                m e = b0.this.f2642c.e(str2);
                if (e == null) {
                    str = c.c.a.a.a.q("Permission request result delivered for unknown Fragment ", str2);
                } else {
                    e.c0();
                    return;
                }
            }
            Log.w("FragmentManager", str);
        }
    }

    public class c extends g.a.b {
        public c(boolean z) {
            super(z);
        }

        @Override // g.a.b
        public void a() {
            b0 b0Var = b0.this;
            b0Var.C(true);
            if (b0Var.f2646h.a) {
                b0Var.W();
            } else {
                b0Var.f2645g.b();
            }
        }
    }

    public class d implements q0.a {
        public d() {
        }

        public void a(m mVar, g.h.f.a aVar) {
            boolean z;
            synchronized (aVar) {
                z = aVar.a;
            }
            if (!z) {
                b0 b0Var = b0.this;
                HashSet<g.h.f.a> hashSet = b0Var.f2650l.get(mVar);
                if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
                    b0Var.f2650l.remove(mVar);
                    if (mVar.f2713f < 5) {
                        b0Var.i(mVar);
                        b0Var.U(mVar, b0Var.p);
                    }
                }
            }
        }

        public void b(m mVar, g.h.f.a aVar) {
            b0 b0Var = b0.this;
            if (b0Var.f2650l.get(mVar) == null) {
                b0Var.f2650l.put(mVar, new HashSet<>());
            }
            b0Var.f2650l.get(mVar).add(aVar);
        }
    }

    public class e extends x {
        public e() {
        }

        @Override // g.l.b.x
        public m a(ClassLoader classLoader, String str) {
            y<?> yVar = b0.this.q;
            Context context = yVar.f2798f;
            Objects.requireNonNull(yVar);
            Object obj = m.e;
            try {
                return (m) x.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new m.c(c.c.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (IllegalAccessException e2) {
                throw new m.c(c.c.a.a.a.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new m.c(c.c.a.a.a.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new m.c(c.c.a.a.a.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    public class f implements y0 {
        public f(b0 b0Var) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            b0.this.C(true);
        }
    }

    public class h implements f0 {
        public final /* synthetic */ m e;

        public h(b0 b0Var, m mVar) {
            this.e = mVar;
        }

        @Override // g.l.b.f0
        public void e(b0 b0Var, m mVar) {
            this.e.M(mVar);
        }
    }

    public class i implements g.a.e.b<g.a.e.a> {
        public i() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // g.a.e.b
        public void a(g.a.e.a aVar) {
            StringBuilder sb;
            g.a.e.a aVar2 = aVar;
            k pollFirst = b0.this.z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
            } else {
                String str = pollFirst.e;
                int i2 = pollFirst.f2653f;
                m e = b0.this.f2642c.e(str);
                if (e == null) {
                    sb = c.c.a.a.a.h("Activity result delivered for unknown Fragment ", str);
                } else {
                    e.J(i2, aVar2.e, aVar2.f1844f);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public static class j extends g.a.e.f.a<?, g.a.e.a> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // g.a.e.f.a
        public g.a.e.a a(int i2, Intent intent) {
            return new g.a.e.a(i2, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();
        public String e;

        /* renamed from: f  reason: collision with root package name */
        public int f2653f;

        public class a implements Parcelable.Creator<k> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public k[] newArray(int i2) {
                return new k[i2];
            }
        }

        public k(Parcel parcel) {
            this.e = parcel.readString();
            this.f2653f = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.e);
            parcel.writeInt(this.f2653f);
        }
    }

    public interface l {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class m implements l {
        public final String a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2654c;

        public m(String str, int i2, int i3) {
            this.a = str;
            this.b = i2;
            this.f2654c = i3;
        }

        @Override // g.l.b.b0.l
        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            m mVar = b0.this.t;
            if (mVar == null || this.b >= 0 || this.a != null || !mVar.j().W()) {
                return b0.this.X(arrayList, arrayList2, this.a, this.b, this.f2654c);
            }
            return false;
        }
    }

    public static class n implements m.e {
        public final boolean a;
        public final a b;

        /* renamed from: c  reason: collision with root package name */
        public int f2656c;

        public void a() {
            boolean z = this.f2656c > 0;
            for (m mVar : this.b.q.L()) {
                mVar.x0(null);
                if (z && mVar.G()) {
                    mVar.A0();
                }
            }
            a aVar = this.b;
            aVar.q.g(aVar, this.a, !z, true);
        }
    }

    public static boolean O(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public void A(l lVar, boolean z2) {
        if (!z2) {
            if (this.q == null) {
                if (this.D) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (S()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.q != null) {
                this.a.add(lVar);
                c0();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void B(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.q == null) {
            if (this.D) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.q.f2799g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !S()) {
            if (this.F == null) {
                this.F = new ArrayList<>();
                this.G = new ArrayList<>();
            }
            this.b = true;
            try {
                F(null, null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean C(boolean z2) {
        boolean z3;
        B(z2);
        boolean z4 = false;
        while (true) {
            ArrayList<a> arrayList = this.F;
            ArrayList<Boolean> arrayList2 = this.G;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z3 = false;
                } else {
                    int size = this.a.size();
                    z3 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z3 |= this.a.get(i2).a(arrayList, arrayList2);
                    }
                    this.a.clear();
                    this.q.f2799g.removeCallbacks(this.K);
                }
            }
            if (z3) {
                this.b = true;
                try {
                    Z(this.F, this.G);
                    e();
                    z4 = true;
                } catch (Throwable th) {
                    e();
                    throw th;
                }
            } else {
                j0();
                x();
                this.f2642c.b();
                return z4;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void D(l lVar, boolean z2) {
        if (!z2 || (this.q != null && !this.D)) {
            B(z2);
            ((a) lVar).a(this.F, this.G);
            this.b = true;
            try {
                Z(this.F, this.G);
                e();
                j0();
                x();
                this.f2642c.b();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
    }

    public final void E(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        int i4;
        int i5;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z2 = arrayList.get(i2).p;
        ArrayList<m> arrayList4 = this.H;
        if (arrayList4 == null) {
            this.H = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.H.addAll(this.f2642c.i());
        m mVar = this.t;
        int i6 = i2;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 < i3) {
                a aVar = arrayList.get(i6);
                int i8 = 3;
                if (!arrayList3.get(i6).booleanValue()) {
                    ArrayList<m> arrayList5 = this.H;
                    int i9 = 0;
                    while (i9 < aVar.a.size()) {
                        j0.a aVar2 = aVar.a.get(i9);
                        int i10 = aVar2.a;
                        if (i10 != i7) {
                            if (i10 == 2) {
                                m mVar2 = aVar2.b;
                                int i11 = mVar2.B;
                                int size = arrayList5.size() - 1;
                                boolean z4 = false;
                                while (size >= 0) {
                                    m mVar3 = arrayList5.get(size);
                                    if (mVar3.B != i11) {
                                        i5 = i11;
                                    } else if (mVar3 == mVar2) {
                                        i5 = i11;
                                        z4 = true;
                                    } else {
                                        if (mVar3 == mVar) {
                                            i5 = i11;
                                            aVar.a.add(i9, new j0.a(9, mVar3));
                                            i9++;
                                            mVar = null;
                                        } else {
                                            i5 = i11;
                                        }
                                        j0.a aVar3 = new j0.a(3, mVar3);
                                        aVar3.f2706c = aVar2.f2706c;
                                        aVar3.e = aVar2.e;
                                        aVar3.f2707d = aVar2.f2707d;
                                        aVar3.f2708f = aVar2.f2708f;
                                        aVar.a.add(i9, aVar3);
                                        arrayList5.remove(mVar3);
                                        i9++;
                                    }
                                    size--;
                                    i11 = i5;
                                }
                                if (z4) {
                                    aVar.a.remove(i9);
                                    i9--;
                                } else {
                                    i4 = 1;
                                    aVar2.a = 1;
                                    arrayList5.add(mVar2);
                                    i9 += i4;
                                    i7 = i4;
                                    i8 = 3;
                                }
                            } else if (i10 == i8 || i10 == 6) {
                                arrayList5.remove(aVar2.b);
                                m mVar4 = aVar2.b;
                                if (mVar4 == mVar) {
                                    aVar.a.add(i9, new j0.a(9, mVar4));
                                    i9++;
                                    i4 = 1;
                                    mVar = null;
                                    i9 += i4;
                                    i7 = i4;
                                    i8 = 3;
                                }
                            } else if (i10 == 7) {
                                i4 = 1;
                            } else if (i10 == 8) {
                                aVar.a.add(i9, new j0.a(9, mVar));
                                i9++;
                                mVar = aVar2.b;
                            }
                            i4 = 1;
                            i9 += i4;
                            i7 = i4;
                            i8 = 3;
                        } else {
                            i4 = i7;
                        }
                        arrayList5.add(aVar2.b);
                        i9 += i4;
                        i7 = i4;
                        i8 = 3;
                    }
                } else {
                    int i12 = 1;
                    ArrayList<m> arrayList6 = this.H;
                    int size2 = aVar.a.size() - 1;
                    while (size2 >= 0) {
                        j0.a aVar4 = aVar.a.get(size2);
                        int i13 = aVar4.a;
                        if (i13 != i12) {
                            if (i13 != 3) {
                                switch (i13) {
                                    case 8:
                                        mVar = null;
                                        break;
                                    case 9:
                                        mVar = aVar4.b;
                                        break;
                                    case 10:
                                        aVar4.f2710h = aVar4.f2709g;
                                        break;
                                }
                                size2--;
                                i12 = 1;
                            }
                            arrayList6.add(aVar4.b);
                            size2--;
                            i12 = 1;
                        }
                        arrayList6.remove(aVar4.b);
                        size2--;
                        i12 = 1;
                    }
                }
                z3 = z3 || aVar.f2699g;
                i6++;
                arrayList3 = arrayList2;
            } else {
                this.H.clear();
                if (!z2 && this.p >= 1) {
                    for (int i14 = i2; i14 < i3; i14++) {
                        Iterator<j0.a> it = arrayList.get(i14).a.iterator();
                        while (it.hasNext()) {
                            m mVar5 = it.next().b;
                            if (!(mVar5 == null || mVar5.w == null)) {
                                this.f2642c.j(h(mVar5));
                            }
                        }
                    }
                }
                int i15 = i2;
                while (i15 < i3) {
                    a aVar5 = arrayList.get(i15);
                    if (arrayList2.get(i15).booleanValue()) {
                        aVar5.f(-1);
                        aVar5.j(i15 == i3 + -1);
                    } else {
                        aVar5.f(1);
                        aVar5.i();
                    }
                    i15++;
                }
                boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
                for (int i16 = i2; i16 < i3; i16++) {
                    a aVar6 = arrayList.get(i16);
                    if (booleanValue) {
                        for (int size3 = aVar6.a.size() - 1; size3 >= 0; size3--) {
                            m mVar6 = aVar6.a.get(size3).b;
                            if (mVar6 != null) {
                                h(mVar6).k();
                            }
                        }
                    } else {
                        Iterator<j0.a> it2 = aVar6.a.iterator();
                        while (it2.hasNext()) {
                            m mVar7 = it2.next().b;
                            if (mVar7 != null) {
                                h(mVar7).k();
                            }
                        }
                    }
                }
                T(this.p, true);
                HashSet hashSet = new HashSet();
                for (int i17 = i2; i17 < i3; i17++) {
                    Iterator<j0.a> it3 = arrayList.get(i17).a.iterator();
                    while (it3.hasNext()) {
                        m mVar8 = it3.next().b;
                        if (!(mVar8 == null || (viewGroup = mVar8.I) == null)) {
                            hashSet.add(x0.g(viewGroup, M()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    x0 x0Var = (x0) it4.next();
                    x0Var.f2783d = booleanValue;
                    x0Var.h();
                    x0Var.c();
                }
                for (int i18 = i2; i18 < i3; i18++) {
                    a aVar7 = arrayList.get(i18);
                    if (arrayList2.get(i18).booleanValue() && aVar7.s >= 0) {
                        aVar7.s = -1;
                    }
                    Objects.requireNonNull(aVar7);
                }
                return;
            }
        }
    }

    public final void F(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<n> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            n nVar = this.I.get(i2);
            if (arrayList == null || nVar.a || (indexOf2 = arrayList.indexOf(nVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((nVar.f2656c == 0) || (arrayList != null && nVar.b.l(arrayList, 0, arrayList.size()))) {
                    this.I.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || nVar.a || (indexOf = arrayList.indexOf(nVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        nVar.a();
                    }
                }
                i2++;
            } else {
                this.I.remove(i2);
                i2--;
                size--;
            }
            a aVar = nVar.b;
            aVar.q.g(aVar, nVar.a, false, false);
            i2++;
        }
    }

    public m G(String str) {
        return this.f2642c.d(str);
    }

    public m H(int i2) {
        i0 i0Var = this.f2642c;
        int size = i0Var.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                m mVar = i0Var.a.get(size);
                if (mVar != null && mVar.A == i2) {
                    return mVar;
                }
            } else {
                for (h0 h0Var : i0Var.b.values()) {
                    if (h0Var != null) {
                        m mVar2 = h0Var.f2691c;
                        if (mVar2.A == i2) {
                            return mVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public m I(String str) {
        i0 i0Var = this.f2642c;
        Objects.requireNonNull(i0Var);
        if (str != null) {
            int size = i0Var.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                m mVar = i0Var.a.get(size);
                if (mVar != null && str.equals(mVar.C)) {
                    return mVar;
                }
            }
        }
        if (str != null) {
            for (h0 h0Var : i0Var.b.values()) {
                if (h0Var != null) {
                    m mVar2 = h0Var.f2691c;
                    if (str.equals(mVar2.C)) {
                        return mVar2;
                    }
                }
            }
        }
        return null;
    }

    public final ViewGroup J(m mVar) {
        ViewGroup viewGroup = mVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (mVar.B > 0 && this.r.h()) {
            View f2 = this.r.f(mVar.B);
            if (f2 instanceof ViewGroup) {
                return (ViewGroup) f2;
            }
        }
        return null;
    }

    public x K() {
        m mVar = this.s;
        return mVar != null ? mVar.w.K() : this.u;
    }

    public List<m> L() {
        return this.f2642c.i();
    }

    public y0 M() {
        m mVar = this.s;
        return mVar != null ? mVar.w.M() : this.v;
    }

    public void N(m mVar) {
        if (O(2)) {
            Log.v("FragmentManager", "hide: " + mVar);
        }
        if (!mVar.D) {
            mVar.D = true;
            mVar.N = true ^ mVar.N;
            g0(mVar);
        }
    }

    public final boolean P(m mVar) {
        b0 b0Var = mVar.y;
        Iterator it = ((ArrayList) b0Var.f2642c.g()).iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            m mVar2 = (m) it.next();
            if (mVar2 != null) {
                z2 = b0Var.P(mVar2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public boolean Q(m mVar) {
        b0 b0Var;
        if (mVar == null) {
            return true;
        }
        return mVar.G && ((b0Var = mVar.w) == null || b0Var.Q(mVar.z));
    }

    public boolean R(m mVar) {
        if (mVar == null) {
            return true;
        }
        b0 b0Var = mVar.w;
        if (!mVar.equals(b0Var.t) || !R(b0Var.s)) {
            return false;
        }
        return true;
    }

    public boolean S() {
        return this.B || this.C;
    }

    public void T(int i2, boolean z2) {
        y<?> yVar;
        if (this.q == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.p) {
            this.p = i2;
            i0 i0Var = this.f2642c;
            Iterator<m> it = i0Var.a.iterator();
            while (it.hasNext()) {
                h0 h0Var = i0Var.b.get(it.next().f2717j);
                if (h0Var != null) {
                    h0Var.k();
                }
            }
            Iterator<h0> it2 = i0Var.b.values().iterator();
            while (true) {
                boolean z3 = false;
                if (!it2.hasNext()) {
                    break;
                }
                h0 next = it2.next();
                if (next != null) {
                    next.k();
                    m mVar = next.f2691c;
                    if (mVar.q && !mVar.F()) {
                        z3 = true;
                    }
                    if (z3) {
                        i0Var.k(next);
                    }
                }
            }
            i0();
            if (this.A && (yVar = this.q) != null && this.p == 7) {
                yVar.l();
                this.A = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != 5) goto L_0x01bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U(g.l.b.m r17, int r18) {
        /*
        // Method dump skipped, instructions count: 496
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l.b.b0.U(g.l.b.m, int):void");
    }

    public void V() {
        if (this.q != null) {
            this.B = false;
            this.C = false;
            this.J.f2677i = false;
            for (m mVar : this.f2642c.i()) {
                if (mVar != null) {
                    mVar.y.V();
                }
            }
        }
    }

    public boolean W() {
        C(false);
        B(true);
        m mVar = this.t;
        if (mVar != null && mVar.j().W()) {
            return true;
        }
        boolean X = X(this.F, this.G, null, -1, 0);
        if (X) {
            this.b = true;
            try {
                Z(this.F, this.G);
            } finally {
                e();
            }
        }
        j0();
        x();
        this.f2642c.b();
        return X;
    }

    public boolean X(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        ArrayList<a> arrayList3 = this.f2643d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2643d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f2643d.get(size2);
                    if ((str != null && str.equals(aVar.f2701i)) || (i2 >= 0 && i2 == aVar.s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f2643d.get(size2);
                        if ((str == null || !str.equals(aVar2.f2701i)) && (i2 < 0 || i2 != aVar2.s)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.f2643d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2643d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f2643d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void Y(m mVar) {
        if (O(2)) {
            Log.v("FragmentManager", "remove: " + mVar + " nesting=" + mVar.v);
        }
        boolean z2 = !mVar.F();
        if (!mVar.E || z2) {
            this.f2642c.l(mVar);
            if (P(mVar)) {
                this.A = true;
            }
            mVar.q = true;
            g0(mVar);
        }
    }

    public final void Z(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                F(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).p) {
                        if (i3 != i2) {
                            E(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                                i3++;
                            }
                        }
                        E(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    E(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public h0 a(m mVar) {
        if (O(2)) {
            Log.v("FragmentManager", "add: " + mVar);
        }
        h0 h2 = h(mVar);
        mVar.w = this;
        this.f2642c.j(h2);
        if (!mVar.E) {
            this.f2642c.a(mVar);
            mVar.q = false;
            if (mVar.J == null) {
                mVar.N = false;
            }
            if (P(mVar)) {
                this.A = true;
            }
        }
        return h2;
    }

    public void a0(Parcelable parcelable) {
        h0 h0Var;
        if (parcelable != null) {
            d0 d0Var = (d0) parcelable;
            if (d0Var.e != null) {
                this.f2642c.b.clear();
                Iterator<g0> it = d0Var.e.iterator();
                while (it.hasNext()) {
                    g0 next = it.next();
                    if (next != null) {
                        m mVar = this.J.f2673d.get(next.f2680f);
                        if (mVar != null) {
                            if (O(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + mVar);
                            }
                            h0Var = new h0(this.n, this.f2642c, mVar, next);
                        } else {
                            h0Var = new h0(this.n, this.f2642c, this.q.f2798f.getClassLoader(), K(), next);
                        }
                        m mVar2 = h0Var.f2691c;
                        mVar2.w = this;
                        if (O(2)) {
                            StringBuilder f2 = c.c.a.a.a.f("restoreSaveState: active (");
                            f2.append(mVar2.f2717j);
                            f2.append("): ");
                            f2.append(mVar2);
                            Log.v("FragmentManager", f2.toString());
                        }
                        h0Var.m(this.q.f2798f.getClassLoader());
                        this.f2642c.j(h0Var);
                        h0Var.e = this.p;
                    }
                }
                e0 e0Var = this.J;
                Objects.requireNonNull(e0Var);
                Iterator it2 = new ArrayList(e0Var.f2673d.values()).iterator();
                while (it2.hasNext()) {
                    m mVar3 = (m) it2.next();
                    if (!this.f2642c.c(mVar3.f2717j)) {
                        if (O(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + mVar3 + " that was not found in the set of active Fragments " + d0Var.e);
                        }
                        this.J.b(mVar3);
                        mVar3.w = this;
                        h0 h0Var2 = new h0(this.n, this.f2642c, mVar3);
                        h0Var2.e = 1;
                        h0Var2.k();
                        mVar3.q = true;
                        h0Var2.k();
                    }
                }
                i0 i0Var = this.f2642c;
                ArrayList<String> arrayList = d0Var.f2665f;
                i0Var.a.clear();
                if (arrayList != null) {
                    for (String str : arrayList) {
                        m d2 = i0Var.d(str);
                        if (d2 != null) {
                            if (O(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + d2);
                            }
                            i0Var.a(d2);
                        } else {
                            throw new IllegalStateException(c.c.a.a.a.c("No instantiated fragment for (", str, ")"));
                        }
                    }
                }
                if (d0Var.f2666g != null) {
                    this.f2643d = new ArrayList<>(d0Var.f2666g.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = d0Var.f2666g;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i2];
                        Objects.requireNonNull(bVar);
                        a aVar = new a(this);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int[] iArr = bVar.e;
                            if (i3 >= iArr.length) {
                                break;
                            }
                            j0.a aVar2 = new j0.a();
                            int i5 = i3 + 1;
                            aVar2.a = iArr[i3];
                            if (O(2)) {
                                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + bVar.e[i5]);
                            }
                            String str2 = bVar.f2634f.get(i4);
                            aVar2.b = str2 != null ? this.f2642c.d(str2) : null;
                            aVar2.f2709g = e.b.values()[bVar.f2635g[i4]];
                            aVar2.f2710h = e.b.values()[bVar.f2636h[i4]];
                            int[] iArr2 = bVar.e;
                            int i6 = i5 + 1;
                            int i7 = iArr2[i5];
                            aVar2.f2706c = i7;
                            int i8 = i6 + 1;
                            int i9 = iArr2[i6];
                            aVar2.f2707d = i9;
                            int i10 = i8 + 1;
                            int i11 = iArr2[i8];
                            aVar2.e = i11;
                            int i12 = iArr2[i10];
                            aVar2.f2708f = i12;
                            aVar.b = i7;
                            aVar.f2696c = i9;
                            aVar.f2697d = i11;
                            aVar.e = i12;
                            aVar.b(aVar2);
                            i4++;
                            i3 = i10 + 1;
                        }
                        aVar.f2698f = bVar.f2637i;
                        aVar.f2701i = bVar.f2638j;
                        aVar.s = bVar.f2639k;
                        aVar.f2699g = true;
                        aVar.f2702j = bVar.f2640l;
                        aVar.f2703k = bVar.f2641m;
                        aVar.f2704l = bVar.n;
                        aVar.f2705m = bVar.o;
                        aVar.n = bVar.p;
                        aVar.o = bVar.q;
                        aVar.p = bVar.r;
                        aVar.f(1);
                        if (O(2)) {
                            StringBuilder g2 = c.c.a.a.a.g("restoreAllState: back stack #", i2, " (index ");
                            g2.append(aVar.s);
                            g2.append("): ");
                            g2.append(aVar);
                            Log.v("FragmentManager", g2.toString());
                            PrintWriter printWriter = new PrintWriter(new w0("FragmentManager"));
                            aVar.h("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2643d.add(aVar);
                        i2++;
                    }
                } else {
                    this.f2643d = null;
                }
                this.f2647i.set(d0Var.f2667h);
                String str3 = d0Var.f2668i;
                if (str3 != null) {
                    m G2 = G(str3);
                    this.t = G2;
                    t(G2);
                }
                ArrayList<String> arrayList2 = d0Var.f2669j;
                if (arrayList2 != null) {
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        Bundle bundle = d0Var.f2670k.get(i13);
                        bundle.setClassLoader(this.q.f2798f.getClassLoader());
                        this.f2648j.put(arrayList2.get(i13), bundle);
                    }
                }
                this.z = new ArrayDeque<>(d0Var.f2671l);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(g.l.b.y<?> r5, g.l.b.v r6, g.l.b.m r7) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l.b.b0.b(g.l.b.y, g.l.b.v, g.l.b.m):void");
    }

    public Parcelable b0() {
        int i2;
        b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Iterator it = ((HashSet) f()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            x0 x0Var = (x0) it.next();
            if (x0Var.e) {
                x0Var.e = false;
                x0Var.c();
            }
        }
        z();
        C(true);
        this.B = true;
        this.J.f2677i = true;
        i0 i0Var = this.f2642c;
        Objects.requireNonNull(i0Var);
        ArrayList<g0> arrayList2 = new ArrayList<>(i0Var.b.size());
        Iterator<h0> it2 = i0Var.b.values().iterator();
        while (true) {
            bVarArr = null;
            Bundle bundle = null;
            bVarArr = null;
            if (!it2.hasNext()) {
                break;
            }
            h0 next = it2.next();
            if (next != null) {
                m mVar = next.f2691c;
                g0 g0Var = new g0(mVar);
                m mVar2 = next.f2691c;
                if (mVar2.f2713f <= -1 || g0Var.q != null) {
                    g0Var.q = mVar2.f2714g;
                } else {
                    Bundle bundle2 = new Bundle();
                    m mVar3 = next.f2691c;
                    mVar3.d0(bundle2);
                    mVar3.V.b(bundle2);
                    Parcelable b0 = mVar3.y.b0();
                    if (b0 != null) {
                        bundle2.putParcelable("android:support:fragments", b0);
                    }
                    next.a.j(next.f2691c, bundle2, false);
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                    if (next.f2691c.J != null) {
                        next.o();
                    }
                    if (next.f2691c.f2715h != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", next.f2691c.f2715h);
                    }
                    if (next.f2691c.f2716i != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("android:view_registry_state", next.f2691c.f2716i);
                    }
                    if (!next.f2691c.L) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", next.f2691c.L);
                    }
                    g0Var.q = bundle;
                    if (next.f2691c.f2720m != null) {
                        if (bundle == null) {
                            g0Var.q = new Bundle();
                        }
                        g0Var.q.putString("android:target_state", next.f2691c.f2720m);
                        int i3 = next.f2691c.n;
                        if (i3 != 0) {
                            g0Var.q.putInt("android:target_req_state", i3);
                        }
                    }
                }
                arrayList2.add(g0Var);
                if (O(2)) {
                    Log.v("FragmentManager", "Saved state of " + mVar + ": " + g0Var.q);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (O(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        i0 i0Var2 = this.f2642c;
        synchronized (i0Var2.a) {
            if (i0Var2.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(i0Var2.a.size());
                Iterator<m> it3 = i0Var2.a.iterator();
                while (it3.hasNext()) {
                    m next2 = it3.next();
                    arrayList.add(next2.f2717j);
                    if (O(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.f2717j + "): " + next2);
                    }
                }
            }
        }
        ArrayList<a> arrayList3 = this.f2643d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new b[size];
            for (i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new b(this.f2643d.get(i2));
                if (O(2)) {
                    StringBuilder g2 = c.c.a.a.a.g("saveAllState: adding back stack #", i2, ": ");
                    g2.append(this.f2643d.get(i2));
                    Log.v("FragmentManager", g2.toString());
                }
            }
        }
        d0 d0Var = new d0();
        d0Var.e = arrayList2;
        d0Var.f2665f = arrayList;
        d0Var.f2666g = bVarArr;
        d0Var.f2667h = this.f2647i.get();
        m mVar4 = this.t;
        if (mVar4 != null) {
            d0Var.f2668i = mVar4.f2717j;
        }
        d0Var.f2669j.addAll(this.f2648j.keySet());
        d0Var.f2670k.addAll(this.f2648j.values());
        d0Var.f2671l = new ArrayList<>(this.z);
        return d0Var;
    }

    public void c(m mVar) {
        if (O(2)) {
            Log.v("FragmentManager", "attach: " + mVar);
        }
        if (mVar.E) {
            mVar.E = false;
            if (!mVar.p) {
                this.f2642c.a(mVar);
                if (O(2)) {
                    Log.v("FragmentManager", "add from attach: " + mVar);
                }
                if (P(mVar)) {
                    this.A = true;
                }
            }
        }
    }

    public void c0() {
        synchronized (this.a) {
            ArrayList<n> arrayList = this.I;
            boolean z2 = false;
            boolean z3 = arrayList != null && !arrayList.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.q.f2799g.removeCallbacks(this.K);
                this.q.f2799g.post(this.K);
                j0();
            }
        }
    }

    public final void d(m mVar) {
        HashSet<g.h.f.a> hashSet = this.f2650l.get(mVar);
        if (hashSet != null) {
            Iterator<g.h.f.a> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            i(mVar);
            this.f2650l.remove(mVar);
        }
    }

    public void d0(m mVar, boolean z2) {
        ViewGroup J2 = J(mVar);
        if (J2 != null && (J2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) J2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public final void e() {
        this.b = false;
        this.G.clear();
        this.F.clear();
    }

    public void e0(m mVar, e.b bVar) {
        if (!mVar.equals(G(mVar.f2717j)) || !(mVar.x == null || mVar.w == this)) {
            throw new IllegalArgumentException("Fragment " + mVar + " is not an active fragment of FragmentManager " + this);
        }
        mVar.R = bVar;
    }

    public final Set<x0> f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f2642c.f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((h0) it.next()).f2691c.I;
            if (viewGroup != null) {
                hashSet.add(x0.g(viewGroup, M()));
            }
        }
        return hashSet;
    }

    public void f0(m mVar) {
        if (mVar == null || (mVar.equals(G(mVar.f2717j)) && (mVar.x == null || mVar.w == this))) {
            m mVar2 = this.t;
            this.t = mVar;
            t(mVar2);
            t(this.t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + mVar + " is not an active fragment of FragmentManager " + this);
    }

    public void g(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.j(z4);
        } else {
            aVar.i();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3 && this.p >= 1) {
            q0.p(this.q.f2798f, this.r, arrayList, arrayList2, 0, 1, true, this.f2651m);
        }
        if (z4) {
            T(this.p, true);
        }
        Iterator it = ((ArrayList) this.f2642c.g()).iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (mVar != null) {
                View view = mVar.J;
            }
        }
    }

    public final void g0(m mVar) {
        ViewGroup J2 = J(mVar);
        if (J2 != null) {
            if (mVar.x() + mVar.w() + mVar.o() + mVar.l() > 0) {
                if (J2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    J2.setTag(R.id.visible_removing_fragment_view_tag, mVar);
                }
                ((m) J2.getTag(R.id.visible_removing_fragment_view_tag)).y0(mVar.v());
            }
        }
    }

    public h0 h(m mVar) {
        h0 h2 = this.f2642c.h(mVar.f2717j);
        if (h2 != null) {
            return h2;
        }
        h0 h0Var = new h0(this.n, this.f2642c, mVar);
        h0Var.m(this.q.f2798f.getClassLoader());
        h0Var.e = this.p;
        return h0Var;
    }

    public void h0(m mVar) {
        if (O(2)) {
            Log.v("FragmentManager", "show: " + mVar);
        }
        if (mVar.D) {
            mVar.D = false;
            mVar.N = !mVar.N;
        }
    }

    public final void i(m mVar) {
        mVar.j0();
        this.n.n(mVar, false);
        mVar.I = null;
        mVar.J = null;
        mVar.T = null;
        mVar.U.h(null);
        mVar.s = false;
    }

    public final void i0() {
        Iterator it = ((ArrayList) this.f2642c.f()).iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            m mVar = h0Var.f2691c;
            if (mVar.K) {
                if (this.b) {
                    this.E = true;
                } else {
                    mVar.K = false;
                    h0Var.k();
                }
            }
        }
    }

    public void j(m mVar) {
        if (O(2)) {
            Log.v("FragmentManager", "detach: " + mVar);
        }
        if (!mVar.E) {
            mVar.E = true;
            if (mVar.p) {
                if (O(2)) {
                    Log.v("FragmentManager", "remove from detach: " + mVar);
                }
                this.f2642c.l(mVar);
                if (P(mVar)) {
                    this.A = true;
                }
                g0(mVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (R(r4.s) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f2646h;
        r1 = r4.f2643d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0() {
        /*
            r4 = this;
            java.util.ArrayList<g.l.b.b0$l> r0 = r4.a
            monitor-enter(r0)
            java.util.ArrayList<g.l.b.b0$l> r1 = r4.a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            g.a.b r1 = r4.f2646h     // Catch:{ all -> 0x002f }
            r1.a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            g.a.b r0 = r4.f2646h
            java.util.ArrayList<g.l.b.a> r1 = r4.f2643d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            g.l.b.m r1 = r4.s
            boolean r1 = r4.R(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r0.a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.l.b.b0.j0():void");
    }

    public void k(Configuration configuration) {
        for (m mVar : this.f2642c.i()) {
            if (mVar != null) {
                mVar.onConfigurationChanged(configuration);
                mVar.y.k(configuration);
            }
        }
    }

    public boolean l(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (m mVar : this.f2642c.i()) {
            if (mVar != null) {
                if (!mVar.D ? mVar.N() ? true : mVar.y.l(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void m() {
        this.B = false;
        this.C = false;
        this.J.f2677i = false;
        w(1);
    }

    public boolean n(Menu menu, MenuInflater menuInflater) {
        if (this.p < 1) {
            return false;
        }
        ArrayList<m> arrayList = null;
        boolean z2 = false;
        for (m mVar : this.f2642c.i()) {
            if (mVar != null && Q(mVar)) {
                if (!mVar.D ? mVar.y.n(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(mVar);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                m mVar2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(mVar2)) {
                    Objects.requireNonNull(mVar2);
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public void o() {
        this.D = true;
        C(true);
        z();
        w(-1);
        this.q = null;
        this.r = null;
        this.s = null;
        if (this.f2645g != null) {
            this.f2646h.b();
            this.f2645g = null;
        }
        g.a.e.c<Intent> cVar = this.w;
        if (cVar != null) {
            cVar.a();
            this.x.a();
            this.y.a();
        }
    }

    public void p() {
        for (m mVar : this.f2642c.i()) {
            if (mVar != null) {
                mVar.l0();
            }
        }
    }

    public void q(boolean z2) {
        for (m mVar : this.f2642c.i()) {
            if (mVar != null) {
                mVar.Z();
                mVar.y.q(z2);
            }
        }
    }

    public boolean r(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (m mVar : this.f2642c.i()) {
            if (mVar != null) {
                if (!mVar.D ? mVar.y.r(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s(Menu menu) {
        if (this.p >= 1) {
            for (m mVar : this.f2642c.i()) {
                if (mVar != null && !mVar.D) {
                    mVar.y.s(menu);
                }
            }
        }
    }

    public final void t(m mVar) {
        if (mVar != null && mVar.equals(G(mVar.f2717j))) {
            boolean R = mVar.w.R(mVar);
            Boolean bool = mVar.o;
            if (bool == null || bool.booleanValue() != R) {
                mVar.o = Boolean.valueOf(R);
                mVar.b0(R);
                b0 b0Var = mVar.y;
                b0Var.j0();
                b0Var.t(b0Var.t);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        m mVar = this.s;
        if (mVar != null) {
            sb.append(mVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.s;
        } else {
            y<?> yVar = this.q;
            if (yVar != null) {
                sb.append(yVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.q;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public void u(boolean z2) {
        for (m mVar : this.f2642c.i()) {
            if (mVar != null) {
                mVar.a0();
                mVar.y.u(z2);
            }
        }
    }

    public boolean v(Menu menu) {
        boolean z2 = false;
        if (this.p < 1) {
            return false;
        }
        for (m mVar : this.f2642c.i()) {
            if (mVar != null && Q(mVar) && mVar.m0(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: finally extract failed */
    public final void w(int i2) {
        try {
            this.b = true;
            for (h0 h0Var : this.f2642c.b.values()) {
                if (h0Var != null) {
                    h0Var.e = i2;
                }
            }
            T(i2, false);
            Iterator it = ((HashSet) f()).iterator();
            while (it.hasNext()) {
                ((x0) it.next()).e();
            }
            this.b = false;
            C(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void x() {
        if (this.E) {
            this.E = false;
            i0();
        }
    }

    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String q2 = c.c.a.a.a.q(str, "    ");
        i0 i0Var = this.f2642c;
        Objects.requireNonNull(i0Var);
        String str2 = str + "    ";
        if (!i0Var.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 h0Var : i0Var.b.values()) {
                printWriter.print(str);
                if (h0Var != null) {
                    m mVar = h0Var.f2691c;
                    printWriter.println(mVar);
                    mVar.e(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = i0Var.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(i0Var.a.get(i2).toString());
            }
        }
        ArrayList<m> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.e.get(i3).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f2643d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.f2643d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(q2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2647i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((l) this.a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.r);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.D);
        if (this.A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A);
        }
    }

    public final void z() {
        Iterator it = ((HashSet) f()).iterator();
        while (it.hasNext()) {
            ((x0) it.next()).e();
        }
    }
}
