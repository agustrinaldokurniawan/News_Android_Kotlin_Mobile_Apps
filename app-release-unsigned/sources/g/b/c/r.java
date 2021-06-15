package g.b.c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

public class r {
    public static r a;
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public final LocationManager f1899c;

    /* renamed from: d  reason: collision with root package name */
    public final a f1900d = new a();

    public static class a {
        public boolean a;
        public long b;
    }

    public r(Context context, LocationManager locationManager) {
        this.b = context;
        this.f1899c = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f1899c.isProviderEnabled(str)) {
                return this.f1899c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
