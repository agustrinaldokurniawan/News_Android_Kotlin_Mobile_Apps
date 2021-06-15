package c.b.a.d0;

import c.b.a.f0.c;
import c.b.a.g;
import c.b.a.h;
import c.b.a.s;
import c.c.a.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.ZipInputStream;

public class f {
    public final e a;
    public final b b;

    public f(e eVar, b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    public final s<g> a(String str, InputStream inputStream, String str2, String str3) {
        c cVar;
        s<g> sVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            c.a("Handling zip response.");
            cVar = c.ZIP;
            sVar = str3 == null ? h.f(new ZipInputStream(inputStream), null) : h.f(new ZipInputStream(new FileInputStream(this.a.c(str, inputStream, cVar))), str);
        } else {
            c.a("Received json response.");
            cVar = c.JSON;
            sVar = str3 == null ? h.c(inputStream, null) : h.c(new FileInputStream(new File(this.a.c(str, inputStream, cVar).getAbsolutePath())), str);
        }
        if (!(str3 == null || sVar.a == null)) {
            e eVar = this.a;
            Objects.requireNonNull(eVar);
            File file = new File(eVar.b(), e.a(str, cVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            c.a("Copying temp file to real file (" + file2 + ")");
            if (!renameTo) {
                StringBuilder f2 = a.f("Unable to rename cache file ");
                f2.append(file.getAbsolutePath());
                f2.append(" to ");
                f2.append(file2.getAbsolutePath());
                f2.append(".");
                c.b(f2.toString());
            }
        }
        return sVar;
    }
}
