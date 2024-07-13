package com.applovin.exoplayer2.k;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface d {

    public interface a {

        /* renamed from: com.applovin.exoplayer2.k.d$a$a  reason: collision with other inner class name */
        public static final class C0134a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList<C0135a> f13345a = new CopyOnWriteArrayList<>();

            /* renamed from: com.applovin.exoplayer2.k.d$a$a$a  reason: collision with other inner class name */
            private static final class C0135a {
                /* access modifiers changed from: private */

                /* renamed from: a  reason: collision with root package name */
                public final Handler f13346a;
                /* access modifiers changed from: private */

                /* renamed from: b  reason: collision with root package name */
                public final a f13347b;
                /* access modifiers changed from: private */

                /* renamed from: c  reason: collision with root package name */
                public boolean f13348c;

                public C0135a(Handler handler, a aVar) {
                    this.f13346a = handler;
                    this.f13347b = aVar;
                }

                public void a() {
                    this.f13348c = true;
                }
            }

            public void a(int i, long j, long j2) {
                Iterator<C0135a> it = this.f13345a.iterator();
                while (it.hasNext()) {
                    C0135a next = it.next();
                    if (!next.f13348c) {
                        next.f13346a.post(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0026: INVOKE  
                              (wrap: android.os.Handler : 0x0019: INVOKE  (r1v3 android.os.Handler) = (r3v1 'next' com.applovin.exoplayer2.k.d$a$a$a) com.applovin.exoplayer2.k.d.a.a.a.c(com.applovin.exoplayer2.k.d$a$a$a):android.os.Handler type: STATIC)
                              (wrap: com.applovin.exoplayer2.k.-$$Lambda$d$a$a$DPKCdAieZSJU3_cS2AJJudqADpU : 0x0023: CONSTRUCTOR  (r2v0 com.applovin.exoplayer2.k.-$$Lambda$d$a$a$DPKCdAieZSJU3_cS2AJJudqADpU) = 
                              (r3v1 'next' com.applovin.exoplayer2.k.d$a$a$a)
                              (r11v0 'i' int)
                              (r12v0 'j' long)
                              (r14v0 'j2' long)
                             call: com.applovin.exoplayer2.k.-$$Lambda$d$a$a$DPKCdAieZSJU3_cS2AJJudqADpU.<init>(com.applovin.exoplayer2.k.d$a$a$a, int, long, long):void type: CONSTRUCTOR)
                             android.os.Handler.post(java.lang.Runnable):boolean type: VIRTUAL in method: com.applovin.exoplayer2.k.d.a.a.a(int, long, long):void, dex: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: CONSTRUCTOR  (r2v0 com.applovin.exoplayer2.k.-$$Lambda$d$a$a$DPKCdAieZSJU3_cS2AJJudqADpU) = 
                              (r3v1 'next' com.applovin.exoplayer2.k.d$a$a$a)
                              (r11v0 'i' int)
                              (r12v0 'j' long)
                              (r14v0 'j2' long)
                             call: com.applovin.exoplayer2.k.-$$Lambda$d$a$a$DPKCdAieZSJU3_cS2AJJudqADpU.<init>(com.applovin.exoplayer2.k.d$a$a$a, int, long, long):void type: CONSTRUCTOR in method: com.applovin.exoplayer2.k.d.a.a.a(int, long, long):void, dex: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	... 69 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.applovin.exoplayer2.k.-$$Lambda$d$a$a$DPKCdAieZSJU3_cS2AJJudqADpU, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	... 75 more
                            */
                        /*
                            this = this;
                            java.util.concurrent.CopyOnWriteArrayList<com.applovin.exoplayer2.k.d$a$a$a> r0 = r10.f13345a
                            java.util.Iterator r0 = r0.iterator()
                        L_0x0006:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L_0x002a
                            java.lang.Object r1 = r0.next()
                            r3 = r1
                            com.applovin.exoplayer2.k.d$a$a$a r3 = (com.applovin.exoplayer2.k.d.a.C0134a.C0135a) r3
                            boolean r1 = r3.f13348c
                            if (r1 != 0) goto L_0x0006
                            android.os.Handler r1 = r3.f13346a
                            com.applovin.exoplayer2.k.-$$Lambda$d$a$a$DPKCdAieZSJU3_cS2AJJudqADpU r9 = new com.applovin.exoplayer2.k.-$$Lambda$d$a$a$DPKCdAieZSJU3_cS2AJJudqADpU
                            r2 = r9
                            r4 = r11
                            r5 = r12
                            r7 = r14
                            r2.<init>(r3, r4, r5, r7)
                            r1.post(r9)
                            goto L_0x0006
                        L_0x002a:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.k.d.a.C0134a.a(int, long, long):void");
                    }

                    public void a(Handler handler, a aVar) {
                        com.applovin.exoplayer2.l.a.b(handler);
                        com.applovin.exoplayer2.l.a.b(aVar);
                        a(aVar);
                        this.f13345a.add(new C0135a(handler, aVar));
                    }

                    public void a(a aVar) {
                        Iterator<C0135a> it = this.f13345a.iterator();
                        while (it.hasNext()) {
                            C0135a next = it.next();
                            if (next.f13347b == aVar) {
                                next.a();
                                this.f13345a.remove(next);
                            }
                        }
                    }
                }

                void b(int i, long j, long j2);
            }

            aa a();

            void a(Handler handler, a aVar);

            void a(a aVar);
        }
