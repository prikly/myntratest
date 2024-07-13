package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzabh implements zzaaz {
    public final zzgau zza;
    private final int zzb;

    private zzabh(int i, zzgau zzgau) {
        this.zzb = i;
        this.zza = zzgau;
    }

    public static zzabh zzc(int i, zzef zzef) {
        String str;
        zzef zzef2 = zzef;
        zzgar zzgar = new zzgar();
        int zzd = zzef.zzd();
        int i2 = -2;
        while (zzef.zza() > 8) {
            int zzg = zzef.zzg();
            int zzc = zzef.zzc() + zzef.zzg();
            zzef2.zzE(zzc);
            zzaaz zzaaz = null;
            if (zzg != 1414744396) {
                switch (zzg) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 != 1) {
                                zzdw.zze("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzen.zzO(i2)));
                                break;
                            } else {
                                int zzi = zzef.zzi();
                                String str2 = zzi != 1 ? zzi != 85 ? zzi != 255 ? zzi != 8192 ? zzi != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int zzi2 = zzef.zzi();
                                    int zzg2 = zzef.zzg();
                                    zzef2.zzG(6);
                                    int zzn = zzen.zzn(zzef.zzo());
                                    int zzi3 = zzef.zzi();
                                    byte[] bArr = new byte[zzi3];
                                    zzef2.zzB(bArr, 0, zzi3);
                                    zzad zzad = new zzad();
                                    zzad.zzS(str2);
                                    zzad.zzw(zzi2);
                                    zzad.zzT(zzg2);
                                    if ("audio/raw".equals(str2) && zzn != 0) {
                                        zzad.zzN(zzn);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && zzi3 > 0) {
                                        zzad.zzI(zzgau.zzp(bArr));
                                    }
                                    zzaaz = new zzabi(zzad.zzY());
                                    break;
                                } else {
                                    zzdw.zze("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzi);
                                    break;
                                }
                            }
                        } else {
                            zzef2.zzG(4);
                            int zzg3 = zzef.zzg();
                            int zzg4 = zzef.zzg();
                            zzef2.zzG(4);
                            int zzg5 = zzef.zzg();
                            switch (zzg5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                zzad zzad2 = new zzad();
                                zzad2.zzX(zzg3);
                                zzad2.zzF(zzg4);
                                zzad2.zzS(str);
                                zzaaz = new zzabi(zzad2.zzY());
                                break;
                            } else {
                                zzdw.zze("StreamFormatChunk", "Ignoring track with unsupported compression " + zzg5);
                                break;
                            }
                        }
                    case 1751742049:
                        zzaaz = zzabe.zzb(zzef);
                        break;
                    case 1752331379:
                        zzaaz = zzabf.zzb(zzef);
                        break;
                    case 1852994675:
                        zzaaz = zzabj.zzb(zzef);
                        break;
                }
            } else {
                zzaaz = zzc(zzef.zzg(), zzef2);
            }
            if (zzaaz != null) {
                if (zzaaz.zza() == 1752331379) {
                    int i3 = ((zzabf) zzaaz).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzdw.zze("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzgar.zze(zzaaz);
            }
            zzef2.zzF(zzc);
            zzef2.zzE(zzd);
        }
        return new zzabh(i, zzgar.zzg());
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzaaz zzb(Class cls) {
        zzgau zzgau = this.zza;
        int size = zzgau.size();
        int i = 0;
        while (i < size) {
            zzaaz zzaaz = (zzaaz) zzgau.get(i);
            i++;
            if (zzaaz.getClass() == cls) {
                return zzaaz;
            }
        }
        return null;
    }
}
