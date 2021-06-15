package g.h.j;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.tsuga.news.R;
import g.h.j.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
    public static boolean a = false;
    public static Method b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f2525c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Field f2526d;

    public interface a {
        boolean e(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        AtomicInteger atomicInteger = o.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = o.g.a;
            o.g gVar = (o.g) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (gVar == null) {
                gVar = new o.g();
                view.setTag(R.id.tag_unhandled_key_event_manager, gVar);
            }
            WeakReference<KeyEvent> weakReference = gVar.f2538d;
            if (weakReference == null || weakReference.get() != keyEvent) {
                gVar.f2538d = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                if (gVar.f2537c == null) {
                    gVar.f2537c = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = gVar.f2537c;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = weakReference2.get();
                    if (view2 == null || !view2.isAttachedToWindow()) {
                        return true;
                    }
                    gVar.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(g.h.j.e.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.j.e.b(g.h.j.e$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
