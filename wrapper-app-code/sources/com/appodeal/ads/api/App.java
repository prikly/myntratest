package com.appodeal.ads.api;

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
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class App extends GeneratedMessageV3 implements AppOrBuilder {
    private static final App DEFAULT_INSTANCE = new App();
    /* access modifiers changed from: private */
    public static final Parser<App> PARSER = new AbstractParser<App>() {
        public App parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new App(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public long activeAppUptime_;
    /* access modifiers changed from: private */
    public volatile Object appKey_;
    /* access modifiers changed from: private */
    public long appUptime_;
    /* access modifiers changed from: private */
    public volatile Object bundle_;
    /* access modifiers changed from: private */
    public volatile Object frameworkVersion_;
    /* access modifiers changed from: private */
    public volatile Object framework_;
    /* access modifiers changed from: private */
    public long installTime_;
    /* access modifiers changed from: private */
    public volatile Object installer_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public long monotonicAppUptime_;
    /* access modifiers changed from: private */
    public boolean multidex_;
    /* access modifiers changed from: private */
    public volatile Object pluginVersion_;
    /* access modifiers changed from: private */
    public volatile Object sdk_;
    /* access modifiers changed from: private */
    public volatile Object ver_;
    /* access modifiers changed from: private */
    public int versionCode_;

    private App(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private App() {
        this.memoizedIsInitialized = -1;
        this.bundle_ = "";
        this.ver_ = "";
        this.pluginVersion_ = "";
        this.installer_ = "";
        this.appKey_ = "";
        this.sdk_ = "";
        this.framework_ = "";
        this.frameworkVersion_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new App();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private App(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z = true;
                            break;
                        case 10:
                            this.bundle_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 18:
                            this.ver_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 24:
                            this.installTime_ = codedInputStream.readInt64();
                            break;
                        case 34:
                            this.pluginVersion_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 42:
                            this.installer_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 48:
                            this.multidex_ = codedInputStream.readBool();
                            break;
                        case 58:
                            this.appKey_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 66:
                            this.sdk_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 72:
                            this.versionCode_ = codedInputStream.readInt32();
                            break;
                        case 80:
                            this.appUptime_ = codedInputStream.readInt64();
                            break;
                        case 90:
                            this.framework_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 98:
                            this.frameworkVersion_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 104:
                            this.monotonicAppUptime_ = codedInputStream.readInt64();
                            break;
                        case 112:
                            this.activeAppUptime_ = codedInputStream.readInt64();
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
        return Api.internal_static_com_appodeal_ads_App_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_App_fieldAccessorTable.ensureFieldAccessorsInitialized(App.class, Builder.class);
    }

    public String getBundle() {
        Object obj = this.bundle_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bundle_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBundleBytes() {
        Object obj = this.bundle_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bundle_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getVer() {
        Object obj = this.ver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getVerBytes() {
        Object obj = this.ver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ver_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public long getInstallTime() {
        return this.installTime_;
    }

    public String getPluginVersion() {
        Object obj = this.pluginVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.pluginVersion_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getPluginVersionBytes() {
        Object obj = this.pluginVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.pluginVersion_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getInstaller() {
        Object obj = this.installer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.installer_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getInstallerBytes() {
        Object obj = this.installer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.installer_ = copyFromUtf8;
        return copyFromUtf8;
    }

    @Deprecated
    public boolean getMultidex() {
        return this.multidex_;
    }

    public String getAppKey() {
        Object obj = this.appKey_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appKey_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getAppKeyBytes() {
        Object obj = this.appKey_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appKey_ = copyFromUtf8;
        return copyFromUtf8;
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

    public int getVersionCode() {
        return this.versionCode_;
    }

    public long getAppUptime() {
        return this.appUptime_;
    }

    public String getFramework() {
        Object obj = this.framework_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.framework_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getFrameworkBytes() {
        Object obj = this.framework_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.framework_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getFrameworkVersion() {
        Object obj = this.frameworkVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.frameworkVersion_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getFrameworkVersionBytes() {
        Object obj = this.frameworkVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.frameworkVersion_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public long getMonotonicAppUptime() {
        return this.monotonicAppUptime_;
    }

    @Deprecated
    public long getActiveAppUptime() {
        return this.activeAppUptime_;
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
        if (!getBundleBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.bundle_);
        }
        if (!getVerBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.ver_);
        }
        long j = this.installTime_;
        if (j != 0) {
            codedOutputStream.writeInt64(3, j);
        }
        if (!getPluginVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.pluginVersion_);
        }
        if (!getInstallerBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.installer_);
        }
        boolean z = this.multidex_;
        if (z) {
            codedOutputStream.writeBool(6, z);
        }
        if (!getAppKeyBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.appKey_);
        }
        if (!getSdkBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.sdk_);
        }
        int i = this.versionCode_;
        if (i != 0) {
            codedOutputStream.writeInt32(9, i);
        }
        long j2 = this.appUptime_;
        if (j2 != 0) {
            codedOutputStream.writeInt64(10, j2);
        }
        if (!getFrameworkBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.framework_);
        }
        if (!getFrameworkVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.frameworkVersion_);
        }
        long j3 = this.monotonicAppUptime_;
        if (j3 != 0) {
            codedOutputStream.writeInt64(13, j3);
        }
        long j4 = this.activeAppUptime_;
        if (j4 != 0) {
            codedOutputStream.writeInt64(14, j4);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getBundleBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.bundle_);
        }
        if (!getVerBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.ver_);
        }
        long j = this.installTime_;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(3, j);
        }
        if (!getPluginVersionBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(4, this.pluginVersion_);
        }
        if (!getInstallerBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(5, this.installer_);
        }
        boolean z = this.multidex_;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(6, z);
        }
        if (!getAppKeyBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(7, this.appKey_);
        }
        if (!getSdkBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(8, this.sdk_);
        }
        int i3 = this.versionCode_;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(9, i3);
        }
        long j2 = this.appUptime_;
        if (j2 != 0) {
            i2 += CodedOutputStream.computeInt64Size(10, j2);
        }
        if (!getFrameworkBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(11, this.framework_);
        }
        if (!getFrameworkVersionBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(12, this.frameworkVersion_);
        }
        long j3 = this.monotonicAppUptime_;
        if (j3 != 0) {
            i2 += CodedOutputStream.computeInt64Size(13, j3);
        }
        long j4 = this.activeAppUptime_;
        if (j4 != 0) {
            i2 += CodedOutputStream.computeInt64Size(14, j4);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof App)) {
            return super.equals(obj);
        }
        App app = (App) obj;
        if (getBundle().equals(app.getBundle()) && getVer().equals(app.getVer()) && getInstallTime() == app.getInstallTime() && getPluginVersion().equals(app.getPluginVersion()) && getInstaller().equals(app.getInstaller()) && getMultidex() == app.getMultidex() && getAppKey().equals(app.getAppKey()) && getSdk().equals(app.getSdk()) && getVersionCode() == app.getVersionCode() && getAppUptime() == app.getAppUptime() && getFramework().equals(app.getFramework()) && getFrameworkVersion().equals(app.getFrameworkVersion()) && getMonotonicAppUptime() == app.getMonotonicAppUptime() && getActiveAppUptime() == app.getActiveAppUptime() && this.unknownFields.equals(app.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBundle().hashCode()) * 37) + 2) * 53) + getVer().hashCode()) * 37) + 3) * 53) + Internal.hashLong(getInstallTime())) * 37) + 4) * 53) + getPluginVersion().hashCode()) * 37) + 5) * 53) + getInstaller().hashCode()) * 37) + 6) * 53) + Internal.hashBoolean(getMultidex())) * 37) + 7) * 53) + getAppKey().hashCode()) * 37) + 8) * 53) + getSdk().hashCode()) * 37) + 9) * 53) + getVersionCode()) * 37) + 10) * 53) + Internal.hashLong(getAppUptime())) * 37) + 11) * 53) + getFramework().hashCode()) * 37) + 12) * 53) + getFrameworkVersion().hashCode()) * 37) + 13) * 53) + Internal.hashLong(getMonotonicAppUptime())) * 37) + 14) * 53) + Internal.hashLong(getActiveAppUptime())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(App app) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppOrBuilder {
        private long activeAppUptime_;
        private Object appKey_;
        private long appUptime_;
        private Object bundle_;
        private Object frameworkVersion_;
        private Object framework_;
        private long installTime_;
        private Object installer_;
        private long monotonicAppUptime_;
        private boolean multidex_;
        private Object pluginVersion_;
        private Object sdk_;
        private Object ver_;
        private int versionCode_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_App_fieldAccessorTable.ensureFieldAccessorsInitialized(App.class, Builder.class);
        }

        private Builder() {
            this.bundle_ = "";
            this.ver_ = "";
            this.pluginVersion_ = "";
            this.installer_ = "";
            this.appKey_ = "";
            this.sdk_ = "";
            this.framework_ = "";
            this.frameworkVersion_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.bundle_ = "";
            this.ver_ = "";
            this.pluginVersion_ = "";
            this.installer_ = "";
            this.appKey_ = "";
            this.sdk_ = "";
            this.framework_ = "";
            this.frameworkVersion_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = App.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.bundle_ = "";
            this.ver_ = "";
            this.installTime_ = 0;
            this.pluginVersion_ = "";
            this.installer_ = "";
            this.multidex_ = false;
            this.appKey_ = "";
            this.sdk_ = "";
            this.versionCode_ = 0;
            this.appUptime_ = 0;
            this.framework_ = "";
            this.frameworkVersion_ = "";
            this.monotonicAppUptime_ = 0;
            this.activeAppUptime_ = 0;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_App_descriptor;
        }

        public App getDefaultInstanceForType() {
            return App.getDefaultInstance();
        }

        public App build() {
            App buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public App buildPartial() {
            App app = new App((GeneratedMessageV3.Builder) this);
            Object unused = app.bundle_ = this.bundle_;
            Object unused2 = app.ver_ = this.ver_;
            long unused3 = app.installTime_ = this.installTime_;
            Object unused4 = app.pluginVersion_ = this.pluginVersion_;
            Object unused5 = app.installer_ = this.installer_;
            boolean unused6 = app.multidex_ = this.multidex_;
            Object unused7 = app.appKey_ = this.appKey_;
            Object unused8 = app.sdk_ = this.sdk_;
            int unused9 = app.versionCode_ = this.versionCode_;
            long unused10 = app.appUptime_ = this.appUptime_;
            Object unused11 = app.framework_ = this.framework_;
            Object unused12 = app.frameworkVersion_ = this.frameworkVersion_;
            long unused13 = app.monotonicAppUptime_ = this.monotonicAppUptime_;
            long unused14 = app.activeAppUptime_ = this.activeAppUptime_;
            onBuilt();
            return app;
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
            if (message instanceof App) {
                return mergeFrom((App) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(App app) {
            if (app == App.getDefaultInstance()) {
                return this;
            }
            if (!app.getBundle().isEmpty()) {
                this.bundle_ = app.bundle_;
                onChanged();
            }
            if (!app.getVer().isEmpty()) {
                this.ver_ = app.ver_;
                onChanged();
            }
            if (app.getInstallTime() != 0) {
                setInstallTime(app.getInstallTime());
            }
            if (!app.getPluginVersion().isEmpty()) {
                this.pluginVersion_ = app.pluginVersion_;
                onChanged();
            }
            if (!app.getInstaller().isEmpty()) {
                this.installer_ = app.installer_;
                onChanged();
            }
            if (app.getMultidex()) {
                setMultidex(app.getMultidex());
            }
            if (!app.getAppKey().isEmpty()) {
                this.appKey_ = app.appKey_;
                onChanged();
            }
            if (!app.getSdk().isEmpty()) {
                this.sdk_ = app.sdk_;
                onChanged();
            }
            if (app.getVersionCode() != 0) {
                setVersionCode(app.getVersionCode());
            }
            if (app.getAppUptime() != 0) {
                setAppUptime(app.getAppUptime());
            }
            if (!app.getFramework().isEmpty()) {
                this.framework_ = app.framework_;
                onChanged();
            }
            if (!app.getFrameworkVersion().isEmpty()) {
                this.frameworkVersion_ = app.frameworkVersion_;
                onChanged();
            }
            if (app.getMonotonicAppUptime() != 0) {
                setMonotonicAppUptime(app.getMonotonicAppUptime());
            }
            if (app.getActiveAppUptime() != 0) {
                setActiveAppUptime(app.getActiveAppUptime());
            }
            mergeUnknownFields(app.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.App.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.App.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.App r3 = (com.appodeal.ads.api.App) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.App) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.App r4 = (com.appodeal.ads.api.App) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.App) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.App.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.App$Builder");
        }

        public Builder setBundle(String str) {
            if (str != null) {
                this.bundle_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setVer(String str) {
            if (str != null) {
                this.ver_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setInstallTime(long j) {
            this.installTime_ = j;
            onChanged();
            return this;
        }

        public Builder setPluginVersion(String str) {
            if (str != null) {
                this.pluginVersion_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setInstaller(String str) {
            if (str != null) {
                this.installer_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        @Deprecated
        public Builder setMultidex(boolean z) {
            this.multidex_ = z;
            onChanged();
            return this;
        }

        public Builder setAppKey(String str) {
            if (str != null) {
                this.appKey_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setSdk(String str) {
            if (str != null) {
                this.sdk_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setVersionCode(int i) {
            this.versionCode_ = i;
            onChanged();
            return this;
        }

        public Builder setAppUptime(long j) {
            this.appUptime_ = j;
            onChanged();
            return this;
        }

        public Builder setFramework(String str) {
            if (str != null) {
                this.framework_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setFrameworkVersion(String str) {
            if (str != null) {
                this.frameworkVersion_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setMonotonicAppUptime(long j) {
            this.monotonicAppUptime_ = j;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setActiveAppUptime(long j) {
            this.activeAppUptime_ = j;
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

    public static App getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<App> parser() {
        return PARSER;
    }

    public Parser<App> getParserForType() {
        return PARSER;
    }

    public App getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
