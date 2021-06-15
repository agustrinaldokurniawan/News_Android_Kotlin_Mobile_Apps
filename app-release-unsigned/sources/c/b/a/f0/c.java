package c.b.a.f0;

import android.util.Log;
import c.b.a.p;
import java.util.Objects;
import java.util.Set;

public class c {
    public static p a = new b();

    public static void a(String str) {
        Objects.requireNonNull((b) a);
    }

    public static void b(String str) {
        Objects.requireNonNull((b) a);
        Set<String> set = b.a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, null);
            set.add(str);
        }
    }

    public static void c(String str, Throwable th) {
        Objects.requireNonNull((b) a);
        Set<String> set = b.a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
