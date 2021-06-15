package c.e.b;

import c.e.b.a0.z.o;
import c.e.b.c0.c;
import java.io.IOException;
import java.io.StringWriter;

public abstract class n {
    public s a() {
        if (this instanceof s) {
            return (s) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f1535l = true;
            o.X.b(cVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
