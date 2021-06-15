package g.t.a.g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import g.t.a.c;
import java.io.File;

public class b implements c {
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3022f;

    /* renamed from: g  reason: collision with root package name */
    public final c.a f3023g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3024h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f3025i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public a f3026j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3027k;

    public static class a extends SQLiteOpenHelper {
        public final a[] e;

        /* renamed from: f  reason: collision with root package name */
        public final c.a f3028f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3029g;

        /* renamed from: g.t.a.g.b$a$a  reason: collision with other inner class name */
        public class C0098a implements DatabaseErrorHandler {
            public final /* synthetic */ c.a a;
            public final /* synthetic */ a[] b;

            public C0098a(c.a aVar, a[] aVarArr) {
                this.a = aVar;
                this.b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
                if (r4.hasNext() != false) goto L_0x0044;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
                r0.a((java.lang.String) r4.next().second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
                r0.a(r4.c());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
                if (r1 != null) goto L_0x003a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
                r4 = r1.iterator();
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0034 */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
            /* JADX WARNING: Removed duplicated region for block: B:5:0x0032 A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
              PHI: (r1v11 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:3:0x002d, B:6:0x0034, B:7:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x002d] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                /*
                // Method dump skipped, instructions count: 124
                */
                throw new UnsupportedOperationException("Method not decompiled: g.t.a.g.b.a.C0098a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public a(Context context, String str, a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.a, new C0098a(aVar, aVarArr));
            this.f3028f = aVar;
            this.e = aVarArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            if ((r1.f3021f == r3) == false) goto L_0x000e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static g.t.a.g.a c(g.t.a.g.a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto L_0x000e
                android.database.sqlite.SQLiteDatabase r1 = r1.f3021f
                if (r1 != r3) goto L_0x000b
                r1 = 1
                goto L_0x000c
            L_0x000b:
                r1 = r0
            L_0x000c:
                if (r1 != 0) goto L_0x0015
            L_0x000e:
                g.t.a.g.a r1 = new g.t.a.g.a
                r1.<init>(r3)
                r2[r0] = r1
            L_0x0015:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: g.t.a.g.b.a.c(g.t.a.g.a[], android.database.sqlite.SQLiteDatabase):g.t.a.g.a");
        }

        public a b(SQLiteDatabase sQLiteDatabase) {
            return c(this.e, sQLiteDatabase);
        }

        @Override // java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.e[0] = null;
        }

        public synchronized g.t.a.b e() {
            this.f3029g = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.f3029g) {
                close();
                return e();
            }
            return b(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f3028f.b(c(this.e, sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f3028f.c(c(this.e, sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f3029g = true;
            this.f3028f.d(c(this.e, sQLiteDatabase), i2, i3);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f3029g) {
                this.f3028f.e(c(this.e, sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f3029g = true;
            this.f3028f.f(c(this.e, sQLiteDatabase), i2, i3);
        }
    }

    public b(Context context, String str, c.a aVar, boolean z) {
        this.e = context;
        this.f3022f = str;
        this.f3023g = aVar;
        this.f3024h = z;
    }

    @Override // g.t.a.c
    public g.t.a.b P() {
        return b().e();
    }

    public final a b() {
        a aVar;
        synchronized (this.f3025i) {
            if (this.f3026j == null) {
                a[] aVarArr = new a[1];
                if (this.f3022f == null || !this.f3024h) {
                    this.f3026j = new a(this.e, this.f3022f, aVarArr, this.f3023g);
                } else {
                    this.f3026j = new a(this.e, new File(this.e.getNoBackupFilesDir(), this.f3022f).getAbsolutePath(), aVarArr, this.f3023g);
                }
                this.f3026j.setWriteAheadLoggingEnabled(this.f3027k);
            }
            aVar = this.f3026j;
        }
        return aVar;
    }

    @Override // java.io.Closeable, g.t.a.c, java.lang.AutoCloseable
    public void close() {
        b().close();
    }

    @Override // g.t.a.c
    public String getDatabaseName() {
        return this.f3022f;
    }

    @Override // g.t.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f3025i) {
            a aVar = this.f3026j;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f3027k = z;
        }
    }
}
