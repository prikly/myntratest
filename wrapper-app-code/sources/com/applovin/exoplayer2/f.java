package com.applovin.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;

public final class f extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private static final int f12487a = (ai.f13525a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536);

    /* renamed from: b  reason: collision with root package name */
    private final s<Bundle> f12488b;

    public static s<Bundle> a(IBinder iBinder) {
        int readInt;
        s.a i = s.i();
        int i2 = 1;
        int i3 = 0;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i3);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    i.a((Bundle) a.b(obtain2.readBundle()));
                    i3++;
                }
                obtain2.recycle();
                obtain.recycle();
                i2 = readInt;
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return i.a();
    }

    /* access modifiers changed from: protected */
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        int size = this.f12488b.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f12487a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.f12488b.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
