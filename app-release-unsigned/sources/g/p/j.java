package g.p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import g.e.i;
import g.p.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class j {
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public k f2846f;

    /* renamed from: g  reason: collision with root package name */
    public int f2847g;

    /* renamed from: h  reason: collision with root package name */
    public String f2848h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f2849i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<h> f2850j;

    /* renamed from: k  reason: collision with root package name */
    public i<c> f2851k;

    /* renamed from: l  reason: collision with root package name */
    public HashMap<String, d> f2852l;

    public static class a implements Comparable<a> {
        public final j e;

        /* renamed from: f  reason: collision with root package name */
        public final Bundle f2853f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f2854g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f2855h;

        /* renamed from: i  reason: collision with root package name */
        public final int f2856i;

        public a(j jVar, Bundle bundle, boolean z, boolean z2, int i2) {
            this.e = jVar;
            this.f2853f = bundle;
            this.f2854g = z;
            this.f2855h = z2;
            this.f2856i = i2;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            boolean z = this.f2854g;
            if (z && !aVar.f2854g) {
                return 1;
            }
            if (!z && aVar.f2854g) {
                return -1;
            }
            Bundle bundle = this.f2853f;
            if (bundle != null && aVar.f2853f == null) {
                return 1;
            }
            if (bundle == null && aVar.f2853f != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f2853f.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f2855h;
            if (z2 && !aVar.f2855h) {
                return 1;
            }
            if (z2 || !aVar.f2855h) {
                return this.f2856i - aVar.f2856i;
            }
            return -1;
        }
    }

    static {
        new HashMap();
    }

    public j(q<? extends j> qVar) {
        this.e = r.b(qVar.getClass());
    }

    public static String c(Context context, int i2) {
        if (i2 <= 16777215) {
            return Integer.toString(i2);
        }
        try {
            return context.getResources().getResourceName(i2);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i2);
        }
    }

    public Bundle a(Bundle bundle) {
        HashMap<String, d> hashMap;
        if (bundle == null && ((hashMap = this.f2852l) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, d> hashMap2 = this.f2852l;
        if (hashMap2 != null) {
            for (Map.Entry<String, d> entry : hashMap2.entrySet()) {
                d value = entry.getValue();
                String key = entry.getKey();
                if (value.f2824c) {
                    value.a.d(bundle2, key, value.f2825d);
                }
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, d> hashMap3 = this.f2852l;
            if (hashMap3 != null) {
                for (Map.Entry<String, d> entry2 : hashMap3.entrySet()) {
                    d value2 = entry2.getValue();
                    String key2 = entry2.getKey();
                    boolean z = false;
                    if (value2.b || !bundle2.containsKey(key2) || bundle2.get(key2) != null) {
                        try {
                            value2.a.a(bundle2, key2);
                            z = true;
                            continue;
                        } catch (ClassCastException unused) {
                            continue;
                        }
                    }
                    if (!z) {
                        StringBuilder f2 = c.c.a.a.a.f("Wrong argument type for '");
                        f2.append(entry2.getKey());
                        f2.append("' in argument bundle. ");
                        f2.append(entry2.getValue().a.b());
                        f2.append(" expected.");
                        throw new IllegalArgumentException(f2.toString());
                    }
                }
            }
        }
        return bundle2;
    }

    public int[] b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        k kVar = this;
        while (true) {
            k kVar2 = kVar.f2846f;
            if (kVar2 == null || kVar2.n != kVar.f2847g) {
                arrayDeque.addFirst(kVar);
            }
            if (kVar2 == null) {
                break;
            }
            kVar = kVar2;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i2 = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i2] = ((j) it.next()).f2847g;
            i2++;
        }
        return iArr;
    }

    public a d(i iVar) {
        Bundle bundle;
        int i2;
        Bundle bundle2;
        Matcher matcher;
        Uri uri;
        ArrayList<h> arrayList = this.f2850j;
        Matcher matcher2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator<h> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            h next = it.next();
            Uri uri2 = iVar.a;
            if (uri2 != null) {
                HashMap<String, d> hashMap = this.f2852l;
                Map emptyMap = hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(hashMap);
                Matcher matcher3 = next.f2839d.matcher(uri2.toString());
                if (matcher3.matches()) {
                    bundle2 = new Bundle();
                    int size = next.b.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            String str = next.b.get(i3);
                            i3++;
                            if (next.b(bundle2, str, Uri.decode(matcher3.group(i3)), (d) emptyMap.get(str))) {
                                break;
                            }
                        } else if (next.f2840f) {
                            Iterator<String> it2 = next.f2838c.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                h.b bVar = next.f2838c.get(next2);
                                String queryParameter = uri2.getQueryParameter(next2);
                                if (queryParameter != null) {
                                    matcher = Pattern.compile(bVar.a).matcher(queryParameter);
                                    if (!matcher.matches()) {
                                        break;
                                    }
                                } else {
                                    matcher = matcher2;
                                }
                                int i4 = 0;
                                while (true) {
                                    if (i4 < bVar.b.size()) {
                                        String decode = matcher != null ? Uri.decode(matcher.group(i4 + 1)) : matcher2;
                                        String str2 = bVar.b.get(i4);
                                        d dVar = (d) emptyMap.get(str2);
                                        if (decode != null) {
                                            uri = uri2;
                                            if (!decode.replaceAll("[{}]", "").equals(str2) && next.b(bundle2, str2, decode, dVar)) {
                                                bundle2 = null;
                                                break;
                                            }
                                        } else {
                                            uri = uri2;
                                        }
                                        i4++;
                                        uri2 = uri;
                                        matcher2 = null;
                                    }
                                }
                            }
                        }
                    }
                    bundle = bundle2;
                }
                bundle2 = matcher2;
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str3 = iVar.b;
            boolean z = str3 != null && str3.equals(next.f2841g);
            String str4 = iVar.f2845c;
            if (str4 != null) {
                i2 = (next.f2843i == null || !next.f2842h.matcher(str4).matches()) ? -1 : new h.a(next.f2843i).compareTo(new h.a(str4));
            } else {
                i2 = -1;
            }
            if (bundle != null || z || i2 > -1) {
                a aVar2 = new a(this, bundle, next.e, z, i2);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
            matcher2 = null;
        }
        return aVar;
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.p.t.a.e);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        this.f2847g = resourceId;
        this.f2848h = null;
        this.f2848h = c(context, resourceId);
        this.f2849i = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f2848h;
        if (str == null) {
            sb.append("0x");
            str = Integer.toHexString(this.f2847g);
        }
        sb.append(str);
        sb.append(")");
        if (this.f2849i != null) {
            sb.append(" label=");
            sb.append(this.f2849i);
        }
        return sb.toString();
    }
}
