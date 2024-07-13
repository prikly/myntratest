package com.appodeal.ads.api;

import com.appodeal.ads.api.Adapter;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolMessageEnum;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Stats extends GeneratedMessageV3 implements StatsOrBuilder {
    private static final Stats DEFAULT_INSTANCE = new Stats();
    /* access modifiers changed from: private */
    public static final Parser<Stats> PARSER = new AbstractParser<Stats>() {
        public Stats parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Stats(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public List<AdUnit> adUnit_;
    /* access modifiers changed from: private */
    public List<Adapter> adapter_;
    /* access modifiers changed from: private */
    public int capacity_;
    /* access modifiers changed from: private */
    public boolean completed_;
    /* access modifiers changed from: private */
    public long finish_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public long start_;
    /* access modifiers changed from: private */
    public boolean successful_;

    public interface AdUnitOrBuilder extends MessageOrBuilder {
    }

    private Stats(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Stats() {
        this.memoizedIsInitialized = -1;
        this.adUnit_ = Collections.emptyList();
        this.adapter_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Stats();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Stats(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.capacity_ = codedInputStream.readInt32();
                        } else if (readTag == 16) {
                            this.start_ = codedInputStream.readInt64();
                        } else if (readTag == 24) {
                            this.finish_ = codedInputStream.readInt64();
                        } else if (readTag == 32) {
                            this.successful_ = codedInputStream.readBool();
                        } else if (readTag == 40) {
                            this.completed_ = codedInputStream.readBool();
                        } else if (readTag == 50) {
                            if (!z2 || !true) {
                                this.adUnit_ = new ArrayList();
                                z2 |= true;
                            }
                            this.adUnit_.add(codedInputStream.readMessage(AdUnit.parser(), extensionRegistryLite));
                        } else if (readTag == 58) {
                            if (!z2 || !true) {
                                this.adapter_ = new ArrayList();
                                z2 |= true;
                            }
                            this.adapter_.add(codedInputStream.readMessage(Adapter.parser(), extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.adUnit_ = Collections.unmodifiableList(this.adUnit_);
                    }
                    if (z2 && true) {
                        this.adapter_ = Collections.unmodifiableList(this.adapter_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.adUnit_ = Collections.unmodifiableList(this.adUnit_);
            }
            if (z2 && true) {
                this.adapter_ = Collections.unmodifiableList(this.adapter_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Api.internal_static_com_appodeal_ads_Stats_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Stats_fieldAccessorTable.ensureFieldAccessorsInitialized(Stats.class, Builder.class);
    }

    public enum AdUnitRequestResult implements ProtocolMessageEnum {
        SUCCESSFUL(0),
        NOFILL(1),
        TIMEOUTREACHED(2),
        EXCEPTION(3),
        UNDEFINEDADAPTER(4),
        INCORRECTADUNIT(5),
        INVALIDASSETS(6),
        CANCELED(7),
        UNRECOGNIZED(-1);
        
        private static final AdUnitRequestResult[] VALUES = null;
        private static final Internal.EnumLiteMap<AdUnitRequestResult> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<AdUnitRequestResult>() {
                public AdUnitRequestResult findValueByNumber(int i) {
                    return AdUnitRequestResult.forNumber(i);
                }
            };
            VALUES = values();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static AdUnitRequestResult forNumber(int i) {
            switch (i) {
                case 0:
                    return SUCCESSFUL;
                case 1:
                    return NOFILL;
                case 2:
                    return TIMEOUTREACHED;
                case 3:
                    return EXCEPTION;
                case 4:
                    return UNDEFINEDADAPTER;
                case 5:
                    return INCORRECTADUNIT;
                case 6:
                    return INVALIDASSETS;
                case 7:
                    return CANCELED;
                default:
                    return null;
            }
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Stats.getDescriptor().getEnumTypes().get(0);
        }

        private AdUnitRequestResult(int i) {
            this.value = i;
        }
    }

    public static final class AdUnit extends GeneratedMessageV3 implements AdUnitOrBuilder {
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        /* access modifiers changed from: private */
        public static final Parser<AdUnit> PARSER = new AbstractParser<AdUnit>() {
            public AdUnit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AdUnit(codedInputStream, extensionRegistryLite);
            }
        };
        /* access modifiers changed from: private */
        public double ecpm_;
        /* access modifiers changed from: private */
        public long finish_;
        /* access modifiers changed from: private */
        public volatile Object id_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public boolean precache_;
        /* access modifiers changed from: private */
        public int result_;
        /* access modifiers changed from: private */
        public long start_;

        private AdUnit(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private AdUnit() {
            this.memoizedIsInitialized = -1;
            this.id_ = "";
            this.result_ = 0;
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AdUnit();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AdUnit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.id_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.start_ = codedInputStream.readInt64();
                            } else if (readTag == 24) {
                                this.finish_ = codedInputStream.readInt64();
                            } else if (readTag == 32) {
                                this.result_ = codedInputStream.readEnum();
                            } else if (readTag == 40) {
                                this.precache_ = codedInputStream.readBool();
                            } else if (readTag == 49) {
                                this.ecpm_ = codedInputStream.readDouble();
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Api.internal_static_com_appodeal_ads_Stats_AdUnit_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Stats_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public long getStart() {
            return this.start_;
        }

        public long getFinish() {
            return this.finish_;
        }

        public int getResultValue() {
            return this.result_;
        }

        public boolean getPrecache() {
            return this.precache_;
        }

        public double getEcpm() {
            return this.ecpm_;
        }

        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            long j = this.start_;
            if (j != 0) {
                codedOutputStream.writeInt64(2, j);
            }
            long j2 = this.finish_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(3, j2);
            }
            if (this.result_ != AdUnitRequestResult.SUCCESSFUL.getNumber()) {
                codedOutputStream.writeEnum(4, this.result_);
            }
            boolean z = this.precache_;
            if (z) {
                codedOutputStream.writeBool(5, z);
            }
            double d2 = this.ecpm_;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(6, d2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getIdBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.id_);
            }
            long j = this.start_;
            if (j != 0) {
                i2 += CodedOutputStream.computeInt64Size(2, j);
            }
            long j2 = this.finish_;
            if (j2 != 0) {
                i2 += CodedOutputStream.computeInt64Size(3, j2);
            }
            if (this.result_ != AdUnitRequestResult.SUCCESSFUL.getNumber()) {
                i2 += CodedOutputStream.computeEnumSize(4, this.result_);
            }
            boolean z = this.precache_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(5, z);
            }
            double d2 = this.ecpm_;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(6, d2);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return super.equals(obj);
            }
            AdUnit adUnit = (AdUnit) obj;
            if (getId().equals(adUnit.getId()) && getStart() == adUnit.getStart() && getFinish() == adUnit.getFinish() && this.result_ == adUnit.result_ && getPrecache() == adUnit.getPrecache() && Double.doubleToLongBits(getEcpm()) == Double.doubleToLongBits(adUnit.getEcpm()) && this.unknownFields.equals(adUnit.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + Internal.hashLong(getStart())) * 37) + 3) * 53) + Internal.hashLong(getFinish())) * 37) + 4) * 53) + this.result_) * 37) + 5) * 53) + Internal.hashBoolean(getPrecache())) * 37) + 6) * 53) + Internal.hashLong(Double.doubleToLongBits(getEcpm()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdUnitOrBuilder {
            private double ecpm_;
            private long finish_;
            private Object id_;
            private boolean precache_;
            private int result_;
            private long start_;

            public final boolean isInitialized() {
                return true;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Api.internal_static_com_appodeal_ads_Stats_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.result_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.result_ = 0;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = AdUnit.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.start_ = 0;
                this.finish_ = 0;
                this.result_ = 0;
                this.precache_ = false;
                this.ecpm_ = 0.0d;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return Api.internal_static_com_appodeal_ads_Stats_AdUnit_descriptor;
            }

            public AdUnit getDefaultInstanceForType() {
                return AdUnit.getDefaultInstance();
            }

            public AdUnit build() {
                AdUnit buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public AdUnit buildPartial() {
                AdUnit adUnit = new AdUnit((GeneratedMessageV3.Builder) this);
                Object unused = adUnit.id_ = this.id_;
                long unused2 = adUnit.start_ = this.start_;
                long unused3 = adUnit.finish_ = this.finish_;
                int unused4 = adUnit.result_ = this.result_;
                boolean unused5 = adUnit.precache_ = this.precache_;
                double unused6 = adUnit.ecpm_ = this.ecpm_;
                onBuilt();
                return adUnit;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof AdUnit) {
                    return mergeFrom((AdUnit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdUnit adUnit) {
                if (adUnit == AdUnit.getDefaultInstance()) {
                    return this;
                }
                if (!adUnit.getId().isEmpty()) {
                    this.id_ = adUnit.id_;
                    onChanged();
                }
                if (adUnit.getStart() != 0) {
                    setStart(adUnit.getStart());
                }
                if (adUnit.getFinish() != 0) {
                    setFinish(adUnit.getFinish());
                }
                if (adUnit.result_ != 0) {
                    setResultValue(adUnit.getResultValue());
                }
                if (adUnit.getPrecache()) {
                    setPrecache(adUnit.getPrecache());
                }
                if (adUnit.getEcpm() != 0.0d) {
                    setEcpm(adUnit.getEcpm());
                }
                mergeUnknownFields(adUnit.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.appodeal.ads.api.Stats.AdUnit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Stats.AdUnit.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.appodeal.ads.api.Stats$AdUnit r3 = (com.appodeal.ads.api.Stats.AdUnit) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.appodeal.ads.api.Stats.AdUnit) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.appodeal.ads.api.Stats$AdUnit r4 = (com.appodeal.ads.api.Stats.AdUnit) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.appodeal.ads.api.Stats.AdUnit) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Stats.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Stats$AdUnit$Builder");
            }

            public Builder setId(String str) {
                if (str != null) {
                    this.id_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setStart(long j) {
                this.start_ = j;
                onChanged();
                return this;
            }

            public Builder setFinish(long j) {
                this.finish_ = j;
                onChanged();
                return this;
            }

            public Builder setResultValue(int i) {
                this.result_ = i;
                onChanged();
                return this;
            }

            public Builder setResult(AdUnitRequestResult adUnitRequestResult) {
                if (adUnitRequestResult != null) {
                    this.result_ = adUnitRequestResult.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setPrecache(boolean z) {
                this.precache_ = z;
                onChanged();
                return this;
            }

            public Builder setEcpm(double d2) {
                this.ecpm_ = d2;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AdUnit> parser() {
            return PARSER;
        }

        public Parser<AdUnit> getParserForType() {
            return PARSER;
        }

        public AdUnit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public int getCapacity() {
        return this.capacity_;
    }

    public long getStart() {
        return this.start_;
    }

    public long getFinish() {
        return this.finish_;
    }

    public boolean getSuccessful() {
        return this.successful_;
    }

    public boolean getCompleted() {
        return this.completed_;
    }

    public List<AdUnit> getAdUnitList() {
        return this.adUnit_;
    }

    public int getAdUnitCount() {
        return this.adUnit_.size();
    }

    public List<Adapter> getAdapterList() {
        return this.adapter_;
    }

    public int getAdapterCount() {
        return this.adapter_.size();
    }

    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.capacity_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        long j = this.start_;
        if (j != 0) {
            codedOutputStream.writeInt64(2, j);
        }
        long j2 = this.finish_;
        if (j2 != 0) {
            codedOutputStream.writeInt64(3, j2);
        }
        boolean z = this.successful_;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
        boolean z2 = this.completed_;
        if (z2) {
            codedOutputStream.writeBool(5, z2);
        }
        for (int i2 = 0; i2 < this.adUnit_.size(); i2++) {
            codedOutputStream.writeMessage(6, this.adUnit_.get(i2));
        }
        for (int i3 = 0; i3 < this.adapter_.size(); i3++) {
            codedOutputStream.writeMessage(7, this.adapter_.get(i3));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.capacity_;
        int computeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) + 0 : 0;
        long j = this.start_;
        if (j != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(2, j);
        }
        long j2 = this.finish_;
        if (j2 != 0) {
            computeInt32Size += CodedOutputStream.computeInt64Size(3, j2);
        }
        boolean z = this.successful_;
        if (z) {
            computeInt32Size += CodedOutputStream.computeBoolSize(4, z);
        }
        boolean z2 = this.completed_;
        if (z2) {
            computeInt32Size += CodedOutputStream.computeBoolSize(5, z2);
        }
        for (int i3 = 0; i3 < this.adUnit_.size(); i3++) {
            computeInt32Size += CodedOutputStream.computeMessageSize(6, this.adUnit_.get(i3));
        }
        for (int i4 = 0; i4 < this.adapter_.size(); i4++) {
            computeInt32Size += CodedOutputStream.computeMessageSize(7, this.adapter_.get(i4));
        }
        int serializedSize = computeInt32Size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Stats)) {
            return super.equals(obj);
        }
        Stats stats = (Stats) obj;
        if (getCapacity() == stats.getCapacity() && getStart() == stats.getStart() && getFinish() == stats.getFinish() && getSuccessful() == stats.getSuccessful() && getCompleted() == stats.getCompleted() && getAdUnitList().equals(stats.getAdUnitList()) && getAdapterList().equals(stats.getAdapterList()) && this.unknownFields.equals(stats.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getCapacity()) * 37) + 2) * 53) + Internal.hashLong(getStart())) * 37) + 3) * 53) + Internal.hashLong(getFinish())) * 37) + 4) * 53) + Internal.hashBoolean(getSuccessful())) * 37) + 5) * 53) + Internal.hashBoolean(getCompleted());
        if (getAdUnitCount() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + getAdUnitList().hashCode();
        }
        if (getAdapterCount() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + getAdapterList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Stats stats) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(stats);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatsOrBuilder {
        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> adUnitBuilder_;
        private List<AdUnit> adUnit_;
        private RepeatedFieldBuilderV3<Adapter, Adapter.Builder, AdapterOrBuilder> adapterBuilder_;
        private List<Adapter> adapter_;
        private int bitField0_;
        private int capacity_;
        private boolean completed_;
        private long finish_;
        private long start_;
        private boolean successful_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Stats_fieldAccessorTable.ensureFieldAccessorsInitialized(Stats.class, Builder.class);
        }

        private Builder() {
            this.adUnit_ = Collections.emptyList();
            this.adapter_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.adUnit_ = Collections.emptyList();
            this.adapter_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Stats.alwaysUseFieldBuilders) {
                getAdUnitFieldBuilder();
                getAdapterFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.capacity_ = 0;
            this.start_ = 0;
            this.finish_ = 0;
            this.successful_ = false;
            this.completed_ = false;
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.adUnit_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<Adapter, Adapter.Builder, AdapterOrBuilder> repeatedFieldBuilderV32 = this.adapterBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.adapter_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV32.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Stats_descriptor;
        }

        public Stats getDefaultInstanceForType() {
            return Stats.getDefaultInstance();
        }

        public Stats build() {
            Stats buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Stats buildPartial() {
            Stats stats = new Stats((GeneratedMessageV3.Builder) this);
            int unused = stats.capacity_ = this.capacity_;
            long unused2 = stats.start_ = this.start_;
            long unused3 = stats.finish_ = this.finish_;
            boolean unused4 = stats.successful_ = this.successful_;
            boolean unused5 = stats.completed_ = this.completed_;
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.adUnit_ = Collections.unmodifiableList(this.adUnit_);
                    this.bitField0_ &= -2;
                }
                List unused6 = stats.adUnit_ = this.adUnit_;
            } else {
                List unused7 = stats.adUnit_ = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Adapter, Adapter.Builder, AdapterOrBuilder> repeatedFieldBuilderV32 = this.adapterBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.adapter_ = Collections.unmodifiableList(this.adapter_);
                    this.bitField0_ &= -3;
                }
                List unused8 = stats.adapter_ = this.adapter_;
            } else {
                List unused9 = stats.adapter_ = repeatedFieldBuilderV32.build();
            }
            onBuilt();
            return stats;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof Stats) {
                return mergeFrom((Stats) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Stats stats) {
            if (stats == Stats.getDefaultInstance()) {
                return this;
            }
            if (stats.getCapacity() != 0) {
                setCapacity(stats.getCapacity());
            }
            if (stats.getStart() != 0) {
                setStart(stats.getStart());
            }
            if (stats.getFinish() != 0) {
                setFinish(stats.getFinish());
            }
            if (stats.getSuccessful()) {
                setSuccessful(stats.getSuccessful());
            }
            if (stats.getCompleted()) {
                setCompleted(stats.getCompleted());
            }
            RepeatedFieldBuilderV3<Adapter, Adapter.Builder, AdapterOrBuilder> repeatedFieldBuilderV3 = null;
            if (this.adUnitBuilder_ == null) {
                if (!stats.adUnit_.isEmpty()) {
                    if (this.adUnit_.isEmpty()) {
                        this.adUnit_ = stats.adUnit_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAdUnitIsMutable();
                        this.adUnit_.addAll(stats.adUnit_);
                    }
                    onChanged();
                }
            } else if (!stats.adUnit_.isEmpty()) {
                if (this.adUnitBuilder_.isEmpty()) {
                    this.adUnitBuilder_.dispose();
                    this.adUnitBuilder_ = null;
                    this.adUnit_ = stats.adUnit_;
                    this.bitField0_ &= -2;
                    this.adUnitBuilder_ = Stats.alwaysUseFieldBuilders ? getAdUnitFieldBuilder() : null;
                } else {
                    this.adUnitBuilder_.addAllMessages(stats.adUnit_);
                }
            }
            if (this.adapterBuilder_ == null) {
                if (!stats.adapter_.isEmpty()) {
                    if (this.adapter_.isEmpty()) {
                        this.adapter_ = stats.adapter_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdapterIsMutable();
                        this.adapter_.addAll(stats.adapter_);
                    }
                    onChanged();
                }
            } else if (!stats.adapter_.isEmpty()) {
                if (this.adapterBuilder_.isEmpty()) {
                    this.adapterBuilder_.dispose();
                    this.adapterBuilder_ = null;
                    this.adapter_ = stats.adapter_;
                    this.bitField0_ &= -3;
                    if (Stats.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getAdapterFieldBuilder();
                    }
                    this.adapterBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.adapterBuilder_.addAllMessages(stats.adapter_);
                }
            }
            mergeUnknownFields(stats.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Stats.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Stats.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Stats r3 = (com.appodeal.ads.api.Stats) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Stats) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Stats r4 = (com.appodeal.ads.api.Stats) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Stats) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Stats.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Stats$Builder");
        }

        public Builder setCapacity(int i) {
            this.capacity_ = i;
            onChanged();
            return this;
        }

        public Builder setStart(long j) {
            this.start_ = j;
            onChanged();
            return this;
        }

        public Builder setFinish(long j) {
            this.finish_ = j;
            onChanged();
            return this;
        }

        public Builder setSuccessful(boolean z) {
            this.successful_ = z;
            onChanged();
            return this;
        }

        public Builder setCompleted(boolean z) {
            this.completed_ = z;
            onChanged();
            return this;
        }

        private void ensureAdUnitIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adUnit_ = new ArrayList(this.adUnit_);
                this.bitField0_ |= 1;
            }
        }

        public Builder addAdUnit(AdUnit adUnit) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(adUnit);
            } else if (adUnit != null) {
                ensureAdUnitIsMutable();
                this.adUnit_.add(adUnit);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> getAdUnitFieldBuilder() {
            if (this.adUnitBuilder_ == null) {
                List<AdUnit> list = this.adUnit_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.adUnitBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.adUnit_ = null;
            }
            return this.adUnitBuilder_;
        }

        private void ensureAdapterIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adapter_ = new ArrayList(this.adapter_);
                this.bitField0_ |= 2;
            }
        }

        public Builder addAdapter(Adapter.Builder builder) {
            RepeatedFieldBuilderV3<Adapter, Adapter.Builder, AdapterOrBuilder> repeatedFieldBuilderV3 = this.adapterBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdapterIsMutable();
                this.adapter_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        private RepeatedFieldBuilderV3<Adapter, Adapter.Builder, AdapterOrBuilder> getAdapterFieldBuilder() {
            if (this.adapterBuilder_ == null) {
                this.adapterBuilder_ = new RepeatedFieldBuilderV3<>(this.adapter_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adapter_ = null;
            }
            return this.adapterBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Stats getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Stats> parser() {
        return PARSER;
    }

    public Parser<Stats> getParserForType() {
        return PARSER;
    }

    public Stats getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
