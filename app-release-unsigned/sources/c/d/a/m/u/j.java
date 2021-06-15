package c.d.a.m.u;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c.d.a.f;
import c.d.a.m.e;
import c.d.a.m.u.d;
import c.d.a.m.w.g;
import c.d.a.s.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class j implements d<InputStream> {
    public static final b e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final g f837f;

    /* renamed from: g  reason: collision with root package name */
    public final int f838g;

    /* renamed from: h  reason: collision with root package name */
    public HttpURLConnection f839h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f840i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f841j;

    public static class a implements b {
    }

    public interface b {
    }

    public j(g gVar, int i2) {
        this.f837f = gVar;
        this.f838g = i2;
    }

    public static int d(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
            return -1;
        }
    }

    @Override // c.d.a.m.u.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // c.d.a.m.u.d
    public void b() {
        InputStream inputStream = this.f840i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f839h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f839h = null;
    }

    @Override // c.d.a.m.u.d
    public c.d.a.m.a c() {
        return c.d.a.m.a.REMOTE;
    }

    @Override // c.d.a.m.u.d
    public void cancel() {
        this.f841j = true;
    }

    @Override // c.d.a.m.u.d
    public void e(f fVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i2 = c.d.a.s.f.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.f(f(this.f837f.d(), 0, null, this.f837f.b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(c.d.a.s.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
            }
            aVar.d(e2);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder f2 = c.c.a.a.a.f("Finished http url fetcher fetch in ");
                f2.append(c.d.a.s.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", f2.toString());
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i2, URL url2, Map<String, String> map) {
        InputStream inputStream;
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e("In re-direct loop", -1, null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f838g);
                httpURLConnection.setReadTimeout(this.f838g);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f839h = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f840i = this.f839h.getInputStream();
                    if (this.f841j) {
                        return null;
                    }
                    int d2 = d(this.f839h);
                    int i3 = d2 / 100;
                    if (i3 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f839h;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.f840i = inputStream;
                            return inputStream;
                        } catch (IOException e2) {
                            throw new e("Failed to obtain InputStream", d(httpURLConnection2), e2);
                        }
                    } else {
                        if (i3 == 3) {
                            z = true;
                        }
                        if (z) {
                            String headerField = this.f839h.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return f(url3, i2 + 1, url, map);
                                } catch (MalformedURLException e3) {
                                    throw new e(c.c.a.a.a.q("Bad redirect url: ", headerField), d2, e3);
                                }
                            } else {
                                throw new e("Received empty or null redirect url", d2, null);
                            }
                        } else if (d2 == -1) {
                            throw new e("Http request failed", d2, null);
                        } else {
                            try {
                                throw new e(this.f839h.getResponseMessage(), d2, null);
                            } catch (IOException e4) {
                                throw new e("Failed to get a response message", d2, e4);
                            }
                        }
                    }
                } catch (IOException e5) {
                    throw new e("Failed to connect or obtain data", d(this.f839h), e5);
                }
            } catch (IOException e6) {
                throw new e("URL.openConnection threw", 0, e6);
            }
        } else {
            throw new e("Too many (> 5) redirects!", -1, null);
        }
    }
}
