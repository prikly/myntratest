package com.appodeal.ads.utils;

import android.content.DialogInterface;

public final class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f17515a;

    public g(h hVar) {
        this.f17515a = hVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        h hVar = this.f17515a;
        if (i == 0) {
            hVar.sort(new i());
        } else if (i != 1) {
            hVar.getClass();
        } else {
            hVar.sort(new j());
        }
        dialogInterface.dismiss();
    }
}
