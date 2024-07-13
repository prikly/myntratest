package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: BaseProxy */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3351a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3352b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected a(IBinder iBinder) {
        this.f3351a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3352b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f3351a;
    }

    /* access modifiers changed from: protected */
    public final Parcel b(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f3351a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }
}
