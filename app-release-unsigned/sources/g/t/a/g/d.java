package g.t.a.g;

import android.database.sqlite.SQLiteProgram;

public class d implements g.t.a.d {
    public final SQLiteProgram e;

    public d(SQLiteProgram sQLiteProgram) {
        this.e = sQLiteProgram;
    }

    @Override // g.t.a.d
    public void H(int i2, byte[] bArr) {
        this.e.bindBlob(i2, bArr);
    }

    @Override // g.t.a.d
    public void I(int i2) {
        this.e.bindNull(i2);
    }

    @Override // g.t.a.d
    public void L(int i2, double d2) {
        this.e.bindDouble(i2, d2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e.close();
    }

    @Override // g.t.a.d
    public void x(int i2, String str) {
        this.e.bindString(i2, str);
    }

    @Override // g.t.a.d
    public void y(int i2, long j2) {
        this.e.bindLong(i2, j2);
    }
}
