package g.r.s;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a {
    public static final Map<String, Lock> a = new HashMap();
    public final File b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f3005c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3006d;
    public FileChannel e;

    public a(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, c.c.a.a.a.q(str, ".lck"));
        this.b = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = a;
        synchronized (map) {
            lock = map.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(absolutePath, lock);
            }
        }
        this.f3005c = lock;
        this.f3006d = z;
    }

    public void a() {
        FileChannel fileChannel = this.e;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f3005c.unlock();
    }
}
