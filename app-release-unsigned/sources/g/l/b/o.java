package g.l.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import g.a.d.b;
import g.n.w;

public class o implements b {
    public final /* synthetic */ p a;

    public o(p pVar) {
        this.a = pVar;
    }

    @Override // g.a.d.b
    public void a(Context context) {
        y<?> yVar = this.a.f2746l.a;
        yVar.f2800h.b(yVar, yVar, null);
        Bundle a2 = this.a.f30h.b.a("android:support:fragments");
        if (a2 != null) {
            Parcelable parcelable = a2.getParcelable("android:support:fragments");
            y<?> yVar2 = this.a.f2746l.a;
            if (yVar2 instanceof w) {
                yVar2.f2800h.a0(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}
