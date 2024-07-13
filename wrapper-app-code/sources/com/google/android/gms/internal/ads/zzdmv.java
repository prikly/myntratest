package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdmv extends zzdan {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdlk zze;
    private final zzdoe zzf;
    private final zzdbh zzg;
    private final zzfsk zzh;
    private final zzdfa zzi;
    private boolean zzj = false;

    zzdmv(zzdam zzdam, Context context, zzcno zzcno, zzdlk zzdlk, zzdoe zzdoe, zzdbh zzdbh, zzfsk zzfsk, zzdfa zzdfa) {
        super(zzdam);
        this.zzc = context;
        this.zzd = new WeakReference(zzcno);
        this.zze = zzdlk;
        this.zzf = zzdoe;
        this.zzg = zzdbh;
        this.zzh = zzfsk;
        this.zzi = zzdfa;
    }

    public final void finalize() throws Throwable {
        try {
            zzcno zzcno = (zzcno) this.zzd.get();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzgg)).booleanValue()) {
                if (!this.zzj && zzcno != null) {
                    zzcib.zze.execute(new zzdmu(zzcno));
                }
            } else if (zzcno != null) {
                zzcno.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final boolean zzc(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzdlk r0 = r4.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzay
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x004d
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r0 = r4.zzc
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzC(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.zze.zzj(r5)
            com.google.android.gms.internal.ads.zzdfa r5 = r4.zzi
            r5.zzb()
            com.google.android.gms.internal.ads.zzbjb r5 = com.google.android.gms.internal.ads.zzbjj.zzaz
            com.google.android.gms.internal.ads.zzbjh r6 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.zzfsk r5 = r4.zzh
            com.google.android.gms.internal.ads.zzfix r6 = r4.zza
            com.google.android.gms.internal.ads.zzfiw r6 = r6.zzb
            com.google.android.gms.internal.ads.zzfio r6 = r6.zzb
            java.lang.String r6 = r6.zzb
            r5.zza(r6)
            goto L_0x0080
        L_0x004d:
            boolean r0 = r4.zzj
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "The interstitial ad has been showed."
            com.google.android.gms.ads.internal.util.zze.zzj(r0)
            com.google.android.gms.internal.ads.zzdfa r0 = r4.zzi
            r2 = 10
            r3 = 0
            com.google.android.gms.ads.internal.client.zze r2 = com.google.android.gms.internal.ads.zzfkg.zzd(r2, r3, r3)
            r0.zza(r2)
        L_0x0062:
            boolean r0 = r4.zzj
            if (r0 != 0) goto L_0x0080
            if (r6 != 0) goto L_0x006a
            android.content.Context r6 = r4.zzc
        L_0x006a:
            com.google.android.gms.internal.ads.zzdoe r0 = r4.zzf     // Catch:{ zzdod -> 0x007a }
            com.google.android.gms.internal.ads.zzdfa r2 = r4.zzi     // Catch:{ zzdod -> 0x007a }
            r0.zza(r5, r6, r2)     // Catch:{ zzdod -> 0x007a }
            com.google.android.gms.internal.ads.zzdlk r5 = r4.zze     // Catch:{ zzdod -> 0x007a }
            r5.zza()     // Catch:{ zzdod -> 0x007a }
            r5 = 1
            r4.zzj = r5
            return r5
        L_0x007a:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzdfa r6 = r4.zzi
            r6.zzc(r5)
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmv.zzc(boolean, android.app.Activity):boolean");
    }
}
