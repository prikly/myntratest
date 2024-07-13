package com.appodeal.ads.api;

import com.appodeal.ads.api.UserSettings;
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
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class User extends GeneratedMessageV3 implements UserOrBuilder {
    private static final User DEFAULT_INSTANCE = new User();
    /* access modifiers changed from: private */
    public static final Parser<User> PARSER = new AbstractParser<User>() {
        public User parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new User(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public boolean consent_;
    /* access modifiers changed from: private */
    public volatile Object iabConsentData_;
    /* access modifiers changed from: private */
    public volatile Object id_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public UserSettings userSettings_;

    private User(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private User() {
        this.memoizedIsInitialized = -1;
        this.id_ = "";
        this.iabConsentData_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new User();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private User(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.consent_ = codedInputStream.readBool();
                        } else if (readTag == 18) {
                            UserSettings.Builder builder = this.userSettings_ != null ? this.userSettings_.toBuilder() : null;
                            UserSettings userSettings = (UserSettings) codedInputStream.readMessage(UserSettings.parser(), extensionRegistryLite);
                            this.userSettings_ = userSettings;
                            if (builder != null) {
                                builder.mergeFrom(userSettings);
                                this.userSettings_ = builder.buildPartial();
                            }
                        } else if (readTag == 26) {
                            this.id_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 34) {
                            this.iabConsentData_ = codedInputStream.readStringRequireUtf8();
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
        return Api.internal_static_com_appodeal_ads_User_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_User_fieldAccessorTable.ensureFieldAccessorsInitialized(User.class, Builder.class);
    }

    public boolean getConsent() {
        return this.consent_;
    }

    public boolean hasUserSettings() {
        return this.userSettings_ != null;
    }

    public UserSettings getUserSettings() {
        UserSettings userSettings = this.userSettings_;
        return userSettings == null ? UserSettings.getDefaultInstance() : userSettings;
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

    public String getIabConsentData() {
        Object obj = this.iabConsentData_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.iabConsentData_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIabConsentDataBytes() {
        Object obj = this.iabConsentData_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.iabConsentData_ = copyFromUtf8;
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
        boolean z = this.consent_;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        if (this.userSettings_ != null) {
            codedOutputStream.writeMessage(2, getUserSettings());
        }
        if (!getIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.id_);
        }
        if (!getIabConsentDataBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.iabConsentData_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.consent_;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        if (this.userSettings_ != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getUserSettings());
        }
        if (!getIdBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(3, this.id_);
        }
        if (!getIabConsentDataBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(4, this.iabConsentData_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof User)) {
            return super.equals(obj);
        }
        User user = (User) obj;
        if (getConsent() != user.getConsent() || hasUserSettings() != user.hasUserSettings()) {
            return false;
        }
        if ((!hasUserSettings() || getUserSettings().equals(user.getUserSettings())) && getId().equals(user.getId()) && getIabConsentData().equals(user.getIabConsentData()) && this.unknownFields.equals(user.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getConsent());
        if (hasUserSettings()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getUserSettings().hashCode();
        }
        int hashCode2 = (((((((((hashCode * 37) + 3) * 53) + getId().hashCode()) * 37) + 4) * 53) + getIabConsentData().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(User user) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(user);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserOrBuilder {
        private boolean consent_;
        private Object iabConsentData_;
        private Object id_;
        private SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> userSettingsBuilder_;
        private UserSettings userSettings_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_User_fieldAccessorTable.ensureFieldAccessorsInitialized(User.class, Builder.class);
        }

        private Builder() {
            this.id_ = "";
            this.iabConsentData_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.id_ = "";
            this.iabConsentData_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = User.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.consent_ = false;
            if (this.userSettingsBuilder_ == null) {
                this.userSettings_ = null;
            } else {
                this.userSettings_ = null;
                this.userSettingsBuilder_ = null;
            }
            this.id_ = "";
            this.iabConsentData_ = "";
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_User_descriptor;
        }

        public User getDefaultInstanceForType() {
            return User.getDefaultInstance();
        }

        public User build() {
            User buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public User buildPartial() {
            User user = new User((GeneratedMessageV3.Builder) this);
            boolean unused = user.consent_ = this.consent_;
            SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                UserSettings unused2 = user.userSettings_ = this.userSettings_;
            } else {
                UserSettings unused3 = user.userSettings_ = singleFieldBuilderV3.build();
            }
            Object unused4 = user.id_ = this.id_;
            Object unused5 = user.iabConsentData_ = this.iabConsentData_;
            onBuilt();
            return user;
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
            if (message instanceof User) {
                return mergeFrom((User) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(User user) {
            if (user == User.getDefaultInstance()) {
                return this;
            }
            if (user.getConsent()) {
                setConsent(user.getConsent());
            }
            if (user.hasUserSettings()) {
                mergeUserSettings(user.getUserSettings());
            }
            if (!user.getId().isEmpty()) {
                this.id_ = user.id_;
                onChanged();
            }
            if (!user.getIabConsentData().isEmpty()) {
                this.iabConsentData_ = user.iabConsentData_;
                onChanged();
            }
            mergeUnknownFields(user.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.User.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.User.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.User r3 = (com.appodeal.ads.api.User) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.User) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.User r4 = (com.appodeal.ads.api.User) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.User) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.User.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.User$Builder");
        }

        public Builder setConsent(boolean z) {
            this.consent_ = z;
            onChanged();
            return this;
        }

        public Builder mergeUserSettings(UserSettings userSettings) {
            SingleFieldBuilderV3<UserSettings, UserSettings.Builder, UserSettingsOrBuilder> singleFieldBuilderV3 = this.userSettingsBuilder_;
            if (singleFieldBuilderV3 == null) {
                UserSettings userSettings2 = this.userSettings_;
                if (userSettings2 != null) {
                    this.userSettings_ = UserSettings.newBuilder(userSettings2).mergeFrom(userSettings).buildPartial();
                } else {
                    this.userSettings_ = userSettings;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(userSettings);
            }
            return this;
        }

        public Builder setId(String str) {
            if (str != null) {
                this.id_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder setIabConsentData(String str) {
            if (str != null) {
                this.iabConsentData_ = str;
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

    public static User getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<User> parser() {
        return PARSER;
    }

    public Parser<User> getParserForType() {
        return PARSER;
    }

    public User getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
