package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import g.n.e;
import g.n.g;
import g.n.i;
import g.n.j;
import g.s.a;
import g.s.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements g {
    public final c a;

    public static final class a implements a.b {
        public final Set<String> a = new HashSet();

        public a(g.s.a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        @Override // g.s.a.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.a = cVar;
    }

    @Override // g.n.g
    public void d(i iVar, e.a aVar) {
        Class cls;
        if (aVar == e.a.ON_CREATE) {
            j jVar = (j) iVar.a();
            jVar.d("removeObserver");
            jVar.a.e(this);
            Bundle a2 = this.a.c().a("androidx.savedstate.Restarter");
            if (a2 != null) {
                ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            try {
                                Constructor<? extends U> declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.AbstractC0096a.class).getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.AbstractC0096a) declaredConstructor.newInstance(new Object[0])).a(this.a);
                                } catch (Exception e) {
                                    throw new RuntimeException(c.c.a.a.a.q("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder f2 = c.c.a.a.a.f("Class");
                                f2.append(cls.getSimpleName());
                                f2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(f2.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(c.c.a.a.a.c("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
