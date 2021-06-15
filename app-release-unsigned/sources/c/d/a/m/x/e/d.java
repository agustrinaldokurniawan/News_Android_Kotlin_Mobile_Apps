package c.d.a.m.x.e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c.d.a.m.p;
import c.d.a.m.r;
import c.d.a.m.v.w;

public class d implements r<Uri, Drawable> {
    public final Context a;

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    /* Return type fixed from 'c.d.a.m.v.w' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public /* bridge */ /* synthetic */ w<Drawable> a(Uri uri, int i2, int i3, p pVar) {
        return c(uri);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, c.d.a.m.p] */
    @Override // c.d.a.m.r
    public boolean b(Uri uri, p pVar) {
        return uri.getScheme().equals("android.resource");
    }

    /* JADX WARN: Incorrect args count in method signature: (Landroid/net/Uri;IILc/d/a/m/p;)Lc/d/a/m/v/w<Landroid/graphics/drawable/Drawable;>; */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c.d.a.m.v.w c(android.net.Uri r7) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.m.x.e.d.c(android.net.Uri):c.d.a.m.v.w");
    }
}
