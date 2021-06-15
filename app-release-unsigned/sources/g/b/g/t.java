package g.b.g;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import g.h.j.a0.c;
import g.h.j.a0.d;
import g.h.j.c;
import g.h.j.o;

public class t implements c {
    public final /* synthetic */ View a;

    public t(View view) {
        this.a = view;
    }

    public boolean a(d dVar, int i2, Bundle bundle) {
        if ((i2 & 1) != 0) {
            try {
                ((d.a) dVar.a).b();
                InputContentInfo inputContentInfo = (InputContentInfo) ((d.a) dVar.a).a();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        c.a aVar = new c.a(new ClipData(((d.a) dVar.a).a.getDescription(), new ClipData.Item(((d.a) dVar.a).a.getContentUri())), 2);
        aVar.f2524d = ((d.a) dVar.a).a.getLinkUri();
        aVar.e = bundle;
        return o.k(this.a, new g.h.j.c(aVar)) == null;
    }
}
