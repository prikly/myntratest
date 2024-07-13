package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

public class MetaData {

    /* renamed from: a  reason: collision with root package name */
    private String f8703a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f8704b;

    /* renamed from: c  reason: collision with root package name */
    private List<MetaDataValueTypes> f8705c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f8703a = str;
        this.f8704b = list;
        this.f8705c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.f8705c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f8703a = str;
        this.f8704b = list;
        this.f8705c = list2;
    }

    public String getMetaDataKey() {
        return this.f8703a;
    }

    public List<String> getMetaDataValue() {
        return this.f8704b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f8705c;
    }
}
