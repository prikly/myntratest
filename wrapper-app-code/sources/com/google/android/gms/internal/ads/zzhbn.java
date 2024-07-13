package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public enum zzhbn {
    DOUBLE(zzhbo.DOUBLE, 1),
    FLOAT(zzhbo.FLOAT, 5),
    INT64(zzhbo.LONG, 0),
    UINT64(zzhbo.LONG, 0),
    INT32(zzhbo.INT, 0),
    FIXED64(zzhbo.LONG, 1),
    FIXED32(zzhbo.INT, 5),
    BOOL(zzhbo.BOOLEAN, 0),
    STRING(zzhbo.STRING, 2),
    GROUP(zzhbo.MESSAGE, 3),
    MESSAGE(zzhbo.MESSAGE, 2),
    BYTES(zzhbo.BYTE_STRING, 2),
    UINT32(zzhbo.INT, 0),
    ENUM(zzhbo.ENUM, 0),
    SFIXED32(zzhbo.INT, 5),
    SFIXED64(zzhbo.LONG, 1),
    SINT32(zzhbo.INT, 0),
    SINT64(zzhbo.LONG, 0);
    
    private final zzhbo zzt;

    private zzhbn(zzhbo zzhbo, int i) {
        this.zzt = zzhbo;
    }

    public final zzhbo zza() {
        return this.zzt;
    }
}
