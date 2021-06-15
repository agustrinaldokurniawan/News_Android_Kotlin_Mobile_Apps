package g.h.g;

import android.util.Base64;
import c.c.a.a.a;
import java.util.List;
import java.util.Objects;

public final class e {
    public final String a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2492c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f2493d;
    public final String e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.a = str;
        this.b = str2;
        this.f2492c = str3;
        Objects.requireNonNull(list);
        this.f2493d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder f2 = a.f("FontRequest {mProviderAuthority: ");
        f2.append(this.a);
        f2.append(", mProviderPackage: ");
        f2.append(this.b);
        f2.append(", mQuery: ");
        f2.append(this.f2492c);
        f2.append(", mCertificates:");
        sb.append(f2.toString());
        for (int i2 = 0; i2 < this.f2493d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f2493d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return a.e(sb, "}", "mCertificatesArray: 0");
    }
}
