package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzmv implements zzkp, zzmw {
    private final Context zza;
    private final zzmx zzb;
    private final PlaybackSession zzc;
    private final long zzd = SystemClock.elapsedRealtime();
    private final zzcm zze = new zzcm();
    private final zzck zzf = new zzck();
    private final HashMap zzg = new HashMap();
    private final HashMap zzh = new HashMap();
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private int zzl = 0;
    private int zzm = 0;
    private zzbw zzn;
    private zzmu zzo;
    private zzmu zzp;
    private zzmu zzq;
    private zzaf zzr;
    private zzaf zzs;
    private zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    private zzmv(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzmt zzmt = new zzmt(zzmt.zza);
        this.zzb = zzmt;
        zzmt.zzg(this);
    }

    public static zzmv zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmv(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzen.zzl(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        long j;
        long j2;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j);
            Long l2 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(j2);
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzaf zzaf, int i) {
        if (!zzen.zzT(this.zzs, zzaf)) {
            int i2 = this.zzs == null ? 1 : 0;
            this.zzs = zzaf;
            zzx(0, j, zzaf, i2);
        }
    }

    private final void zzu(long j, zzaf zzaf, int i) {
        if (!zzen.zzT(this.zzt, zzaf)) {
            int i2 = this.zzt == null ? 1 : 0;
            this.zzt = zzaf;
            zzx(2, j, zzaf, i2);
        }
    }

    private final void zzv(zzcn zzcn, zzsh zzsh) {
        int zza2;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzsh != null && (zza2 = zzcn.zza(zzsh.zza)) != -1) {
            int i = 0;
            zzcn.zzd(zza2, this.zzf, false);
            zzcn.zze(this.zzf.zzd, this.zze, 0);
            zzay zzay = this.zze.zzd.zzd;
            int i2 = 2;
            if (zzay != null) {
                int zzp2 = zzen.zzp(zzay.zza);
                i = zzp2 != 0 ? zzp2 != 1 ? zzp2 != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            zzcm zzcm = this.zze;
            if (zzcm.zzn != -9223372036854775807L && !zzcm.zzl && !zzcm.zzi && !zzcm.zzb()) {
                builder.setMediaDurationMillis(zzen.zzz(this.zze.zzn));
            }
            if (true != this.zze.zzb()) {
                i2 = 1;
            }
            builder.setPlaybackType(i2);
            this.zzz = true;
        }
    }

    private final void zzw(long j, zzaf zzaf, int i) {
        if (!zzen.zzT(this.zzr, zzaf)) {
            int i2 = this.zzr == null ? 1 : 0;
            this.zzr = zzaf;
            zzx(1, j, zzaf, i2);
        }
    }

    private final void zzx(int i, long j, zzaf zzaf, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzaf != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzaf.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzaf.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzaf.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzaf.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzaf.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzaf.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzaf.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzaf.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzaf.zzd;
            if (str4 != null) {
                String[] zzag = zzen.zzag(str4, "-");
                Pair create = Pair.create(zzag[0], zzag.length >= 2 ? zzag[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f2 = zzaf.zzt;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(zzmu zzmu) {
        return zzmu != null && zzmu.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    public final void zzc(zzkn zzkn, String str) {
        zzsh zzsh = zzkn.zzd;
        if (zzsh == null || !zzsh.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            zzv(zzkn.zzb, zzkn.zzd);
        }
    }

    public final void zzd(zzkn zzkn, String str, boolean z) {
        zzsh zzsh = zzkn.zzd;
        if ((zzsh == null || !zzsh.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    public final /* synthetic */ void zze(zzkn zzkn, zzaf zzaf, zzgt zzgt) {
    }

    public final void zzf(zzkn zzkn, int i, long j, long j2) {
        long j3;
        zzsh zzsh = zzkn.zzd;
        if (zzsh != null) {
            String zze2 = this.zzb.zze(zzkn.zzb, zzsh);
            Long l = (Long) this.zzh.get(zze2);
            Long l2 = (Long) this.zzg.get(zze2);
            HashMap hashMap = this.zzh;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(zze2, Long.valueOf(j3 + j));
            HashMap hashMap2 = this.zzg;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(zze2, Long.valueOf(j4 + ((long) i)));
        }
    }

    public final void zzg(zzkn zzkn, zzsd zzsd) {
        zzsh zzsh = zzkn.zzd;
        if (zzsh != null) {
            zzaf zzaf = zzsd.zzb;
            if (zzaf != null) {
                zzmu zzmu = new zzmu(zzaf, 0, this.zzb.zze(zzkn.zzb, zzsh));
                int i = zzsd.zza;
                if (i != 0) {
                    if (i == 1) {
                        this.zzp = zzmu;
                        return;
                    } else if (i != 2) {
                        if (i == 3) {
                            this.zzq = zzmu;
                            return;
                        }
                        return;
                    }
                }
                this.zzo = zzmu;
                return;
            }
            throw null;
        }
    }

    public final /* synthetic */ void zzh(zzkn zzkn, int i, long j) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.gms.internal.ads.zzcg r21, com.google.android.gms.internal.ads.zzko r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.zzb()
            if (r2 == 0) goto L_0x03f8
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r22.zzb()
            r5 = 11
            if (r3 >= r4) goto L_0x0036
            int r4 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzkn r6 = r1.zzc(r4)
            if (r4 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzmx r4 = r0.zzb
            r4.zzj(r6)
            goto L_0x0033
        L_0x0024:
            if (r4 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.zzmx r4 = r0.zzb
            int r5 = r0.zzk
            r4.zzi(r6, r5)
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.zzmx r4 = r0.zzb
            r4.zzh(r6)
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0036:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.zzd(r2)
            if (r6 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzkn r6 = r1.zzc(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzcn r7 = r6.zzb
            com.google.android.gms.internal.ads.zzsh r6 = r6.zzd
            r0.zzv(r7, r6)
        L_0x004f:
            r6 = 2
            boolean r7 = r1.zzd(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            if (r7 == 0) goto L_0x00c6
            com.google.android.gms.internal.ads.zzcy r7 = r21.zzo()
            com.google.android.gms.internal.ads.zzgau r7 = r7.zza()
            int r12 = r7.size()
            r13 = 0
        L_0x006a:
            if (r13 >= r12) goto L_0x008f
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzcx r14 = (com.google.android.gms.internal.ads.zzcx) r14
            r15 = 0
        L_0x0073:
            int r5 = r14.zzb
            int r5 = r13 + 1
            if (r15 > 0) goto L_0x008b
            boolean r5 = r14.zzd(r15)
            if (r5 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzaf r5 = r14.zzb(r15)
            com.google.android.gms.internal.ads.zzx r5 = r5.zzp
            if (r5 == 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008b:
            r13 = r5
            r5 = 11
            goto L_0x006a
        L_0x008f:
            r5 = r10
        L_0x0090:
            if (r5 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzj
            int r12 = com.google.android.gms.internal.ads.zzen.zza
            r12 = 0
        L_0x0097:
            int r13 = r5.zzb
            if (r12 >= r13) goto L_0x00c2
            com.google.android.gms.internal.ads.zzw r13 = r5.zza(r12)
            java.util.UUID r13 = r13.zza
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zzd
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00ab
            r5 = 3
            goto L_0x00c3
        L_0x00ab:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zze
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b5
            r5 = 2
            goto L_0x00c3
        L_0x00b5:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.zzc
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00bf
            r5 = 6
            goto L_0x00c3
        L_0x00bf:
            int r12 = r12 + 1
            goto L_0x0097
        L_0x00c2:
            r5 = 1
        L_0x00c3:
            r7.setDrmType(r5)
        L_0x00c6:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.zzd(r5)
            if (r5 == 0) goto L_0x00d3
            int r5 = r0.zzy
            int r5 = r5 + r11
            r0.zzy = r5
        L_0x00d3:
            com.google.android.gms.internal.ads.zzbw r5 = r0.zzn
            r16 = 9
            if (r5 != 0) goto L_0x00db
            goto L_0x029a
        L_0x00db:
            android.content.Context r7 = r0.zza
            int r8 = r5.zzb
            r12 = 1001(0x3e9, float:1.403E-42)
            r17 = 14
            r18 = 35
            r19 = 31
            r13 = 21
            r14 = 23
            if (r8 != r12) goto L_0x00f3
            r17 = 20
            r14 = 20
            goto L_0x0274
        L_0x00f3:
            r8 = r5
            com.google.android.gms.internal.ads.zzha r8 = (com.google.android.gms.internal.ads.zzha) r8
            int r12 = r8.zze
            if (r12 != r11) goto L_0x00fc
            r12 = 1
            goto L_0x00fd
        L_0x00fc:
            r12 = 0
        L_0x00fd:
            int r8 = r8.zzi
            java.lang.Throwable r15 = r5.getCause()
            if (r15 == 0) goto L_0x03f7
            boolean r2 = r15 instanceof java.io.IOException
            if (r2 == 0) goto L_0x0203
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfs
            if (r2 == 0) goto L_0x0114
            com.google.android.gms.internal.ads.zzfs r15 = (com.google.android.gms.internal.ads.zzfs) r15
            int r2 = r15.zzd
            r14 = 5
            goto L_0x0274
        L_0x0114:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfr
            if (r2 != 0) goto L_0x01fe
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzbu
            if (r2 == 0) goto L_0x011e
            goto L_0x01fe
        L_0x011e:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfq
            if (r2 != 0) goto L_0x01cb
            boolean r8 = r15 instanceof com.google.android.gms.internal.ads.zzga
            if (r8 == 0) goto L_0x0128
            goto L_0x01cb
        L_0x0128:
            int r2 = r5.zzb
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r7) goto L_0x0133
            r2 = 0
            r14 = 21
            goto L_0x0274
        L_0x0133:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzpg
            if (r2 == 0) goto L_0x0193
            java.lang.Throwable r2 = r15.getCause()
            if (r2 == 0) goto L_0x0192
            int r7 = com.google.android.gms.internal.ads.zzen.zza
            if (r7 < r13) goto L_0x0155
            boolean r7 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r7 == 0) goto L_0x0155
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = com.google.android.gms.internal.ads.zzen.zzm(r2)
            int r17 = zzr(r2)
            goto L_0x026c
        L_0x0155:
            int r7 = com.google.android.gms.internal.ads.zzen.zza
            if (r7 < r14) goto L_0x0164
            boolean r7 = r2 instanceof android.media.MediaDrmResetException
            if (r7 == 0) goto L_0x0164
            r17 = 27
            r2 = 0
            r14 = 27
            goto L_0x0274
        L_0x0164:
            boolean r7 = r2 instanceof android.media.NotProvisionedException
            if (r7 == 0) goto L_0x016f
            r17 = 24
            r2 = 0
            r14 = 24
            goto L_0x0274
        L_0x016f:
            boolean r7 = r2 instanceof android.media.DeniedByServerException
            if (r7 == 0) goto L_0x017a
            r17 = 29
            r2 = 0
            r14 = 29
            goto L_0x0274
        L_0x017a:
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzpr
            if (r7 == 0) goto L_0x0180
            goto L_0x021c
        L_0x0180:
            boolean r2 = r2 instanceof com.google.android.gms.internal.ads.zzpe
            if (r2 == 0) goto L_0x018b
            r17 = 28
            r2 = 0
            r14 = 28
            goto L_0x0274
        L_0x018b:
            r17 = 30
            r2 = 0
            r14 = 30
            goto L_0x0274
        L_0x0192:
            throw r10
        L_0x0193:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfm
            if (r2 == 0) goto L_0x01c6
            java.lang.Throwable r2 = r15.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x01c6
            java.lang.Throwable r2 = r15.getCause()
            if (r2 == 0) goto L_0x01c5
            java.lang.Throwable r2 = r2.getCause()
            int r7 = com.google.android.gms.internal.ads.zzen.zza
            if (r7 < r13) goto L_0x01c0
            boolean r7 = r2 instanceof android.system.ErrnoException
            if (r7 == 0) goto L_0x01c0
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r7 = android.system.OsConstants.EACCES
            if (r2 != r7) goto L_0x01c0
            r17 = 32
            r2 = 0
            r14 = 32
            goto L_0x0274
        L_0x01c0:
            r2 = 0
            r14 = 31
            goto L_0x0274
        L_0x01c5:
            throw r10
        L_0x01c6:
            r2 = 0
            r14 = 9
            goto L_0x0274
        L_0x01cb:
            com.google.android.gms.internal.ads.zzed r7 = com.google.android.gms.internal.ads.zzed.zzb(r7)
            int r7 = r7.zza()
            if (r7 != r11) goto L_0x01d9
            r2 = 0
            r14 = 3
            goto L_0x0274
        L_0x01d9:
            java.lang.Throwable r7 = r15.getCause()
            boolean r8 = r7 instanceof java.net.UnknownHostException
            if (r8 == 0) goto L_0x01e5
            r2 = 0
            r14 = 6
            goto L_0x0274
        L_0x01e5:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01ed
            r2 = 0
            r14 = 7
            goto L_0x0274
        L_0x01ed:
            if (r2 == 0) goto L_0x01f9
            com.google.android.gms.internal.ads.zzfq r15 = (com.google.android.gms.internal.ads.zzfq) r15
            int r2 = r15.zzc
            if (r2 != r11) goto L_0x01f9
            r2 = 0
            r14 = 4
            goto L_0x0274
        L_0x01f9:
            r2 = 0
            r14 = 8
            goto L_0x0274
        L_0x01fe:
            r2 = 0
            r14 = 11
            goto L_0x0274
        L_0x0203:
            if (r12 == 0) goto L_0x020e
            if (r8 == 0) goto L_0x0209
            if (r8 != r11) goto L_0x020e
        L_0x0209:
            r2 = 0
            r14 = 35
            goto L_0x0274
        L_0x020e:
            if (r12 == 0) goto L_0x0218
            if (r8 != r9) goto L_0x0218
            r17 = 15
            r2 = 0
            r14 = 15
            goto L_0x0274
        L_0x0218:
            if (r12 == 0) goto L_0x021e
            if (r8 != r6) goto L_0x021e
        L_0x021c:
            r2 = 0
            goto L_0x0274
        L_0x021e:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqo
            if (r2 == 0) goto L_0x022d
            com.google.android.gms.internal.ads.zzqo r15 = (com.google.android.gms.internal.ads.zzqo) r15
            java.lang.String r2 = r15.zzd
            int r2 = com.google.android.gms.internal.ads.zzen.zzm(r2)
            r14 = 13
            goto L_0x0274
        L_0x022d:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqk
            if (r2 == 0) goto L_0x023c
            com.google.android.gms.internal.ads.zzqk r15 = (com.google.android.gms.internal.ads.zzqk) r15
            java.lang.String r2 = r15.zzb
            int r2 = com.google.android.gms.internal.ads.zzen.zzm(r2)
        L_0x0239:
            r14 = 14
            goto L_0x0274
        L_0x023c:
            boolean r2 = r15 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x0242
            r2 = 0
            goto L_0x0239
        L_0x0242:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzns
            if (r2 == 0) goto L_0x024f
            com.google.android.gms.internal.ads.zzns r15 = (com.google.android.gms.internal.ads.zzns) r15
            int r2 = r15.zza
            r17 = 17
            r14 = 17
            goto L_0x0274
        L_0x024f:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zznv
            if (r2 == 0) goto L_0x025c
            com.google.android.gms.internal.ads.zznv r15 = (com.google.android.gms.internal.ads.zznv) r15
            int r2 = r15.zza
            r17 = 18
            r14 = 18
            goto L_0x0274
        L_0x025c:
            int r2 = com.google.android.gms.internal.ads.zzen.zza
            boolean r2 = r15 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x026f
            android.media.MediaCodec$CryptoException r15 = (android.media.MediaCodec.CryptoException) r15
            int r2 = r15.getErrorCode()
            int r17 = zzr(r2)
        L_0x026c:
            r14 = r17
            goto L_0x0274
        L_0x026f:
            r17 = 22
            r2 = 0
            r14 = 22
        L_0x0274:
            android.media.metrics.PlaybackSession r7 = r0.zzc
            android.media.metrics.PlaybackErrorEvent$Builder r8 = new android.media.metrics.PlaybackErrorEvent$Builder
            r8.<init>()
            long r12 = r0.zzd
            long r12 = r3 - r12
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setErrorCode(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r8.setSubErrorCode(r2)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r2.setException(r5)
            android.media.metrics.PlaybackErrorEvent r2 = r2.build()
            r7.reportPlaybackErrorEvent(r2)
            r0.zzz = r11
            r0.zzn = r10
        L_0x029a:
            boolean r2 = r1.zzd(r6)
            if (r2 == 0) goto L_0x02c9
            com.google.android.gms.internal.ads.zzcy r2 = r21.zzo()
            boolean r5 = r2.zzb(r6)
            boolean r7 = r2.zzb(r11)
            boolean r2 = r2.zzb(r9)
            if (r5 != 0) goto L_0x02b7
            if (r7 != 0) goto L_0x02b7
            if (r2 == 0) goto L_0x02c9
            r2 = 1
        L_0x02b7:
            if (r5 != 0) goto L_0x02be
            r5 = 0
            r0.zzw(r3, r10, r5)
            goto L_0x02bf
        L_0x02be:
            r5 = 0
        L_0x02bf:
            if (r7 != 0) goto L_0x02c4
            r0.zzt(r3, r10, r5)
        L_0x02c4:
            if (r2 != 0) goto L_0x02c9
            r0.zzu(r3, r10, r5)
        L_0x02c9:
            com.google.android.gms.internal.ads.zzmu r2 = r0.zzo
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02e3
            com.google.android.gms.internal.ads.zzmu r2 = r0.zzo
            com.google.android.gms.internal.ads.zzaf r5 = r2.zza
            int r7 = r5.zzs
            r8 = -1
            if (r7 == r8) goto L_0x02e3
            int r2 = r2.zzb
            r7 = 0
            r0.zzw(r3, r5, r7)
            r0.zzo = r10
            goto L_0x02e4
        L_0x02e3:
            r7 = 0
        L_0x02e4:
            com.google.android.gms.internal.ads.zzmu r2 = r0.zzp
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x02f7
            com.google.android.gms.internal.ads.zzmu r2 = r0.zzp
            com.google.android.gms.internal.ads.zzaf r5 = r2.zza
            int r2 = r2.zzb
            r0.zzt(r3, r5, r7)
            r0.zzp = r10
        L_0x02f7:
            com.google.android.gms.internal.ads.zzmu r2 = r0.zzq
            boolean r2 = r0.zzy(r2)
            if (r2 == 0) goto L_0x030a
            com.google.android.gms.internal.ads.zzmu r2 = r0.zzq
            com.google.android.gms.internal.ads.zzaf r5 = r2.zza
            int r2 = r2.zzb
            r0.zzu(r3, r5, r7)
            r0.zzq = r10
        L_0x030a:
            android.content.Context r2 = r0.zza
            com.google.android.gms.internal.ads.zzed r2 = com.google.android.gms.internal.ads.zzed.zzb(r2)
            int r2 = r2.zza()
            switch(r2) {
                case 0: goto L_0x032b;
                case 1: goto L_0x0328;
                case 2: goto L_0x0326;
                case 3: goto L_0x0324;
                case 4: goto L_0x0322;
                case 5: goto L_0x0320;
                case 6: goto L_0x0317;
                case 7: goto L_0x031e;
                case 8: goto L_0x0317;
                case 9: goto L_0x031b;
                case 10: goto L_0x0319;
                default: goto L_0x0317;
            }
        L_0x0317:
            r13 = 1
            goto L_0x032c
        L_0x0319:
            r13 = 7
            goto L_0x032c
        L_0x031b:
            r13 = 8
            goto L_0x032c
        L_0x031e:
            r13 = 3
            goto L_0x032c
        L_0x0320:
            r13 = 6
            goto L_0x032c
        L_0x0322:
            r13 = 5
            goto L_0x032c
        L_0x0324:
            r13 = 4
            goto L_0x032c
        L_0x0326:
            r13 = 2
            goto L_0x032c
        L_0x0328:
            r13 = 9
            goto L_0x032c
        L_0x032b:
            r13 = 0
        L_0x032c:
            int r2 = r0.zzm
            if (r13 == r2) goto L_0x034c
            r0.zzm = r13
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r13)
            long r7 = r0.zzd
            long r7 = r3 - r7
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r7)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r2.reportNetworkEvent(r5)
        L_0x034c:
            int r2 = r21.zzh()
            if (r2 == r6) goto L_0x0356
            r2 = 0
            r0.zzu = r2
            goto L_0x0357
        L_0x0356:
            r2 = 0
        L_0x0357:
            r5 = r21
            com.google.android.gms.internal.ads.zzkd r5 = (com.google.android.gms.internal.ads.zzkd) r5
            com.google.android.gms.internal.ads.zzha r5 = r5.zzw()
            r7 = 10
            if (r5 != 0) goto L_0x0366
            r0.zzv = r2
            goto L_0x036e
        L_0x0366:
            boolean r2 = r1.zzd(r7)
            if (r2 == 0) goto L_0x036e
            r0.zzv = r11
        L_0x036e:
            int r2 = r21.zzh()
            boolean r5 = r0.zzu
            if (r5 == 0) goto L_0x0378
            r5 = 5
            goto L_0x03c2
        L_0x0378:
            boolean r5 = r0.zzv
            if (r5 == 0) goto L_0x037f
            r5 = 13
            goto L_0x03c2
        L_0x037f:
            r5 = 4
            if (r2 != r5) goto L_0x0385
            r5 = 11
            goto L_0x03c2
        L_0x0385:
            if (r2 != r6) goto L_0x03a3
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x03a1
            if (r2 != r6) goto L_0x038e
            goto L_0x03a1
        L_0x038e:
            boolean r2 = r21.zzq()
            if (r2 != 0) goto L_0x0396
            r5 = 7
            goto L_0x03c2
        L_0x0396:
            int r2 = r21.zzi()
            if (r2 == 0) goto L_0x039f
            r5 = 10
            goto L_0x03c2
        L_0x039f:
            r5 = 6
            goto L_0x03c2
        L_0x03a1:
            r5 = 2
            goto L_0x03c2
        L_0x03a3:
            if (r2 != r9) goto L_0x03b7
            boolean r2 = r21.zzq()
            if (r2 != 0) goto L_0x03ac
            goto L_0x03c2
        L_0x03ac:
            int r2 = r21.zzi()
            if (r2 == 0) goto L_0x03b5
            r5 = 9
            goto L_0x03c2
        L_0x03b5:
            r5 = 3
            goto L_0x03c2
        L_0x03b7:
            if (r2 != r11) goto L_0x03c0
            int r2 = r0.zzl
            if (r2 == 0) goto L_0x03c0
            r5 = 12
            goto L_0x03c2
        L_0x03c0:
            int r5 = r0.zzl
        L_0x03c2:
            int r2 = r0.zzl
            if (r2 == r5) goto L_0x03e5
            r0.zzl = r5
            r0.zzz = r11
            android.media.metrics.PlaybackSession r2 = r0.zzc
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.zzl
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.zzd
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03e5:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.zzd(r2)
            if (r3 == 0) goto L_0x03f6
            com.google.android.gms.internal.ads.zzmx r3 = r0.zzb
            com.google.android.gms.internal.ads.zzkn r1 = r1.zzc(r2)
            r3.zzf(r1)
        L_0x03f6:
            return
        L_0x03f7:
            throw r10
        L_0x03f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmv.zzi(com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzko):void");
    }

    public final void zzj(zzkn zzkn, zzry zzry, zzsd zzsd, IOException iOException, boolean z) {
    }

    public final /* synthetic */ void zzk(zzkn zzkn, int i) {
    }

    public final void zzl(zzkn zzkn, zzbw zzbw) {
        this.zzn = zzbw;
    }

    public final void zzm(zzkn zzkn, zzcf zzcf, zzcf zzcf2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    public final /* synthetic */ void zzn(zzkn zzkn, Object obj, long j) {
    }

    public final void zzo(zzkn zzkn, zzgs zzgs) {
        this.zzw += zzgs.zzg;
        this.zzx += zzgs.zze;
    }

    public final /* synthetic */ void zzp(zzkn zzkn, zzaf zzaf, zzgt zzgt) {
    }

    public final void zzq(zzkn zzkn, zzda zzda) {
        zzmu zzmu = this.zzo;
        if (zzmu != null) {
            zzaf zzaf = zzmu.zza;
            if (zzaf.zzs == -1) {
                zzad zzb2 = zzaf.zzb();
                zzb2.zzX(zzda.zzc);
                zzb2.zzF(zzda.zzd);
                this.zzo = new zzmu(zzb2.zzY(), 0, zzmu.zzc);
            }
        }
    }
}
