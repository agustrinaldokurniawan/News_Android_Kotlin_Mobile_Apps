package c.b.a.d0;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class a implements Closeable {
    public final HttpURLConnection e;

    public a(HttpURLConnection httpURLConnection) {
        this.e = httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012 A[SYNTHETIC, Splitter:B:9:0x0012] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b() {
        /*
            r2 = this;
            java.net.HttpURLConnection r0 = r2.e     // Catch:{ IOException -> 0x000d }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x000d }
            int r0 = r0 / 100
            r1 = 2
            if (r0 != r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0012
            r0 = 0
            goto L_0x0045
        L_0x0012:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0046 }
            r0.<init>()     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = "Unable to fetch "
            r0.append(r1)     // Catch:{ IOException -> 0x0046 }
            java.net.HttpURLConnection r1 = r2.e     // Catch:{ IOException -> 0x0046 }
            java.net.URL r1 = r1.getURL()     // Catch:{ IOException -> 0x0046 }
            r0.append(r1)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = ". Failed with "
            r0.append(r1)     // Catch:{ IOException -> 0x0046 }
            java.net.HttpURLConnection r1 = r2.e     // Catch:{ IOException -> 0x0046 }
            int r1 = r1.getResponseCode()     // Catch:{ IOException -> 0x0046 }
            r0.append(r1)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch:{ IOException -> 0x0046 }
            java.net.HttpURLConnection r1 = r2.e     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = r2.c(r1)     // Catch:{ IOException -> 0x0046 }
            r0.append(r1)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0046 }
        L_0x0045:
            return r0
        L_0x0046:
            r0 = move-exception
            java.lang.String r1 = "get error failed "
            c.b.a.f0.c.c(r1, r0)
            java.lang.String r0 = r0.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.d0.a.b():java.lang.String");
    }

    public final String c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e.disconnect();
    }
}
