package g.p;

import android.content.Intent;
import android.net.Uri;
import c.c.a.a.a;

public class i {
    public final Uri a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2845c;

    public i(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.a = data;
        this.b = action;
        this.f2845c = type;
    }

    public String toString() {
        StringBuilder h2 = a.h("NavDeepLinkRequest", "{");
        if (this.a != null) {
            h2.append(" uri=");
            h2.append(this.a.toString());
        }
        if (this.b != null) {
            h2.append(" action=");
            h2.append(this.b);
        }
        if (this.f2845c != null) {
            h2.append(" mimetype=");
            h2.append(this.f2845c);
        }
        h2.append(" }");
        return h2.toString();
    }
}
