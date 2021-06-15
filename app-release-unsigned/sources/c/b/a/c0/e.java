package c.b.a.c0;

import c.c.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e {
    public static final e a = new e("COMPOSITION");
    public final List<String> b;

    /* renamed from: c  reason: collision with root package name */
    public f f536c;

    public e(e eVar) {
        this.b = new ArrayList(eVar.b);
        this.f536c = eVar.f536c;
    }

    public e(String... strArr) {
        this.b = Arrays.asList(strArr);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.b.add(str);
        return eVar;
    }

    public final boolean b() {
        List<String> list = this.b;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean c(String str, int i2) {
        if (i2 >= this.b.size()) {
            return false;
        }
        boolean z = i2 == this.b.size() - 1;
        String str2 = this.b.get(i2);
        if (!str2.equals("**")) {
            return (z || (i2 == this.b.size() + -2 && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.b.get(i2 + 1).equals(str)) {
            return i2 == this.b.size() + -2 || (i2 == this.b.size() + -3 && b());
        }
        if (z) {
            return true;
        }
        int i3 = i2 + 1;
        if (i3 < this.b.size() - 1) {
            return false;
        }
        return this.b.get(i3).equals(str);
    }

    public int d(String str, int i2) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.b.get(i2).equals("**")) {
            return 1;
        }
        if (i2 != this.b.size() - 1 && this.b.get(i2 + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public boolean e(String str, int i2) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i2 >= this.b.size()) {
            return false;
        }
        if (this.b.get(i2).equals(str) || this.b.get(i2).equals("**") || this.b.get(i2).equals("*")) {
            return true;
        }
        return false;
    }

    public boolean f(String str, int i2) {
        return "__container".equals(str) || i2 < this.b.size() - 1 || this.b.get(i2).equals("**");
    }

    public e g(f fVar) {
        e eVar = new e(this);
        eVar.f536c = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder f2 = a.f("KeyPath{keys=");
        f2.append(this.b);
        f2.append(",resolved=");
        f2.append(this.f536c != null);
        f2.append('}');
        return f2.toString();
    }
}
