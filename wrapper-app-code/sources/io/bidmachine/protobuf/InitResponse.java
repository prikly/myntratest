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
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.SdkAnalyticConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class InitResponse extends GeneratedMessageV3 implements InitResponseOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 5;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 6;
    public static final int AD_CACHE_PLACEMENT_CONTROL_FIELD_NUMBER = 8;
    public static final int AD_NETWORKS_FIELD_NUMBER = 4;
    public static final int AD_NETWORKS_LOADING_TIMEOUT_FIELD_NUMBER = 9;
    public static final int AD_REQUEST_TMAX_FIELD_NUMBER = 7;
    private static final InitResponse DEFAULT_INSTANCE = new InitResponse();
    public static final int ENDPOINT_FIELD_NUMBER = 1;
    public static final int EVENT_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Parser<InitResponse> PARSER = new AbstractParser<InitResponse>() {
        public InitResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new InitResponse(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SDK_ANALYTIC_CONFIG_FIELD_NUMBER = 10;
    public static final int SESSION_RESET_AFTER_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public int adCacheControl_;
    /* access modifiers changed from: private */
    public int adCacheMaxAge_;
    /* access modifiers changed from: private */
    public MapField<String, AdCachePlacementControl> adCachePlacementControl_;
    /* access modifiers changed from: private */
    public int adNetworksLoadingTimeout_;
    /* access modifiers changed from: private */
    public List<AdNetwork> adNetworks_;
    /* access modifiers changed from: private */
    public int adRequestTmax_;
    /* access modifiers changed from: private */
    public volatile Object endpoint_;
    /* access modifiers changed from: private */
    public List<Ad.Event> event_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public SdkAnalyticConfig sdkAnalyticConfig_;
    /* access modifiers changed from: private */
    public int sessionResetAfter_;

    private InitResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private InitResponse() {
        this.memoizedIsInitialized = -1;
        this.endpoint_ = "";
        this.event_ = Collections.emptyList();
        this.adNetworks_ = Collections.emptyList();
        this.adCacheControl_ = 0;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new InitResponse();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private InitResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.endpoint_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 18:
                            if (!z2 || !true) {
                                this.event_ = new ArrayList();
                                z2 |= true;
                            }
                            this.event_.add(codedInputStream.readMessage(Ad.Event.parser(), extensionRegistryLite));
                            break;
                        case 24:
                            this.sessionResetAfter_ = codedInputStream.readUInt32();
                            break;
                        case 34:
                            if (!z2 || !true) {
                                this.adNetworks_ = new ArrayList();
                                z2 |= true;
                            }
                            this.adNetworks_.add(codedInputStream.readMessage(AdNetwork.parser(), extensionRegistryLite));
                            break;
                        case 40:
                            this.adCacheControl_ = codedInputStream.readEnum();
                            break;
                        case 48:
                            this.adCacheMaxAge_ = codedInputStream.readUInt32();
                            break;
                        case 56:
                            this.adRequestTmax_ = codedInputStream.readUInt32();
                            break;
                        case 66:
                            if (!z2 || !true) {
                                this.adCachePlacementControl_ = MapField.newMapField(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
                                z2 |= true;
                            }
                            MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(AdCachePlacementControlDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                            this.adCachePlacementControl_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            break;
                        case 72:
                            this.adNetworksLoadingTimeout_ = codedInputStream.readUInt32();
                            break;
                        case 82:
                            SdkAnalyticConfig.Builder builder = this.sdkAnalyticConfig_ != null ? this.sdkAnalyticConfig_.toBuilder() : null;
                            SdkAnalyticConfig sdkAnalyticConfig = (SdkAnalyticConfig) codedInputStream.readMessage(SdkAnalyticConfig.parser(), extensionRegistryLite);
                            this.sdkAnalyticConfig_ = sdkAnalyticConfig;
                            if (builder == null) {
                                break;
                            } else {
                                builder.mergeFrom(sdkAnalyticConfig);
                                this.sdkAnalyticConfig_ = builder.buildPartial();
                                break;
                            }
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
                        this.event_ = Collections.unmodifiableList(this.event_);
                    }
                    if (z2 && true) {
                        this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.event_ = Collections.unmodifiableList(this.event_);
            }
            if (z2 && true) {
                this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
    }

    /* access modifiers changed from: protected */
    public MapField internalGetMapField(int i) {
        if (i == 8) {
            return internalGetAdCachePlacementControl();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InitResponse.class, Builder.class);
    }

    public String getEndpoint() {
        Object obj = this.endpoint_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.endpoint_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getEndpointBytes() {
        Object obj = this.endpoint_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.endpoint_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public List<Ad.Event> getEventList() {
        return this.event_;
    }

    public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
        return this.event_;
    }

    public int getEventCount() {
        return this.event_.size();
    }

    public Ad.Event getEvent(int i) {
        return this.event_.get(i);
    }

    public Ad.EventOrBuilder getEventOrBuilder(int i) {
        return this.event_.get(i);
    }

    public int getSessionResetAfter() {
        return this.sessionResetAfter_;
    }

    public List<AdNetwork> getAdNetworksList() {
        return this.adNetworks_;
    }

    public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
        return this.adNetworks_;
    }

    public int getAdNetworksCount() {
        return this.adNetworks_.size();
    }

    public AdNetwork getAdNetworks(int i) {
        return this.adNetworks_.get(i);
    }

    public AdNetworkOrBuilder getAdNetworksOrBuilder(int i) {
        return this.adNetworks_.get(i);
    }

    public int getAdNetworksLoadingTimeout() {
        return this.adNetworksLoadingTimeout_;
    }

    public int getAdCacheControlValue() {
        return this.adCacheControl_;
    }

    public AdCacheControl getAdCacheControl() {
        AdCacheControl valueOf = AdCacheControl.valueOf(this.adCacheControl_);
        return valueOf == null ? AdCacheControl.UNRECOGNIZED : valueOf;
    }

    public int getAdCacheMaxAge() {
        return this.adCacheMaxAge_;
    }

    private static final class AdCachePlacementControlDefaultEntryHolder {
        static final MapEntry<String, AdCachePlacementControl> defaultEntry = MapEntry.newDefaultInstance(InitProto.internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, AdCachePlacementControl.getDefaultInstance());

        private AdCachePlacementControlDefaultEntryHolder() {
        }
    }

    /* access modifiers changed from: private */
    public MapField<String, AdCachePlacementControl> internalGetAdCachePlacementControl() {
        MapField<String, AdCachePlacementControl> mapField = this.adCachePlacementControl_;
        return mapField == null ? MapField.emptyMapField(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : mapField;
    }

    public int getAdCachePlacementControlCount() {
        return internalGetAdCachePlacementControl().getMap().size();
    }

    public boolean containsAdCachePlacementControl(String str) {
        if (str != null) {
            return internalGetAdCachePlacementControl().getMap().containsKey(str);
        }
        throw null;
    }

    @Deprecated
    public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
        return getAdCachePlacementControlMap();
    }

    public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
        return internalGetAdCachePlacementControl().getMap();
    }

    public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
        if (str != null) {
            Map<String, AdCachePlacementControl> map = internalGetAdCachePlacementControl().getMap();
            return map.containsKey(str) ? map.get(str) : adCachePlacementControl;
        }
        throw null;
    }

    public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
        if (str != null) {
            Map<String, AdCachePlacementControl> map = internalGetAdCachePlacementControl().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw null;
    }

    public int getAdRequestTmax() {
        return this.adRequestTmax_;
    }

    public boolean hasSdkAnalyticConfig() {
        return this.sdkAnalyticConfig_ != null;
    }

    public SdkAnalyticConfig getSdkAnalyticConfig() {
        SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
        return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
    }

    public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
        return getSdkAnalyticConfig();
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
        if (!getEndpointBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.endpoint_);
        }
        for (int i = 0; i < this.event_.size(); i++) {
            codedOutputStream.writeMessage(2, this.event_.get(i));
        }
        int i2 = this.sessionResetAfter_;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(3, i2);
        }
        for (int i3 = 0; i3 < this.adNetworks_.size(); i3++) {
            codedOutputStream.writeMessage(4, this.adNetworks_.get(i3));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            codedOutputStream.writeEnum(5, this.adCacheControl_);
        }
        int i4 = this.adCacheMaxAge_;
        if (i4 != 0) {
            codedOutputStream.writeUInt32(6, i4);
        }
        int i5 = this.adRequestTmax_;
        if (i5 != 0) {
            codedOutputStream.writeUInt32(7, i5);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetAdCachePlacementControl(), AdCachePlacementControlDefaultEntryHolder.defaultEntry, 8);
        int i6 = this.adNetworksLoadingTimeout_;
        if (i6 != 0) {
            codedOutputStream.writeUInt32(9, i6);
        }
        if (this.sdkAnalyticConfig_ != null) {
            codedOutputStream.writeMessage(10, getSdkAnalyticConfig());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getEndpointBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.endpoint_) + 0 : 0;
        for (int i2 = 0; i2 < this.event_.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, this.event_.get(i2));
        }
        int i3 = this.sessionResetAfter_;
        if (i3 != 0) {
            computeStringSize += CodedOutputStream.computeUInt32Size(3, i3);
        }
        for (int i4 = 0; i4 < this.adNetworks_.size(); i4++) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, this.adNetworks_.get(i4));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(5, this.adCacheControl_);
        }
        int i5 = this.adCacheMaxAge_;
        if (i5 != 0) {
            computeStringSize += CodedOutputStream.computeUInt32Size(6, i5);
        }
        int i6 = this.adRequestTmax_;
        if (i6 != 0) {
            computeStringSize += CodedOutputStream.computeUInt32Size(7, i6);
        }
        for (Map.Entry next : internalGetAdCachePlacementControl().getMap().entrySet()) {
            computeStringSize += CodedOutputStream.computeMessageSize(8, AdCachePlacementControlDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
        }
        int i7 = this.adNetworksLoadingTimeout_;
        if (i7 != 0) {
            computeStringSize += CodedOutputStream.computeUInt32Size(9, i7);
        }
        if (this.sdkAnalyticConfig_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(10, getSdkAnalyticConfig());
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitResponse)) {
            return super.equals(obj);
        }
        InitResponse initResponse = (InitResponse) obj;
        if (!getEndpoint().equals(initResponse.getEndpoint()) || !getEventList().equals(initResponse.getEventList()) || getSessionResetAfter() != initResponse.getSessionResetAfter() || !getAdNetworksList().equals(initResponse.getAdNetworksList()) || getAdNetworksLoadingTimeout() != initResponse.getAdNetworksLoadingTimeout() || this.adCacheControl_ != initResponse.adCacheControl_ || getAdCacheMaxAge() != initResponse.getAdCacheMaxAge() || !internalGetAdCachePlacementControl().equals(initResponse.internalGetAdCachePlacementControl()) || getAdRequestTmax() != initResponse.getAdRequestTmax() || hasSdkAnalyticConfig() != initResponse.hasSdkAnalyticConfig()) {
            return false;
        }
        if ((!hasSdkAnalyticConfig() || getSdkAnalyticConfig().equals(initResponse.getSdkAnalyticConfig())) && this.unknownFields.equals(initResponse.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getEndpoint().hashCode();
        if (getEventCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getEventList().hashCode();
        }
        int sessionResetAfter = (((hashCode * 37) + 3) * 53) + getSessionResetAfter();
        if (getAdNetworksCount() > 0) {
            sessionResetAfter = (((sessionResetAfter * 37) + 4) * 53) + getAdNetworksList().hashCode();
        }
        int adNetworksLoadingTimeout = (((((((((((sessionResetAfter * 37) + 9) * 53) + getAdNetworksLoadingTimeout()) * 37) + 5) * 53) + this.adCacheControl_) * 37) + 6) * 53) + getAdCacheMaxAge();
        if (!internalGetAdCachePlacementControl().getMap().isEmpty()) {
            adNetworksLoadingTimeout = (((adNetworksLoadingTimeout * 37) + 8) * 53) + internalGetAdCachePlacementControl().hashCode();
        }
        int adRequestTmax = (((adNetworksLoadingTimeout * 37) + 7) * 53) + getAdRequestTmax();
        if (hasSdkAnalyticConfig()) {
            adRequestTmax = (((adRequestTmax * 37) + 10) * 53) + getSdkAnalyticConfig().hashCode();
        }
        int hashCode2 = (adRequestTmax * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static InitResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static InitResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static InitResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static InitResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static InitResponse parseFrom(InputStream inputStream) throws IOException {
        return (InitResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InitResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InitResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static InitResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InitResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(InitResponse initResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initResponse);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitResponseOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private MapField<String, AdCachePlacementControl> adCachePlacementControl_;
        private RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> adNetworksBuilder_;
        private int adNetworksLoadingTimeout_;
        private List<AdNetwork> adNetworks_;
        private int adRequestTmax_;
        private int bitField0_;
        private Object endpoint_;
        private RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> eventBuilder_;
        private List<Ad.Event> event_;
        private SingleFieldBuilderV3<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> sdkAnalyticConfigBuilder_;
        private SdkAnalyticConfig sdkAnalyticConfig_;
        private int sessionResetAfter_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 8) {
                return internalGetAdCachePlacementControl();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMutableMapField(int i) {
            if (i == 8) {
                return internalGetMutableAdCachePlacementControl();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InitResponse.class, Builder.class);
        }

        private Builder() {
            this.endpoint_ = "";
            this.event_ = Collections.emptyList();
            this.adNetworks_ = Collections.emptyList();
            this.adCacheControl_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.endpoint_ = "";
            this.event_ = Collections.emptyList();
            this.adNetworks_ = Collections.emptyList();
            this.adCacheControl_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (InitResponse.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
                getAdNetworksFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.endpoint_ = "";
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.sessionResetAfter_ = 0;
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV32 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.adNetworks_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV32.clear();
            }
            this.adNetworksLoadingTimeout_ = 0;
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            internalGetMutableAdCachePlacementControl().clear();
            this.adRequestTmax_ = 0;
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
            } else {
                this.sdkAnalyticConfig_ = null;
                this.sdkAnalyticConfigBuilder_ = null;
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        public InitResponse getDefaultInstanceForType() {
            return InitResponse.getDefaultInstance();
        }

        public InitResponse build() {
            InitResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public InitResponse buildPartial() {
            InitResponse initResponse = new InitResponse((GeneratedMessageV3.Builder) this);
            Object unused = initResponse.endpoint_ = this.endpoint_;
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                List unused2 = initResponse.event_ = this.event_;
            } else {
                List unused3 = initResponse.event_ = repeatedFieldBuilderV3.build();
            }
            int unused4 = initResponse.sessionResetAfter_ = this.sessionResetAfter_;
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV32 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
                    this.bitField0_ &= -3;
                }
                List unused5 = initResponse.adNetworks_ = this.adNetworks_;
            } else {
                List unused6 = initResponse.adNetworks_ = repeatedFieldBuilderV32.build();
            }
            int unused7 = initResponse.adNetworksLoadingTimeout_ = this.adNetworksLoadingTimeout_;
            int unused8 = initResponse.adCacheControl_ = this.adCacheControl_;
            int unused9 = initResponse.adCacheMaxAge_ = this.adCacheMaxAge_;
            MapField unused10 = initResponse.adCachePlacementControl_ = internalGetAdCachePlacementControl();
            initResponse.adCachePlacementControl_.makeImmutable();
            int unused11 = initResponse.adRequestTmax_ = this.adRequestTmax_;
            SingleFieldBuilderV3<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> singleFieldBuilderV3 = this.sdkAnalyticConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                SdkAnalyticConfig unused12 = initResponse.sdkAnalyticConfig_ = this.sdkAnalyticConfig_;
            } else {
                SdkAnalyticConfig unused13 = initResponse.sdkAnalyticConfig_ = singleFieldBuilderV3.build();
            }
            onBuilt();
            return initResponse;
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
            if (message instanceof InitResponse) {
                return mergeFrom((InitResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(InitResponse initResponse) {
            if (initResponse == InitResponse.getDefaultInstance()) {
                return this;
            }
            if (!initResponse.getEndpoint().isEmpty()) {
                this.endpoint_ = initResponse.endpoint_;
                onChanged();
            }
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = null;
            if (this.eventBuilder_ == null) {
                if (!initResponse.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = initResponse.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(initResponse.event_);
                    }
                    onChanged();
                }
            } else if (!initResponse.event_.isEmpty()) {
                if (this.eventBuilder_.isEmpty()) {
                    this.eventBuilder_.dispose();
                    this.eventBuilder_ = null;
                    this.event_ = initResponse.event_;
                    this.bitField0_ &= -2;
                    this.eventBuilder_ = InitResponse.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                } else {
                    this.eventBuilder_.addAllMessages(initResponse.event_);
                }
            }
            if (initResponse.getSessionResetAfter() != 0) {
                setSessionResetAfter(initResponse.getSessionResetAfter());
            }
            if (this.adNetworksBuilder_ == null) {
                if (!initResponse.adNetworks_.isEmpty()) {
                    if (this.adNetworks_.isEmpty()) {
                        this.adNetworks_ = initResponse.adNetworks_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdNetworksIsMutable();
                        this.adNetworks_.addAll(initResponse.adNetworks_);
                    }
                    onChanged();
                }
            } else if (!initResponse.adNetworks_.isEmpty()) {
                if (this.adNetworksBuilder_.isEmpty()) {
                    this.adNetworksBuilder_.dispose();
                    this.adNetworksBuilder_ = null;
                    this.adNetworks_ = initResponse.adNetworks_;
                    this.bitField0_ &= -3;
                    if (InitResponse.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getAdNetworksFieldBuilder();
                    }
                    this.adNetworksBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.adNetworksBuilder_.addAllMessages(initResponse.adNetworks_);
                }
            }
            if (initResponse.getAdNetworksLoadingTimeout() != 0) {
                setAdNetworksLoadingTimeout(initResponse.getAdNetworksLoadingTimeout());
            }
            if (initResponse.adCacheControl_ != 0) {
                setAdCacheControlValue(initResponse.getAdCacheControlValue());
            }
            if (initResponse.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(initResponse.getAdCacheMaxAge());
            }
            internalGetMutableAdCachePlacementControl().mergeFrom(initResponse.internalGetAdCachePlacementControl());
            if (initResponse.getAdRequestTmax() != 0) {
                setAdRequestTmax(initResponse.getAdRequestTmax());
            }
            if (initResponse.hasSdkAnalyticConfig()) {
                mergeSdkAnalyticConfig(initResponse.getSdkAnalyticConfig());
            }
            mergeUnknownFields(initResponse.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.InitResponse.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.InitResponse.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.InitResponse r3 = (io.bidmachine.protobuf.InitResponse) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.InitResponse) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.InitResponse r4 = (io.bidmachine.protobuf.InitResponse) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.InitResponse) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.InitResponse.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.InitResponse$Builder");
        }

        public String getEndpoint() {
            Object obj = this.endpoint_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.endpoint_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getEndpointBytes() {
            Object obj = this.endpoint_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.endpoint_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setEndpoint(String str) {
            if (str != null) {
                this.endpoint_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearEndpoint() {
            this.endpoint_ = InitResponse.getDefaultInstance().getEndpoint();
            onChanged();
            return this;
        }

        public Builder setEndpointBytes(ByteString byteString) {
            if (byteString != null) {
                InitResponse.checkByteStringIsUtf8(byteString);
                this.endpoint_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureEventIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.event_ = new ArrayList(this.event_);
                this.bitField0_ |= 1;
            }
        }

        public List<Ad.Event> getEventList() {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.event_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getEventCount() {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.event_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public Ad.Event getEvent(int i) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.event_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setEvent(int i, Ad.Event event) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, event);
            } else if (event != null) {
                ensureEventIsMutable();
                this.event_.set(i, event);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setEvent(int i, Ad.Event.Builder builder) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                this.event_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addEvent(Ad.Event event) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(event);
            } else if (event != null) {
                ensureEventIsMutable();
                this.event_.add(event);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addEvent(int i, Ad.Event event) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, event);
            } else if (event != null) {
                ensureEventIsMutable();
                this.event_.add(i, event);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addEvent(Ad.Event.Builder builder) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                this.event_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addEvent(int i, Ad.Event.Builder builder) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                this.event_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllEvent(Iterable<? extends Ad.Event> iterable) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.event_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearEvent() {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeEvent(int i) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                this.event_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Ad.Event.Builder getEventBuilder(int i) {
            return getEventFieldBuilder().getBuilder(i);
        }

        public Ad.EventOrBuilder getEventOrBuilder(int i) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.event_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.event_);
        }

        public Ad.Event.Builder addEventBuilder() {
            return getEventFieldBuilder().addBuilder(Ad.Event.getDefaultInstance());
        }

        public Ad.Event.Builder addEventBuilder(int i) {
            return getEventFieldBuilder().addBuilder(i, Ad.Event.getDefaultInstance());
        }

        public List<Ad.Event.Builder> getEventBuilderList() {
            return getEventFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
                List<Ad.Event> list = this.event_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.eventBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.event_ = null;
            }
            return this.eventBuilder_;
        }

        public int getSessionResetAfter() {
            return this.sessionResetAfter_;
        }

        public Builder setSessionResetAfter(int i) {
            this.sessionResetAfter_ = i;
            onChanged();
            return this;
        }

        public Builder clearSessionResetAfter() {
            this.sessionResetAfter_ = 0;
            onChanged();
            return this;
        }

        private void ensureAdNetworksIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adNetworks_ = new ArrayList(this.adNetworks_);
                this.bitField0_ |= 2;
            }
        }

        public List<AdNetwork> getAdNetworksList() {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.adNetworks_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getAdNetworksCount() {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adNetworks_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public AdNetwork getAdNetworks(int i) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adNetworks_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setAdNetworks(int i, AdNetwork adNetwork) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, adNetwork);
            } else if (adNetwork != null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.set(i, adNetwork);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setAdNetworks(int i, AdNetwork.Builder builder) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAdNetworks(AdNetwork adNetwork) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(adNetwork);
            } else if (adNetwork != null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(adNetwork);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addAdNetworks(int i, AdNetwork adNetwork) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, adNetwork);
            } else if (adNetwork != null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i, adNetwork);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addAdNetworks(AdNetwork.Builder builder) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addAdNetworks(int i, AdNetwork.Builder builder) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllAdNetworks(Iterable<? extends AdNetwork> iterable) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdNetworksIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.adNetworks_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearAdNetworks() {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.adNetworks_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeAdNetworks(int i) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public AdNetwork.Builder getAdNetworksBuilder(int i) {
            return getAdNetworksFieldBuilder().getBuilder(i);
        }

        public AdNetworkOrBuilder getAdNetworksOrBuilder(int i) {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adNetworks_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
            RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> repeatedFieldBuilderV3 = this.adNetworksBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.adNetworks_);
        }

        public AdNetwork.Builder addAdNetworksBuilder() {
            return getAdNetworksFieldBuilder().addBuilder(AdNetwork.getDefaultInstance());
        }

        public AdNetwork.Builder addAdNetworksBuilder(int i) {
            return getAdNetworksFieldBuilder().addBuilder(i, AdNetwork.getDefaultInstance());
        }

        public List<AdNetwork.Builder> getAdNetworksBuilderList() {
            return getAdNetworksFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<AdNetwork, AdNetwork.Builder, AdNetworkOrBuilder> getAdNetworksFieldBuilder() {
            if (this.adNetworksBuilder_ == null) {
                this.adNetworksBuilder_ = new RepeatedFieldBuilderV3<>(this.adNetworks_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adNetworks_ = null;
            }
            return this.adNetworksBuilder_;
        }

        public int getAdNetworksLoadingTimeout() {
            return this.adNetworksLoadingTimeout_;
        }

        public Builder setAdNetworksLoadingTimeout(int i) {
            this.adNetworksLoadingTimeout_ = i;
            onChanged();
            return this;
        }

        public Builder clearAdNetworksLoadingTimeout() {
            this.adNetworksLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public int getAdCacheControlValue() {
            return this.adCacheControl_;
        }

        public Builder setAdCacheControlValue(int i) {
            this.adCacheControl_ = i;
            onChanged();
            return this;
        }

        public AdCacheControl getAdCacheControl() {
            AdCacheControl valueOf = AdCacheControl.valueOf(this.adCacheControl_);
            return valueOf == null ? AdCacheControl.UNRECOGNIZED : valueOf;
        }

        public Builder setAdCacheControl(AdCacheControl adCacheControl) {
            if (adCacheControl != null) {
                this.adCacheControl_ = adCacheControl.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearAdCacheControl() {
            this.adCacheControl_ = 0;
            onChanged();
            return this;
        }

        public int getAdCacheMaxAge() {
            return this.adCacheMaxAge_;
        }

        public Builder setAdCacheMaxAge(int i) {
            this.adCacheMaxAge_ = i;
            onChanged();
            return this;
        }

        public Builder clearAdCacheMaxAge() {
            this.adCacheMaxAge_ = 0;
            onChanged();
            return this;
        }

        private MapField<String, AdCachePlacementControl> internalGetAdCachePlacementControl() {
            MapField<String, AdCachePlacementControl> mapField = this.adCachePlacementControl_;
            return mapField == null ? MapField.emptyMapField(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, AdCachePlacementControl> internalGetMutableAdCachePlacementControl() {
            onChanged();
            if (this.adCachePlacementControl_ == null) {
                this.adCachePlacementControl_ = MapField.newMapField(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
            }
            if (!this.adCachePlacementControl_.isMutable()) {
                this.adCachePlacementControl_ = this.adCachePlacementControl_.copy();
            }
            return this.adCachePlacementControl_;
        }

        public int getAdCachePlacementControlCount() {
            return internalGetAdCachePlacementControl().getMap().size();
        }

        public boolean containsAdCachePlacementControl(String str) {
            if (str != null) {
                return internalGetAdCachePlacementControl().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
            return getAdCachePlacementControlMap();
        }

        public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
            return internalGetAdCachePlacementControl().getMap();
        }

        public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
            if (str != null) {
                Map<String, AdCachePlacementControl> map = internalGetAdCachePlacementControl().getMap();
                return map.containsKey(str) ? map.get(str) : adCachePlacementControl;
            }
            throw null;
        }

        public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
            if (str != null) {
                Map<String, AdCachePlacementControl> map = internalGetAdCachePlacementControl().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw null;
        }

        public Builder clearAdCachePlacementControl() {
            internalGetMutableAdCachePlacementControl().getMutableMap().clear();
            return this;
        }

        public Builder removeAdCachePlacementControl(String str) {
            if (str != null) {
                internalGetMutableAdCachePlacementControl().getMutableMap().remove(str);
                return this;
            }
            throw null;
        }

        @Deprecated
        public Map<String, AdCachePlacementControl> getMutableAdCachePlacementControl() {
            return internalGetMutableAdCachePlacementControl().getMutableMap();
        }

        public Builder putAdCachePlacementControl(String str, AdCachePlacementControl adCachePlacementControl) {
            if (str == null) {
                throw null;
            } else if (adCachePlacementControl != null) {
                internalGetMutableAdCachePlacementControl().getMutableMap().put(str, adCachePlacementControl);
                return this;
            } else {
                throw null;
            }
        }

        public Builder putAllAdCachePlacementControl(Map<String, AdCachePlacementControl> map) {
            internalGetMutableAdCachePlacementControl().getMutableMap().putAll(map);
            return this;
        }

        public int getAdRequestTmax() {
            return this.adRequestTmax_;
        }

        public Builder setAdRequestTmax(int i) {
            this.adRequestTmax_ = i;
            onChanged();
            return this;
        }

        public Builder clearAdRequestTmax() {
            this.adRequestTmax_ = 0;
            onChanged();
            return this;
        }

        public boolean hasSdkAnalyticConfig() {
            return (this.sdkAnalyticConfigBuilder_ == null && this.sdkAnalyticConfig_ == null) ? false : true;
        }

        public SdkAnalyticConfig getSdkAnalyticConfig() {
            SingleFieldBuilderV3<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> singleFieldBuilderV3 = this.sdkAnalyticConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            SingleFieldBuilderV3<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> singleFieldBuilderV3 = this.sdkAnalyticConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(sdkAnalyticConfig);
            } else if (sdkAnalyticConfig != null) {
                this.sdkAnalyticConfig_ = sdkAnalyticConfig;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig.Builder builder) {
            SingleFieldBuilderV3<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> singleFieldBuilderV3 = this.sdkAnalyticConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.sdkAnalyticConfig_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            SingleFieldBuilderV3<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> singleFieldBuilderV3 = this.sdkAnalyticConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                SdkAnalyticConfig sdkAnalyticConfig2 = this.sdkAnalyticConfig_;
                if (sdkAnalyticConfig2 != null) {
                    this.sdkAnalyticConfig_ = SdkAnalyticConfig.newBuilder(sdkAnalyticConfig2).mergeFrom(sdkAnalyticConfig).buildPartial();
                } else {
                    this.sdkAnalyticConfig_ = sdkAnalyticConfig;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(sdkAnalyticConfig);
            }
            return this;
        }

        public Builder clearSdkAnalyticConfig() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
                onChanged();
            } else {
                this.sdkAnalyticConfig_ = null;
                this.sdkAnalyticConfigBuilder_ = null;
            }
            return this;
        }

        public SdkAnalyticConfig.Builder getSdkAnalyticConfigBuilder() {
            onChanged();
            return getSdkAnalyticConfigFieldBuilder().getBuilder();
        }

        public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
            SingleFieldBuilderV3<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> singleFieldBuilderV3 = this.sdkAnalyticConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        private SingleFieldBuilderV3<SdkAnalyticConfig, SdkAnalyticConfig.Builder, SdkAnalyticConfigOrBuilder> getSdkAnalyticConfigFieldBuilder() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfigBuilder_ = new SingleFieldBuilderV3<>(getSdkAnalyticConfig(), getParentForChildren(), isClean());
                this.sdkAnalyticConfig_ = null;
            }
            return this.sdkAnalyticConfigBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static InitResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<InitResponse> parser() {
        return PARSER;
    }

    public Parser<InitResponse> getParserForType() {
        return PARSER;
    }

    public InitResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
