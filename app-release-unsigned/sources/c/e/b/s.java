package c.e.b;

import c.e.b.a0.r;
import java.math.BigInteger;
import java.util.Objects;

public final class s extends n {
    public final Object a;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean e(s sVar) {
        Object obj = sVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        Object obj = this.a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(d());
    }

    public Number c() {
        Object obj = this.a;
        return obj instanceof String ? new r((String) this.a) : (Number) obj;
    }

    public String d() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return c().toString();
        }
        return obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.a == null) {
            return sVar.a == null;
        }
        if (e(this) && e(sVar)) {
            return c().longValue() == sVar.c().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(sVar.a instanceof Number)) {
            return obj2.equals(sVar.a);
        }
        double doubleValue = c().doubleValue();
        double doubleValue2 = sVar.c().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (e(this)) {
            doubleToLongBits = c().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
