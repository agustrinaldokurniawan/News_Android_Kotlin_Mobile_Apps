package g.r.s;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class c {
    public final String a;
    public final Map<String, a> b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f3007c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f3008d;

    public static final class a {
        public final String a;
        public final String b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3009c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3010d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final String f3011f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3012g;

        public a(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.a = str;
            this.b = str2;
            this.f3010d = z;
            this.e = i2;
            int i4 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i4 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i4 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i4 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f3009c = i4;
            this.f3011f = str3;
            this.f3012g = i3;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.e != aVar.e || !this.a.equals(aVar.a) || this.f3010d != aVar.f3010d) {
                return false;
            }
            if (this.f3012g == 1 && aVar.f3012g == 2 && (str3 = this.f3011f) != null && !str3.equals(aVar.f3011f)) {
                return false;
            }
            if (this.f3012g == 2 && aVar.f3012g == 1 && (str2 = aVar.f3011f) != null && !str2.equals(this.f3011f)) {
                return false;
            }
            int i2 = this.f3012g;
            if (i2 == 0 || i2 != aVar.f3012g || ((str = this.f3011f) == null ? aVar.f3011f == null : str.equals(aVar.f3011f))) {
                return this.f3009c == aVar.f3009c;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.f3009c) * 31) + (this.f3010d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("Column{name='");
            f2.append(this.a);
            f2.append('\'');
            f2.append(", type='");
            f2.append(this.b);
            f2.append('\'');
            f2.append(", affinity='");
            f2.append(this.f3009c);
            f2.append('\'');
            f2.append(", notNull=");
            f2.append(this.f3010d);
            f2.append(", primaryKeyPosition=");
            f2.append(this.e);
            f2.append(", defaultValue='");
            f2.append(this.f3011f);
            f2.append('\'');
            f2.append('}');
            return f2.toString();
        }
    }

    public static final class b {
        public final String a;
        public final String b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3013c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f3014d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.f3013c = str3;
            this.f3014d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.f3013c.equals(bVar.f3013c) && this.f3014d.equals(bVar.f3014d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int b2 = c.c.a.a.a.b(this.f3013c, c.c.a.a.a.b(this.b, this.a.hashCode() * 31, 31), 31);
            return this.e.hashCode() + ((this.f3014d.hashCode() + b2) * 31);
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("ForeignKey{referenceTable='");
            f2.append(this.a);
            f2.append('\'');
            f2.append(", onDelete='");
            f2.append(this.b);
            f2.append('\'');
            f2.append(", onUpdate='");
            f2.append(this.f3013c);
            f2.append('\'');
            f2.append(", columnNames=");
            f2.append(this.f3014d);
            f2.append(", referenceColumnNames=");
            f2.append(this.e);
            f2.append('}');
            return f2.toString();
        }
    }

    /* renamed from: g.r.s.c$c  reason: collision with other inner class name */
    public static class C0095c implements Comparable<C0095c> {
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3015f;

        /* renamed from: g  reason: collision with root package name */
        public final String f3016g;

        /* renamed from: h  reason: collision with root package name */
        public final String f3017h;

        public C0095c(int i2, int i3, String str, String str2) {
            this.e = i2;
            this.f3015f = i3;
            this.f3016g = str;
            this.f3017h = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(C0095c cVar) {
            C0095c cVar2 = cVar;
            int i2 = this.e - cVar2.e;
            return i2 == 0 ? this.f3015f - cVar2.f3015f : i2;
        }
    }

    public static final class d {
        public final String a;
        public final boolean b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f3018c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.f3018c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b == dVar.b && this.f3018c.equals(dVar.f3018c)) {
                return this.a.startsWith("index_") ? dVar.a.startsWith("index_") : this.a.equals(dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3018c.hashCode() + ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder f2 = c.c.a.a.a.f("Index{name='");
            f2.append(this.a);
            f2.append('\'');
            f2.append(", unique=");
            f2.append(this.b);
            f2.append(", columns=");
            f2.append(this.f3018c);
            f2.append('}');
            return f2.toString();
        }
    }

    public c(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.f3007c = Collections.unmodifiableSet(set);
        this.f3008d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static List<C0095c> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new C0095c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d b(g.t.a.b bVar, String str, boolean z) {
        Cursor U = bVar.U("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = U.getColumnIndex("seqno");
            int columnIndex2 = U.getColumnIndex("cid");
            int columnIndex3 = U.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (U.moveToNext()) {
                        if (U.getInt(columnIndex2) >= 0) {
                            int i2 = U.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i2), U.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z, arrayList);
                    U.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            U.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.a;
        if (str == null ? cVar.a != null : !str.equals(cVar.a)) {
            return false;
        }
        Map<String, a> map = this.b;
        if (map == null ? cVar.b != null : !map.equals(cVar.b)) {
            return false;
        }
        Set<b> set2 = this.f3007c;
        if (set2 == null ? cVar.f3007c != null : !set2.equals(cVar.f3007c)) {
            return false;
        }
        Set<d> set3 = this.f3008d;
        if (set3 == null || (set = cVar.f3008d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f3007c;
        if (set != null) {
            i2 = set.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder f2 = c.c.a.a.a.f("TableInfo{name='");
        f2.append(this.a);
        f2.append('\'');
        f2.append(", columns=");
        f2.append(this.b);
        f2.append(", foreignKeys=");
        f2.append(this.f3007c);
        f2.append(", indices=");
        f2.append(this.f3008d);
        f2.append('}');
        return f2.toString();
    }
}
