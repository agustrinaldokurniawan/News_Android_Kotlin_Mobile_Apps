package g.n;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import g.n.u;
import g.s.c;
import i.s.c.h;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import l.a.b.a.b;

public abstract class a extends u.b {
    public final g.s.a a;
    public final e b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2805c;

    public a(c cVar, Bundle bundle) {
        this.a = cVar.c();
        this.b = cVar.a();
        this.f2805c = bundle;
    }

    @Override // g.n.u.b, g.n.u.a
    public final <T extends t> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // g.n.u.c
    public void b(t tVar) {
        SavedStateHandleController.h(tVar, this.a, this.b);
    }

    @Override // g.n.u.b
    public final <T extends t> T c(String str, Class<T> cls) {
        s sVar;
        Object obj;
        g.s.a aVar = this.a;
        e eVar = this.b;
        Bundle bundle = this.f2805c;
        Bundle a2 = aVar.a(str);
        Class[] clsArr = s.a;
        if (a2 == null && bundle == null) {
            sVar = new s();
        } else {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a2 == null) {
                sVar = new s(hashMap);
            } else {
                ArrayList parcelableArrayList = a2.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = a2.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                    hashMap.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
                }
                sVar = new s(hashMap);
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, sVar);
        savedStateHandleController.i(aVar, eVar);
        SavedStateHandleController.j(aVar, eVar);
        l.a.b.a.c.c cVar = (l.a.b.a.c.c) this;
        h.e(str, "key");
        h.e(cls, "modelClass");
        h.e(sVar, "handle");
        l.a.c.n.a aVar2 = cVar.f3781d;
        b<T> bVar = cVar.e;
        T t = (T) ((t) aVar2.a(bVar.a, bVar.b, new l.a.b.a.c.b(cVar, sVar)));
        synchronized (t.a) {
            obj = t.a.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj == null) {
                t.a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
            }
        }
        if (obj != null) {
            savedStateHandleController = obj;
        }
        if (t.b && (savedStateHandleController instanceof Closeable)) {
            try {
                ((Closeable) savedStateHandleController).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return t;
    }
}
