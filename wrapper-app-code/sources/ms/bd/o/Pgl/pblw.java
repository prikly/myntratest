package ms.bd.o.Pgl;

import java.io.File;
import java.io.FilenameFilter;

class pblw implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f9732a;

    pblw(pblv pblv, String str) {
        this.f9732a = str;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.f9732a);
    }
}
