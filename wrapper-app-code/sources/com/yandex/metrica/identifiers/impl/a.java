package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private IBinder f3643a;

    a(IBinder iBinder) {
        this.f3643a = iBinder;
    }

    public IBinder asBinder() {
        return this.f3643a;
    }

    public String b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.f3643a.transact(1, obtain, obtain2, 0)) {
                int i = b.f3644a;
            }
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public boolean d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            boolean z = false;
            if (!this.f3643a.transact(2, obtain, obtain2, 0)) {
                int i = b.f3644a;
            }
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
