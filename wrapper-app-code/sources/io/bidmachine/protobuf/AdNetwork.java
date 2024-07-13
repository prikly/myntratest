package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AdNetwork extends GeneratedMessageV3 implements AdNetworkOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int CLASS_NAME_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 3;
    private static final AdNetwork DEFAULT_INSTANCE = new AdNetwork();
    public static final int NAME_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Parser<AdNetwork> PARSER = new AbstractParser<AdNetwork>() {
        public AdNetwork parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AdNetwork(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public List<AdUnit> adUnits_;
    /* access modifiers changed from: private */
    public volatile Object className_;
    /* access modifiers changed from: private */
    public MapField<String, String> customParams_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public volatile Object name_;

    public interface AdUnitOrBuilder extends MessageOrBuilder {
        boolean containsCustomParams(String str);

        String getAdFormat();

        ByteString getAdFormatBytes();

        @Deprecated
        Map<String, String> getCustomParams();

        int getCustomParamsCount();

        Map<String, String> getCustomParamsMap();

        String getCustomParamsOrDefault(String str, String str2);

        String getCustomParamsOrThrow(String str);
    }

    private AdNetwork(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private AdNetwork() {
        this.memoizedIsInitialized = -1;
        this.name_ = "";
        this.className_ = "";
        this.adUnits_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AdNetwork();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private AdNetwork(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.name_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.className_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 26) {
                            if (!z2 || !true) {
                                this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                                z2 |= true;
                            }
                            MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                            this.customParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                        } else if (readTag == 34) {
                            if (!z2 || !true) {
                                this.adUnits_ = new ArrayList();
                                z2 |= true;
                            }
                            this.adUnits_.add(codedInputStream.readMessage(AdUnit.parser(), extensionRegistryLite));
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
                        this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
    }

    /* access modifiers changed from: protected */
    public MapField internalGetMapField(int i) {
        if (i == 3) {
            return internalGetCustomParams();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable.ensureFieldAccessorsInitialized(AdNetwork.class, Builder.class);
    }

    public static final class AdUnit extends GeneratedMessageV3 implements AdUnitOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        public static final int CUSTOM_PARAMS_FIELD_NUMBER = 2;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        /* access modifiers changed from: private */
        public static final Parser<AdUnit> PARSER = new AbstractParser<AdUnit>() {
            public AdUnit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AdUnit(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object adFormat_;
        /* access modifiers changed from: private */
        public MapField<String, String> customParams_;
        private byte memoizedIsInitialized;

        private AdUnit(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private AdUnit() {
            this.memoizedIsInitialized = -1;
            this.adFormat_ = "";
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
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.adFormat_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                if (!z2 || !true) {
                                    this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.customParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
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
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 2) {
                return internalGetCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
        }

        public String getAdFormat() {
            Object obj = this.adFormat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adFormat_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAdFormatBytes() {
            Object obj = this.adFormat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adFormat_ = copyFromUtf8;
            return copyFromUtf8;
        }

        private static final class CustomParamsDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private CustomParamsDefaultEntryHolder() {
            }
        }

        /* access modifiers changed from: private */
        public MapField<String, String> internalGetCustomParams() {
            MapField<String, String> mapField = this.customParams_;
            return mapField == null ? MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : mapField;
        }

        public int getCustomParamsCount() {
            return internalGetCustomParams().getMap().size();
        }

        public boolean containsCustomParams(String str) {
            if (str != null) {
                return internalGetCustomParams().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().getMap();
        }

        public String getCustomParamsOrDefault(String str, String str2) {
            if (str != null) {
                Map<String, String> map = internalGetCustomParams().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }
            throw null;
        }

        public String getCustomParamsOrThrow(String str) {
            if (str != null) {
                Map<String, String> map = internalGetCustomParams().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw null;
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
            if (!getAdFormatBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.adFormat_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 2);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getAdFormatBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.adFormat_);
            }
            for (Map.Entry next : internalGetCustomParams().getMap().entrySet()) {
                i2 += CodedOutputStream.computeMessageSize(2, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
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
            if (getAdFormat().equals(adUnit.getAdFormat()) && internalGetCustomParams().equals(adUnit.internalGetCustomParams()) && this.unknownFields.equals(adUnit.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdFormat().hashCode();
            if (!internalGetCustomParams().getMap().isEmpty()) {
                hashCode = (((hashCode * 37) + 2) * 53) + internalGetCustomParams().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static AdUnit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static AdUnit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdUnit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AdUnit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdUnitOrBuilder {
            private Object adFormat_;
            private int bitField0_;
            private MapField<String, String> customParams_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            /* access modifiers changed from: protected */
            public MapField internalGetMapField(int i) {
                if (i == 2) {
                    return internalGetCustomParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* access modifiers changed from: protected */
            public MapField internalGetMutableMapField(int i) {
                if (i == 2) {
                    return internalGetMutableCustomParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            private Builder() {
                this.adFormat_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.adFormat_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = AdUnit.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.adFormat_ = "";
                internalGetMutableCustomParams().clear();
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
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
                Object unused = adUnit.adFormat_ = this.adFormat_;
                MapField unused2 = adUnit.customParams_ = internalGetCustomParams();
                adUnit.customParams_.makeImmutable();
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
                if (!adUnit.getAdFormat().isEmpty()) {
                    this.adFormat_ = adUnit.adFormat_;
                    onChanged();
                }
                internalGetMutableCustomParams().mergeFrom(adUnit.internalGetCustomParams());
                mergeUnknownFields(adUnit.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.AdNetwork.AdUnit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.AdNetwork.AdUnit.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.AdNetwork$AdUnit r3 = (io.bidmachine.protobuf.AdNetwork.AdUnit) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.AdNetwork.AdUnit) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.AdNetwork$AdUnit r4 = (io.bidmachine.protobuf.AdNetwork.AdUnit) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.AdNetwork.AdUnit) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdNetwork.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.AdNetwork$AdUnit$Builder");
            }

            public String getAdFormat() {
                Object obj = this.adFormat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adFormat_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAdFormatBytes() {
                Object obj = this.adFormat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adFormat_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAdFormat(String str) {
                if (str != null) {
                    this.adFormat_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAdFormat() {
                this.adFormat_ = AdUnit.getDefaultInstance().getAdFormat();
                onChanged();
                return this;
            }

            public Builder setAdFormatBytes(ByteString byteString) {
                if (byteString != null) {
                    AdUnit.checkByteStringIsUtf8(byteString);
                    this.adFormat_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private MapField<String, String> internalGetCustomParams() {
                MapField<String, String> mapField = this.customParams_;
                return mapField == null ? MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, String> internalGetMutableCustomParams() {
                onChanged();
                if (this.customParams_ == null) {
                    this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                }
                if (!this.customParams_.isMutable()) {
                    this.customParams_ = this.customParams_.copy();
                }
                return this.customParams_;
            }

            public int getCustomParamsCount() {
                return internalGetCustomParams().getMap().size();
            }

            public boolean containsCustomParams(String str) {
                if (str != null) {
                    return internalGetCustomParams().getMap().containsKey(str);
                }
                throw null;
            }

            @Deprecated
            public Map<String, String> getCustomParams() {
                return getCustomParamsMap();
            }

            public Map<String, String> getCustomParamsMap() {
                return internalGetCustomParams().getMap();
            }

            public String getCustomParamsOrDefault(String str, String str2) {
                if (str != null) {
                    Map<String, String> map = internalGetCustomParams().getMap();
                    return map.containsKey(str) ? map.get(str) : str2;
                }
                throw null;
            }

            public String getCustomParamsOrThrow(String str) {
                if (str != null) {
                    Map<String, String> map = internalGetCustomParams().getMap();
                    if (map.containsKey(str)) {
                        return map.get(str);
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            }

            public Builder clearCustomParams() {
                internalGetMutableCustomParams().getMutableMap().clear();
                return this;
            }

            public Builder removeCustomParams(String str) {
                if (str != null) {
                    internalGetMutableCustomParams().getMutableMap().remove(str);
                    return this;
                }
                throw null;
            }

            @Deprecated
            public Map<String, String> getMutableCustomParams() {
                return internalGetMutableCustomParams().getMutableMap();
            }

            public Builder putCustomParams(String str, String str2) {
                if (str == null) {
                    throw null;
                } else if (str2 != null) {
                    internalGetMutableCustomParams().getMutableMap().put(str, str2);
                    return this;
                } else {
                    throw null;
                }
            }

            public Builder putAllCustomParams(Map<String, String> map) {
                internalGetMutableCustomParams().getMutableMap().putAll(map);
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

    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getClassName() {
        Object obj = this.className_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.className_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getClassNameBytes() {
        Object obj = this.className_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.className_ = copyFromUtf8;
        return copyFromUtf8;
    }

    private static final class CustomParamsDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(InitProto.internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private CustomParamsDefaultEntryHolder() {
        }
    }

    /* access modifiers changed from: private */
    public MapField<String, String> internalGetCustomParams() {
        MapField<String, String> mapField = this.customParams_;
        return mapField == null ? MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : mapField;
    }

    public int getCustomParamsCount() {
        return internalGetCustomParams().getMap().size();
    }

    public boolean containsCustomParams(String str) {
        if (str != null) {
            return internalGetCustomParams().getMap().containsKey(str);
        }
        throw null;
    }

    @Deprecated
    public Map<String, String> getCustomParams() {
        return getCustomParamsMap();
    }

    public Map<String, String> getCustomParamsMap() {
        return internalGetCustomParams().getMap();
    }

    public String getCustomParamsOrDefault(String str, String str2) {
        if (str != null) {
            Map<String, String> map = internalGetCustomParams().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }
        throw null;
    }

    public String getCustomParamsOrThrow(String str) {
        if (str != null) {
            Map<String, String> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw null;
    }

    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    public AdUnit getAdUnits(int i) {
        return this.adUnits_.get(i);
    }

    public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
        return this.adUnits_.get(i);
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
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        if (!getClassNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.className_);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 3);
        for (int i = 0; i < this.adUnits_.size(); i++) {
            codedOutputStream.writeMessage(4, this.adUnits_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) + 0 : 0;
        if (!getClassNameBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.className_);
        }
        for (Map.Entry next : internalGetCustomParams().getMap().entrySet()) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
        }
        for (int i2 = 0; i2 < this.adUnits_.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, this.adUnits_.get(i2));
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdNetwork)) {
            return super.equals(obj);
        }
        AdNetwork adNetwork = (AdNetwork) obj;
        if (getName().equals(adNetwork.getName()) && getClassName().equals(adNetwork.getClassName()) && internalGetCustomParams().equals(adNetwork.internalGetCustomParams()) && getAdUnitsList().equals(adNetwork.getAdUnitsList()) && this.unknownFields.equals(adNetwork.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getClassName().hashCode();
        if (!internalGetCustomParams().getMap().isEmpty()) {
            hashCode = (((hashCode * 37) + 3) * 53) + internalGetCustomParams().hashCode();
        }
        if (getAdUnitsCount() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + getAdUnitsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AdNetwork parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AdNetwork parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AdNetwork parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AdNetwork parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AdNetwork parseFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdNetwork parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AdNetwork parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdNetwork) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AdNetwork adNetwork) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adNetwork);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdNetworkOrBuilder {
        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;
        private Object className_;
        private MapField<String, String> customParams_;
        private Object name_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 3) {
                return internalGetCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMutableMapField(int i) {
            if (i == 3) {
                return internalGetMutableCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable.ensureFieldAccessorsInitialized(AdNetwork.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (AdNetwork.alwaysUseFieldBuilders) {
                getAdUnitsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.name_ = "";
            this.className_ = "";
            internalGetMutableCustomParams().clear();
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.adUnits_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        public AdNetwork getDefaultInstanceForType() {
            return AdNetwork.getDefaultInstance();
        }

        public AdNetwork build() {
            AdNetwork buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public AdNetwork buildPartial() {
            AdNetwork adNetwork = new AdNetwork((GeneratedMessageV3.Builder) this);
            Object unused = adNetwork.name_ = this.name_;
            Object unused2 = adNetwork.className_ = this.className_;
            MapField unused3 = adNetwork.customParams_ = internalGetCustomParams();
            adNetwork.customParams_.makeImmutable();
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -3;
                }
                List unused4 = adNetwork.adUnits_ = this.adUnits_;
            } else {
                List unused5 = adNetwork.adUnits_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return adNetwork;
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
            if (message instanceof AdNetwork) {
                return mergeFrom((AdNetwork) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AdNetwork adNetwork) {
            if (adNetwork == AdNetwork.getDefaultInstance()) {
                return this;
            }
            if (!adNetwork.getName().isEmpty()) {
                this.name_ = adNetwork.name_;
                onChanged();
            }
            if (!adNetwork.getClassName().isEmpty()) {
                this.className_ = adNetwork.className_;
                onChanged();
            }
            internalGetMutableCustomParams().mergeFrom(adNetwork.internalGetCustomParams());
            if (this.adUnitsBuilder_ == null) {
                if (!adNetwork.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = adNetwork.adUnits_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(adNetwork.adUnits_);
                    }
                    onChanged();
                }
            } else if (!adNetwork.adUnits_.isEmpty()) {
                if (this.adUnitsBuilder_.isEmpty()) {
                    this.adUnitsBuilder_.dispose();
                    RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = null;
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = adNetwork.adUnits_;
                    this.bitField0_ &= -3;
                    if (AdNetwork.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getAdUnitsFieldBuilder();
                    }
                    this.adUnitsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.adUnitsBuilder_.addAllMessages(adNetwork.adUnits_);
                }
            }
            mergeUnknownFields(adNetwork.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.AdNetwork.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.AdNetwork.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.AdNetwork r3 = (io.bidmachine.protobuf.AdNetwork) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.AdNetwork) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.AdNetwork r4 = (io.bidmachine.protobuf.AdNetwork) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.AdNetwork) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdNetwork.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.AdNetwork$Builder");
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setName(String str) {
            if (str != null) {
                this.name_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearName() {
            this.name_ = AdNetwork.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            if (byteString != null) {
                AdNetwork.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getClassName() {
            Object obj = this.className_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.className_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getClassNameBytes() {
            Object obj = this.className_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.className_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setClassName(String str) {
            if (str != null) {
                this.className_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearClassName() {
            this.className_ = AdNetwork.getDefaultInstance().getClassName();
            onChanged();
            return this;
        }

        public Builder setClassNameBytes(ByteString byteString) {
            if (byteString != null) {
                AdNetwork.checkByteStringIsUtf8(byteString);
                this.className_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        private MapField<String, String> internalGetCustomParams() {
            MapField<String, String> mapField = this.customParams_;
            return mapField == null ? MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableCustomParams() {
            onChanged();
            if (this.customParams_ == null) {
                this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.customParams_.isMutable()) {
                this.customParams_ = this.customParams_.copy();
            }
            return this.customParams_;
        }

        public int getCustomParamsCount() {
            return internalGetCustomParams().getMap().size();
        }

        public boolean containsCustomParams(String str) {
            if (str != null) {
                return internalGetCustomParams().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().getMap();
        }

        public String getCustomParamsOrDefault(String str, String str2) {
            if (str != null) {
                Map<String, String> map = internalGetCustomParams().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }
            throw null;
        }

        public String getCustomParamsOrThrow(String str) {
            if (str != null) {
                Map<String, String> map = internalGetCustomParams().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw null;
        }

        public Builder clearCustomParams() {
            internalGetMutableCustomParams().getMutableMap().clear();
            return this;
        }

        public Builder removeCustomParams(String str) {
            if (str != null) {
                internalGetMutableCustomParams().getMutableMap().remove(str);
                return this;
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getMutableCustomParams() {
            return internalGetMutableCustomParams().getMutableMap();
        }

        public Builder putCustomParams(String str, String str2) {
            if (str == null) {
                throw null;
            } else if (str2 != null) {
                internalGetMutableCustomParams().getMutableMap().put(str, str2);
                return this;
            } else {
                throw null;
            }
        }

        public Builder putAllCustomParams(Map<String, String> map) {
            internalGetMutableCustomParams().getMutableMap().putAll(map);
            return this;
        }

        private void ensureAdUnitsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adUnits_ = new ArrayList(this.adUnits_);
                this.bitField0_ |= 2;
            }
        }

        public List<AdUnit> getAdUnitsList() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.adUnits_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getAdUnitsCount() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public AdUnit getAdUnits(int i) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setAdUnits(int i, AdUnit adUnit) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, adUnit);
            } else if (adUnit != null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i, adUnit);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setAdUnits(int i, AdUnit.Builder builder) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAdUnits(AdUnit adUnit) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(adUnit);
            } else if (adUnit != null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(adUnit);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addAdUnits(int i, AdUnit adUnit) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, adUnit);
            } else if (adUnit != null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i, adUnit);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addAdUnits(AdUnit.Builder builder) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addAdUnits(int i, AdUnit.Builder builder) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.adUnits_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearAdUnits() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.adUnits_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeAdUnits(int i) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public AdUnit.Builder getAdUnitsBuilder(int i) {
            return getAdUnitsFieldBuilder().getBuilder(i);
        }

        public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.adUnits_);
        }

        public AdUnit.Builder addAdUnitsBuilder() {
            return getAdUnitsFieldBuilder().addBuilder(AdUnit.getDefaultInstance());
        }

        public AdUnit.Builder addAdUnitsBuilder(int i) {
            return getAdUnitsFieldBuilder().addBuilder(i, AdUnit.getDefaultInstance());
        }

        public List<AdUnit.Builder> getAdUnitsBuilderList() {
            return getAdUnitsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> getAdUnitsFieldBuilder() {
            if (this.adUnitsBuilder_ == null) {
                this.adUnitsBuilder_ = new RepeatedFieldBuilderV3<>(this.adUnits_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adUnits_ = null;
            }
            return this.adUnitsBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static AdNetwork getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AdNetwork> parser() {
        return PARSER;
    }

    public Parser<AdNetwork> getParserForType() {
        return PARSER;
    }

    public AdNetwork getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
