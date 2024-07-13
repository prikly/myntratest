package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzgxx {
    private static final Logger zza = Logger.getLogger(zzgxk.class.getName());
    private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzgxx() {
    }

    static zzgxp zzb(Class cls) {
        String str;
        Class<zzgxx> cls2 = zzgxx.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(zzgxp.class)) {
            str = zzb;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (zzgxp) cls.cast(((zzgxx) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException(e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException(e5);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzgxp) cls.cast(((zzgxx) it.next()).zza()));
                } catch (ServiceConfigurationError e6) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), e6);
                }
            }
            if (arrayList.size() == 1) {
                return (zzgxp) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzgxp) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract zzgxp zza();
}
