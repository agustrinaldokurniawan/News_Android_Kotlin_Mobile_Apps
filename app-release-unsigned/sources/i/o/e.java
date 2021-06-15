package i.o;

import h.a.t.a;
import i.f;
import i.s.b.l;
import i.s.c.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class e extends d {
    public static final <T> List<T> a(T[] tArr) {
        h.e(tArr, "$this$asList");
        List<T> asList = Arrays.asList(tArr);
        h.d(asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        h.e(bArr, "$this$copyInto");
        h.e(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static /* synthetic */ byte[] c(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        b(bArr, bArr2, i2, i3, i4);
        return bArr2;
    }

    public static Object[] d(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        h.e(objArr, "$this$copyInto");
        h.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
        return objArr2;
    }

    public static final byte[] e(byte[] bArr, int i2, int i3) {
        h.e(bArr, "$this$copyOfRangeImpl");
        int length = bArr.length;
        if (i3 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3);
            h.d(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + length + ").");
    }

    public static final <T> T f(List<? extends T> list) {
        h.e(list, "$this$first");
        if (!list.isEmpty()) {
            return (T) list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T, A extends Appendable> A g(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        h.e(iterable, "$this$joinTo");
        h.e(a, "buffer");
        h.e(charSequence, "separator");
        h.e(charSequence2, "prefix");
        h.e(charSequence3, "postfix");
        h.e(charSequence4, "truncated");
        a.append(charSequence2);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                a.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            a.e(a, obj, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static String h(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i3 & 2) != 0 ? "" : charSequence2;
        String str2 = (i3 & 4) != 0 ? "" : charSequence3;
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        String str3 = (i3 & 16) != 0 ? "..." : null;
        l lVar2 = (i3 & 32) != 0 ? null : lVar;
        h.e(iterable, "$this$joinToString");
        h.e(charSequence, "separator");
        h.e(str, "prefix");
        h.e(str2, "postfix");
        h.e(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        g(iterable, sb, charSequence, str, str2, i2, str3, lVar2);
        String sb2 = sb.toString();
        h.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> List<T> i(T... tArr) {
        h.e(tArr, "elements");
        h.e(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        h.e(tArr, "$this$filterNotNullTo");
        h.e(arrayList, "destination");
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> j(List<? extends T> list) {
        h.e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : a.G(list.get(0)) : h.e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<K, ? extends V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> k(Map<K, ? extends V> map) {
        h.e(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        return size != 0 ? size != 1 ? map : a.c0(map) : i.e;
    }

    public static final <T> List<T> l(Collection<? extends T> collection, T t) {
        h.e(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final void m() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final <T, C extends Collection<? super T>> C n(Iterable<? extends T> iterable, C c2) {
        h.e(iterable, "$this$toCollection");
        h.e(c2, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    public static final <T> List<T> o(Iterable<? extends T> iterable) {
        List list;
        h.e(iterable, "$this$toList");
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return h.e;
            }
            if (size != 1) {
                return q(collection);
            }
            return a.G(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        h.e(iterable, "$this$toMutableList");
        if (z) {
            list = q((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            n(iterable, arrayList);
            list = arrayList;
        }
        return j(list);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M p(Iterable<? extends f<? extends K, ? extends V>> iterable, M m2) {
        h.e(iterable, "$this$toMap");
        h.e(m2, "destination");
        h.e(m2, "$this$putAll");
        h.e(iterable, "pairs");
        Iterator<? extends f<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            m2.put(fVar.e, fVar.f3289f);
        }
        return m2;
    }

    public static final <T> List<T> q(Collection<? extends T> collection) {
        h.e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> r(Iterable<? extends T> iterable) {
        h.e(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return j.e;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(a.H(collection.size()));
                n(iterable, linkedHashSet);
                return linkedHashSet;
            }
            Set<T> singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            h.d(singleton, "java.util.Collections.singleton(element)");
            return singleton;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        n(iterable, linkedHashSet2);
        h.e(linkedHashSet2, "$this$optimizeReadOnlySet");
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return j.e;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        Set<T> singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
        h.d(singleton2, "java.util.Collections.singleton(element)");
        return singleton2;
    }
}
