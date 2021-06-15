package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import g.w.a;
import g.w.c;
import java.util.Objects;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.a;
        if (aVar.i(1)) {
            cVar = aVar.o();
        }
        remoteActionCompat.a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (aVar.i(2)) {
            charSequence = aVar.h();
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f166c;
        if (aVar.i(3)) {
            charSequence2 = aVar.h();
        }
        remoteActionCompat.f166c = charSequence2;
        remoteActionCompat.f167d = (PendingIntent) aVar.m(remoteActionCompat.f167d, 4);
        boolean z = remoteActionCompat.e;
        if (aVar.i(5)) {
            z = aVar.f();
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f168f;
        if (aVar.i(6)) {
            z2 = aVar.f();
        }
        remoteActionCompat.f168f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.a;
        aVar.p(1);
        aVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f166c;
        aVar.p(3);
        aVar.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f167d;
        aVar.p(4);
        aVar.u(pendingIntent);
        boolean z = remoteActionCompat.e;
        aVar.p(5);
        aVar.q(z);
        boolean z2 = remoteActionCompat.f168f;
        aVar.p(6);
        aVar.q(z2);
    }
}
