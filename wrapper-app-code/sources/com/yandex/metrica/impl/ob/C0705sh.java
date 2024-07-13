package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.sh  reason: case insensitive filesystem */
class C0705sh implements ActivationBarrier.IActivationBarrierCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6790a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ File f6791b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Eh f6792c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0336di f6793d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ C0753uh f6794e;

    C0705sh(C0753uh uhVar, String str, File file, Eh eh, C0336di diVar) {
        this.f6794e = uhVar;
        this.f6790a = str;
        this.f6791b = file;
        this.f6792c = eh;
        this.f6793d = diVar;
    }

    public void onWaitFinished() {
        CacheControlHttpsConnectionPerformer a2 = this.f6794e.f6919d;
        String str = this.f6790a;
        C0753uh uhVar = this.f6794e;
        File file = this.f6791b;
        Eh eh = this.f6792c;
        C0336di diVar = this.f6793d;
        uhVar.getClass();
        a2.performConnection(str, new C0729th(uhVar, diVar, file, eh));
    }
}
