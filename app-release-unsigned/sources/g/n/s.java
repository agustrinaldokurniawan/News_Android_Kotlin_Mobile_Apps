package g.n;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import g.s.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class s {
    public static final Class[] a = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final Map<String, Object> b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, a.b> f2819c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, ?> f2820d;
    public final a.b e;

    public class a implements a.b {
        public a() {
        }

        @Override // g.s.a.b
        public Bundle a() {
            for (Map.Entry entry : new HashMap(s.this.f2819c).entrySet()) {
                Bundle a2 = ((a.b) entry.getValue()).a();
                s sVar = s.this;
                String str = (String) entry.getKey();
                Objects.requireNonNull(sVar);
                if (a2 != null) {
                    for (Class cls : s.a) {
                        if (!cls.isInstance(a2)) {
                        }
                    }
                    StringBuilder f2 = c.c.a.a.a.f("Can't put value with type ");
                    f2.append(a2.getClass());
                    f2.append(" into saved state");
                    throw new IllegalArgumentException(f2.toString());
                }
                o oVar = (o) sVar.f2820d.get(str);
                if (oVar != null) {
                    oVar.h(a2);
                } else {
                    sVar.b.put(str, a2);
                }
            }
            Set<String> keySet = s.this.b.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str2 : keySet) {
                arrayList.add(str2);
                arrayList2.add(s.this.b.get(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public s() {
        this.f2819c = new HashMap();
        this.f2820d = new HashMap();
        this.e = new a();
        this.b = new HashMap();
    }

    public s(Map<String, Object> map) {
        this.f2819c = new HashMap();
        this.f2820d = new HashMap();
        this.e = new a();
        this.b = new HashMap(map);
    }
}
