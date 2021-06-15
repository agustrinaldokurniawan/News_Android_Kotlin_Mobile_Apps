package g.r;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import g.t.a.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class i {
    public static final String[] a = {"UPDATE", "DELETE", "INSERT"};
    public final HashMap<String, Integer> b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f2963c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, Set<String>> f2964d;
    public a e;

    /* renamed from: f  reason: collision with root package name */
    public final j f2965f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicBoolean f2966g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f2967h = false;

    /* renamed from: i  reason: collision with root package name */
    public volatile f f2968i;

    /* renamed from: j  reason: collision with root package name */
    public b f2969j;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: k  reason: collision with root package name */
    public final g.c.a.b.b<c, d> f2970k = new g.c.a.b.b<>();

    /* renamed from: l  reason: collision with root package name */
    public Runnable f2971l = new a();

    public class a implements Runnable {
        public a() {
        }

        /* JADX INFO: finally extract failed */
        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor k2 = i.this.f2965f.k(new g.t.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            while (k2.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(k2.getInt(0)));
                } catch (Throwable th) {
                    k2.close();
                    throw th;
                }
            }
            k2.close();
            if (!hashSet.isEmpty()) {
                i.this.f2968i.C();
            }
            return hashSet;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: boolean */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:90:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 266
            */
            throw new UnsupportedOperationException("Method not decompiled: g.r.i.a.run():void");
        }
    }

    public static class b {
        public final long[] a;
        public final boolean[] b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f2972c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2973d;
        public boolean e;

        public b(int i2) {
            long[] jArr = new long[i2];
            this.a = jArr;
            boolean[] zArr = new boolean[i2];
            this.b = zArr;
            this.f2972c = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.f2973d) {
                    if (!this.e) {
                        int length = this.a.length;
                        int i2 = 0;
                        while (true) {
                            int i3 = 1;
                            if (i2 < length) {
                                boolean z = this.a[i2] > 0;
                                boolean[] zArr = this.b;
                                if (z != zArr[i2]) {
                                    int[] iArr = this.f2972c;
                                    if (!z) {
                                        i3 = 2;
                                    }
                                    iArr[i2] = i3;
                                } else {
                                    this.f2972c[i2] = 0;
                                }
                                zArr[i2] = z;
                                i2++;
                            } else {
                                this.e = true;
                                this.f2973d = false;
                                return this.f2972c;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    public static abstract class c {
        public final String[] a;

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void a(Set<String> set);
    }

    public static class d {
        public final int[] a;
        public final String[] b;

        /* renamed from: c  reason: collision with root package name */
        public final c f2974c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f2975d;

        public d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f2974c = cVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f2975d = set;
        }
    }

    public i(j jVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2965f = jVar;
        this.f2969j = new b(strArr.length);
        this.b = new HashMap<>();
        this.f2964d = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f2963c = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.b.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.f2963c[i2] = str2.toLowerCase(locale);
            } else {
                this.f2963c[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.b.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.b;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d d2;
        boolean z;
        String[] strArr = cVar.a;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f2964d.containsKey(lowerCase)) {
                hashSet.addAll(this.f2964d.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        int length2 = strArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Integer num = this.b.get(strArr2[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
            } else {
                StringBuilder f2 = c.c.a.a.a.f("There is no table with name ");
                f2.append(strArr2[i2]);
                throw new IllegalArgumentException(f2.toString());
            }
        }
        d dVar = new d(cVar, iArr, strArr2);
        synchronized (this.f2970k) {
            d2 = this.f2970k.d(cVar, dVar);
        }
        if (d2 == null) {
            b bVar = this.f2969j;
            synchronized (bVar) {
                z = false;
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = iArr[i3];
                    long[] jArr = bVar.a;
                    long j2 = jArr[i4];
                    jArr[i4] = 1 + j2;
                    if (j2 == 0) {
                        bVar.f2973d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                f();
            }
        }
    }

    public boolean b() {
        if (!this.f2965f.j()) {
            return false;
        }
        if (!this.f2967h) {
            this.f2965f.f2977d.P();
        }
        if (this.f2967h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public void c(c cVar) {
        d e2;
        boolean z;
        synchronized (this.f2970k) {
            e2 = this.f2970k.e(cVar);
        }
        if (e2 != null) {
            b bVar = this.f2969j;
            int[] iArr = e2.a;
            synchronized (bVar) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = bVar.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        bVar.f2973d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                f();
            }
        }
    }

    public final void d(g.t.a.b bVar, int i2) {
        bVar.v("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f2963c[i2];
        StringBuilder sb = new StringBuilder();
        String[] strArr = a;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.v(sb.toString());
        }
    }

    public final void e(g.t.a.b bVar, int i2) {
        String str = this.f2963c[i2];
        StringBuilder sb = new StringBuilder();
        String[] strArr = a;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            bVar.v(sb.toString());
        }
    }

    public void f() {
        if (this.f2965f.j()) {
            g(this.f2965f.f2977d.P());
        }
    }

    public void g(g.t.a.b bVar) {
        if (!bVar.Z()) {
            while (true) {
                try {
                    ReentrantReadWriteLock.ReadLock readLock = this.f2965f.f2981i.readLock();
                    readLock.lock();
                    try {
                        int[] a2 = this.f2969j.a();
                        if (a2 == null) {
                            readLock.unlock();
                            return;
                        }
                        int length = a2.length;
                        if (bVar.s()) {
                            bVar.F();
                        } else {
                            bVar.k();
                        }
                        for (int i2 = 0; i2 < length; i2++) {
                            try {
                                int i3 = a2[i2];
                                if (i3 == 1) {
                                    d(bVar, i2);
                                } else if (i3 == 2) {
                                    e(bVar, i2);
                                }
                            } catch (Throwable th) {
                                bVar.j();
                                throw th;
                            }
                        }
                        bVar.B();
                        bVar.j();
                        b bVar2 = this.f2969j;
                        synchronized (bVar2) {
                            bVar2.e = false;
                        }
                    } finally {
                        readLock.unlock();
                    }
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    return;
                }
            }
        }
    }
}
