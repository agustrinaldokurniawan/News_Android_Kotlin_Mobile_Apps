package g.t.a.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import g.t.a.e;
import g.t.a.f;
import java.util.List;

public class a implements g.t.a.b {
    public static final String[] e = new String[0];

    /* renamed from: f  reason: collision with root package name */
    public final SQLiteDatabase f3021f;

    /* renamed from: g.t.a.g.a$a  reason: collision with other inner class name */
    public class C0097a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ e a;

        public C0097a(a aVar, e eVar) {
            this.a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ e a;

        public b(a aVar, e eVar) {
            this.a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f3021f = sQLiteDatabase;
    }

    @Override // g.t.a.b
    public void B() {
        this.f3021f.setTransactionSuccessful();
    }

    @Override // g.t.a.b
    public f D(String str) {
        return new e(this.f3021f.compileStatement(str));
    }

    @Override // g.t.a.b
    public void F() {
        this.f3021f.beginTransactionNonExclusive();
    }

    @Override // g.t.a.b
    public Cursor G(e eVar) {
        return this.f3021f.rawQueryWithFactory(new C0097a(this, eVar), eVar.b(), e, null);
    }

    @Override // g.t.a.b
    public Cursor U(String str) {
        return G(new g.t.a.a(str));
    }

    @Override // g.t.a.b
    public Cursor X(e eVar, CancellationSignal cancellationSignal) {
        return this.f3021f.rawQueryWithFactory(new b(this, eVar), eVar.b(), e, null, cancellationSignal);
    }

    @Override // g.t.a.b
    public boolean Z() {
        return this.f3021f.inTransaction();
    }

    public List<Pair<String, String>> b() {
        return this.f3021f.getAttachedDbs();
    }

    public String c() {
        return this.f3021f.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3021f.close();
    }

    @Override // g.t.a.b
    public boolean isOpen() {
        return this.f3021f.isOpen();
    }

    @Override // g.t.a.b
    public void j() {
        this.f3021f.endTransaction();
    }

    @Override // g.t.a.b
    public void k() {
        this.f3021f.beginTransaction();
    }

    @Override // g.t.a.b
    public boolean s() {
        return this.f3021f.isWriteAheadLoggingEnabled();
    }

    @Override // g.t.a.b
    public void v(String str) {
        this.f3021f.execSQL(str);
    }
}
