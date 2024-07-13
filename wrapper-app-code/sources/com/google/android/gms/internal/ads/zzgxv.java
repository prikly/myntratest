package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public enum zzgxv {
    DOUBLE(0, 1, zzgyr.DOUBLE),
    FLOAT(1, 1, zzgyr.FLOAT),
    INT64(2, 1, zzgyr.LONG),
    UINT64(3, 1, zzgyr.LONG),
    INT32(4, 1, zzgyr.INT),
    FIXED64(5, 1, zzgyr.LONG),
    FIXED32(6, 1, zzgyr.INT),
    BOOL(7, 1, zzgyr.BOOLEAN),
    STRING(8, 1, zzgyr.STRING),
    MESSAGE(9, 1, zzgyr.MESSAGE),
    BYTES(10, 1, zzgyr.BYTE_STRING),
    UINT32(11, 1, zzgyr.INT),
    ENUM(12, 1, zzgyr.ENUM),
    SFIXED32(13, 1, zzgyr.INT),
    SFIXED64(14, 1, zzgyr.LONG),
    SINT32(15, 1, zzgyr.INT),
    SINT64(16, 1, zzgyr.LONG),
    GROUP(17, 1, zzgyr.MESSAGE),
    DOUBLE_LIST(18, 2, zzgyr.DOUBLE),
    FLOAT_LIST(19, 2, zzgyr.FLOAT),
    INT64_LIST(20, 2, zzgyr.LONG),
    UINT64_LIST(21, 2, zzgyr.LONG),
    INT32_LIST(22, 2, zzgyr.INT),
    FIXED64_LIST(23, 2, zzgyr.LONG),
    FIXED32_LIST(24, 2, zzgyr.INT),
    BOOL_LIST(25, 2, zzgyr.BOOLEAN),
    STRING_LIST(26, 2, zzgyr.STRING),
    MESSAGE_LIST(27, 2, zzgyr.MESSAGE),
    BYTES_LIST(28, 2, zzgyr.BYTE_STRING),
    UINT32_LIST(29, 2, zzgyr.INT),
    ENUM_LIST(30, 2, zzgyr.ENUM),
    SFIXED32_LIST(31, 2, zzgyr.INT),
    SFIXED64_LIST(32, 2, zzgyr.LONG),
    SINT32_LIST(33, 2, zzgyr.INT),
    SINT64_LIST(34, 2, zzgyr.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzgyr.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzgyr.FLOAT),
    INT64_LIST_PACKED(37, 3, zzgyr.LONG),
    UINT64_LIST_PACKED(38, 3, zzgyr.LONG),
    INT32_LIST_PACKED(39, 3, zzgyr.INT),
    FIXED64_LIST_PACKED(40, 3, zzgyr.LONG),
    FIXED32_LIST_PACKED(41, 3, zzgyr.INT),
    BOOL_LIST_PACKED(42, 3, zzgyr.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzgyr.INT),
    ENUM_LIST_PACKED(44, 3, zzgyr.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzgyr.INT),
    SFIXED64_LIST_PACKED(46, 3, zzgyr.LONG),
    SINT32_LIST_PACKED(47, 3, zzgyr.INT),
    SINT64_LIST_PACKED(48, 3, zzgyr.LONG),
    GROUP_LIST(49, 2, zzgyr.MESSAGE),
    MAP(50, 4, zzgyr.VOID);
    
    private static final zzgxv[] zzZ = null;
    private final zzgyr zzab;
    private final int zzac;
    private final Class zzad;

    static {
        int i;
        zzZ = new zzgxv[r1];
        for (zzgxv zzgxv : values()) {
            zzZ[zzgxv.zzac] = zzgxv;
        }
    }

    private zzgxv(int i, int i2, zzgyr zzgyr) {
        this.zzac = i;
        this.zzab = zzgyr;
        zzgyr zzgyr2 = zzgyr.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzad = zzgyr.zza();
        } else if (i3 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzgyr.zza();
        }
        if (i2 == 1) {
            zzgyr.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
