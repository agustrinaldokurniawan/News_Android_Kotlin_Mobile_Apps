package i.x;

import i.s.c.h;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class c implements Serializable {
    public final Pattern e;

    public c(String str) {
        h.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        h.d(compile, "Pattern.compile(pattern)");
        h.e(compile, "nativePattern");
        this.e = compile;
    }

    public final boolean a(CharSequence charSequence) {
        h.e(charSequence, "input");
        return this.e.matcher(charSequence).matches();
    }

    public String toString() {
        String pattern = this.e.toString();
        h.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
