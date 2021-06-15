package g.p;

import android.annotation.SuppressLint;
import c.c.a.a.a;
import g.p.q;
import java.util.HashMap;

@SuppressLint({"TypeParameterUnusedInFormals"})
public class r {
    public static final HashMap<Class<?>, String> a = new HashMap<>();
    public final HashMap<String, q<? extends j>> b = new HashMap<>();

    public static String b(Class<? extends q> cls) {
        HashMap<Class<?>, String> hashMap = a;
        String str = hashMap.get(cls);
        if (str == null) {
            q.b bVar = (q.b) cls.getAnnotation(q.b.class);
            str = bVar != null ? bVar.value() : null;
            if (d(str)) {
                hashMap.put(cls, str);
            } else {
                StringBuilder f2 = a.f("No @Navigator.Name annotation found for ");
                f2.append(cls.getSimpleName());
                throw new IllegalArgumentException(f2.toString());
            }
        }
        return str;
    }

    public static boolean d(String str) {
        return str != null && !str.isEmpty();
    }

    public final q<? extends j> a(q<? extends j> qVar) {
        String b2 = b(qVar.getClass());
        if (d(b2)) {
            return this.b.put(b2, qVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public <T extends q<?>> T c(String str) {
        if (d(str)) {
            q<? extends j> qVar = this.b.get(str);
            if (qVar != null) {
                return qVar;
            }
            throw new IllegalStateException(a.c("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
