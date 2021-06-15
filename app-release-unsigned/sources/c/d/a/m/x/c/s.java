package c.d.a.m.x.c;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class s {
    public static final boolean a;
    public static final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public static final File f1061c = new File("/proc/self/fd");

    /* renamed from: d  reason: collision with root package name */
    public static volatile s f1062d;
    public static volatile int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1063f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1064g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1065h;

    /* renamed from: i  reason: collision with root package name */
    public int f1066i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1067j = true;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f1068k = new AtomicBoolean(false);

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = true;
        a = i2 < 29;
        if (i2 < 26) {
            z = false;
        }
        b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        if ((android.os.Build.VERSION.SDK_INT != 27 ? false : java.util.Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(android.os.Build.MODEL)) == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.x.c.s.<init>():void");
    }

    public static s a() {
        if (f1062d == null) {
            synchronized (s.class) {
                if (f1062d == null) {
                    f1062d = new s();
                }
            }
        }
        return f1062d;
    }

    public boolean b(int i2, int i3, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f1063f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!b) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else {
            if (a && !this.f1068k.get()) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                }
                return false;
            } else if (z2) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                }
                return false;
            } else {
                int i4 = this.f1065h;
                if (i2 < i4) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                    }
                    return false;
                } else if (i3 < i4) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                    }
                    return false;
                } else {
                    synchronized (this) {
                        int i5 = this.f1066i + 1;
                        this.f1066i = i5;
                        if (i5 >= 50) {
                            this.f1066i = 0;
                            int length = f1061c.list().length;
                            long j2 = (long) (e != -1 ? e : this.f1064g);
                            boolean z4 = ((long) length) < j2;
                            this.f1067j = z4;
                            if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j2);
                            }
                        }
                        z3 = this.f1067j;
                    }
                    if (z3) {
                        return true;
                    }
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    }
                    return false;
                }
            }
        }
    }
}
