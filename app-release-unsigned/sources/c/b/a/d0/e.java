package c.b.a.d0;

import c.b.a.c;
import c.c.a.a.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Objects;

public class e {
    public final d a;

    public e(d dVar) {
        this.a = dVar;
    }

    public static String a(String str, c cVar, boolean z) {
        String str2;
        StringBuilder f2 = a.f("lottie_cache_");
        f2.append(str.replaceAll("\\W+", ""));
        if (z) {
            Objects.requireNonNull(cVar);
            str2 = ".temp" + cVar.f629h;
        } else {
            str2 = cVar.f629h;
        }
        f2.append(str2);
        return f2.toString();
    }

    public final File b() {
        c cVar = (c) this.a;
        Objects.requireNonNull(cVar);
        File file = new File(cVar.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: finally extract failed */
    public File c(String str, InputStream inputStream, c cVar) {
        File file = new File(b(), a(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
