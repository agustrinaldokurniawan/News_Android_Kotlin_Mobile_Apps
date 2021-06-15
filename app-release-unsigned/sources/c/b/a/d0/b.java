package c.b.a.d0;

import java.net.HttpURLConnection;
import java.net.URL;

public class b {
    public a a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
