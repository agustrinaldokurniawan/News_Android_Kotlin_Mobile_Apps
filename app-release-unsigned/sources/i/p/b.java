package i.p;

import i.s.c.h;
import java.util.Comparator;

public final class b implements Comparator<Comparable<? super Object>> {
    public static final b a = new b();

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        h.e(comparable3, "a");
        h.e(comparable4, "b");
        return comparable4.compareTo(comparable3);
    }

    /* Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return a.a;
    }
}
