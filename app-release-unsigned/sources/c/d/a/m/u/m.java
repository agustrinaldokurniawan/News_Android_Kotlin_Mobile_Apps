package c.d.a.m.u;

import android.content.res.AssetManager;
import java.io.InputStream;

public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // c.d.a.m.u.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // c.d.a.m.u.b
    public void d(InputStream inputStream) {
        inputStream.close();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // c.d.a.m.u.b
    public InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
