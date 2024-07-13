package com.google.gson;

import com.google.gson.internal.Excluder;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GsonBuilder {
    private boolean complexMapKeySerialization = false;
    private String datePattern = Gson.DEFAULT_DATE_PATTERN;
    private int dateStyle = 2;
    private boolean escapeHtmlChars = true;
    private Excluder excluder = Excluder.DEFAULT;
    private final List<TypeAdapterFactory> factories = new ArrayList();
    private FieldNamingStrategy fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
    private boolean generateNonExecutableJson = false;
    private final List<TypeAdapterFactory> hierarchyFactories = new ArrayList();
    private final Map<Type, InstanceCreator<?>> instanceCreators = new HashMap();
    private boolean lenient = false;
    private LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
    private ToNumberStrategy numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
    private ToNumberStrategy objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
    private boolean prettyPrinting = false;
    private boolean serializeNulls = false;
    private boolean serializeSpecialFloatingPointValues = false;
    private int timeStyle = 2;
    private boolean useJdkUnsafe = true;

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
        this.factories.add(typeAdapterFactory);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList2.addAll(this.factories);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList2);
        return new Gson(this.excluder, this.fieldNamingPolicy, this.instanceCreators, this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.lenient, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, this.factories, this.hierarchyFactories, arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void addTypeAdaptersForDate(java.lang.String r5, int r6, int r7, java.util.List<com.google.gson.TypeAdapterFactory> r8) {
        /*
            r4 = this;
            boolean r0 = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r6 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r6 = r6.createAdapterFactory(r5)
            if (r0 == 0) goto L_0x0024
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r7 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r7.createAdapterFactory(r5)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r7 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r5 = r7.createAdapterFactory(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r5 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r5 = r5.createAdapterFactory(r6, r7)
            if (r0 == 0) goto L_0x0043
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r1 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r1.createAdapterFactory(r6, r7)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r2 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r6 = r2.createAdapterFactory(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.GsonBuilder.addTypeAdaptersForDate(java.lang.String, int, int, java.util.List):void");
    }
}
