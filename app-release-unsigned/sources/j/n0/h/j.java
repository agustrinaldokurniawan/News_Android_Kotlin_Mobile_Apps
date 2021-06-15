package j.n0.h;

import c.c.a.a.a;
import i.s.c.h;
import i.x.e;
import j.d0;
import java.net.ProtocolException;

public final class j {
    public final d0 a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3551c;

    public j(d0 d0Var, int i2, String str) {
        h.f(d0Var, "protocol");
        h.f(str, "message");
        this.a = d0Var;
        this.b = i2;
        this.f3551c = str;
    }

    public static final j a(String str) {
        String str2;
        d0 d0Var = d0.HTTP_1_0;
        h.f(str, "statusLine");
        int i2 = 9;
        if (e.u(str, "HTTP/1.", false, 2)) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.q("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    d0Var = d0.HTTP_1_1;
                } else {
                    throw new ProtocolException(a.q("Unexpected status line: ", str));
                }
            }
        } else if (e.u(str, "ICY ", false, 2)) {
            i2 = 4;
        } else {
            throw new ProtocolException(a.q("Unexpected status line: ", str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                String substring = str.substring(i2, i3);
                h.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                    h.b(str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new ProtocolException(a.q("Unexpected status line: ", str));
                }
                return new j(d0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.q("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(a.q("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == d0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.f3551c);
        String sb2 = sb.toString();
        h.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
