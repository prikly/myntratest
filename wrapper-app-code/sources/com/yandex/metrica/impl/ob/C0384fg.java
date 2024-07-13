package com.yandex.metrica.impl.ob;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0334dg;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.fg  reason: case insensitive filesystem */
class C0384fg implements Callable<C0334dg> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0409gg f5817a;

    C0384fg(C0409gg ggVar) {
        this.f5817a = ggVar;
    }

    public Object call() throws Exception {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f5817a.f5869a.getContentResolver();
        C0409gg ggVar = this.f5817a;
        Cursor unused = ggVar.f5870b = contentResolver.query(parse, (String[]) null, (String) null, new String[]{ggVar.f5869a.getPackageName()}, (String) null);
        if (this.f5817a.f5870b != null && this.f5817a.f5870b.moveToFirst()) {
            String string = this.f5817a.f5870b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C0334dg(string, this.f5817a.f5870b.getLong(1), this.f5817a.f5870b.getLong(2), C0334dg.a.HMS);
            }
        }
        return null;
    }
}
