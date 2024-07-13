package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public final class RequestTokenPayload extends GeneratedMessageV3 implements RequestTokenPayloadOrBuilder {
    public static final int APP_DATA_FIELD_NUMBER = 6;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 4;
    private static final RequestTokenPayload DEFAULT_INSTANCE = new RequestTokenPayload();
    public static final int DEVICE_DATA_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Parser<RequestTokenPayload> PARSER = new AbstractParser<RequestTokenPayload>() {
        public RequestTokenPayload parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RequestTokenPayload(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PLACEMENT_DATA_FIELD_NUMBER = 1;
    public static final int SESSION_DATA_FIELD_NUMBER = 2;
    public static final int USER_DATA_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public AppData appData_;
    /* access modifiers changed from: private */
    public MapField<String, String> customData_;
    /* access modifiers changed from: private */
    public DeviceData deviceData_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public PlacementData placementData_;
    /* access modifiers changed from: private */
    public SessionData sessionData_;
    /* access modifiers changed from: private */
    public UserData userData_;

    public interface AppDataOrBuilder extends MessageOrBuilder {
        String getAppName();

        ByteString getAppNameBytes();

        String getAppVer();

        ByteString getAppVerBytes();
    }

    public interface DeviceDataOrBuilder extends MessageOrBuilder {
        String getAccess();

        ByteString getAccessBytes();

        boolean getAirplane();

        int getAtts();

        float getBatterylevel();

        boolean getBatterysaver();

        String getBmIfv();

        ByteString getBmIfvBytes();

        boolean getCharging();

        boolean getDarkmode();

        String getDevicename();

        ByteString getDevicenameBytes();

        long getDiskspace();

        boolean getDnd();

        boolean getHeadset();

        String getHeadsetname();

        ByteString getHeadsetnameBytes();

        String getIfv();

        ByteString getIfvBytes();

        String getInputlanguage(int i);

        ByteString getInputlanguageBytes(int i);

        int getInputlanguageCount();

        List<String> getInputlanguageList();

        boolean getJailbreak();

        long getLastbootup();

        boolean getRingmute();

        float getScreenbright();

        long getTime();

        long getTotaldisk();

        long getTotalmem();
    }

    public interface PlacementDataOrBuilder extends MessageOrBuilder {
        String getSdk();

        ByteString getSdkBytes();

        String getSdkver();

        ByteString getSdkverBytes();
    }

    public interface SessionDataOrBuilder extends MessageOrBuilder {
        boolean containsSessionPlacementData(String str);

        String getSessionId();

        ByteString getSessionIdBytes();

        @Deprecated
        Map<String, SessionData.SessionPlacementData> getSessionPlacementData();

        int getSessionPlacementDataCount();

        Map<String, SessionData.SessionPlacementData> getSessionPlacementDataMap();

        SessionData.SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionData.SessionPlacementData sessionPlacementData);

        SessionData.SessionPlacementData getSessionPlacementDataOrThrow(String str);

        long getSessionduration();
    }

    public interface UserDataOrBuilder extends MessageOrBuilder {
        String getCcpa();

        ByteString getCcpaBytes();

        String getConsent();

        ByteString getConsentBytes();

        boolean getGdpr();
    }

    private RequestTokenPayload(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private RequestTokenPayload() {
        this.memoizedIsInitialized = -1;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RequestTokenPayload();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private RequestTokenPayload(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            PlacementData.Builder builder = this.placementData_ != null ? this.placementData_.toBuilder() : null;
                            PlacementData placementData = (PlacementData) codedInputStream.readMessage(PlacementData.parser(), extensionRegistryLite);
                            this.placementData_ = placementData;
                            if (builder != null) {
                                builder.mergeFrom(placementData);
                                this.placementData_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            SessionData.Builder builder2 = this.sessionData_ != null ? this.sessionData_.toBuilder() : null;
                            SessionData sessionData = (SessionData) codedInputStream.readMessage(SessionData.parser(), extensionRegistryLite);
                            this.sessionData_ = sessionData;
                            if (builder2 != null) {
                                builder2.mergeFrom(sessionData);
                                this.sessionData_ = builder2.buildPartial();
                            }
                        } else if (readTag == 26) {
                            DeviceData.Builder builder3 = this.deviceData_ != null ? this.deviceData_.toBuilder() : null;
                            DeviceData deviceData = (DeviceData) codedInputStream.readMessage(DeviceData.parser(), extensionRegistryLite);
                            this.deviceData_ = deviceData;
                            if (builder3 != null) {
                                builder3.mergeFrom(deviceData);
                                this.deviceData_ = builder3.buildPartial();
                            }
                        } else if (readTag == 34) {
                            if (!z2 || !true) {
                                this.customData_ = MapField.newMapField(CustomDataDefaultEntryHolder.defaultEntry);
                                z2 |= true;
                            }
                            MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CustomDataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                            this.customData_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                        } else if (readTag == 42) {
                            UserData.Builder builder4 = this.userData_ != null ? this.userData_.toBuilder() : null;
                            UserData userData = (UserData) codedInputStream.readMessage(UserData.parser(), extensionRegistryLite);
                            this.userData_ = userData;
                            if (builder4 != null) {
                                builder4.mergeFrom(userData);
                                this.userData_ = builder4.buildPartial();
                            }
                        } else if (readTag == 50) {
                            AppData.Builder builder5 = this.appData_ != null ? this.appData_.toBuilder() : null;
                            AppData appData = (AppData) codedInputStream.readMessage(AppData.parser(), extensionRegistryLite);
                            this.appData_ = appData;
                            if (builder5 != null) {
                                builder5.mergeFrom(appData);
                                this.appData_ = builder5.buildPartial();
                            }
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
        return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
    }

    /* access modifiers changed from: protected */
    public MapField internalGetMapField(int i) {
        if (i == 4) {
            return internalGetCustomData();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestTokenPayload.class, Builder.class);
    }

    public static final class PlacementData extends GeneratedMessageV3 implements PlacementDataOrBuilder {
        private static final PlacementData DEFAULT_INSTANCE = new PlacementData();
        /* access modifiers changed from: private */
        public static final Parser<PlacementData> PARSER = new AbstractParser<PlacementData>() {
            public PlacementData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PlacementData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SDKVER_FIELD_NUMBER = 2;
        public static final int SDK_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object sdk_;
        /* access modifiers changed from: private */
        public volatile Object sdkver_;

        private PlacementData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private PlacementData() {
            this.memoizedIsInitialized = -1;
            this.sdk_ = "";
            this.sdkver_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new PlacementData();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PlacementData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.sdk_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.sdkver_ = codedInputStream.readStringRequireUtf8();
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
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_PlacementData_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_PlacementData_fieldAccessorTable.ensureFieldAccessorsInitialized(PlacementData.class, Builder.class);
        }

        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = copyFromUtf8;
            return copyFromUtf8;
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
            if (!getSdkBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.sdk_);
            }
            if (!getSdkverBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.sdkver_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getSdkBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.sdk_);
            }
            if (!getSdkverBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.sdkver_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlacementData)) {
                return super.equals(obj);
            }
            PlacementData placementData = (PlacementData) obj;
            if (getSdk().equals(placementData.getSdk()) && getSdkver().equals(placementData.getSdkver()) && this.unknownFields.equals(placementData.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSdk().hashCode()) * 37) + 2) * 53) + getSdkver().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static PlacementData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static PlacementData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static PlacementData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static PlacementData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PlacementData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static PlacementData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PlacementData parseFrom(InputStream inputStream) throws IOException {
            return (PlacementData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PlacementData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlacementData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PlacementData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PlacementData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PlacementData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlacementData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PlacementData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PlacementData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PlacementData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PlacementData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(PlacementData placementData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(placementData);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlacementDataOrBuilder {
            private Object sdk_;
            private Object sdkver_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_PlacementData_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_PlacementData_fieldAccessorTable.ensureFieldAccessorsInitialized(PlacementData.class, Builder.class);
            }

            private Builder() {
                this.sdk_ = "";
                this.sdkver_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sdk_ = "";
                this.sdkver_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = PlacementData.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.sdk_ = "";
                this.sdkver_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_PlacementData_descriptor;
            }

            public PlacementData getDefaultInstanceForType() {
                return PlacementData.getDefaultInstance();
            }

            public PlacementData build() {
                PlacementData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public PlacementData buildPartial() {
                PlacementData placementData = new PlacementData((GeneratedMessageV3.Builder) this);
                Object unused = placementData.sdk_ = this.sdk_;
                Object unused2 = placementData.sdkver_ = this.sdkver_;
                onBuilt();
                return placementData;
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
                if (message instanceof PlacementData) {
                    return mergeFrom((PlacementData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PlacementData placementData) {
                if (placementData == PlacementData.getDefaultInstance()) {
                    return this;
                }
                if (!placementData.getSdk().isEmpty()) {
                    this.sdk_ = placementData.sdk_;
                    onChanged();
                }
                if (!placementData.getSdkver().isEmpty()) {
                    this.sdkver_ = placementData.sdkver_;
                    onChanged();
                }
                mergeUnknownFields(placementData.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.RequestTokenPayload.PlacementData.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RequestTokenPayload.PlacementData.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.RequestTokenPayload$PlacementData r3 = (io.bidmachine.protobuf.RequestTokenPayload.PlacementData) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.PlacementData) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.RequestTokenPayload$PlacementData r4 = (io.bidmachine.protobuf.RequestTokenPayload.PlacementData) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.PlacementData) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.PlacementData.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RequestTokenPayload$PlacementData$Builder");
            }

            public String getSdk() {
                Object obj = this.sdk_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sdk_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSdkBytes() {
                Object obj = this.sdk_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sdk_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSdk(String str) {
                if (str != null) {
                    this.sdk_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSdk() {
                this.sdk_ = PlacementData.getDefaultInstance().getSdk();
                onChanged();
                return this;
            }

            public Builder setSdkBytes(ByteString byteString) {
                if (byteString != null) {
                    PlacementData.checkByteStringIsUtf8(byteString);
                    this.sdk_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getSdkver() {
                Object obj = this.sdkver_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sdkver_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSdkverBytes() {
                Object obj = this.sdkver_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sdkver_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSdkver(String str) {
                if (str != null) {
                    this.sdkver_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSdkver() {
                this.sdkver_ = PlacementData.getDefaultInstance().getSdkver();
                onChanged();
                return this;
            }

            public Builder setSdkverBytes(ByteString byteString) {
                if (byteString != null) {
                    PlacementData.checkByteStringIsUtf8(byteString);
                    this.sdkver_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static PlacementData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PlacementData> parser() {
            return PARSER;
        }

        public Parser<PlacementData> getParserForType() {
            return PARSER;
        }

        public PlacementData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class SessionData extends GeneratedMessageV3 implements SessionDataOrBuilder {
        private static final SessionData DEFAULT_INSTANCE = new SessionData();
        /* access modifiers changed from: private */
        public static final Parser<SessionData> PARSER = new AbstractParser<SessionData>() {
            public SessionData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new SessionData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SESSIONDURATION_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int SESSION_PLACEMENT_DATA_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object sessionId_;
        /* access modifiers changed from: private */
        public MapField<String, SessionPlacementData> sessionPlacementData_;
        /* access modifiers changed from: private */
        public long sessionduration_;

        public interface SessionPlacementDataOrBuilder extends MessageOrBuilder {
            float getClickrate();

            float getCompletionrate();

            int getImpdepth();

            String getLastadomain();

            ByteString getLastadomainBytes();

            String getLastbundle();

            ByteString getLastbundleBytes();

            boolean getLastclick();
        }

        private SessionData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private SessionData() {
            this.memoizedIsInitialized = -1;
            this.sessionId_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new SessionData();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private SessionData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.sessionId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.sessionduration_ = codedInputStream.readUInt64();
                            } else if (readTag == 26) {
                                if (!z2 || !true) {
                                    this.sessionPlacementData_ = MapField.newMapField(SessionPlacementDataDefaultEntryHolder.defaultEntry);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(SessionPlacementDataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.sessionPlacementData_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
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
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 3) {
                return internalGetSessionPlacementData();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionData.class, Builder.class);
        }

        public static final class SessionPlacementData extends GeneratedMessageV3 implements SessionPlacementDataOrBuilder {
            public static final int CLICKRATE_FIELD_NUMBER = 5;
            public static final int COMPLETIONRATE_FIELD_NUMBER = 7;
            private static final SessionPlacementData DEFAULT_INSTANCE = new SessionPlacementData();
            public static final int IMPDEPTH_FIELD_NUMBER = 1;
            public static final int LASTADOMAIN_FIELD_NUMBER = 4;
            public static final int LASTBUNDLE_FIELD_NUMBER = 3;
            public static final int LASTCLICK_FIELD_NUMBER = 6;
            /* access modifiers changed from: private */
            public static final Parser<SessionPlacementData> PARSER = new AbstractParser<SessionPlacementData>() {
                public SessionPlacementData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new SessionPlacementData(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public float clickrate_;
            /* access modifiers changed from: private */
            public float completionrate_;
            /* access modifiers changed from: private */
            public int impdepth_;
            /* access modifiers changed from: private */
            public volatile Object lastadomain_;
            /* access modifiers changed from: private */
            public volatile Object lastbundle_;
            /* access modifiers changed from: private */
            public boolean lastclick_;
            private byte memoizedIsInitialized;

            private SessionPlacementData(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private SessionPlacementData() {
                this.memoizedIsInitialized = -1;
                this.lastbundle_ = "";
                this.lastadomain_ = "";
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new SessionPlacementData();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private SessionPlacementData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 8) {
                                    this.impdepth_ = codedInputStream.readUInt32();
                                } else if (readTag == 26) {
                                    this.lastbundle_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    this.lastadomain_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 45) {
                                    this.clickrate_ = codedInputStream.readFloat();
                                } else if (readTag == 48) {
                                    this.lastclick_ = codedInputStream.readBool();
                                } else if (readTag == 61) {
                                    this.completionrate_ = codedInputStream.readFloat();
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
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionPlacementData.class, Builder.class);
            }

            public int getImpdepth() {
                return this.impdepth_;
            }

            public String getLastbundle() {
                Object obj = this.lastbundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastbundle_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLastbundleBytes() {
                Object obj = this.lastbundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastbundle_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getLastadomain() {
                Object obj = this.lastadomain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastadomain_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLastadomainBytes() {
                Object obj = this.lastadomain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastadomain_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public float getClickrate() {
                return this.clickrate_;
            }

            public boolean getLastclick() {
                return this.lastclick_;
            }

            public float getCompletionrate() {
                return this.completionrate_;
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
                int i = this.impdepth_;
                if (i != 0) {
                    codedOutputStream.writeUInt32(1, i);
                }
                if (!getLastbundleBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.lastbundle_);
                }
                if (!getLastadomainBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.lastadomain_);
                }
                float f2 = this.clickrate_;
                if (f2 != 0.0f) {
                    codedOutputStream.writeFloat(5, f2);
                }
                boolean z = this.lastclick_;
                if (z) {
                    codedOutputStream.writeBool(6, z);
                }
                float f3 = this.completionrate_;
                if (f3 != 0.0f) {
                    codedOutputStream.writeFloat(7, f3);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                int i3 = this.impdepth_;
                if (i3 != 0) {
                    i2 = 0 + CodedOutputStream.computeUInt32Size(1, i3);
                }
                if (!getLastbundleBytes().isEmpty()) {
                    i2 += GeneratedMessageV3.computeStringSize(3, this.lastbundle_);
                }
                if (!getLastadomainBytes().isEmpty()) {
                    i2 += GeneratedMessageV3.computeStringSize(4, this.lastadomain_);
                }
                float f2 = this.clickrate_;
                if (f2 != 0.0f) {
                    i2 += CodedOutputStream.computeFloatSize(5, f2);
                }
                boolean z = this.lastclick_;
                if (z) {
                    i2 += CodedOutputStream.computeBoolSize(6, z);
                }
                float f3 = this.completionrate_;
                if (f3 != 0.0f) {
                    i2 += CodedOutputStream.computeFloatSize(7, f3);
                }
                int serializedSize = i2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SessionPlacementData)) {
                    return super.equals(obj);
                }
                SessionPlacementData sessionPlacementData = (SessionPlacementData) obj;
                if (getImpdepth() == sessionPlacementData.getImpdepth() && getLastbundle().equals(sessionPlacementData.getLastbundle()) && getLastadomain().equals(sessionPlacementData.getLastadomain()) && Float.floatToIntBits(getClickrate()) == Float.floatToIntBits(sessionPlacementData.getClickrate()) && getLastclick() == sessionPlacementData.getLastclick() && Float.floatToIntBits(getCompletionrate()) == Float.floatToIntBits(sessionPlacementData.getCompletionrate()) && this.unknownFields.equals(sessionPlacementData.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImpdepth()) * 37) + 3) * 53) + getLastbundle().hashCode()) * 37) + 4) * 53) + getLastadomain().hashCode()) * 37) + 5) * 53) + Float.floatToIntBits(getClickrate())) * 37) + 6) * 53) + Internal.hashBoolean(getLastclick())) * 37) + 7) * 53) + Float.floatToIntBits(getCompletionrate())) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode;
                return hashCode;
            }

            public static SessionPlacementData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static SessionPlacementData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static SessionPlacementData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static SessionPlacementData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static SessionPlacementData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static SessionPlacementData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SessionPlacementData parseFrom(InputStream inputStream) throws IOException {
                return (SessionPlacementData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static SessionPlacementData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SessionPlacementData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SessionPlacementData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (SessionPlacementData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SessionPlacementData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SessionPlacementData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SessionPlacementData parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (SessionPlacementData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static SessionPlacementData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SessionPlacementData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(SessionPlacementData sessionPlacementData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionPlacementData);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionPlacementDataOrBuilder {
                private float clickrate_;
                private float completionrate_;
                private int impdepth_;
                private Object lastadomain_;
                private Object lastbundle_;
                private boolean lastclick_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionPlacementData.class, Builder.class);
                }

                private Builder() {
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = SessionPlacementData.alwaysUseFieldBuilders;
                }

                public Builder clear() {
                    super.clear();
                    this.impdepth_ = 0;
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    this.clickrate_ = 0.0f;
                    this.lastclick_ = false;
                    this.completionrate_ = 0.0f;
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
                }

                public SessionPlacementData getDefaultInstanceForType() {
                    return SessionPlacementData.getDefaultInstance();
                }

                public SessionPlacementData build() {
                    SessionPlacementData buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public SessionPlacementData buildPartial() {
                    SessionPlacementData sessionPlacementData = new SessionPlacementData((GeneratedMessageV3.Builder) this);
                    int unused = sessionPlacementData.impdepth_ = this.impdepth_;
                    Object unused2 = sessionPlacementData.lastbundle_ = this.lastbundle_;
                    Object unused3 = sessionPlacementData.lastadomain_ = this.lastadomain_;
                    float unused4 = sessionPlacementData.clickrate_ = this.clickrate_;
                    boolean unused5 = sessionPlacementData.lastclick_ = this.lastclick_;
                    float unused6 = sessionPlacementData.completionrate_ = this.completionrate_;
                    onBuilt();
                    return sessionPlacementData;
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
                    if (message instanceof SessionPlacementData) {
                        return mergeFrom((SessionPlacementData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(SessionPlacementData sessionPlacementData) {
                    if (sessionPlacementData == SessionPlacementData.getDefaultInstance()) {
                        return this;
                    }
                    if (sessionPlacementData.getImpdepth() != 0) {
                        setImpdepth(sessionPlacementData.getImpdepth());
                    }
                    if (!sessionPlacementData.getLastbundle().isEmpty()) {
                        this.lastbundle_ = sessionPlacementData.lastbundle_;
                        onChanged();
                    }
                    if (!sessionPlacementData.getLastadomain().isEmpty()) {
                        this.lastadomain_ = sessionPlacementData.lastadomain_;
                        onChanged();
                    }
                    if (sessionPlacementData.getClickrate() != 0.0f) {
                        setClickrate(sessionPlacementData.getClickrate());
                    }
                    if (sessionPlacementData.getLastclick()) {
                        setLastclick(sessionPlacementData.getLastclick());
                    }
                    if (sessionPlacementData.getCompletionrate() != 0.0f) {
                        setCompletionrate(sessionPlacementData.getCompletionrate());
                    }
                    mergeUnknownFields(sessionPlacementData.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData r3 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData r4 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData$Builder");
                }

                public int getImpdepth() {
                    return this.impdepth_;
                }

                public Builder setImpdepth(int i) {
                    this.impdepth_ = i;
                    onChanged();
                    return this;
                }

                public Builder clearImpdepth() {
                    this.impdepth_ = 0;
                    onChanged();
                    return this;
                }

                public String getLastbundle() {
                    Object obj = this.lastbundle_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastbundle_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getLastbundleBytes() {
                    Object obj = this.lastbundle_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastbundle_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setLastbundle(String str) {
                    if (str != null) {
                        this.lastbundle_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearLastbundle() {
                    this.lastbundle_ = SessionPlacementData.getDefaultInstance().getLastbundle();
                    onChanged();
                    return this;
                }

                public Builder setLastbundleBytes(ByteString byteString) {
                    if (byteString != null) {
                        SessionPlacementData.checkByteStringIsUtf8(byteString);
                        this.lastbundle_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getLastadomain() {
                    Object obj = this.lastadomain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastadomain_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getLastadomainBytes() {
                    Object obj = this.lastadomain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastadomain_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setLastadomain(String str) {
                    if (str != null) {
                        this.lastadomain_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearLastadomain() {
                    this.lastadomain_ = SessionPlacementData.getDefaultInstance().getLastadomain();
                    onChanged();
                    return this;
                }

                public Builder setLastadomainBytes(ByteString byteString) {
                    if (byteString != null) {
                        SessionPlacementData.checkByteStringIsUtf8(byteString);
                        this.lastadomain_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public float getClickrate() {
                    return this.clickrate_;
                }

                public Builder setClickrate(float f2) {
                    this.clickrate_ = f2;
                    onChanged();
                    return this;
                }

                public Builder clearClickrate() {
                    this.clickrate_ = 0.0f;
                    onChanged();
                    return this;
                }

                public boolean getLastclick() {
                    return this.lastclick_;
                }

                public Builder setLastclick(boolean z) {
                    this.lastclick_ = z;
                    onChanged();
                    return this;
                }

                public Builder clearLastclick() {
                    this.lastclick_ = false;
                    onChanged();
                    return this;
                }

                public float getCompletionrate() {
                    return this.completionrate_;
                }

                public Builder setCompletionrate(float f2) {
                    this.completionrate_ = f2;
                    onChanged();
                    return this;
                }

                public Builder clearCompletionrate() {
                    this.completionrate_ = 0.0f;
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

            public static SessionPlacementData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<SessionPlacementData> parser() {
                return PARSER;
            }

            public Parser<SessionPlacementData> getParserForType() {
                return PARSER;
            }

            public SessionPlacementData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public long getSessionduration() {
            return this.sessionduration_;
        }

        private static final class SessionPlacementDataDefaultEntryHolder {
            static final MapEntry<String, SessionPlacementData> defaultEntry = MapEntry.newDefaultInstance(CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, SessionPlacementData.getDefaultInstance());

            private SessionPlacementDataDefaultEntryHolder() {
            }
        }

        /* access modifiers changed from: private */
        public MapField<String, SessionPlacementData> internalGetSessionPlacementData() {
            MapField<String, SessionPlacementData> mapField = this.sessionPlacementData_;
            return mapField == null ? MapField.emptyMapField(SessionPlacementDataDefaultEntryHolder.defaultEntry) : mapField;
        }

        public int getSessionPlacementDataCount() {
            return internalGetSessionPlacementData().getMap().size();
        }

        public boolean containsSessionPlacementData(String str) {
            if (str != null) {
                return internalGetSessionPlacementData().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, SessionPlacementData> getSessionPlacementData() {
            return getSessionPlacementDataMap();
        }

        public Map<String, SessionPlacementData> getSessionPlacementDataMap() {
            return internalGetSessionPlacementData().getMap();
        }

        public SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionPlacementData sessionPlacementData) {
            if (str != null) {
                Map<String, SessionPlacementData> map = internalGetSessionPlacementData().getMap();
                return map.containsKey(str) ? map.get(str) : sessionPlacementData;
            }
            throw null;
        }

        public SessionPlacementData getSessionPlacementDataOrThrow(String str) {
            if (str != null) {
                Map<String, SessionPlacementData> map = internalGetSessionPlacementData().getMap();
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
            if (!getSessionIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.sessionId_);
            }
            long j = this.sessionduration_;
            if (j != 0) {
                codedOutputStream.writeUInt64(2, j);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetSessionPlacementData(), SessionPlacementDataDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getSessionIdBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.sessionId_);
            }
            long j = this.sessionduration_;
            if (j != 0) {
                i2 += CodedOutputStream.computeUInt64Size(2, j);
            }
            for (Map.Entry next : internalGetSessionPlacementData().getMap().entrySet()) {
                i2 += CodedOutputStream.computeMessageSize(3, SessionPlacementDataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionData)) {
                return super.equals(obj);
            }
            SessionData sessionData = (SessionData) obj;
            if (getSessionId().equals(sessionData.getSessionId()) && getSessionduration() == sessionData.getSessionduration() && internalGetSessionPlacementData().equals(sessionData.internalGetSessionPlacementData()) && this.unknownFields.equals(sessionData.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSessionId().hashCode()) * 37) + 2) * 53) + Internal.hashLong(getSessionduration());
            if (!internalGetSessionPlacementData().getMap().isEmpty()) {
                hashCode = (((hashCode * 37) + 3) * 53) + internalGetSessionPlacementData().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SessionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static SessionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SessionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static SessionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SessionData parseFrom(InputStream inputStream) throws IOException {
            return (SessionData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SessionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SessionData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(SessionData sessionData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionData);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionDataOrBuilder {
            private int bitField0_;
            private Object sessionId_;
            private MapField<String, SessionPlacementData> sessionPlacementData_;
            private long sessionduration_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
            }

            /* access modifiers changed from: protected */
            public MapField internalGetMapField(int i) {
                if (i == 3) {
                    return internalGetSessionPlacementData();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* access modifiers changed from: protected */
            public MapField internalGetMutableMapField(int i) {
                if (i == 3) {
                    return internalGetMutableSessionPlacementData();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionData.class, Builder.class);
            }

            private Builder() {
                this.sessionId_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionId_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = SessionData.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.sessionId_ = "";
                this.sessionduration_ = 0;
                internalGetMutableSessionPlacementData().clear();
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
            }

            public SessionData getDefaultInstanceForType() {
                return SessionData.getDefaultInstance();
            }

            public SessionData build() {
                SessionData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public SessionData buildPartial() {
                SessionData sessionData = new SessionData((GeneratedMessageV3.Builder) this);
                Object unused = sessionData.sessionId_ = this.sessionId_;
                long unused2 = sessionData.sessionduration_ = this.sessionduration_;
                MapField unused3 = sessionData.sessionPlacementData_ = internalGetSessionPlacementData();
                sessionData.sessionPlacementData_.makeImmutable();
                onBuilt();
                return sessionData;
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
                if (message instanceof SessionData) {
                    return mergeFrom((SessionData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionData sessionData) {
                if (sessionData == SessionData.getDefaultInstance()) {
                    return this;
                }
                if (!sessionData.getSessionId().isEmpty()) {
                    this.sessionId_ = sessionData.sessionId_;
                    onChanged();
                }
                if (sessionData.getSessionduration() != 0) {
                    setSessionduration(sessionData.getSessionduration());
                }
                internalGetMutableSessionPlacementData().mergeFrom(sessionData.internalGetSessionPlacementData());
                mergeUnknownFields(sessionData.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.RequestTokenPayload.SessionData.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RequestTokenPayload.SessionData.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.RequestTokenPayload$SessionData r3 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.SessionData) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.RequestTokenPayload$SessionData r4 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.SessionData) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.SessionData.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RequestTokenPayload$SessionData$Builder");
            }

            public String getSessionId() {
                Object obj = this.sessionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sessionId_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSessionIdBytes() {
                Object obj = this.sessionId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionId_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSessionId(String str) {
                if (str != null) {
                    this.sessionId_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSessionId() {
                this.sessionId_ = SessionData.getDefaultInstance().getSessionId();
                onChanged();
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                if (byteString != null) {
                    SessionData.checkByteStringIsUtf8(byteString);
                    this.sessionId_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public long getSessionduration() {
                return this.sessionduration_;
            }

            public Builder setSessionduration(long j) {
                this.sessionduration_ = j;
                onChanged();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0;
                onChanged();
                return this;
            }

            private MapField<String, SessionPlacementData> internalGetSessionPlacementData() {
                MapField<String, SessionPlacementData> mapField = this.sessionPlacementData_;
                return mapField == null ? MapField.emptyMapField(SessionPlacementDataDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, SessionPlacementData> internalGetMutableSessionPlacementData() {
                onChanged();
                if (this.sessionPlacementData_ == null) {
                    this.sessionPlacementData_ = MapField.newMapField(SessionPlacementDataDefaultEntryHolder.defaultEntry);
                }
                if (!this.sessionPlacementData_.isMutable()) {
                    this.sessionPlacementData_ = this.sessionPlacementData_.copy();
                }
                return this.sessionPlacementData_;
            }

            public int getSessionPlacementDataCount() {
                return internalGetSessionPlacementData().getMap().size();
            }

            public boolean containsSessionPlacementData(String str) {
                if (str != null) {
                    return internalGetSessionPlacementData().getMap().containsKey(str);
                }
                throw null;
            }

            @Deprecated
            public Map<String, SessionPlacementData> getSessionPlacementData() {
                return getSessionPlacementDataMap();
            }

            public Map<String, SessionPlacementData> getSessionPlacementDataMap() {
                return internalGetSessionPlacementData().getMap();
            }

            public SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionPlacementData sessionPlacementData) {
                if (str != null) {
                    Map<String, SessionPlacementData> map = internalGetSessionPlacementData().getMap();
                    return map.containsKey(str) ? map.get(str) : sessionPlacementData;
                }
                throw null;
            }

            public SessionPlacementData getSessionPlacementDataOrThrow(String str) {
                if (str != null) {
                    Map<String, SessionPlacementData> map = internalGetSessionPlacementData().getMap();
                    if (map.containsKey(str)) {
                        return map.get(str);
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            }

            public Builder clearSessionPlacementData() {
                internalGetMutableSessionPlacementData().getMutableMap().clear();
                return this;
            }

            public Builder removeSessionPlacementData(String str) {
                if (str != null) {
                    internalGetMutableSessionPlacementData().getMutableMap().remove(str);
                    return this;
                }
                throw null;
            }

            @Deprecated
            public Map<String, SessionPlacementData> getMutableSessionPlacementData() {
                return internalGetMutableSessionPlacementData().getMutableMap();
            }

            public Builder putSessionPlacementData(String str, SessionPlacementData sessionPlacementData) {
                if (str == null) {
                    throw null;
                } else if (sessionPlacementData != null) {
                    internalGetMutableSessionPlacementData().getMutableMap().put(str, sessionPlacementData);
                    return this;
                } else {
                    throw null;
                }
            }

            public Builder putAllSessionPlacementData(Map<String, SessionPlacementData> map) {
                internalGetMutableSessionPlacementData().getMutableMap().putAll(map);
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<SessionData> parser() {
            return PARSER;
        }

        public Parser<SessionData> getParserForType() {
            return PARSER;
        }

        public SessionData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class DeviceData extends GeneratedMessageV3 implements DeviceDataOrBuilder {
        public static final int ACCESS_FIELD_NUMBER = 19;
        public static final int AIRPLANE_FIELD_NUMBER = 12;
        public static final int ATTS_FIELD_NUMBER = 22;
        public static final int BATTERYLEVEL_FIELD_NUMBER = 9;
        public static final int BATTERYSAVER_FIELD_NUMBER = 10;
        public static final int BM_IFV_FIELD_NUMBER = 2;
        public static final int CHARGING_FIELD_NUMBER = 7;
        public static final int DARKMODE_FIELD_NUMBER = 11;
        private static final DeviceData DEFAULT_INSTANCE = new DeviceData();
        public static final int DEVICENAME_FIELD_NUMBER = 14;
        public static final int DISKSPACE_FIELD_NUMBER = 4;
        public static final int DND_FIELD_NUMBER = 13;
        public static final int HEADSETNAME_FIELD_NUMBER = 20;
        public static final int HEADSET_FIELD_NUMBER = 8;
        public static final int IFV_FIELD_NUMBER = 1;
        public static final int INPUTLANGUAGE_FIELD_NUMBER = 3;
        public static final int JAILBREAK_FIELD_NUMBER = 17;
        public static final int LASTBOOTUP_FIELD_NUMBER = 18;
        /* access modifiers changed from: private */
        public static final Parser<DeviceData> PARSER = new AbstractParser<DeviceData>() {
            public DeviceData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new DeviceData(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int RINGMUTE_FIELD_NUMBER = 6;
        public static final int SCREENBRIGHT_FIELD_NUMBER = 16;
        public static final int TIME_FIELD_NUMBER = 15;
        public static final int TOTALDISK_FIELD_NUMBER = 5;
        public static final int TOTALMEM_FIELD_NUMBER = 21;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object access_;
        /* access modifiers changed from: private */
        public boolean airplane_;
        /* access modifiers changed from: private */
        public int atts_;
        /* access modifiers changed from: private */
        public float batterylevel_;
        /* access modifiers changed from: private */
        public boolean batterysaver_;
        /* access modifiers changed from: private */
        public volatile Object bmIfv_;
        /* access modifiers changed from: private */
        public boolean charging_;
        /* access modifiers changed from: private */
        public boolean darkmode_;
        /* access modifiers changed from: private */
        public volatile Object devicename_;
        /* access modifiers changed from: private */
        public long diskspace_;
        /* access modifiers changed from: private */
        public boolean dnd_;
        /* access modifiers changed from: private */
        public boolean headset_;
        /* access modifiers changed from: private */
        public volatile Object headsetname_;
        /* access modifiers changed from: private */
        public volatile Object ifv_;
        /* access modifiers changed from: private */
        public LazyStringList inputlanguage_;
        /* access modifiers changed from: private */
        public boolean jailbreak_;
        /* access modifiers changed from: private */
        public long lastbootup_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public boolean ringmute_;
        /* access modifiers changed from: private */
        public float screenbright_;
        /* access modifiers changed from: private */
        public long time_;
        /* access modifiers changed from: private */
        public long totaldisk_;
        /* access modifiers changed from: private */
        public long totalmem_;

        private DeviceData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private DeviceData() {
            this.memoizedIsInitialized = -1;
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.inputlanguage_ = LazyStringArrayList.EMPTY;
            this.devicename_ = "";
            this.access_ = "";
            this.headsetname_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new DeviceData();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DeviceData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.ifv_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.bmIfv_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.inputlanguage_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.inputlanguage_.add(readStringRequireUtf8);
                                break;
                            case 32:
                                this.diskspace_ = codedInputStream.readUInt64();
                                break;
                            case 40:
                                this.totaldisk_ = codedInputStream.readUInt64();
                                break;
                            case 48:
                                this.ringmute_ = codedInputStream.readBool();
                                break;
                            case 56:
                                this.charging_ = codedInputStream.readBool();
                                break;
                            case 64:
                                this.headset_ = codedInputStream.readBool();
                                break;
                            case 77:
                                this.batterylevel_ = codedInputStream.readFloat();
                                break;
                            case 80:
                                this.batterysaver_ = codedInputStream.readBool();
                                break;
                            case 88:
                                this.darkmode_ = codedInputStream.readBool();
                                break;
                            case 96:
                                this.airplane_ = codedInputStream.readBool();
                                break;
                            case 104:
                                this.dnd_ = codedInputStream.readBool();
                                break;
                            case 114:
                                this.devicename_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 120:
                                this.time_ = codedInputStream.readUInt64();
                                break;
                            case 133:
                                this.screenbright_ = codedInputStream.readFloat();
                                break;
                            case 136:
                                this.jailbreak_ = codedInputStream.readBool();
                                break;
                            case 144:
                                this.lastbootup_ = codedInputStream.readUInt64();
                                break;
                            case 154:
                                this.access_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 162:
                                this.headsetname_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 168:
                                this.totalmem_ = codedInputStream.readUInt64();
                                break;
                            case 176:
                                this.atts_ = codedInputStream.readUInt32();
                                break;
                            default:
                                if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_DeviceData_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_DeviceData_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceData.class, Builder.class);
        }

        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getInputlanguageList() {
            return this.inputlanguage_;
        }

        public int getInputlanguageCount() {
            return this.inputlanguage_.size();
        }

        public String getInputlanguage(int i) {
            return (String) this.inputlanguage_.get(i);
        }

        public ByteString getInputlanguageBytes(int i) {
            return this.inputlanguage_.getByteString(i);
        }

        public long getDiskspace() {
            return this.diskspace_;
        }

        public long getTotaldisk() {
            return this.totaldisk_;
        }

        public boolean getRingmute() {
            return this.ringmute_;
        }

        public boolean getCharging() {
            return this.charging_;
        }

        public boolean getHeadset() {
            return this.headset_;
        }

        public float getBatterylevel() {
            return this.batterylevel_;
        }

        public boolean getBatterysaver() {
            return this.batterysaver_;
        }

        public boolean getDarkmode() {
            return this.darkmode_;
        }

        public boolean getAirplane() {
            return this.airplane_;
        }

        public boolean getDnd() {
            return this.dnd_;
        }

        public String getDevicename() {
            Object obj = this.devicename_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.devicename_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDevicenameBytes() {
            Object obj = this.devicename_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.devicename_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public long getTime() {
            return this.time_;
        }

        public float getScreenbright() {
            return this.screenbright_;
        }

        public boolean getJailbreak() {
            return this.jailbreak_;
        }

        public long getLastbootup() {
            return this.lastbootup_;
        }

        public String getAccess() {
            Object obj = this.access_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.access_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAccessBytes() {
            Object obj = this.access_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.access_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getHeadsetname() {
            Object obj = this.headsetname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.headsetname_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getHeadsetnameBytes() {
            Object obj = this.headsetname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.headsetname_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public long getTotalmem() {
            return this.totalmem_;
        }

        public int getAtts() {
            return this.atts_;
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
            if (!getIfvBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.ifv_);
            }
            if (!getBmIfvBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.bmIfv_);
            }
            for (int i = 0; i < this.inputlanguage_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.inputlanguage_.getRaw(i));
            }
            long j = this.diskspace_;
            if (j != 0) {
                codedOutputStream.writeUInt64(4, j);
            }
            long j2 = this.totaldisk_;
            if (j2 != 0) {
                codedOutputStream.writeUInt64(5, j2);
            }
            boolean z = this.ringmute_;
            if (z) {
                codedOutputStream.writeBool(6, z);
            }
            boolean z2 = this.charging_;
            if (z2) {
                codedOutputStream.writeBool(7, z2);
            }
            boolean z3 = this.headset_;
            if (z3) {
                codedOutputStream.writeBool(8, z3);
            }
            float f2 = this.batterylevel_;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(9, f2);
            }
            boolean z4 = this.batterysaver_;
            if (z4) {
                codedOutputStream.writeBool(10, z4);
            }
            boolean z5 = this.darkmode_;
            if (z5) {
                codedOutputStream.writeBool(11, z5);
            }
            boolean z6 = this.airplane_;
            if (z6) {
                codedOutputStream.writeBool(12, z6);
            }
            boolean z7 = this.dnd_;
            if (z7) {
                codedOutputStream.writeBool(13, z7);
            }
            if (!getDevicenameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 14, this.devicename_);
            }
            long j3 = this.time_;
            if (j3 != 0) {
                codedOutputStream.writeUInt64(15, j3);
            }
            float f3 = this.screenbright_;
            if (f3 != 0.0f) {
                codedOutputStream.writeFloat(16, f3);
            }
            boolean z8 = this.jailbreak_;
            if (z8) {
                codedOutputStream.writeBool(17, z8);
            }
            long j4 = this.lastbootup_;
            if (j4 != 0) {
                codedOutputStream.writeUInt64(18, j4);
            }
            if (!getAccessBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 19, this.access_);
            }
            if (!getHeadsetnameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 20, this.headsetname_);
            }
            long j5 = this.totalmem_;
            if (j5 != 0) {
                codedOutputStream.writeUInt64(21, j5);
            }
            int i2 = this.atts_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(22, i2);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getIfvBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.ifv_) + 0 : 0;
            if (!getBmIfvBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.bmIfv_);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.inputlanguage_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.inputlanguage_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getInputlanguageList().size() * 1);
            long j = this.diskspace_;
            if (j != 0) {
                size += CodedOutputStream.computeUInt64Size(4, j);
            }
            long j2 = this.totaldisk_;
            if (j2 != 0) {
                size += CodedOutputStream.computeUInt64Size(5, j2);
            }
            boolean z = this.ringmute_;
            if (z) {
                size += CodedOutputStream.computeBoolSize(6, z);
            }
            boolean z2 = this.charging_;
            if (z2) {
                size += CodedOutputStream.computeBoolSize(7, z2);
            }
            boolean z3 = this.headset_;
            if (z3) {
                size += CodedOutputStream.computeBoolSize(8, z3);
            }
            float f2 = this.batterylevel_;
            if (f2 != 0.0f) {
                size += CodedOutputStream.computeFloatSize(9, f2);
            }
            boolean z4 = this.batterysaver_;
            if (z4) {
                size += CodedOutputStream.computeBoolSize(10, z4);
            }
            boolean z5 = this.darkmode_;
            if (z5) {
                size += CodedOutputStream.computeBoolSize(11, z5);
            }
            boolean z6 = this.airplane_;
            if (z6) {
                size += CodedOutputStream.computeBoolSize(12, z6);
            }
            boolean z7 = this.dnd_;
            if (z7) {
                size += CodedOutputStream.computeBoolSize(13, z7);
            }
            if (!getDevicenameBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(14, this.devicename_);
            }
            long j3 = this.time_;
            if (j3 != 0) {
                size += CodedOutputStream.computeUInt64Size(15, j3);
            }
            float f3 = this.screenbright_;
            if (f3 != 0.0f) {
                size += CodedOutputStream.computeFloatSize(16, f3);
            }
            boolean z8 = this.jailbreak_;
            if (z8) {
                size += CodedOutputStream.computeBoolSize(17, z8);
            }
            long j4 = this.lastbootup_;
            if (j4 != 0) {
                size += CodedOutputStream.computeUInt64Size(18, j4);
            }
            if (!getAccessBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(19, this.access_);
            }
            if (!getHeadsetnameBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(20, this.headsetname_);
            }
            long j5 = this.totalmem_;
            if (j5 != 0) {
                size += CodedOutputStream.computeUInt64Size(21, j5);
            }
            int i4 = this.atts_;
            if (i4 != 0) {
                size += CodedOutputStream.computeUInt32Size(22, i4);
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceData)) {
                return super.equals(obj);
            }
            DeviceData deviceData = (DeviceData) obj;
            if (getIfv().equals(deviceData.getIfv()) && getBmIfv().equals(deviceData.getBmIfv()) && getInputlanguageList().equals(deviceData.getInputlanguageList()) && getDiskspace() == deviceData.getDiskspace() && getTotaldisk() == deviceData.getTotaldisk() && getRingmute() == deviceData.getRingmute() && getCharging() == deviceData.getCharging() && getHeadset() == deviceData.getHeadset() && Float.floatToIntBits(getBatterylevel()) == Float.floatToIntBits(deviceData.getBatterylevel()) && getBatterysaver() == deviceData.getBatterysaver() && getDarkmode() == deviceData.getDarkmode() && getAirplane() == deviceData.getAirplane() && getDnd() == deviceData.getDnd() && getDevicename().equals(deviceData.getDevicename()) && getTime() == deviceData.getTime() && Float.floatToIntBits(getScreenbright()) == Float.floatToIntBits(deviceData.getScreenbright()) && getJailbreak() == deviceData.getJailbreak() && getLastbootup() == deviceData.getLastbootup() && getAccess().equals(deviceData.getAccess()) && getHeadsetname().equals(deviceData.getHeadsetname()) && getTotalmem() == deviceData.getTotalmem() && getAtts() == deviceData.getAtts() && this.unknownFields.equals(deviceData.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getIfv().hashCode()) * 37) + 2) * 53) + getBmIfv().hashCode();
            if (getInputlanguageCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getInputlanguageList().hashCode();
            }
            int hashLong = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 37) + 4) * 53) + Internal.hashLong(getDiskspace())) * 37) + 5) * 53) + Internal.hashLong(getTotaldisk())) * 37) + 6) * 53) + Internal.hashBoolean(getRingmute())) * 37) + 7) * 53) + Internal.hashBoolean(getCharging())) * 37) + 8) * 53) + Internal.hashBoolean(getHeadset())) * 37) + 9) * 53) + Float.floatToIntBits(getBatterylevel())) * 37) + 10) * 53) + Internal.hashBoolean(getBatterysaver())) * 37) + 11) * 53) + Internal.hashBoolean(getDarkmode())) * 37) + 12) * 53) + Internal.hashBoolean(getAirplane())) * 37) + 13) * 53) + Internal.hashBoolean(getDnd())) * 37) + 14) * 53) + getDevicename().hashCode()) * 37) + 15) * 53) + Internal.hashLong(getTime())) * 37) + 16) * 53) + Float.floatToIntBits(getScreenbright())) * 37) + 17) * 53) + Internal.hashBoolean(getJailbreak())) * 37) + 18) * 53) + Internal.hashLong(getLastbootup())) * 37) + 19) * 53) + getAccess().hashCode()) * 37) + 20) * 53) + getHeadsetname().hashCode()) * 37) + 21) * 53) + Internal.hashLong(getTotalmem())) * 37) + 22) * 53) + getAtts()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashLong;
            return hashLong;
        }

        public static DeviceData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static DeviceData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DeviceData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static DeviceData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceData parseFrom(InputStream inputStream) throws IOException {
            return (DeviceData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DeviceData deviceData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceData);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceDataOrBuilder {
            private Object access_;
            private boolean airplane_;
            private int atts_;
            private float batterylevel_;
            private boolean batterysaver_;
            private int bitField0_;
            private Object bmIfv_;
            private boolean charging_;
            private boolean darkmode_;
            private Object devicename_;
            private long diskspace_;
            private boolean dnd_;
            private boolean headset_;
            private Object headsetname_;
            private Object ifv_;
            private LazyStringList inputlanguage_;
            private boolean jailbreak_;
            private long lastbootup_;
            private boolean ringmute_;
            private float screenbright_;
            private long time_;
            private long totaldisk_;
            private long totalmem_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_DeviceData_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_DeviceData_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceData.class, Builder.class);
            }

            private Builder() {
                this.ifv_ = "";
                this.bmIfv_ = "";
                this.inputlanguage_ = LazyStringArrayList.EMPTY;
                this.devicename_ = "";
                this.access_ = "";
                this.headsetname_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ifv_ = "";
                this.bmIfv_ = "";
                this.inputlanguage_ = LazyStringArrayList.EMPTY;
                this.devicename_ = "";
                this.access_ = "";
                this.headsetname_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = DeviceData.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.ifv_ = "";
                this.bmIfv_ = "";
                this.inputlanguage_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.diskspace_ = 0;
                this.totaldisk_ = 0;
                this.ringmute_ = false;
                this.charging_ = false;
                this.headset_ = false;
                this.batterylevel_ = 0.0f;
                this.batterysaver_ = false;
                this.darkmode_ = false;
                this.airplane_ = false;
                this.dnd_ = false;
                this.devicename_ = "";
                this.time_ = 0;
                this.screenbright_ = 0.0f;
                this.jailbreak_ = false;
                this.lastbootup_ = 0;
                this.access_ = "";
                this.headsetname_ = "";
                this.totalmem_ = 0;
                this.atts_ = 0;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_DeviceData_descriptor;
            }

            public DeviceData getDefaultInstanceForType() {
                return DeviceData.getDefaultInstance();
            }

            public DeviceData build() {
                DeviceData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public DeviceData buildPartial() {
                DeviceData deviceData = new DeviceData((GeneratedMessageV3.Builder) this);
                Object unused = deviceData.ifv_ = this.ifv_;
                Object unused2 = deviceData.bmIfv_ = this.bmIfv_;
                if ((this.bitField0_ & 1) != 0) {
                    this.inputlanguage_ = this.inputlanguage_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused3 = deviceData.inputlanguage_ = this.inputlanguage_;
                long unused4 = deviceData.diskspace_ = this.diskspace_;
                long unused5 = deviceData.totaldisk_ = this.totaldisk_;
                boolean unused6 = deviceData.ringmute_ = this.ringmute_;
                boolean unused7 = deviceData.charging_ = this.charging_;
                boolean unused8 = deviceData.headset_ = this.headset_;
                float unused9 = deviceData.batterylevel_ = this.batterylevel_;
                boolean unused10 = deviceData.batterysaver_ = this.batterysaver_;
                boolean unused11 = deviceData.darkmode_ = this.darkmode_;
                boolean unused12 = deviceData.airplane_ = this.airplane_;
                boolean unused13 = deviceData.dnd_ = this.dnd_;
                Object unused14 = deviceData.devicename_ = this.devicename_;
                long unused15 = deviceData.time_ = this.time_;
                float unused16 = deviceData.screenbright_ = this.screenbright_;
                boolean unused17 = deviceData.jailbreak_ = this.jailbreak_;
                long unused18 = deviceData.lastbootup_ = this.lastbootup_;
                Object unused19 = deviceData.access_ = this.access_;
                Object unused20 = deviceData.headsetname_ = this.headsetname_;
                long unused21 = deviceData.totalmem_ = this.totalmem_;
                int unused22 = deviceData.atts_ = this.atts_;
                onBuilt();
                return deviceData;
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
                if (message instanceof DeviceData) {
                    return mergeFrom((DeviceData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceData deviceData) {
                if (deviceData == DeviceData.getDefaultInstance()) {
                    return this;
                }
                if (!deviceData.getIfv().isEmpty()) {
                    this.ifv_ = deviceData.ifv_;
                    onChanged();
                }
                if (!deviceData.getBmIfv().isEmpty()) {
                    this.bmIfv_ = deviceData.bmIfv_;
                    onChanged();
                }
                if (!deviceData.inputlanguage_.isEmpty()) {
                    if (this.inputlanguage_.isEmpty()) {
                        this.inputlanguage_ = deviceData.inputlanguage_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureInputlanguageIsMutable();
                        this.inputlanguage_.addAll(deviceData.inputlanguage_);
                    }
                    onChanged();
                }
                if (deviceData.getDiskspace() != 0) {
                    setDiskspace(deviceData.getDiskspace());
                }
                if (deviceData.getTotaldisk() != 0) {
                    setTotaldisk(deviceData.getTotaldisk());
                }
                if (deviceData.getRingmute()) {
                    setRingmute(deviceData.getRingmute());
                }
                if (deviceData.getCharging()) {
                    setCharging(deviceData.getCharging());
                }
                if (deviceData.getHeadset()) {
                    setHeadset(deviceData.getHeadset());
                }
                if (deviceData.getBatterylevel() != 0.0f) {
                    setBatterylevel(deviceData.getBatterylevel());
                }
                if (deviceData.getBatterysaver()) {
                    setBatterysaver(deviceData.getBatterysaver());
                }
                if (deviceData.getDarkmode()) {
                    setDarkmode(deviceData.getDarkmode());
                }
                if (deviceData.getAirplane()) {
                    setAirplane(deviceData.getAirplane());
                }
                if (deviceData.getDnd()) {
                    setDnd(deviceData.getDnd());
                }
                if (!deviceData.getDevicename().isEmpty()) {
                    this.devicename_ = deviceData.devicename_;
                    onChanged();
                }
                if (deviceData.getTime() != 0) {
                    setTime(deviceData.getTime());
                }
                if (deviceData.getScreenbright() != 0.0f) {
                    setScreenbright(deviceData.getScreenbright());
                }
                if (deviceData.getJailbreak()) {
                    setJailbreak(deviceData.getJailbreak());
                }
                if (deviceData.getLastbootup() != 0) {
                    setLastbootup(deviceData.getLastbootup());
                }
                if (!deviceData.getAccess().isEmpty()) {
                    this.access_ = deviceData.access_;
                    onChanged();
                }
                if (!deviceData.getHeadsetname().isEmpty()) {
                    this.headsetname_ = deviceData.headsetname_;
                    onChanged();
                }
                if (deviceData.getTotalmem() != 0) {
                    setTotalmem(deviceData.getTotalmem());
                }
                if (deviceData.getAtts() != 0) {
                    setAtts(deviceData.getAtts());
                }
                mergeUnknownFields(deviceData.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.RequestTokenPayload.DeviceData.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RequestTokenPayload.DeviceData.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.RequestTokenPayload$DeviceData r3 = (io.bidmachine.protobuf.RequestTokenPayload.DeviceData) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.DeviceData) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.RequestTokenPayload$DeviceData r4 = (io.bidmachine.protobuf.RequestTokenPayload.DeviceData) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.DeviceData) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.DeviceData.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RequestTokenPayload$DeviceData$Builder");
            }

            public String getIfv() {
                Object obj = this.ifv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ifv_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIfvBytes() {
                Object obj = this.ifv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ifv_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setIfv(String str) {
                if (str != null) {
                    this.ifv_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearIfv() {
                this.ifv_ = DeviceData.getDefaultInstance().getIfv();
                onChanged();
                return this;
            }

            public Builder setIfvBytes(ByteString byteString) {
                if (byteString != null) {
                    DeviceData.checkByteStringIsUtf8(byteString);
                    this.ifv_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getBmIfv() {
                Object obj = this.bmIfv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bmIfv_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getBmIfvBytes() {
                Object obj = this.bmIfv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bmIfv_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setBmIfv(String str) {
                if (str != null) {
                    this.bmIfv_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearBmIfv() {
                this.bmIfv_ = DeviceData.getDefaultInstance().getBmIfv();
                onChanged();
                return this;
            }

            public Builder setBmIfvBytes(ByteString byteString) {
                if (byteString != null) {
                    DeviceData.checkByteStringIsUtf8(byteString);
                    this.bmIfv_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureInputlanguageIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.inputlanguage_ = new LazyStringArrayList(this.inputlanguage_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getInputlanguageList() {
                return this.inputlanguage_.getUnmodifiableView();
            }

            public int getInputlanguageCount() {
                return this.inputlanguage_.size();
            }

            public String getInputlanguage(int i) {
                return (String) this.inputlanguage_.get(i);
            }

            public ByteString getInputlanguageBytes(int i) {
                return this.inputlanguage_.getByteString(i);
            }

            public Builder setInputlanguage(int i, String str) {
                if (str != null) {
                    ensureInputlanguageIsMutable();
                    this.inputlanguage_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addInputlanguage(String str) {
                if (str != null) {
                    ensureInputlanguageIsMutable();
                    this.inputlanguage_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllInputlanguage(Iterable<String> iterable) {
                ensureInputlanguageIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.inputlanguage_);
                onChanged();
                return this;
            }

            public Builder clearInputlanguage() {
                this.inputlanguage_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addInputlanguageBytes(ByteString byteString) {
                if (byteString != null) {
                    DeviceData.checkByteStringIsUtf8(byteString);
                    ensureInputlanguageIsMutable();
                    this.inputlanguage_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public long getDiskspace() {
                return this.diskspace_;
            }

            public Builder setDiskspace(long j) {
                this.diskspace_ = j;
                onChanged();
                return this;
            }

            public Builder clearDiskspace() {
                this.diskspace_ = 0;
                onChanged();
                return this;
            }

            public long getTotaldisk() {
                return this.totaldisk_;
            }

            public Builder setTotaldisk(long j) {
                this.totaldisk_ = j;
                onChanged();
                return this;
            }

            public Builder clearTotaldisk() {
                this.totaldisk_ = 0;
                onChanged();
                return this;
            }

            public boolean getRingmute() {
                return this.ringmute_;
            }

            public Builder setRingmute(boolean z) {
                this.ringmute_ = z;
                onChanged();
                return this;
            }

            public Builder clearRingmute() {
                this.ringmute_ = false;
                onChanged();
                return this;
            }

            public boolean getCharging() {
                return this.charging_;
            }

            public Builder setCharging(boolean z) {
                this.charging_ = z;
                onChanged();
                return this;
            }

            public Builder clearCharging() {
                this.charging_ = false;
                onChanged();
                return this;
            }

            public boolean getHeadset() {
                return this.headset_;
            }

            public Builder setHeadset(boolean z) {
                this.headset_ = z;
                onChanged();
                return this;
            }

            public Builder clearHeadset() {
                this.headset_ = false;
                onChanged();
                return this;
            }

            public float getBatterylevel() {
                return this.batterylevel_;
            }

            public Builder setBatterylevel(float f2) {
                this.batterylevel_ = f2;
                onChanged();
                return this;
            }

            public Builder clearBatterylevel() {
                this.batterylevel_ = 0.0f;
                onChanged();
                return this;
            }

            public boolean getBatterysaver() {
                return this.batterysaver_;
            }

            public Builder setBatterysaver(boolean z) {
                this.batterysaver_ = z;
                onChanged();
                return this;
            }

            public Builder clearBatterysaver() {
                this.batterysaver_ = false;
                onChanged();
                return this;
            }

            public boolean getDarkmode() {
                return this.darkmode_;
            }

            public Builder setDarkmode(boolean z) {
                this.darkmode_ = z;
                onChanged();
                return this;
            }

            public Builder clearDarkmode() {
                this.darkmode_ = false;
                onChanged();
                return this;
            }

            public boolean getAirplane() {
                return this.airplane_;
            }

            public Builder setAirplane(boolean z) {
                this.airplane_ = z;
                onChanged();
                return this;
            }

            public Builder clearAirplane() {
                this.airplane_ = false;
                onChanged();
                return this;
            }

            public boolean getDnd() {
                return this.dnd_;
            }

            public Builder setDnd(boolean z) {
                this.dnd_ = z;
                onChanged();
                return this;
            }

            public Builder clearDnd() {
                this.dnd_ = false;
                onChanged();
                return this;
            }

            public String getDevicename() {
                Object obj = this.devicename_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.devicename_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDevicenameBytes() {
                Object obj = this.devicename_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.devicename_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDevicename(String str) {
                if (str != null) {
                    this.devicename_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDevicename() {
                this.devicename_ = DeviceData.getDefaultInstance().getDevicename();
                onChanged();
                return this;
            }

            public Builder setDevicenameBytes(ByteString byteString) {
                if (byteString != null) {
                    DeviceData.checkByteStringIsUtf8(byteString);
                    this.devicename_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public long getTime() {
                return this.time_;
            }

            public Builder setTime(long j) {
                this.time_ = j;
                onChanged();
                return this;
            }

            public Builder clearTime() {
                this.time_ = 0;
                onChanged();
                return this;
            }

            public float getScreenbright() {
                return this.screenbright_;
            }

            public Builder setScreenbright(float f2) {
                this.screenbright_ = f2;
                onChanged();
                return this;
            }

            public Builder clearScreenbright() {
                this.screenbright_ = 0.0f;
                onChanged();
                return this;
            }

            public boolean getJailbreak() {
                return this.jailbreak_;
            }

            public Builder setJailbreak(boolean z) {
                this.jailbreak_ = z;
                onChanged();
                return this;
            }

            public Builder clearJailbreak() {
                this.jailbreak_ = false;
                onChanged();
                return this;
            }

            public long getLastbootup() {
                return this.lastbootup_;
            }

            public Builder setLastbootup(long j) {
                this.lastbootup_ = j;
                onChanged();
                return this;
            }

            public Builder clearLastbootup() {
                this.lastbootup_ = 0;
                onChanged();
                return this;
            }

            public String getAccess() {
                Object obj = this.access_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.access_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAccessBytes() {
                Object obj = this.access_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.access_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAccess(String str) {
                if (str != null) {
                    this.access_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAccess() {
                this.access_ = DeviceData.getDefaultInstance().getAccess();
                onChanged();
                return this;
            }

            public Builder setAccessBytes(ByteString byteString) {
                if (byteString != null) {
                    DeviceData.checkByteStringIsUtf8(byteString);
                    this.access_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getHeadsetname() {
                Object obj = this.headsetname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.headsetname_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getHeadsetnameBytes() {
                Object obj = this.headsetname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.headsetname_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setHeadsetname(String str) {
                if (str != null) {
                    this.headsetname_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearHeadsetname() {
                this.headsetname_ = DeviceData.getDefaultInstance().getHeadsetname();
                onChanged();
                return this;
            }

            public Builder setHeadsetnameBytes(ByteString byteString) {
                if (byteString != null) {
                    DeviceData.checkByteStringIsUtf8(byteString);
                    this.headsetname_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public long getTotalmem() {
                return this.totalmem_;
            }

            public Builder setTotalmem(long j) {
                this.totalmem_ = j;
                onChanged();
                return this;
            }

            public Builder clearTotalmem() {
                this.totalmem_ = 0;
                onChanged();
                return this;
            }

            public int getAtts() {
                return this.atts_;
            }

            public Builder setAtts(int i) {
                this.atts_ = i;
                onChanged();
                return this;
            }

            public Builder clearAtts() {
                this.atts_ = 0;
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

        public static DeviceData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DeviceData> parser() {
            return PARSER;
        }

        public Parser<DeviceData> getParserForType() {
            return PARSER;
        }

        public DeviceData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class UserData extends GeneratedMessageV3 implements UserDataOrBuilder {
        public static final int CCPA_FIELD_NUMBER = 3;
        public static final int CONSENT_FIELD_NUMBER = 1;
        private static final UserData DEFAULT_INSTANCE = new UserData();
        public static final int GDPR_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<UserData> PARSER = new AbstractParser<UserData>() {
            public UserData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new UserData(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object ccpa_;
        /* access modifiers changed from: private */
        public volatile Object consent_;
        /* access modifiers changed from: private */
        public boolean gdpr_;
        private byte memoizedIsInitialized;

        private UserData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private UserData() {
            this.memoizedIsInitialized = -1;
            this.consent_ = "";
            this.ccpa_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new UserData();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private UserData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.consent_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.gdpr_ = codedInputStream.readBool();
                            } else if (readTag == 26) {
                                this.ccpa_ = codedInputStream.readStringRequireUtf8();
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
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_UserData_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_UserData_fieldAccessorTable.ensureFieldAccessorsInitialized(UserData.class, Builder.class);
        }

        public String getConsent() {
            Object obj = this.consent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.consent_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getConsentBytes() {
            Object obj = this.consent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consent_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean getGdpr() {
            return this.gdpr_;
        }

        public String getCcpa() {
            Object obj = this.ccpa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ccpa_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCcpaBytes() {
            Object obj = this.ccpa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ccpa_ = copyFromUtf8;
            return copyFromUtf8;
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
            if (!getConsentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.consent_);
            }
            boolean z = this.gdpr_;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            if (!getCcpaBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.ccpa_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getConsentBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.consent_);
            }
            boolean z = this.gdpr_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(2, z);
            }
            if (!getCcpaBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(3, this.ccpa_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserData)) {
                return super.equals(obj);
            }
            UserData userData = (UserData) obj;
            if (getConsent().equals(userData.getConsent()) && getGdpr() == userData.getGdpr() && getCcpa().equals(userData.getCcpa()) && this.unknownFields.equals(userData.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getConsent().hashCode()) * 37) + 2) * 53) + Internal.hashBoolean(getGdpr())) * 37) + 3) * 53) + getCcpa().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static UserData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static UserData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static UserData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static UserData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static UserData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserData parseFrom(InputStream inputStream) throws IOException {
            return (UserData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UserData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UserData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(UserData userData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userData);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserDataOrBuilder {
            private Object ccpa_;
            private Object consent_;
            private boolean gdpr_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_UserData_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_UserData_fieldAccessorTable.ensureFieldAccessorsInitialized(UserData.class, Builder.class);
            }

            private Builder() {
                this.consent_ = "";
                this.ccpa_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.consent_ = "";
                this.ccpa_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = UserData.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.consent_ = "";
                this.gdpr_ = false;
                this.ccpa_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_UserData_descriptor;
            }

            public UserData getDefaultInstanceForType() {
                return UserData.getDefaultInstance();
            }

            public UserData build() {
                UserData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public UserData buildPartial() {
                UserData userData = new UserData((GeneratedMessageV3.Builder) this);
                Object unused = userData.consent_ = this.consent_;
                boolean unused2 = userData.gdpr_ = this.gdpr_;
                Object unused3 = userData.ccpa_ = this.ccpa_;
                onBuilt();
                return userData;
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
                if (message instanceof UserData) {
                    return mergeFrom((UserData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserData userData) {
                if (userData == UserData.getDefaultInstance()) {
                    return this;
                }
                if (!userData.getConsent().isEmpty()) {
                    this.consent_ = userData.consent_;
                    onChanged();
                }
                if (userData.getGdpr()) {
                    setGdpr(userData.getGdpr());
                }
                if (!userData.getCcpa().isEmpty()) {
                    this.ccpa_ = userData.ccpa_;
                    onChanged();
                }
                mergeUnknownFields(userData.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.RequestTokenPayload.UserData.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RequestTokenPayload.UserData.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.RequestTokenPayload$UserData r3 = (io.bidmachine.protobuf.RequestTokenPayload.UserData) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.UserData) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.RequestTokenPayload$UserData r4 = (io.bidmachine.protobuf.RequestTokenPayload.UserData) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.UserData) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.UserData.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RequestTokenPayload$UserData$Builder");
            }

            public String getConsent() {
                Object obj = this.consent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.consent_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getConsentBytes() {
                Object obj = this.consent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consent_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setConsent(String str) {
                if (str != null) {
                    this.consent_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearConsent() {
                this.consent_ = UserData.getDefaultInstance().getConsent();
                onChanged();
                return this;
            }

            public Builder setConsentBytes(ByteString byteString) {
                if (byteString != null) {
                    UserData.checkByteStringIsUtf8(byteString);
                    this.consent_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean getGdpr() {
                return this.gdpr_;
            }

            public Builder setGdpr(boolean z) {
                this.gdpr_ = z;
                onChanged();
                return this;
            }

            public Builder clearGdpr() {
                this.gdpr_ = false;
                onChanged();
                return this;
            }

            public String getCcpa() {
                Object obj = this.ccpa_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ccpa_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCcpaBytes() {
                Object obj = this.ccpa_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ccpa_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCcpa(String str) {
                if (str != null) {
                    this.ccpa_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCcpa() {
                this.ccpa_ = UserData.getDefaultInstance().getCcpa();
                onChanged();
                return this;
            }

            public Builder setCcpaBytes(ByteString byteString) {
                if (byteString != null) {
                    UserData.checkByteStringIsUtf8(byteString);
                    this.ccpa_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static UserData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<UserData> parser() {
            return PARSER;
        }

        public Parser<UserData> getParserForType() {
            return PARSER;
        }

        public UserData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class AppData extends GeneratedMessageV3 implements AppDataOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 1;
        public static final int APP_VER_FIELD_NUMBER = 2;
        private static final AppData DEFAULT_INSTANCE = new AppData();
        /* access modifiers changed from: private */
        public static final Parser<AppData> PARSER = new AbstractParser<AppData>() {
            public AppData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AppData(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object appName_;
        /* access modifiers changed from: private */
        public volatile Object appVer_;
        private byte memoizedIsInitialized;

        private AppData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private AppData() {
            this.memoizedIsInitialized = -1;
            this.appName_ = "";
            this.appVer_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AppData();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AppData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.appName_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.appVer_ = codedInputStream.readStringRequireUtf8();
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
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_AppData_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_AppData_fieldAccessorTable.ensureFieldAccessorsInitialized(AppData.class, Builder.class);
        }

        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appName_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = copyFromUtf8;
            return copyFromUtf8;
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
            if (!getAppNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.appName_);
            }
            if (!getAppVerBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.appVer_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getAppNameBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.appName_);
            }
            if (!getAppVerBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.appVer_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppData)) {
                return super.equals(obj);
            }
            AppData appData = (AppData) obj;
            if (getAppName().equals(appData.getAppName()) && getAppVer().equals(appData.getAppVer()) && this.unknownFields.equals(appData.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAppName().hashCode()) * 37) + 2) * 53) + getAppVer().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static AppData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AppData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AppData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static AppData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static AppData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AppData parseFrom(InputStream inputStream) throws IOException {
            return (AppData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AppData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AppData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AppData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AppData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AppData appData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appData);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppDataOrBuilder {
            private Object appName_;
            private Object appVer_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_AppData_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_AppData_fieldAccessorTable.ensureFieldAccessorsInitialized(AppData.class, Builder.class);
            }

            private Builder() {
                this.appName_ = "";
                this.appVer_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appName_ = "";
                this.appVer_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = AppData.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.appName_ = "";
                this.appVer_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_AppData_descriptor;
            }

            public AppData getDefaultInstanceForType() {
                return AppData.getDefaultInstance();
            }

            public AppData build() {
                AppData buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public AppData buildPartial() {
                AppData appData = new AppData((GeneratedMessageV3.Builder) this);
                Object unused = appData.appName_ = this.appName_;
                Object unused2 = appData.appVer_ = this.appVer_;
                onBuilt();
                return appData;
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
                if (message instanceof AppData) {
                    return mergeFrom((AppData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AppData appData) {
                if (appData == AppData.getDefaultInstance()) {
                    return this;
                }
                if (!appData.getAppName().isEmpty()) {
                    this.appName_ = appData.appName_;
                    onChanged();
                }
                if (!appData.getAppVer().isEmpty()) {
                    this.appVer_ = appData.appVer_;
                    onChanged();
                }
                mergeUnknownFields(appData.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.RequestTokenPayload.AppData.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RequestTokenPayload.AppData.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.RequestTokenPayload$AppData r3 = (io.bidmachine.protobuf.RequestTokenPayload.AppData) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.AppData) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.RequestTokenPayload$AppData r4 = (io.bidmachine.protobuf.RequestTokenPayload.AppData) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload.AppData) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.AppData.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RequestTokenPayload$AppData$Builder");
            }

            public String getAppName() {
                Object obj = this.appName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.appName_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAppNameBytes() {
                Object obj = this.appName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAppName(String str) {
                if (str != null) {
                    this.appName_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAppName() {
                this.appName_ = AppData.getDefaultInstance().getAppName();
                onChanged();
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                if (byteString != null) {
                    AppData.checkByteStringIsUtf8(byteString);
                    this.appName_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getAppVer() {
                Object obj = this.appVer_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.appVer_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAppVerBytes() {
                Object obj = this.appVer_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appVer_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAppVer(String str) {
                if (str != null) {
                    this.appVer_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAppVer() {
                this.appVer_ = AppData.getDefaultInstance().getAppVer();
                onChanged();
                return this;
            }

            public Builder setAppVerBytes(ByteString byteString) {
                if (byteString != null) {
                    AppData.checkByteStringIsUtf8(byteString);
                    this.appVer_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static AppData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AppData> parser() {
            return PARSER;
        }

        public Parser<AppData> getParserForType() {
            return PARSER;
        }

        public AppData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public boolean hasPlacementData() {
        return this.placementData_ != null;
    }

    public PlacementData getPlacementData() {
        PlacementData placementData = this.placementData_;
        return placementData == null ? PlacementData.getDefaultInstance() : placementData;
    }

    public PlacementDataOrBuilder getPlacementDataOrBuilder() {
        return getPlacementData();
    }

    public boolean hasSessionData() {
        return this.sessionData_ != null;
    }

    public SessionData getSessionData() {
        SessionData sessionData = this.sessionData_;
        return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
    }

    public SessionDataOrBuilder getSessionDataOrBuilder() {
        return getSessionData();
    }

    public boolean hasDeviceData() {
        return this.deviceData_ != null;
    }

    public DeviceData getDeviceData() {
        DeviceData deviceData = this.deviceData_;
        return deviceData == null ? DeviceData.getDefaultInstance() : deviceData;
    }

    public DeviceDataOrBuilder getDeviceDataOrBuilder() {
        return getDeviceData();
    }

    private static final class CustomDataDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private CustomDataDefaultEntryHolder() {
        }
    }

    /* access modifiers changed from: private */
    public MapField<String, String> internalGetCustomData() {
        MapField<String, String> mapField = this.customData_;
        return mapField == null ? MapField.emptyMapField(CustomDataDefaultEntryHolder.defaultEntry) : mapField;
    }

    public int getCustomDataCount() {
        return internalGetCustomData().getMap().size();
    }

    public boolean containsCustomData(String str) {
        if (str != null) {
            return internalGetCustomData().getMap().containsKey(str);
        }
        throw null;
    }

    @Deprecated
    public Map<String, String> getCustomData() {
        return getCustomDataMap();
    }

    public Map<String, String> getCustomDataMap() {
        return internalGetCustomData().getMap();
    }

    public String getCustomDataOrDefault(String str, String str2) {
        if (str != null) {
            Map<String, String> map = internalGetCustomData().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }
        throw null;
    }

    public String getCustomDataOrThrow(String str) {
        if (str != null) {
            Map<String, String> map = internalGetCustomData().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw null;
    }

    public boolean hasUserData() {
        return this.userData_ != null;
    }

    public UserData getUserData() {
        UserData userData = this.userData_;
        return userData == null ? UserData.getDefaultInstance() : userData;
    }

    public UserDataOrBuilder getUserDataOrBuilder() {
        return getUserData();
    }

    public boolean hasAppData() {
        return this.appData_ != null;
    }

    public AppData getAppData() {
        AppData appData = this.appData_;
        return appData == null ? AppData.getDefaultInstance() : appData;
    }

    public AppDataOrBuilder getAppDataOrBuilder() {
        return getAppData();
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
        if (this.placementData_ != null) {
            codedOutputStream.writeMessage(1, getPlacementData());
        }
        if (this.sessionData_ != null) {
            codedOutputStream.writeMessage(2, getSessionData());
        }
        if (this.deviceData_ != null) {
            codedOutputStream.writeMessage(3, getDeviceData());
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCustomData(), CustomDataDefaultEntryHolder.defaultEntry, 4);
        if (this.userData_ != null) {
            codedOutputStream.writeMessage(5, getUserData());
        }
        if (this.appData_ != null) {
            codedOutputStream.writeMessage(6, getAppData());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.placementData_ != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getPlacementData());
        }
        if (this.sessionData_ != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getSessionData());
        }
        if (this.deviceData_ != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getDeviceData());
        }
        for (Map.Entry next : internalGetCustomData().getMap().entrySet()) {
            i2 += CodedOutputStream.computeMessageSize(4, CustomDataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
        }
        if (this.userData_ != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getUserData());
        }
        if (this.appData_ != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getAppData());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestTokenPayload)) {
            return super.equals(obj);
        }
        RequestTokenPayload requestTokenPayload = (RequestTokenPayload) obj;
        if (hasPlacementData() != requestTokenPayload.hasPlacementData()) {
            return false;
        }
        if ((hasPlacementData() && !getPlacementData().equals(requestTokenPayload.getPlacementData())) || hasSessionData() != requestTokenPayload.hasSessionData()) {
            return false;
        }
        if ((hasSessionData() && !getSessionData().equals(requestTokenPayload.getSessionData())) || hasDeviceData() != requestTokenPayload.hasDeviceData()) {
            return false;
        }
        if ((hasDeviceData() && !getDeviceData().equals(requestTokenPayload.getDeviceData())) || !internalGetCustomData().equals(requestTokenPayload.internalGetCustomData()) || hasUserData() != requestTokenPayload.hasUserData()) {
            return false;
        }
        if ((hasUserData() && !getUserData().equals(requestTokenPayload.getUserData())) || hasAppData() != requestTokenPayload.hasAppData()) {
            return false;
        }
        if ((!hasAppData() || getAppData().equals(requestTokenPayload.getAppData())) && this.unknownFields.equals(requestTokenPayload.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasPlacementData()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getPlacementData().hashCode();
        }
        if (hasSessionData()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getSessionData().hashCode();
        }
        if (hasDeviceData()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getDeviceData().hashCode();
        }
        if (!internalGetCustomData().getMap().isEmpty()) {
            hashCode = (((hashCode * 37) + 4) * 53) + internalGetCustomData().hashCode();
        }
        if (hasUserData()) {
            hashCode = (((hashCode * 37) + 5) * 53) + getUserData().hashCode();
        }
        if (hasAppData()) {
            hashCode = (((hashCode * 37) + 6) * 53) + getAppData().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static RequestTokenPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RequestTokenPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RequestTokenPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RequestTokenPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RequestTokenPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RequestTokenPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RequestTokenPayload parseFrom(InputStream inputStream) throws IOException {
        return (RequestTokenPayload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RequestTokenPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestTokenPayload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RequestTokenPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestTokenPayload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestTokenPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestTokenPayload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RequestTokenPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RequestTokenPayload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RequestTokenPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestTokenPayload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RequestTokenPayload requestTokenPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestTokenPayload);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestTokenPayloadOrBuilder {
        private SingleFieldBuilderV3<AppData, AppData.Builder, AppDataOrBuilder> appDataBuilder_;
        private AppData appData_;
        private int bitField0_;
        private MapField<String, String> customData_;
        private SingleFieldBuilderV3<DeviceData, DeviceData.Builder, DeviceDataOrBuilder> deviceDataBuilder_;
        private DeviceData deviceData_;
        private SingleFieldBuilderV3<PlacementData, PlacementData.Builder, PlacementDataOrBuilder> placementDataBuilder_;
        private PlacementData placementData_;
        private SingleFieldBuilderV3<SessionData, SessionData.Builder, SessionDataOrBuilder> sessionDataBuilder_;
        private SessionData sessionData_;
        private SingleFieldBuilderV3<UserData, UserData.Builder, UserDataOrBuilder> userDataBuilder_;
        private UserData userData_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 4) {
                return internalGetCustomData();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMutableMapField(int i) {
            if (i == 4) {
                return internalGetMutableCustomData();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestTokenPayload.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = RequestTokenPayload.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            if (this.placementDataBuilder_ == null) {
                this.placementData_ = null;
            } else {
                this.placementData_ = null;
                this.placementDataBuilder_ = null;
            }
            if (this.sessionDataBuilder_ == null) {
                this.sessionData_ = null;
            } else {
                this.sessionData_ = null;
                this.sessionDataBuilder_ = null;
            }
            if (this.deviceDataBuilder_ == null) {
                this.deviceData_ = null;
            } else {
                this.deviceData_ = null;
                this.deviceDataBuilder_ = null;
            }
            internalGetMutableCustomData().clear();
            if (this.userDataBuilder_ == null) {
                this.userData_ = null;
            } else {
                this.userData_ = null;
                this.userDataBuilder_ = null;
            }
            if (this.appDataBuilder_ == null) {
                this.appData_ = null;
            } else {
                this.appData_ = null;
                this.appDataBuilder_ = null;
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
        }

        public RequestTokenPayload getDefaultInstanceForType() {
            return RequestTokenPayload.getDefaultInstance();
        }

        public RequestTokenPayload build() {
            RequestTokenPayload buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public RequestTokenPayload buildPartial() {
            RequestTokenPayload requestTokenPayload = new RequestTokenPayload((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<PlacementData, PlacementData.Builder, PlacementDataOrBuilder> singleFieldBuilderV3 = this.placementDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                PlacementData unused = requestTokenPayload.placementData_ = this.placementData_;
            } else {
                PlacementData unused2 = requestTokenPayload.placementData_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<SessionData, SessionData.Builder, SessionDataOrBuilder> singleFieldBuilderV32 = this.sessionDataBuilder_;
            if (singleFieldBuilderV32 == null) {
                SessionData unused3 = requestTokenPayload.sessionData_ = this.sessionData_;
            } else {
                SessionData unused4 = requestTokenPayload.sessionData_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<DeviceData, DeviceData.Builder, DeviceDataOrBuilder> singleFieldBuilderV33 = this.deviceDataBuilder_;
            if (singleFieldBuilderV33 == null) {
                DeviceData unused5 = requestTokenPayload.deviceData_ = this.deviceData_;
            } else {
                DeviceData unused6 = requestTokenPayload.deviceData_ = singleFieldBuilderV33.build();
            }
            MapField unused7 = requestTokenPayload.customData_ = internalGetCustomData();
            requestTokenPayload.customData_.makeImmutable();
            SingleFieldBuilderV3<UserData, UserData.Builder, UserDataOrBuilder> singleFieldBuilderV34 = this.userDataBuilder_;
            if (singleFieldBuilderV34 == null) {
                UserData unused8 = requestTokenPayload.userData_ = this.userData_;
            } else {
                UserData unused9 = requestTokenPayload.userData_ = singleFieldBuilderV34.build();
            }
            SingleFieldBuilderV3<AppData, AppData.Builder, AppDataOrBuilder> singleFieldBuilderV35 = this.appDataBuilder_;
            if (singleFieldBuilderV35 == null) {
                AppData unused10 = requestTokenPayload.appData_ = this.appData_;
            } else {
                AppData unused11 = requestTokenPayload.appData_ = singleFieldBuilderV35.build();
            }
            onBuilt();
            return requestTokenPayload;
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
            if (message instanceof RequestTokenPayload) {
                return mergeFrom((RequestTokenPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RequestTokenPayload requestTokenPayload) {
            if (requestTokenPayload == RequestTokenPayload.getDefaultInstance()) {
                return this;
            }
            if (requestTokenPayload.hasPlacementData()) {
                mergePlacementData(requestTokenPayload.getPlacementData());
            }
            if (requestTokenPayload.hasSessionData()) {
                mergeSessionData(requestTokenPayload.getSessionData());
            }
            if (requestTokenPayload.hasDeviceData()) {
                mergeDeviceData(requestTokenPayload.getDeviceData());
            }
            internalGetMutableCustomData().mergeFrom(requestTokenPayload.internalGetCustomData());
            if (requestTokenPayload.hasUserData()) {
                mergeUserData(requestTokenPayload.getUserData());
            }
            if (requestTokenPayload.hasAppData()) {
                mergeAppData(requestTokenPayload.getAppData());
            }
            mergeUnknownFields(requestTokenPayload.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.RequestTokenPayload.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.RequestTokenPayload.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.RequestTokenPayload r3 = (io.bidmachine.protobuf.RequestTokenPayload) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.RequestTokenPayload r4 = (io.bidmachine.protobuf.RequestTokenPayload) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.RequestTokenPayload) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.RequestTokenPayload$Builder");
        }

        public boolean hasPlacementData() {
            return (this.placementDataBuilder_ == null && this.placementData_ == null) ? false : true;
        }

        public PlacementData getPlacementData() {
            SingleFieldBuilderV3<PlacementData, PlacementData.Builder, PlacementDataOrBuilder> singleFieldBuilderV3 = this.placementDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            PlacementData placementData = this.placementData_;
            return placementData == null ? PlacementData.getDefaultInstance() : placementData;
        }

        public Builder setPlacementData(PlacementData placementData) {
            SingleFieldBuilderV3<PlacementData, PlacementData.Builder, PlacementDataOrBuilder> singleFieldBuilderV3 = this.placementDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(placementData);
            } else if (placementData != null) {
                this.placementData_ = placementData;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setPlacementData(PlacementData.Builder builder) {
            SingleFieldBuilderV3<PlacementData, PlacementData.Builder, PlacementDataOrBuilder> singleFieldBuilderV3 = this.placementDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.placementData_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergePlacementData(PlacementData placementData) {
            SingleFieldBuilderV3<PlacementData, PlacementData.Builder, PlacementDataOrBuilder> singleFieldBuilderV3 = this.placementDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                PlacementData placementData2 = this.placementData_;
                if (placementData2 != null) {
                    this.placementData_ = PlacementData.newBuilder(placementData2).mergeFrom(placementData).buildPartial();
                } else {
                    this.placementData_ = placementData;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(placementData);
            }
            return this;
        }

        public Builder clearPlacementData() {
            if (this.placementDataBuilder_ == null) {
                this.placementData_ = null;
                onChanged();
            } else {
                this.placementData_ = null;
                this.placementDataBuilder_ = null;
            }
            return this;
        }

        public PlacementData.Builder getPlacementDataBuilder() {
            onChanged();
            return getPlacementDataFieldBuilder().getBuilder();
        }

        public PlacementDataOrBuilder getPlacementDataOrBuilder() {
            SingleFieldBuilderV3<PlacementData, PlacementData.Builder, PlacementDataOrBuilder> singleFieldBuilderV3 = this.placementDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            PlacementData placementData = this.placementData_;
            return placementData == null ? PlacementData.getDefaultInstance() : placementData;
        }

        private SingleFieldBuilderV3<PlacementData, PlacementData.Builder, PlacementDataOrBuilder> getPlacementDataFieldBuilder() {
            if (this.placementDataBuilder_ == null) {
                this.placementDataBuilder_ = new SingleFieldBuilderV3<>(getPlacementData(), getParentForChildren(), isClean());
                this.placementData_ = null;
            }
            return this.placementDataBuilder_;
        }

        public boolean hasSessionData() {
            return (this.sessionDataBuilder_ == null && this.sessionData_ == null) ? false : true;
        }

        public SessionData getSessionData() {
            SingleFieldBuilderV3<SessionData, SessionData.Builder, SessionDataOrBuilder> singleFieldBuilderV3 = this.sessionDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            SessionData sessionData = this.sessionData_;
            return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
        }

        public Builder setSessionData(SessionData sessionData) {
            SingleFieldBuilderV3<SessionData, SessionData.Builder, SessionDataOrBuilder> singleFieldBuilderV3 = this.sessionDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(sessionData);
            } else if (sessionData != null) {
                this.sessionData_ = sessionData;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setSessionData(SessionData.Builder builder) {
            SingleFieldBuilderV3<SessionData, SessionData.Builder, SessionDataOrBuilder> singleFieldBuilderV3 = this.sessionDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.sessionData_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeSessionData(SessionData sessionData) {
            SingleFieldBuilderV3<SessionData, SessionData.Builder, SessionDataOrBuilder> singleFieldBuilderV3 = this.sessionDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                SessionData sessionData2 = this.sessionData_;
                if (sessionData2 != null) {
                    this.sessionData_ = SessionData.newBuilder(sessionData2).mergeFrom(sessionData).buildPartial();
                } else {
                    this.sessionData_ = sessionData;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(sessionData);
            }
            return this;
        }

        public Builder clearSessionData() {
            if (this.sessionDataBuilder_ == null) {
                this.sessionData_ = null;
                onChanged();
            } else {
                this.sessionData_ = null;
                this.sessionDataBuilder_ = null;
            }
            return this;
        }

        public SessionData.Builder getSessionDataBuilder() {
            onChanged();
            return getSessionDataFieldBuilder().getBuilder();
        }

        public SessionDataOrBuilder getSessionDataOrBuilder() {
            SingleFieldBuilderV3<SessionData, SessionData.Builder, SessionDataOrBuilder> singleFieldBuilderV3 = this.sessionDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            SessionData sessionData = this.sessionData_;
            return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
        }

        private SingleFieldBuilderV3<SessionData, SessionData.Builder, SessionDataOrBuilder> getSessionDataFieldBuilder() {
            if (this.sessionDataBuilder_ == null) {
                this.sessionDataBuilder_ = new SingleFieldBuilderV3<>(getSessionData(), getParentForChildren(), isClean());
                this.sessionData_ = null;
            }
            return this.sessionDataBuilder_;
        }

        public boolean hasDeviceData() {
            return (this.deviceDataBuilder_ == null && this.deviceData_ == null) ? false : true;
        }

        public DeviceData getDeviceData() {
            SingleFieldBuilderV3<DeviceData, DeviceData.Builder, DeviceDataOrBuilder> singleFieldBuilderV3 = this.deviceDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            DeviceData deviceData = this.deviceData_;
            return deviceData == null ? DeviceData.getDefaultInstance() : deviceData;
        }

        public Builder setDeviceData(DeviceData deviceData) {
            SingleFieldBuilderV3<DeviceData, DeviceData.Builder, DeviceDataOrBuilder> singleFieldBuilderV3 = this.deviceDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(deviceData);
            } else if (deviceData != null) {
                this.deviceData_ = deviceData;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setDeviceData(DeviceData.Builder builder) {
            SingleFieldBuilderV3<DeviceData, DeviceData.Builder, DeviceDataOrBuilder> singleFieldBuilderV3 = this.deviceDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.deviceData_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDeviceData(DeviceData deviceData) {
            SingleFieldBuilderV3<DeviceData, DeviceData.Builder, DeviceDataOrBuilder> singleFieldBuilderV3 = this.deviceDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                DeviceData deviceData2 = this.deviceData_;
                if (deviceData2 != null) {
                    this.deviceData_ = DeviceData.newBuilder(deviceData2).mergeFrom(deviceData).buildPartial();
                } else {
                    this.deviceData_ = deviceData;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(deviceData);
            }
            return this;
        }

        public Builder clearDeviceData() {
            if (this.deviceDataBuilder_ == null) {
                this.deviceData_ = null;
                onChanged();
            } else {
                this.deviceData_ = null;
                this.deviceDataBuilder_ = null;
            }
            return this;
        }

        public DeviceData.Builder getDeviceDataBuilder() {
            onChanged();
            return getDeviceDataFieldBuilder().getBuilder();
        }

        public DeviceDataOrBuilder getDeviceDataOrBuilder() {
            SingleFieldBuilderV3<DeviceData, DeviceData.Builder, DeviceDataOrBuilder> singleFieldBuilderV3 = this.deviceDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            DeviceData deviceData = this.deviceData_;
            return deviceData == null ? DeviceData.getDefaultInstance() : deviceData;
        }

        private SingleFieldBuilderV3<DeviceData, DeviceData.Builder, DeviceDataOrBuilder> getDeviceDataFieldBuilder() {
            if (this.deviceDataBuilder_ == null) {
                this.deviceDataBuilder_ = new SingleFieldBuilderV3<>(getDeviceData(), getParentForChildren(), isClean());
                this.deviceData_ = null;
            }
            return this.deviceDataBuilder_;
        }

        private MapField<String, String> internalGetCustomData() {
            MapField<String, String> mapField = this.customData_;
            return mapField == null ? MapField.emptyMapField(CustomDataDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableCustomData() {
            onChanged();
            if (this.customData_ == null) {
                this.customData_ = MapField.newMapField(CustomDataDefaultEntryHolder.defaultEntry);
            }
            if (!this.customData_.isMutable()) {
                this.customData_ = this.customData_.copy();
            }
            return this.customData_;
        }

        public int getCustomDataCount() {
            return internalGetCustomData().getMap().size();
        }

        public boolean containsCustomData(String str) {
            if (str != null) {
                return internalGetCustomData().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getCustomData() {
            return getCustomDataMap();
        }

        public Map<String, String> getCustomDataMap() {
            return internalGetCustomData().getMap();
        }

        public String getCustomDataOrDefault(String str, String str2) {
            if (str != null) {
                Map<String, String> map = internalGetCustomData().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }
            throw null;
        }

        public String getCustomDataOrThrow(String str) {
            if (str != null) {
                Map<String, String> map = internalGetCustomData().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw null;
        }

        public Builder clearCustomData() {
            internalGetMutableCustomData().getMutableMap().clear();
            return this;
        }

        public Builder removeCustomData(String str) {
            if (str != null) {
                internalGetMutableCustomData().getMutableMap().remove(str);
                return this;
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getMutableCustomData() {
            return internalGetMutableCustomData().getMutableMap();
        }

        public Builder putCustomData(String str, String str2) {
            if (str == null) {
                throw null;
            } else if (str2 != null) {
                internalGetMutableCustomData().getMutableMap().put(str, str2);
                return this;
            } else {
                throw null;
            }
        }

        public Builder putAllCustomData(Map<String, String> map) {
            internalGetMutableCustomData().getMutableMap().putAll(map);
            return this;
        }

        public boolean hasUserData() {
            return (this.userDataBuilder_ == null && this.userData_ == null) ? false : true;
        }

        public UserData getUserData() {
            SingleFieldBuilderV3<UserData, UserData.Builder, UserDataOrBuilder> singleFieldBuilderV3 = this.userDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            UserData userData = this.userData_;
            return userData == null ? UserData.getDefaultInstance() : userData;
        }

        public Builder setUserData(UserData userData) {
            SingleFieldBuilderV3<UserData, UserData.Builder, UserDataOrBuilder> singleFieldBuilderV3 = this.userDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(userData);
            } else if (userData != null) {
                this.userData_ = userData;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setUserData(UserData.Builder builder) {
            SingleFieldBuilderV3<UserData, UserData.Builder, UserDataOrBuilder> singleFieldBuilderV3 = this.userDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.userData_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUserData(UserData userData) {
            SingleFieldBuilderV3<UserData, UserData.Builder, UserDataOrBuilder> singleFieldBuilderV3 = this.userDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                UserData userData2 = this.userData_;
                if (userData2 != null) {
                    this.userData_ = UserData.newBuilder(userData2).mergeFrom(userData).buildPartial();
                } else {
                    this.userData_ = userData;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(userData);
            }
            return this;
        }

        public Builder clearUserData() {
            if (this.userDataBuilder_ == null) {
                this.userData_ = null;
                onChanged();
            } else {
                this.userData_ = null;
                this.userDataBuilder_ = null;
            }
            return this;
        }

        public UserData.Builder getUserDataBuilder() {
            onChanged();
            return getUserDataFieldBuilder().getBuilder();
        }

        public UserDataOrBuilder getUserDataOrBuilder() {
            SingleFieldBuilderV3<UserData, UserData.Builder, UserDataOrBuilder> singleFieldBuilderV3 = this.userDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            UserData userData = this.userData_;
            return userData == null ? UserData.getDefaultInstance() : userData;
        }

        private SingleFieldBuilderV3<UserData, UserData.Builder, UserDataOrBuilder> getUserDataFieldBuilder() {
            if (this.userDataBuilder_ == null) {
                this.userDataBuilder_ = new SingleFieldBuilderV3<>(getUserData(), getParentForChildren(), isClean());
                this.userData_ = null;
            }
            return this.userDataBuilder_;
        }

        public boolean hasAppData() {
            return (this.appDataBuilder_ == null && this.appData_ == null) ? false : true;
        }

        public AppData getAppData() {
            SingleFieldBuilderV3<AppData, AppData.Builder, AppDataOrBuilder> singleFieldBuilderV3 = this.appDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            AppData appData = this.appData_;
            return appData == null ? AppData.getDefaultInstance() : appData;
        }

        public Builder setAppData(AppData appData) {
            SingleFieldBuilderV3<AppData, AppData.Builder, AppDataOrBuilder> singleFieldBuilderV3 = this.appDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(appData);
            } else if (appData != null) {
                this.appData_ = appData;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setAppData(AppData.Builder builder) {
            SingleFieldBuilderV3<AppData, AppData.Builder, AppDataOrBuilder> singleFieldBuilderV3 = this.appDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.appData_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAppData(AppData appData) {
            SingleFieldBuilderV3<AppData, AppData.Builder, AppDataOrBuilder> singleFieldBuilderV3 = this.appDataBuilder_;
            if (singleFieldBuilderV3 == null) {
                AppData appData2 = this.appData_;
                if (appData2 != null) {
                    this.appData_ = AppData.newBuilder(appData2).mergeFrom(appData).buildPartial();
                } else {
                    this.appData_ = appData;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(appData);
            }
            return this;
        }

        public Builder clearAppData() {
            if (this.appDataBuilder_ == null) {
                this.appData_ = null;
                onChanged();
            } else {
                this.appData_ = null;
                this.appDataBuilder_ = null;
            }
            return this;
        }

        public AppData.Builder getAppDataBuilder() {
            onChanged();
            return getAppDataFieldBuilder().getBuilder();
        }

        public AppDataOrBuilder getAppDataOrBuilder() {
            SingleFieldBuilderV3<AppData, AppData.Builder, AppDataOrBuilder> singleFieldBuilderV3 = this.appDataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            AppData appData = this.appData_;
            return appData == null ? AppData.getDefaultInstance() : appData;
        }

        private SingleFieldBuilderV3<AppData, AppData.Builder, AppDataOrBuilder> getAppDataFieldBuilder() {
            if (this.appDataBuilder_ == null) {
                this.appDataBuilder_ = new SingleFieldBuilderV3<>(getAppData(), getParentForChildren(), isClean());
                this.appData_ = null;
            }
            return this.appDataBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static RequestTokenPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RequestTokenPayload> parser() {
        return PARSER;
    }

    public Parser<RequestTokenPayload> getParserForType() {
        return PARSER;
    }

    public RequestTokenPayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
