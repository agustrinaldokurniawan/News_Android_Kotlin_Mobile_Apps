package g.r;

import android.content.Context;
import android.util.Log;
import g.r.s.a;
import g.t.a.b;
import g.t.a.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Objects;
import java.util.concurrent.Callable;

public class o implements c, d {
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2994f;

    /* renamed from: g  reason: collision with root package name */
    public final File f2995g;

    /* renamed from: h  reason: collision with root package name */
    public final Callable<InputStream> f2996h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2997i;

    /* renamed from: j  reason: collision with root package name */
    public final c f2998j;

    /* renamed from: k  reason: collision with root package name */
    public c f2999k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3000l;

    @Override // g.t.a.c
    public synchronized b P() {
        if (!this.f3000l) {
            e(true);
            this.f3000l = true;
        }
        return this.f2998j.P();
    }

    @Override // g.r.d
    public c b() {
        return this.f2998j;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.io.File r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: g.r.o.c(java.io.File, boolean):void");
    }

    @Override // java.io.Closeable, g.t.a.c, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2998j.close();
        this.f3000l = false;
    }

    public final void e(boolean z) {
        boolean z2;
        String databaseName = getDatabaseName();
        File databasePath = this.e.getDatabasePath(databaseName);
        c cVar = this.f2999k;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
            z2 = false;
        } else {
            z2 = true;
        }
        a aVar = new a(databaseName, this.e.getFilesDir(), z2);
        try {
            aVar.f3005c.lock();
            if (aVar.f3006d) {
                try {
                    FileChannel channel = new FileOutputStream(aVar.b).getChannel();
                    aVar.e = channel;
                    channel.lock();
                } catch (IOException e2) {
                    throw new IllegalStateException("Unable to grab copy lock.", e2);
                }
            }
            if (!databasePath.exists()) {
                try {
                    c(databasePath, z);
                } catch (IOException e3) {
                    throw new RuntimeException("Unable to copy database file.", e3);
                }
            } else if (this.f2999k == null) {
                aVar.a();
            } else {
                try {
                    int b = g.r.s.b.b(databasePath);
                    int i2 = this.f2997i;
                    if (b == i2) {
                        aVar.a();
                    } else if (this.f2999k.a(b, i2)) {
                        aVar.a();
                    } else {
                        if (this.e.deleteDatabase(databaseName)) {
                            try {
                                c(databasePath, z);
                            } catch (IOException e4) {
                                Log.w("ROOM", "Unable to copy database file.", e4);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.a();
                    }
                } catch (IOException e5) {
                    Log.w("ROOM", "Unable to read database version.", e5);
                    aVar.a();
                }
            }
        } finally {
            aVar.a();
        }
    }

    @Override // g.t.a.c
    public String getDatabaseName() {
        return this.f2998j.getDatabaseName();
    }

    @Override // g.t.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f2998j.setWriteAheadLoggingEnabled(z);
    }
}
