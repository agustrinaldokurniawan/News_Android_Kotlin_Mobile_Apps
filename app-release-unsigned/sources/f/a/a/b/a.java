package f.a.a.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f.a.a.b.b;
import java.util.Objects;

public interface a extends IInterface {

    /* renamed from: f.a.a.b.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0058a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: f.a.a.b.a$a$a  reason: collision with other inner class name */
        public static class C0059a implements a {
            public IBinder a;

            public C0059a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public AbstractBinderC0058a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                b.BinderC0060b bVar = (b.BinderC0060b) this;
                Objects.requireNonNull(b.this);
                b.this.j(readInt, bundle);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }
}
