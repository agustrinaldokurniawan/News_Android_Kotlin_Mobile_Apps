package g.r;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import g.r.g;

public abstract class h extends Binder implements IInterface {
    public h() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int c2 = ((MultiInstanceInvalidationService.b) this).c(g.a.b(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(c2);
            return true;
        } else if (i2 == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            g b = g.a.b(parcel.readStrongBinder());
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.b bVar = (MultiInstanceInvalidationService.b) this;
            synchronized (MultiInstanceInvalidationService.this.f320g) {
                MultiInstanceInvalidationService.this.f320g.unregister(b);
                MultiInstanceInvalidationService.this.f319f.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i2 == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).b(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i2 != 1598968902) {
            return super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
