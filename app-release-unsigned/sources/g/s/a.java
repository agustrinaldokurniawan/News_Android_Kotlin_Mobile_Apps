package g.s;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
public final class a {
    public g.c.a.b.b<String, b> a = new g.c.a.b.b<>();
    public Bundle b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3019c;

    /* renamed from: d  reason: collision with root package name */
    public Recreator.a f3020d;
    public boolean e = true;

    /* renamed from: g.s.a$a  reason: collision with other inner class name */
    public interface AbstractC0096a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f3019c) {
            Bundle bundle = this.b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(String str, b bVar) {
        if (this.a.d(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void c(Class<? extends AbstractC0096a> cls) {
        if (this.e) {
            if (this.f3020d == null) {
                this.f3020d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.f3020d;
                aVar.a.add(cls.getName());
            } catch (NoSuchMethodException e2) {
                StringBuilder f2 = c.c.a.a.a.f("Class");
                f2.append(cls.getSimpleName());
                f2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(f2.toString(), e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
