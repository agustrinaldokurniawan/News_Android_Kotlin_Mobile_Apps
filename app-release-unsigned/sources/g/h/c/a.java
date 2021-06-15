package g.h.c;

import android.content.Context;
import android.os.Process;

public class a {
    public static final Object a = new Object();

    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
