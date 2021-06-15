package g.h.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import g.h.c.a;
import java.util.ArrayList;
import java.util.Iterator;

public final class f implements Iterable<Intent> {
    public final ArrayList<Intent> e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final Context f2466f;

    public f(Context context) {
        this.f2466f = context;
    }

    public f a(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f2466f.getPackageManager());
        }
        if (component != null) {
            b(component);
        }
        this.e.add(intent);
        return this;
    }

    public f b(ComponentName componentName) {
        int size = this.e.size();
        try {
            Context context = this.f2466f;
            while (true) {
                Intent l2 = d.l(context, componentName);
                if (l2 == null) {
                    return this;
                }
                this.e.add(size, l2);
                context = this.f2466f;
                componentName = l2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public void c() {
        if (!this.e.isEmpty()) {
            ArrayList<Intent> arrayList = this.e;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.f2466f;
            Object obj = a.a;
            context.startActivities(intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.e.iterator();
    }
}
