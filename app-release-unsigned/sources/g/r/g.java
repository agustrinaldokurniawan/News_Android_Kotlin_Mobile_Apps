package g.r;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface g extends IInterface {

    public static abstract class a extends Binder implements g {
        public static final /* synthetic */ int a = 0;

        /* renamed from: g.r.g$a$a  reason: collision with other inner class name */
        public static class C0094a implements g {
            public IBinder a;

            public C0094a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // g.r.g
            public void a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (!this.a.transact(1, obtain, null, 1)) {
                        int i2 = a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static g b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new C0094a(iBinder) : (g) queryLocalInterface;
        }
    }

    void a(String[] strArr);
}
