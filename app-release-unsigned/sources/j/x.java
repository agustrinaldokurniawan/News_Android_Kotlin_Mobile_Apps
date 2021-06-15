package j;

import i.f;
import i.j;
import i.s.c.h;
import i.u.d;
import i.x.e;
import j.n0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class x implements Iterable<f<? extends String, ? extends String>>, i.s.c.s.a {
    public static final b e = new b(null);

    /* renamed from: f  reason: collision with root package name */
    public final String[] f3712f;

    public static final class a {
        public final List<String> a = new ArrayList(20);

        public final a a(String str, String str2) {
            h.f(str, "name");
            h.f(str2, "value");
            b bVar = x.e;
            bVar.a(str);
            bVar.b(str2, str);
            b(str, str2);
            return this;
        }

        public final a b(String str, String str2) {
            h.f(str, "name");
            h.f(str2, "value");
            this.a.add(str);
            this.a.add(e.y(str2).toString());
            return this;
        }

        public final x c() {
            Object[] array = this.a.toArray(new String[0]);
            if (array != null) {
                return new x((String[]) array, null);
            }
            throw new j("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final a d(String str) {
            h.f(str, "name");
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (e.d(str, this.a.get(i2), true)) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }
    }

    public static final class b {
        public b(i.s.c.f fVar) {
        }

        public final void a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (!('!' <= charAt && '~' >= charAt)) {
                        throw new IllegalArgumentException(c.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public final void b(String str, String str2) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    throw new IllegalArgumentException(c.h("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str2, str).toString());
                }
            }
        }

        public final x c(String... strArr) {
            h.f(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                if (clone != null) {
                    String[] strArr2 = (String[]) clone;
                    int length = strArr2.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (strArr2[i2] != null) {
                            String str = strArr2[i2];
                            if (str != null) {
                                strArr2[i2] = e.y(str).toString();
                            } else {
                                throw new j("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                    }
                    i.u.a d2 = d.d(d.e(0, strArr2.length), 2);
                    int i3 = d2.e;
                    int i4 = d2.f3320f;
                    int i5 = d2.f3321g;
                    if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                        while (true) {
                            String str2 = strArr2[i3];
                            String str3 = strArr2[i3 + 1];
                            a(str2);
                            b(str3, str2);
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        }
                    }
                    return new x(strArr2, null);
                }
                throw new j("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public x(String[] strArr, i.s.c.f fVar) {
        this.f3712f = strArr;
    }

    public final String a(String str) {
        h.f(str, "name");
        String[] strArr = this.f3712f;
        i.u.a d2 = d.d(d.c(strArr.length - 2, 0), 2);
        int i2 = d2.e;
        int i3 = d2.f3320f;
        int i4 = d2.f3321g;
        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
            while (!e.d(str, strArr[i2], true)) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return strArr[i2 + 1];
        }
        return null;
    }

    public final String b(int i2) {
        return this.f3712f[i2 * 2];
    }

    public final a c() {
        a aVar = new a();
        List<String> list = aVar.a;
        String[] strArr = this.f3712f;
        h.e(list, "$this$addAll");
        h.e(strArr, "elements");
        list.addAll(i.o.e.a(strArr));
        return aVar;
    }

    public final String d(int i2) {
        return this.f3712f[(i2 * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && Arrays.equals(this.f3712f, ((x) obj).f3712f);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f3712f);
    }

    /* Return type fixed from 'java.util.Iterator<i.f<java.lang.String, java.lang.String>>' to match base method */
    @Override // java.lang.Iterable
    public Iterator<f<? extends String, ? extends String>> iterator() {
        int size = size();
        f[] fVarArr = new f[size];
        for (int i2 = 0; i2 < size; i2++) {
            fVarArr[i2] = new f(b(i2), d(i2));
        }
        h.e(fVarArr, "array");
        return new i.s.c.a(fVarArr);
    }

    public final int size() {
        return this.f3712f.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(b(i2));
            sb.append(": ");
            sb.append(d(i2));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        h.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
