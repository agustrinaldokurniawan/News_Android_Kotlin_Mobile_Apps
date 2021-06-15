package g.h.j.a0;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import g.b.g.t;
import g.h.j.a0.d;

public class b extends InputConnectionWrapper {
    public final /* synthetic */ c a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, boolean z, c cVar) {
        super(inputConnection, z);
        this.a = cVar;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        if (((t) this.a).a(inputContentInfo == null ? null : new d(new d.a(inputContentInfo)), i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
