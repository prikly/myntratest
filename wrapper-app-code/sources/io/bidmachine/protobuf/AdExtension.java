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
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import com.explorestack.protobuf.adcom.Ad;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AdExtension extends GeneratedMessageV3 implements AdExtensionOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 21;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 22;
    public static final int AD_MARKUP_LOADING_TIMEOUT_FIELD_NUMBER = 24;
    public static final int CLOSE_BUTTON_FIELD_NUMBER = 15;
    public static final int COMPANION_SKIPOFFSET_FIELD_NUMBER = 10;
    public static final int COUNTDOWN_FIELD_NUMBER = 14;
    public static final int CREATIVE_LOADING_METHOD_FIELD_NUMBER = 27;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 8;
    private static final AdExtension DEFAULT_INSTANCE = new AdExtension();
    public static final int EVENT_FIELD_NUMBER = 7;
    public static final int IGNORES_SAFE_AREA_LAYOUT_GUIDE_FIELD_NUMBER = 16;
    public static final int LOAD_SKIPOFFSET_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Parser<AdExtension> PARSER = new AbstractParser<AdExtension>() {
        public AdExtension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AdExtension(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PLACEHOLDER_TIMEOUT_FIELD_NUMBER = 28;
    public static final int PRELOAD_AD_FIELD_NUMBER = 26;
    public static final int PRELOAD_FIELD_NUMBER = 2;
    public static final int PROGRESS_DURATION_FIELD_NUMBER = 19;
    public static final int PROGRESS_FIELD_NUMBER = 18;
    public static final int R1_DELAY_FIELD_NUMBER = 23;
    public static final int R1_FIELD_NUMBER = 12;
    public static final int R2_FIELD_NUMBER = 13;
    public static final int SKIPOFFSET_FIELD_NUMBER = 9;
    public static final int STORE_URL_FIELD_NUMBER = 17;
    public static final int USE_EMBEDDED_BROWSER_FIELD_NUMBER = 25;
    public static final int USE_NATIVE_CLOSE_FIELD_NUMBER = 11;
    public static final int VIEWABILITY_DURATION_THRESHOLD_FIELD_NUMBER = 6;
    public static final int VIEWABILITY_IGNORE_WINDOW_FOCUS_FIELD_NUMBER = 20;
    public static final int VIEWABILITY_PIXEL_THRESHOLD_FIELD_NUMBER = 5;
    public static final int VIEWABILITY_TIME_THRESHOLD_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public int adCacheControl_;
    /* access modifiers changed from: private */
    public int adCacheMaxAge_;
    /* access modifiers changed from: private */
    public int adMarkupLoadingTimeout_;
    /* access modifiers changed from: private */
    public ControlAsset closeButton_;
    /* access modifiers changed from: private */
    public int companionSkipoffset_;
    /* access modifiers changed from: private */
    public ControlAsset countdown_;
    /* access modifiers changed from: private */
    public int creativeLoadingMethod_;
    /* access modifiers changed from: private */
    public MapField<String, String> customParams_;
    /* access modifiers changed from: private */
    public List<Ad.Event> event_;
    /* access modifiers changed from: private */
    public boolean ignoresSafeAreaLayoutGuide_;
    /* access modifiers changed from: private */
    public int loadSkipoffset_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public float placeholderTimeout_;
    /* access modifiers changed from: private */
    public boolean preloadAd_;
    /* access modifiers changed from: private */
    public boolean preload_;
    /* access modifiers changed from: private */
    public int progressDuration_;
    /* access modifiers changed from: private */
    public ControlAsset progress_;
    /* access modifiers changed from: private */
    public int r1Delay_;
    /* access modifiers changed from: private */
    public boolean r1_;
    /* access modifiers changed from: private */
    public boolean r2_;
    /* access modifiers changed from: private */
    public int skipoffset_;
    /* access modifiers changed from: private */
    public volatile Object storeUrl_;
    /* access modifiers changed from: private */
    public boolean useEmbeddedBrowser_;
    /* access modifiers changed from: private */
    public boolean useNativeClose_;
    /* access modifiers changed from: private */
    public float viewabilityDurationThreshold_;
    /* access modifiers changed from: private */
    public boolean viewabilityIgnoreWindowFocus_;
    /* access modifiers changed from: private */
    public float viewabilityPixelThreshold_;
    /* access modifiers changed from: private */
    public int viewabilityTimeThreshold_;

    public interface ControlAssetOrBuilder extends MessageOrBuilder {
        String getContent();

        ByteString getContentBytes();

        String getFill();

        ByteString getFillBytes();

        int getFontStyle();

        int getHeight();

        int getHideafter();

        String getMargin();

        ByteString getMarginBytes();

        float getOpacity();

        boolean getOutlined();

        String getPadding();

        ByteString getPaddingBytes();

        String getShadow();

        ByteString getShadowBytes();

        String getStroke();

        ByteString getStrokeBytes();

        float getStrokeWidth();

        String getStyle();

        ByteString getStyleBytes();

        boolean getVisible();

        int getWidth();

        String getX();

        ByteString getXBytes();

        String getY();

        ByteString getYBytes();
    }

    private AdExtension(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private AdExtension() {
        this.memoizedIsInitialized = -1;
        this.storeUrl_ = "";
        this.event_ = Collections.emptyList();
        this.adCacheControl_ = 0;
        this.creativeLoadingMethod_ = 0;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AdExtension();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private AdExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        case 16:
                            this.preload_ = codedInputStream.readBool();
                            break;
                        case 24:
                            this.loadSkipoffset_ = codedInputStream.readUInt32();
                            break;
                        case 32:
                            this.viewabilityTimeThreshold_ = codedInputStream.readUInt32();
                            break;
                        case 45:
                            this.viewabilityPixelThreshold_ = codedInputStream.readFloat();
                            break;
                        case 53:
                            this.viewabilityDurationThreshold_ = codedInputStream.readFloat();
                            break;
                        case 58:
                            if (!z2 || !true) {
                                this.event_ = new ArrayList();
                                z2 |= true;
                            }
                            this.event_.add(codedInputStream.readMessage(Ad.Event.parser(), extensionRegistryLite));
                            break;
                        case 66:
                            if (!z2 || !true) {
                                this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                                z2 |= true;
                            }
                            MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                            this.customParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            break;
                        case 72:
                            this.skipoffset_ = codedInputStream.readUInt32();
                            break;
                        case 80:
                            this.companionSkipoffset_ = codedInputStream.readUInt32();
                            break;
                        case 88:
                            this.useNativeClose_ = codedInputStream.readBool();
                            break;
                        case 96:
                            this.r1_ = codedInputStream.readBool();
                            break;
                        case 104:
                            this.r2_ = codedInputStream.readBool();
                            break;
                        case 114:
                            ControlAsset.Builder builder = this.countdown_ != null ? this.countdown_.toBuilder() : null;
                            ControlAsset controlAsset = (ControlAsset) codedInputStream.readMessage(ControlAsset.parser(), extensionRegistryLite);
                            this.countdown_ = controlAsset;
                            if (builder == null) {
                                break;
                            } else {
                                builder.mergeFrom(controlAsset);
                                this.countdown_ = builder.buildPartial();
                                break;
                            }
                        case 122:
                            ControlAsset.Builder builder2 = this.closeButton_ != null ? this.closeButton_.toBuilder() : null;
                            ControlAsset controlAsset2 = (ControlAsset) codedInputStream.readMessage(ControlAsset.parser(), extensionRegistryLite);
                            this.closeButton_ = controlAsset2;
                            if (builder2 == null) {
                                break;
                            } else {
                                builder2.mergeFrom(controlAsset2);
                                this.closeButton_ = builder2.buildPartial();
                                break;
                            }
                        case 128:
                            this.ignoresSafeAreaLayoutGuide_ = codedInputStream.readBool();
                            break;
                        case 138:
                            this.storeUrl_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 146:
                            ControlAsset.Builder builder3 = this.progress_ != null ? this.progress_.toBuilder() : null;
                            ControlAsset controlAsset3 = (ControlAsset) codedInputStream.readMessage(ControlAsset.parser(), extensionRegistryLite);
                            this.progress_ = controlAsset3;
                            if (builder3 == null) {
                                break;
                            } else {
                                builder3.mergeFrom(controlAsset3);
                                this.progress_ = builder3.buildPartial();
                                break;
                            }
                        case 152:
                            this.progressDuration_ = codedInputStream.readUInt32();
                            break;
                        case 160:
                            this.viewabilityIgnoreWindowFocus_ = codedInputStream.readBool();
                            break;
                        case 168:
                            this.adCacheControl_ = codedInputStream.readEnum();
                            break;
                        case 176:
                            this.adCacheMaxAge_ = codedInputStream.readUInt32();
                            break;
                        case 184:
                            this.r1Delay_ = codedInputStream.readUInt32();
                            break;
                        case 192:
                            this.adMarkupLoadingTimeout_ = codedInputStream.readUInt32();
                            break;
                        case 200:
                            this.useEmbeddedBrowser_ = codedInputStream.readBool();
                            break;
                        case LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE:
                            this.preloadAd_ = codedInputStream.readBool();
                            break;
                        case 216:
                            this.creativeLoadingMethod_ = codedInputStream.readEnum();
                            break;
                        case 229:
                            this.placeholderTimeout_ = codedInputStream.readFloat();
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
                        this.event_ = Collections.unmodifiableList(this.event_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.event_ = Collections.unmodifiableList(this.event_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
    }

    /* access modifiers changed from: protected */
    public MapField internalGetMapField(int i) {
        if (i == 8) {
            return internalGetCustomParams();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(AdExtension.class, Builder.class);
    }

    public static final class ControlAsset extends GeneratedMessageV3 implements ControlAssetOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 1;
        private static final ControlAsset DEFAULT_INSTANCE = new ControlAsset();
        public static final int FILL_FIELD_NUMBER = 2;
        public static final int FONT_STYLE_FIELD_NUMBER = 3;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int HIDEAFTER_FIELD_NUMBER = 5;
        public static final int MARGIN_FIELD_NUMBER = 6;
        public static final int OPACITY_FIELD_NUMBER = 7;
        public static final int OUTLINED_FIELD_NUMBER = 8;
        public static final int PADDING_FIELD_NUMBER = 9;
        /* access modifiers changed from: private */
        public static final Parser<ControlAsset> PARSER = new AbstractParser<ControlAsset>() {
            public ControlAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ControlAsset(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SHADOW_FIELD_NUMBER = 10;
        public static final int STROKE_FIELD_NUMBER = 11;
        public static final int STROKE_WIDTH_FIELD_NUMBER = 18;
        public static final int STYLE_FIELD_NUMBER = 13;
        public static final int VISIBLE_FIELD_NUMBER = 14;
        public static final int WIDTH_FIELD_NUMBER = 15;
        public static final int X_FIELD_NUMBER = 16;
        public static final int Y_FIELD_NUMBER = 17;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object content_;
        /* access modifiers changed from: private */
        public volatile Object fill_;
        /* access modifiers changed from: private */
        public int fontStyle_;
        /* access modifiers changed from: private */
        public int height_;
        /* access modifiers changed from: private */
        public int hideafter_;
        /* access modifiers changed from: private */
        public volatile Object margin_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public float opacity_;
        /* access modifiers changed from: private */
        public boolean outlined_;
        /* access modifiers changed from: private */
        public volatile Object padding_;
        /* access modifiers changed from: private */
        public volatile Object shadow_;
        /* access modifiers changed from: private */
        public float strokeWidth_;
        /* access modifiers changed from: private */
        public volatile Object stroke_;
        /* access modifiers changed from: private */
        public volatile Object style_;
        /* access modifiers changed from: private */
        public boolean visible_;
        /* access modifiers changed from: private */
        public int width_;
        /* access modifiers changed from: private */
        public volatile Object x_;
        /* access modifiers changed from: private */
        public volatile Object y_;

        private ControlAsset(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private ControlAsset() {
            this.memoizedIsInitialized = -1;
            this.content_ = "";
            this.fill_ = "";
            this.margin_ = "";
            this.padding_ = "";
            this.shadow_ = "";
            this.stroke_ = "";
            this.style_ = "";
            this.x_ = "";
            this.y_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ControlAsset();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ControlAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.content_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                this.fill_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 24:
                                this.fontStyle_ = codedInputStream.readUInt32();
                                break;
                            case 32:
                                this.height_ = codedInputStream.readUInt32();
                                break;
                            case 40:
                                this.hideafter_ = codedInputStream.readUInt32();
                                break;
                            case 50:
                                this.margin_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 61:
                                this.opacity_ = codedInputStream.readFloat();
                                break;
                            case 64:
                                this.outlined_ = codedInputStream.readBool();
                                break;
                            case 74:
                                this.padding_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.shadow_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.stroke_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 106:
                                this.style_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 112:
                                this.visible_ = codedInputStream.readBool();
                                break;
                            case 120:
                                this.width_ = codedInputStream.readUInt32();
                                break;
                            case 130:
                                this.x_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 138:
                                this.y_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 149:
                                this.strokeWidth_ = codedInputStream.readFloat();
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
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(ControlAsset.class, Builder.class);
        }

        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getFill() {
            Object obj = this.fill_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fill_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getFillBytes() {
            Object obj = this.fill_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fill_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getFontStyle() {
            return this.fontStyle_;
        }

        public int getHeight() {
            return this.height_;
        }

        public int getHideafter() {
            return this.hideafter_;
        }

        public String getMargin() {
            Object obj = this.margin_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.margin_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getMarginBytes() {
            Object obj = this.margin_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.margin_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public float getOpacity() {
            return this.opacity_;
        }

        public boolean getOutlined() {
            return this.outlined_;
        }

        public String getPadding() {
            Object obj = this.padding_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.padding_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getPaddingBytes() {
            Object obj = this.padding_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.padding_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getShadow() {
            Object obj = this.shadow_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.shadow_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getShadowBytes() {
            Object obj = this.shadow_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.shadow_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getStroke() {
            Object obj = this.stroke_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stroke_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getStrokeBytes() {
            Object obj = this.stroke_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stroke_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public float getStrokeWidth() {
            return this.strokeWidth_;
        }

        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.style_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean getVisible() {
            return this.visible_;
        }

        public int getWidth() {
            return this.width_;
        }

        public String getX() {
            Object obj = this.x_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.x_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getXBytes() {
            Object obj = this.x_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.x_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getY() {
            Object obj = this.y_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.y_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getYBytes() {
            Object obj = this.y_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.y_ = copyFromUtf8;
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
            if (!getContentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.content_);
            }
            if (!getFillBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.fill_);
            }
            int i = this.fontStyle_;
            if (i != 0) {
                codedOutputStream.writeUInt32(3, i);
            }
            int i2 = this.height_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(4, i2);
            }
            int i3 = this.hideafter_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(5, i3);
            }
            if (!getMarginBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.margin_);
            }
            float f2 = this.opacity_;
            if (f2 != 0.0f) {
                codedOutputStream.writeFloat(7, f2);
            }
            boolean z = this.outlined_;
            if (z) {
                codedOutputStream.writeBool(8, z);
            }
            if (!getPaddingBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.padding_);
            }
            if (!getShadowBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 13, this.style_);
            }
            boolean z2 = this.visible_;
            if (z2) {
                codedOutputStream.writeBool(14, z2);
            }
            int i4 = this.width_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(15, i4);
            }
            if (!getXBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 16, this.x_);
            }
            if (!getYBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 17, this.y_);
            }
            float f3 = this.strokeWidth_;
            if (f3 != 0.0f) {
                codedOutputStream.writeFloat(18, f3);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!getContentBytes().isEmpty()) {
                i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.content_);
            }
            if (!getFillBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.fill_);
            }
            int i3 = this.fontStyle_;
            if (i3 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(3, i3);
            }
            int i4 = this.height_;
            if (i4 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(4, i4);
            }
            int i5 = this.hideafter_;
            if (i5 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(5, i5);
            }
            if (!getMarginBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(6, this.margin_);
            }
            float f2 = this.opacity_;
            if (f2 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(7, f2);
            }
            boolean z = this.outlined_;
            if (z) {
                i2 += CodedOutputStream.computeBoolSize(8, z);
            }
            if (!getPaddingBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(9, this.padding_);
            }
            if (!getShadowBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(13, this.style_);
            }
            boolean z2 = this.visible_;
            if (z2) {
                i2 += CodedOutputStream.computeBoolSize(14, z2);
            }
            int i6 = this.width_;
            if (i6 != 0) {
                i2 += CodedOutputStream.computeUInt32Size(15, i6);
            }
            if (!getXBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(16, this.x_);
            }
            if (!getYBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(17, this.y_);
            }
            float f3 = this.strokeWidth_;
            if (f3 != 0.0f) {
                i2 += CodedOutputStream.computeFloatSize(18, f3);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ControlAsset)) {
                return super.equals(obj);
            }
            ControlAsset controlAsset = (ControlAsset) obj;
            if (getContent().equals(controlAsset.getContent()) && getFill().equals(controlAsset.getFill()) && getFontStyle() == controlAsset.getFontStyle() && getHeight() == controlAsset.getHeight() && getHideafter() == controlAsset.getHideafter() && getMargin().equals(controlAsset.getMargin()) && Float.floatToIntBits(getOpacity()) == Float.floatToIntBits(controlAsset.getOpacity()) && getOutlined() == controlAsset.getOutlined() && getPadding().equals(controlAsset.getPadding()) && getShadow().equals(controlAsset.getShadow()) && getStroke().equals(controlAsset.getStroke()) && Float.floatToIntBits(getStrokeWidth()) == Float.floatToIntBits(controlAsset.getStrokeWidth()) && getStyle().equals(controlAsset.getStyle()) && getVisible() == controlAsset.getVisible() && getWidth() == controlAsset.getWidth() && getX().equals(controlAsset.getX()) && getY().equals(controlAsset.getY()) && this.unknownFields.equals(controlAsset.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getFill().hashCode()) * 37) + 3) * 53) + getFontStyle()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + getHideafter()) * 37) + 6) * 53) + getMargin().hashCode()) * 37) + 7) * 53) + Float.floatToIntBits(getOpacity())) * 37) + 8) * 53) + Internal.hashBoolean(getOutlined())) * 37) + 9) * 53) + getPadding().hashCode()) * 37) + 10) * 53) + getShadow().hashCode()) * 37) + 11) * 53) + getStroke().hashCode()) * 37) + 18) * 53) + Float.floatToIntBits(getStrokeWidth())) * 37) + 13) * 53) + getStyle().hashCode()) * 37) + 14) * 53) + Internal.hashBoolean(getVisible())) * 37) + 15) * 53) + getWidth()) * 37) + 16) * 53) + getX().hashCode()) * 37) + 17) * 53) + getY().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static ControlAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ControlAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ControlAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static ControlAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ControlAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static ControlAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ControlAsset parseFrom(InputStream inputStream) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ControlAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControlAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ControlAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControlAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ControlAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ControlAsset controlAsset) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(controlAsset);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ControlAssetOrBuilder {
            private Object content_;
            private Object fill_;
            private int fontStyle_;
            private int height_;
            private int hideafter_;
            private Object margin_;
            private float opacity_;
            private boolean outlined_;
            private Object padding_;
            private Object shadow_;
            private float strokeWidth_;
            private Object stroke_;
            private Object style_;
            private boolean visible_;
            private int width_;
            private Object x_;
            private Object y_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(ControlAsset.class, Builder.class);
            }

            private Builder() {
                this.content_ = "";
                this.fill_ = "";
                this.margin_ = "";
                this.padding_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.x_ = "";
                this.y_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.content_ = "";
                this.fill_ = "";
                this.margin_ = "";
                this.padding_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.x_ = "";
                this.y_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = ControlAsset.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.content_ = "";
                this.fill_ = "";
                this.fontStyle_ = 0;
                this.height_ = 0;
                this.hideafter_ = 0;
                this.margin_ = "";
                this.opacity_ = 0.0f;
                this.outlined_ = false;
                this.padding_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.strokeWidth_ = 0.0f;
                this.style_ = "";
                this.visible_ = false;
                this.width_ = 0;
                this.x_ = "";
                this.y_ = "";
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
            }

            public ControlAsset getDefaultInstanceForType() {
                return ControlAsset.getDefaultInstance();
            }

            public ControlAsset build() {
                ControlAsset buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public ControlAsset buildPartial() {
                ControlAsset controlAsset = new ControlAsset((GeneratedMessageV3.Builder) this);
                Object unused = controlAsset.content_ = this.content_;
                Object unused2 = controlAsset.fill_ = this.fill_;
                int unused3 = controlAsset.fontStyle_ = this.fontStyle_;
                int unused4 = controlAsset.height_ = this.height_;
                int unused5 = controlAsset.hideafter_ = this.hideafter_;
                Object unused6 = controlAsset.margin_ = this.margin_;
                float unused7 = controlAsset.opacity_ = this.opacity_;
                boolean unused8 = controlAsset.outlined_ = this.outlined_;
                Object unused9 = controlAsset.padding_ = this.padding_;
                Object unused10 = controlAsset.shadow_ = this.shadow_;
                Object unused11 = controlAsset.stroke_ = this.stroke_;
                float unused12 = controlAsset.strokeWidth_ = this.strokeWidth_;
                Object unused13 = controlAsset.style_ = this.style_;
                boolean unused14 = controlAsset.visible_ = this.visible_;
                int unused15 = controlAsset.width_ = this.width_;
                Object unused16 = controlAsset.x_ = this.x_;
                Object unused17 = controlAsset.y_ = this.y_;
                onBuilt();
                return controlAsset;
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
                if (message instanceof ControlAsset) {
                    return mergeFrom((ControlAsset) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ControlAsset controlAsset) {
                if (controlAsset == ControlAsset.getDefaultInstance()) {
                    return this;
                }
                if (!controlAsset.getContent().isEmpty()) {
                    this.content_ = controlAsset.content_;
                    onChanged();
                }
                if (!controlAsset.getFill().isEmpty()) {
                    this.fill_ = controlAsset.fill_;
                    onChanged();
                }
                if (controlAsset.getFontStyle() != 0) {
                    setFontStyle(controlAsset.getFontStyle());
                }
                if (controlAsset.getHeight() != 0) {
                    setHeight(controlAsset.getHeight());
                }
                if (controlAsset.getHideafter() != 0) {
                    setHideafter(controlAsset.getHideafter());
                }
                if (!controlAsset.getMargin().isEmpty()) {
                    this.margin_ = controlAsset.margin_;
                    onChanged();
                }
                if (controlAsset.getOpacity() != 0.0f) {
                    setOpacity(controlAsset.getOpacity());
                }
                if (controlAsset.getOutlined()) {
                    setOutlined(controlAsset.getOutlined());
                }
                if (!controlAsset.getPadding().isEmpty()) {
                    this.padding_ = controlAsset.padding_;
                    onChanged();
                }
                if (!controlAsset.getShadow().isEmpty()) {
                    this.shadow_ = controlAsset.shadow_;
                    onChanged();
                }
                if (!controlAsset.getStroke().isEmpty()) {
                    this.stroke_ = controlAsset.stroke_;
                    onChanged();
                }
                if (controlAsset.getStrokeWidth() != 0.0f) {
                    setStrokeWidth(controlAsset.getStrokeWidth());
                }
                if (!controlAsset.getStyle().isEmpty()) {
                    this.style_ = controlAsset.style_;
                    onChanged();
                }
                if (controlAsset.getVisible()) {
                    setVisible(controlAsset.getVisible());
                }
                if (controlAsset.getWidth() != 0) {
                    setWidth(controlAsset.getWidth());
                }
                if (!controlAsset.getX().isEmpty()) {
                    this.x_ = controlAsset.x_;
                    onChanged();
                }
                if (!controlAsset.getY().isEmpty()) {
                    this.y_ = controlAsset.y_;
                    onChanged();
                }
                mergeUnknownFields(controlAsset.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.AdExtension.ControlAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.AdExtension.ControlAsset.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.AdExtension$ControlAsset r3 = (io.bidmachine.protobuf.AdExtension.ControlAsset) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.AdExtension.ControlAsset) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.AdExtension$ControlAsset r4 = (io.bidmachine.protobuf.AdExtension.ControlAsset) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.AdExtension.ControlAsset) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdExtension.ControlAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.AdExtension$ControlAsset$Builder");
            }

            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setContent(String str) {
                if (str != null) {
                    this.content_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearContent() {
                this.content_ = ControlAsset.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.content_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getFill() {
                Object obj = this.fill_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fill_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getFillBytes() {
                Object obj = this.fill_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fill_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setFill(String str) {
                if (str != null) {
                    this.fill_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearFill() {
                this.fill_ = ControlAsset.getDefaultInstance().getFill();
                onChanged();
                return this;
            }

            public Builder setFillBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.fill_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getFontStyle() {
                return this.fontStyle_;
            }

            public Builder setFontStyle(int i) {
                this.fontStyle_ = i;
                onChanged();
                return this;
            }

            public Builder clearFontStyle() {
                this.fontStyle_ = 0;
                onChanged();
                return this;
            }

            public int getHeight() {
                return this.height_;
            }

            public Builder setHeight(int i) {
                this.height_ = i;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public int getHideafter() {
                return this.hideafter_;
            }

            public Builder setHideafter(int i) {
                this.hideafter_ = i;
                onChanged();
                return this;
            }

            public Builder clearHideafter() {
                this.hideafter_ = 0;
                onChanged();
                return this;
            }

            public String getMargin() {
                Object obj = this.margin_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.margin_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMarginBytes() {
                Object obj = this.margin_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.margin_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setMargin(String str) {
                if (str != null) {
                    this.margin_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMargin() {
                this.margin_ = ControlAsset.getDefaultInstance().getMargin();
                onChanged();
                return this;
            }

            public Builder setMarginBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.margin_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public float getOpacity() {
                return this.opacity_;
            }

            public Builder setOpacity(float f2) {
                this.opacity_ = f2;
                onChanged();
                return this;
            }

            public Builder clearOpacity() {
                this.opacity_ = 0.0f;
                onChanged();
                return this;
            }

            public boolean getOutlined() {
                return this.outlined_;
            }

            public Builder setOutlined(boolean z) {
                this.outlined_ = z;
                onChanged();
                return this;
            }

            public Builder clearOutlined() {
                this.outlined_ = false;
                onChanged();
                return this;
            }

            public String getPadding() {
                Object obj = this.padding_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.padding_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getPaddingBytes() {
                Object obj = this.padding_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.padding_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setPadding(String str) {
                if (str != null) {
                    this.padding_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearPadding() {
                this.padding_ = ControlAsset.getDefaultInstance().getPadding();
                onChanged();
                return this;
            }

            public Builder setPaddingBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.padding_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getShadow() {
                Object obj = this.shadow_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.shadow_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getShadowBytes() {
                Object obj = this.shadow_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.shadow_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setShadow(String str) {
                if (str != null) {
                    this.shadow_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearShadow() {
                this.shadow_ = ControlAsset.getDefaultInstance().getShadow();
                onChanged();
                return this;
            }

            public Builder setShadowBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.shadow_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getStroke() {
                Object obj = this.stroke_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stroke_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getStrokeBytes() {
                Object obj = this.stroke_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stroke_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setStroke(String str) {
                if (str != null) {
                    this.stroke_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearStroke() {
                this.stroke_ = ControlAsset.getDefaultInstance().getStroke();
                onChanged();
                return this;
            }

            public Builder setStrokeBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.stroke_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public float getStrokeWidth() {
                return this.strokeWidth_;
            }

            public Builder setStrokeWidth(float f2) {
                this.strokeWidth_ = f2;
                onChanged();
                return this;
            }

            public Builder clearStrokeWidth() {
                this.strokeWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.style_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setStyle(String str) {
                if (str != null) {
                    this.style_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearStyle() {
                this.style_ = ControlAsset.getDefaultInstance().getStyle();
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.style_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean getVisible() {
                return this.visible_;
            }

            public Builder setVisible(boolean z) {
                this.visible_ = z;
                onChanged();
                return this;
            }

            public Builder clearVisible() {
                this.visible_ = false;
                onChanged();
                return this;
            }

            public int getWidth() {
                return this.width_;
            }

            public Builder setWidth(int i) {
                this.width_ = i;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            public String getX() {
                Object obj = this.x_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.x_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getXBytes() {
                Object obj = this.x_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.x_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setX(String str) {
                if (str != null) {
                    this.x_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearX() {
                this.x_ = ControlAsset.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder setXBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.x_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getY() {
                Object obj = this.y_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.y_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getYBytes() {
                Object obj = this.y_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.y_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setY(String str) {
                if (str != null) {
                    this.y_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearY() {
                this.y_ = ControlAsset.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            public Builder setYBytes(ByteString byteString) {
                if (byteString != null) {
                    ControlAsset.checkByteStringIsUtf8(byteString);
                    this.y_ = byteString;
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

        public static ControlAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ControlAsset> parser() {
            return PARSER;
        }

        public Parser<ControlAsset> getParserForType() {
            return PARSER;
        }

        public ControlAsset getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Deprecated
    public boolean getPreload() {
        return this.preload_;
    }

    @Deprecated
    public int getLoadSkipoffset() {
        return this.loadSkipoffset_;
    }

    public int getSkipoffset() {
        return this.skipoffset_;
    }

    public int getCompanionSkipoffset() {
        return this.companionSkipoffset_;
    }

    public boolean getUseNativeClose() {
        return this.useNativeClose_;
    }

    public boolean getR1() {
        return this.r1_;
    }

    public boolean getR2() {
        return this.r2_;
    }

    public int getR1Delay() {
        return this.r1Delay_;
    }

    public boolean hasCountdown() {
        return this.countdown_ != null;
    }

    public ControlAsset getCountdown() {
        ControlAsset controlAsset = this.countdown_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    public ControlAssetOrBuilder getCountdownOrBuilder() {
        return getCountdown();
    }

    public boolean hasCloseButton() {
        return this.closeButton_ != null;
    }

    public ControlAsset getCloseButton() {
        ControlAsset controlAsset = this.closeButton_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    public ControlAssetOrBuilder getCloseButtonOrBuilder() {
        return getCloseButton();
    }

    public boolean hasProgress() {
        return this.progress_ != null;
    }

    public ControlAsset getProgress() {
        ControlAsset controlAsset = this.progress_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    public ControlAssetOrBuilder getProgressOrBuilder() {
        return getProgress();
    }

    public int getProgressDuration() {
        return this.progressDuration_;
    }

    public boolean getIgnoresSafeAreaLayoutGuide() {
        return this.ignoresSafeAreaLayoutGuide_;
    }

    public String getStoreUrl() {
        Object obj = this.storeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storeUrl_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getStoreUrlBytes() {
        Object obj = this.storeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.storeUrl_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getViewabilityTimeThreshold() {
        return this.viewabilityTimeThreshold_;
    }

    public float getViewabilityPixelThreshold() {
        return this.viewabilityPixelThreshold_;
    }

    public float getViewabilityDurationThreshold() {
        return this.viewabilityDurationThreshold_;
    }

    public boolean getViewabilityIgnoreWindowFocus() {
        return this.viewabilityIgnoreWindowFocus_;
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

    private static final class CustomParamsDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_CustomParamsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

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

    public int getAdMarkupLoadingTimeout() {
        return this.adMarkupLoadingTimeout_;
    }

    public boolean getUseEmbeddedBrowser() {
        return this.useEmbeddedBrowser_;
    }

    public boolean getPreloadAd() {
        return this.preloadAd_;
    }

    public int getCreativeLoadingMethodValue() {
        return this.creativeLoadingMethod_;
    }

    public CreativeLoadingMethod getCreativeLoadingMethod() {
        CreativeLoadingMethod valueOf = CreativeLoadingMethod.valueOf(this.creativeLoadingMethod_);
        return valueOf == null ? CreativeLoadingMethod.UNRECOGNIZED : valueOf;
    }

    public float getPlaceholderTimeout() {
        return this.placeholderTimeout_;
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
        boolean z = this.preload_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        int i = this.loadSkipoffset_;
        if (i != 0) {
            codedOutputStream.writeUInt32(3, i);
        }
        int i2 = this.viewabilityTimeThreshold_;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(4, i2);
        }
        float f2 = this.viewabilityPixelThreshold_;
        if (f2 != 0.0f) {
            codedOutputStream.writeFloat(5, f2);
        }
        float f3 = this.viewabilityDurationThreshold_;
        if (f3 != 0.0f) {
            codedOutputStream.writeFloat(6, f3);
        }
        for (int i3 = 0; i3 < this.event_.size(); i3++) {
            codedOutputStream.writeMessage(7, this.event_.get(i3));
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 8);
        int i4 = this.skipoffset_;
        if (i4 != 0) {
            codedOutputStream.writeUInt32(9, i4);
        }
        int i5 = this.companionSkipoffset_;
        if (i5 != 0) {
            codedOutputStream.writeUInt32(10, i5);
        }
        boolean z2 = this.useNativeClose_;
        if (z2) {
            codedOutputStream.writeBool(11, z2);
        }
        boolean z3 = this.r1_;
        if (z3) {
            codedOutputStream.writeBool(12, z3);
        }
        boolean z4 = this.r2_;
        if (z4) {
            codedOutputStream.writeBool(13, z4);
        }
        if (this.countdown_ != null) {
            codedOutputStream.writeMessage(14, getCountdown());
        }
        if (this.closeButton_ != null) {
            codedOutputStream.writeMessage(15, getCloseButton());
        }
        boolean z5 = this.ignoresSafeAreaLayoutGuide_;
        if (z5) {
            codedOutputStream.writeBool(16, z5);
        }
        if (!getStoreUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 17, this.storeUrl_);
        }
        if (this.progress_ != null) {
            codedOutputStream.writeMessage(18, getProgress());
        }
        int i6 = this.progressDuration_;
        if (i6 != 0) {
            codedOutputStream.writeUInt32(19, i6);
        }
        boolean z6 = this.viewabilityIgnoreWindowFocus_;
        if (z6) {
            codedOutputStream.writeBool(20, z6);
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            codedOutputStream.writeEnum(21, this.adCacheControl_);
        }
        int i7 = this.adCacheMaxAge_;
        if (i7 != 0) {
            codedOutputStream.writeUInt32(22, i7);
        }
        int i8 = this.r1Delay_;
        if (i8 != 0) {
            codedOutputStream.writeUInt32(23, i8);
        }
        int i9 = this.adMarkupLoadingTimeout_;
        if (i9 != 0) {
            codedOutputStream.writeUInt32(24, i9);
        }
        boolean z7 = this.useEmbeddedBrowser_;
        if (z7) {
            codedOutputStream.writeBool(25, z7);
        }
        boolean z8 = this.preloadAd_;
        if (z8) {
            codedOutputStream.writeBool(26, z8);
        }
        if (this.creativeLoadingMethod_ != CreativeLoadingMethod.FullLoad.getNumber()) {
            codedOutputStream.writeEnum(27, this.creativeLoadingMethod_);
        }
        float f4 = this.placeholderTimeout_;
        if (f4 != 0.0f) {
            codedOutputStream.writeFloat(28, f4);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        boolean z = this.preload_;
        int computeBoolSize = z ? CodedOutputStream.computeBoolSize(2, z) + 0 : 0;
        int i2 = this.loadSkipoffset_;
        if (i2 != 0) {
            computeBoolSize += CodedOutputStream.computeUInt32Size(3, i2);
        }
        int i3 = this.viewabilityTimeThreshold_;
        if (i3 != 0) {
            computeBoolSize += CodedOutputStream.computeUInt32Size(4, i3);
        }
        float f2 = this.viewabilityPixelThreshold_;
        if (f2 != 0.0f) {
            computeBoolSize += CodedOutputStream.computeFloatSize(5, f2);
        }
        float f3 = this.viewabilityDurationThreshold_;
        if (f3 != 0.0f) {
            computeBoolSize += CodedOutputStream.computeFloatSize(6, f3);
        }
        for (int i4 = 0; i4 < this.event_.size(); i4++) {
            computeBoolSize += CodedOutputStream.computeMessageSize(7, this.event_.get(i4));
        }
        for (Map.Entry next : internalGetCustomParams().getMap().entrySet()) {
            computeBoolSize += CodedOutputStream.computeMessageSize(8, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
        }
        int i5 = this.skipoffset_;
        if (i5 != 0) {
            computeBoolSize += CodedOutputStream.computeUInt32Size(9, i5);
        }
        int i6 = this.companionSkipoffset_;
        if (i6 != 0) {
            computeBoolSize += CodedOutputStream.computeUInt32Size(10, i6);
        }
        boolean z2 = this.useNativeClose_;
        if (z2) {
            computeBoolSize += CodedOutputStream.computeBoolSize(11, z2);
        }
        boolean z3 = this.r1_;
        if (z3) {
            computeBoolSize += CodedOutputStream.computeBoolSize(12, z3);
        }
        boolean z4 = this.r2_;
        if (z4) {
            computeBoolSize += CodedOutputStream.computeBoolSize(13, z4);
        }
        if (this.countdown_ != null) {
            computeBoolSize += CodedOutputStream.computeMessageSize(14, getCountdown());
        }
        if (this.closeButton_ != null) {
            computeBoolSize += CodedOutputStream.computeMessageSize(15, getCloseButton());
        }
        boolean z5 = this.ignoresSafeAreaLayoutGuide_;
        if (z5) {
            computeBoolSize += CodedOutputStream.computeBoolSize(16, z5);
        }
        if (!getStoreUrlBytes().isEmpty()) {
            computeBoolSize += GeneratedMessageV3.computeStringSize(17, this.storeUrl_);
        }
        if (this.progress_ != null) {
            computeBoolSize += CodedOutputStream.computeMessageSize(18, getProgress());
        }
        int i7 = this.progressDuration_;
        if (i7 != 0) {
            computeBoolSize += CodedOutputStream.computeUInt32Size(19, i7);
        }
        boolean z6 = this.viewabilityIgnoreWindowFocus_;
        if (z6) {
            computeBoolSize += CodedOutputStream.computeBoolSize(20, z6);
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            computeBoolSize += CodedOutputStream.computeEnumSize(21, this.adCacheControl_);
        }
        int i8 = this.adCacheMaxAge_;
        if (i8 != 0) {
            computeBoolSize += CodedOutputStream.computeUInt32Size(22, i8);
        }
        int i9 = this.r1Delay_;
        if (i9 != 0) {
            computeBoolSize += CodedOutputStream.computeUInt32Size(23, i9);
        }
        int i10 = this.adMarkupLoadingTimeout_;
        if (i10 != 0) {
            computeBoolSize += CodedOutputStream.computeUInt32Size(24, i10);
        }
        boolean z7 = this.useEmbeddedBrowser_;
        if (z7) {
            computeBoolSize += CodedOutputStream.computeBoolSize(25, z7);
        }
        boolean z8 = this.preloadAd_;
        if (z8) {
            computeBoolSize += CodedOutputStream.computeBoolSize(26, z8);
        }
        if (this.creativeLoadingMethod_ != CreativeLoadingMethod.FullLoad.getNumber()) {
            computeBoolSize += CodedOutputStream.computeEnumSize(27, this.creativeLoadingMethod_);
        }
        float f4 = this.placeholderTimeout_;
        if (f4 != 0.0f) {
            computeBoolSize += CodedOutputStream.computeFloatSize(28, f4);
        }
        int serializedSize = computeBoolSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdExtension)) {
            return super.equals(obj);
        }
        AdExtension adExtension = (AdExtension) obj;
        if (getPreload() != adExtension.getPreload() || getLoadSkipoffset() != adExtension.getLoadSkipoffset() || getSkipoffset() != adExtension.getSkipoffset() || getCompanionSkipoffset() != adExtension.getCompanionSkipoffset() || getUseNativeClose() != adExtension.getUseNativeClose() || getR1() != adExtension.getR1() || getR2() != adExtension.getR2() || getR1Delay() != adExtension.getR1Delay() || hasCountdown() != adExtension.hasCountdown()) {
            return false;
        }
        if ((hasCountdown() && !getCountdown().equals(adExtension.getCountdown())) || hasCloseButton() != adExtension.hasCloseButton()) {
            return false;
        }
        if ((hasCloseButton() && !getCloseButton().equals(adExtension.getCloseButton())) || hasProgress() != adExtension.hasProgress()) {
            return false;
        }
        if ((!hasProgress() || getProgress().equals(adExtension.getProgress())) && getProgressDuration() == adExtension.getProgressDuration() && getIgnoresSafeAreaLayoutGuide() == adExtension.getIgnoresSafeAreaLayoutGuide() && getStoreUrl().equals(adExtension.getStoreUrl()) && getViewabilityTimeThreshold() == adExtension.getViewabilityTimeThreshold() && Float.floatToIntBits(getViewabilityPixelThreshold()) == Float.floatToIntBits(adExtension.getViewabilityPixelThreshold()) && Float.floatToIntBits(getViewabilityDurationThreshold()) == Float.floatToIntBits(adExtension.getViewabilityDurationThreshold()) && getViewabilityIgnoreWindowFocus() == adExtension.getViewabilityIgnoreWindowFocus() && getEventList().equals(adExtension.getEventList()) && internalGetCustomParams().equals(adExtension.internalGetCustomParams()) && this.adCacheControl_ == adExtension.adCacheControl_ && getAdCacheMaxAge() == adExtension.getAdCacheMaxAge() && getAdMarkupLoadingTimeout() == adExtension.getAdMarkupLoadingTimeout() && getUseEmbeddedBrowser() == adExtension.getUseEmbeddedBrowser() && getPreloadAd() == adExtension.getPreloadAd() && this.creativeLoadingMethod_ == adExtension.creativeLoadingMethod_ && Float.floatToIntBits(getPlaceholderTimeout()) == Float.floatToIntBits(adExtension.getPlaceholderTimeout()) && this.unknownFields.equals(adExtension.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 2) * 53) + Internal.hashBoolean(getPreload())) * 37) + 3) * 53) + getLoadSkipoffset()) * 37) + 9) * 53) + getSkipoffset()) * 37) + 10) * 53) + getCompanionSkipoffset()) * 37) + 11) * 53) + Internal.hashBoolean(getUseNativeClose())) * 37) + 12) * 53) + Internal.hashBoolean(getR1())) * 37) + 13) * 53) + Internal.hashBoolean(getR2())) * 37) + 23) * 53) + getR1Delay();
        if (hasCountdown()) {
            hashCode = (((hashCode * 37) + 14) * 53) + getCountdown().hashCode();
        }
        if (hasCloseButton()) {
            hashCode = (((hashCode * 37) + 15) * 53) + getCloseButton().hashCode();
        }
        if (hasProgress()) {
            hashCode = (((hashCode * 37) + 18) * 53) + getProgress().hashCode();
        }
        int progressDuration = (((((((((((((((((((((((((((hashCode * 37) + 19) * 53) + getProgressDuration()) * 37) + 16) * 53) + Internal.hashBoolean(getIgnoresSafeAreaLayoutGuide())) * 37) + 17) * 53) + getStoreUrl().hashCode()) * 37) + 4) * 53) + getViewabilityTimeThreshold()) * 37) + 5) * 53) + Float.floatToIntBits(getViewabilityPixelThreshold())) * 37) + 6) * 53) + Float.floatToIntBits(getViewabilityDurationThreshold())) * 37) + 20) * 53) + Internal.hashBoolean(getViewabilityIgnoreWindowFocus());
        if (getEventCount() > 0) {
            progressDuration = (((progressDuration * 37) + 7) * 53) + getEventList().hashCode();
        }
        if (!internalGetCustomParams().getMap().isEmpty()) {
            progressDuration = (((progressDuration * 37) + 8) * 53) + internalGetCustomParams().hashCode();
        }
        int adCacheMaxAge = (((((((((((((((((((((((((((((progressDuration * 37) + 21) * 53) + this.adCacheControl_) * 37) + 22) * 53) + getAdCacheMaxAge()) * 37) + 24) * 53) + getAdMarkupLoadingTimeout()) * 37) + 25) * 53) + Internal.hashBoolean(getUseEmbeddedBrowser())) * 37) + 26) * 53) + Internal.hashBoolean(getPreloadAd())) * 37) + 27) * 53) + this.creativeLoadingMethod_) * 37) + 28) * 53) + Float.floatToIntBits(getPlaceholderTimeout())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = adCacheMaxAge;
        return adCacheMaxAge;
    }

    public static AdExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AdExtension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AdExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AdExtension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AdExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AdExtension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AdExtension parseFrom(InputStream inputStream) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AdExtension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdExtension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdExtension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AdExtension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AdExtension adExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adExtension);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdExtensionOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private int adMarkupLoadingTimeout_;
        private int bitField0_;
        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> closeButtonBuilder_;
        private ControlAsset closeButton_;
        private int companionSkipoffset_;
        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> countdownBuilder_;
        private ControlAsset countdown_;
        private int creativeLoadingMethod_;
        private MapField<String, String> customParams_;
        private RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> eventBuilder_;
        private List<Ad.Event> event_;
        private boolean ignoresSafeAreaLayoutGuide_;
        private int loadSkipoffset_;
        private float placeholderTimeout_;
        private boolean preloadAd_;
        private boolean preload_;
        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> progressBuilder_;
        private int progressDuration_;
        private ControlAsset progress_;
        private int r1Delay_;
        private boolean r1_;
        private boolean r2_;
        private int skipoffset_;
        private Object storeUrl_;
        private boolean useEmbeddedBrowser_;
        private boolean useNativeClose_;
        private float viewabilityDurationThreshold_;
        private boolean viewabilityIgnoreWindowFocus_;
        private float viewabilityPixelThreshold_;
        private int viewabilityTimeThreshold_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 8) {
                return internalGetCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMutableMapField(int i) {
            if (i == 8) {
                return internalGetMutableCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(AdExtension.class, Builder.class);
        }

        private Builder() {
            this.storeUrl_ = "";
            this.event_ = Collections.emptyList();
            this.adCacheControl_ = 0;
            this.creativeLoadingMethod_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.storeUrl_ = "";
            this.event_ = Collections.emptyList();
            this.adCacheControl_ = 0;
            this.creativeLoadingMethod_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (AdExtension.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.preload_ = false;
            this.loadSkipoffset_ = 0;
            this.skipoffset_ = 0;
            this.companionSkipoffset_ = 0;
            this.useNativeClose_ = false;
            this.r1_ = false;
            this.r2_ = false;
            this.r1Delay_ = 0;
            if (this.countdownBuilder_ == null) {
                this.countdown_ = null;
            } else {
                this.countdown_ = null;
                this.countdownBuilder_ = null;
            }
            if (this.closeButtonBuilder_ == null) {
                this.closeButton_ = null;
            } else {
                this.closeButton_ = null;
                this.closeButtonBuilder_ = null;
            }
            if (this.progressBuilder_ == null) {
                this.progress_ = null;
            } else {
                this.progress_ = null;
                this.progressBuilder_ = null;
            }
            this.progressDuration_ = 0;
            this.ignoresSafeAreaLayoutGuide_ = false;
            this.storeUrl_ = "";
            this.viewabilityTimeThreshold_ = 0;
            this.viewabilityPixelThreshold_ = 0.0f;
            this.viewabilityDurationThreshold_ = 0.0f;
            this.viewabilityIgnoreWindowFocus_ = false;
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            internalGetMutableCustomParams().clear();
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            this.adMarkupLoadingTimeout_ = 0;
            this.useEmbeddedBrowser_ = false;
            this.preloadAd_ = false;
            this.creativeLoadingMethod_ = 0;
            this.placeholderTimeout_ = 0.0f;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
        }

        public AdExtension getDefaultInstanceForType() {
            return AdExtension.getDefaultInstance();
        }

        public AdExtension build() {
            AdExtension buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public AdExtension buildPartial() {
            AdExtension adExtension = new AdExtension((GeneratedMessageV3.Builder) this);
            boolean unused = adExtension.preload_ = this.preload_;
            int unused2 = adExtension.loadSkipoffset_ = this.loadSkipoffset_;
            int unused3 = adExtension.skipoffset_ = this.skipoffset_;
            int unused4 = adExtension.companionSkipoffset_ = this.companionSkipoffset_;
            boolean unused5 = adExtension.useNativeClose_ = this.useNativeClose_;
            boolean unused6 = adExtension.r1_ = this.r1_;
            boolean unused7 = adExtension.r2_ = this.r2_;
            int unused8 = adExtension.r1Delay_ = this.r1Delay_;
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 == null) {
                ControlAsset unused9 = adExtension.countdown_ = this.countdown_;
            } else {
                ControlAsset unused10 = adExtension.countdown_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV32 = this.closeButtonBuilder_;
            if (singleFieldBuilderV32 == null) {
                ControlAsset unused11 = adExtension.closeButton_ = this.closeButton_;
            } else {
                ControlAsset unused12 = adExtension.closeButton_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV33 = this.progressBuilder_;
            if (singleFieldBuilderV33 == null) {
                ControlAsset unused13 = adExtension.progress_ = this.progress_;
            } else {
                ControlAsset unused14 = adExtension.progress_ = singleFieldBuilderV33.build();
            }
            int unused15 = adExtension.progressDuration_ = this.progressDuration_;
            boolean unused16 = adExtension.ignoresSafeAreaLayoutGuide_ = this.ignoresSafeAreaLayoutGuide_;
            Object unused17 = adExtension.storeUrl_ = this.storeUrl_;
            int unused18 = adExtension.viewabilityTimeThreshold_ = this.viewabilityTimeThreshold_;
            float unused19 = adExtension.viewabilityPixelThreshold_ = this.viewabilityPixelThreshold_;
            float unused20 = adExtension.viewabilityDurationThreshold_ = this.viewabilityDurationThreshold_;
            boolean unused21 = adExtension.viewabilityIgnoreWindowFocus_ = this.viewabilityIgnoreWindowFocus_;
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                List unused22 = adExtension.event_ = this.event_;
            } else {
                List unused23 = adExtension.event_ = repeatedFieldBuilderV3.build();
            }
            MapField unused24 = adExtension.customParams_ = internalGetCustomParams();
            adExtension.customParams_.makeImmutable();
            int unused25 = adExtension.adCacheControl_ = this.adCacheControl_;
            int unused26 = adExtension.adCacheMaxAge_ = this.adCacheMaxAge_;
            int unused27 = adExtension.adMarkupLoadingTimeout_ = this.adMarkupLoadingTimeout_;
            boolean unused28 = adExtension.useEmbeddedBrowser_ = this.useEmbeddedBrowser_;
            boolean unused29 = adExtension.preloadAd_ = this.preloadAd_;
            int unused30 = adExtension.creativeLoadingMethod_ = this.creativeLoadingMethod_;
            float unused31 = adExtension.placeholderTimeout_ = this.placeholderTimeout_;
            onBuilt();
            return adExtension;
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
            if (message instanceof AdExtension) {
                return mergeFrom((AdExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AdExtension adExtension) {
            if (adExtension == AdExtension.getDefaultInstance()) {
                return this;
            }
            if (adExtension.getPreload()) {
                setPreload(adExtension.getPreload());
            }
            if (adExtension.getLoadSkipoffset() != 0) {
                setLoadSkipoffset(adExtension.getLoadSkipoffset());
            }
            if (adExtension.getSkipoffset() != 0) {
                setSkipoffset(adExtension.getSkipoffset());
            }
            if (adExtension.getCompanionSkipoffset() != 0) {
                setCompanionSkipoffset(adExtension.getCompanionSkipoffset());
            }
            if (adExtension.getUseNativeClose()) {
                setUseNativeClose(adExtension.getUseNativeClose());
            }
            if (adExtension.getR1()) {
                setR1(adExtension.getR1());
            }
            if (adExtension.getR2()) {
                setR2(adExtension.getR2());
            }
            if (adExtension.getR1Delay() != 0) {
                setR1Delay(adExtension.getR1Delay());
            }
            if (adExtension.hasCountdown()) {
                mergeCountdown(adExtension.getCountdown());
            }
            if (adExtension.hasCloseButton()) {
                mergeCloseButton(adExtension.getCloseButton());
            }
            if (adExtension.hasProgress()) {
                mergeProgress(adExtension.getProgress());
            }
            if (adExtension.getProgressDuration() != 0) {
                setProgressDuration(adExtension.getProgressDuration());
            }
            if (adExtension.getIgnoresSafeAreaLayoutGuide()) {
                setIgnoresSafeAreaLayoutGuide(adExtension.getIgnoresSafeAreaLayoutGuide());
            }
            if (!adExtension.getStoreUrl().isEmpty()) {
                this.storeUrl_ = adExtension.storeUrl_;
                onChanged();
            }
            if (adExtension.getViewabilityTimeThreshold() != 0) {
                setViewabilityTimeThreshold(adExtension.getViewabilityTimeThreshold());
            }
            if (adExtension.getViewabilityPixelThreshold() != 0.0f) {
                setViewabilityPixelThreshold(adExtension.getViewabilityPixelThreshold());
            }
            if (adExtension.getViewabilityDurationThreshold() != 0.0f) {
                setViewabilityDurationThreshold(adExtension.getViewabilityDurationThreshold());
            }
            if (adExtension.getViewabilityIgnoreWindowFocus()) {
                setViewabilityIgnoreWindowFocus(adExtension.getViewabilityIgnoreWindowFocus());
            }
            if (this.eventBuilder_ == null) {
                if (!adExtension.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = adExtension.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(adExtension.event_);
                    }
                    onChanged();
                }
            } else if (!adExtension.event_.isEmpty()) {
                if (this.eventBuilder_.isEmpty()) {
                    this.eventBuilder_.dispose();
                    RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = null;
                    this.eventBuilder_ = null;
                    this.event_ = adExtension.event_;
                    this.bitField0_ &= -2;
                    if (AdExtension.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getEventFieldBuilder();
                    }
                    this.eventBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.eventBuilder_.addAllMessages(adExtension.event_);
                }
            }
            internalGetMutableCustomParams().mergeFrom(adExtension.internalGetCustomParams());
            if (adExtension.adCacheControl_ != 0) {
                setAdCacheControlValue(adExtension.getAdCacheControlValue());
            }
            if (adExtension.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(adExtension.getAdCacheMaxAge());
            }
            if (adExtension.getAdMarkupLoadingTimeout() != 0) {
                setAdMarkupLoadingTimeout(adExtension.getAdMarkupLoadingTimeout());
            }
            if (adExtension.getUseEmbeddedBrowser()) {
                setUseEmbeddedBrowser(adExtension.getUseEmbeddedBrowser());
            }
            if (adExtension.getPreloadAd()) {
                setPreloadAd(adExtension.getPreloadAd());
            }
            if (adExtension.creativeLoadingMethod_ != 0) {
                setCreativeLoadingMethodValue(adExtension.getCreativeLoadingMethodValue());
            }
            if (adExtension.getPlaceholderTimeout() != 0.0f) {
                setPlaceholderTimeout(adExtension.getPlaceholderTimeout());
            }
            mergeUnknownFields(adExtension.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.AdExtension.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.AdExtension.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.AdExtension r3 = (io.bidmachine.protobuf.AdExtension) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.AdExtension) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.AdExtension r4 = (io.bidmachine.protobuf.AdExtension) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.AdExtension) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdExtension.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.AdExtension$Builder");
        }

        @Deprecated
        public boolean getPreload() {
            return this.preload_;
        }

        @Deprecated
        public Builder setPreload(boolean z) {
            this.preload_ = z;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearPreload() {
            this.preload_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public int getLoadSkipoffset() {
            return this.loadSkipoffset_;
        }

        @Deprecated
        public Builder setLoadSkipoffset(int i) {
            this.loadSkipoffset_ = i;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearLoadSkipoffset() {
            this.loadSkipoffset_ = 0;
            onChanged();
            return this;
        }

        public int getSkipoffset() {
            return this.skipoffset_;
        }

        public Builder setSkipoffset(int i) {
            this.skipoffset_ = i;
            onChanged();
            return this;
        }

        public Builder clearSkipoffset() {
            this.skipoffset_ = 0;
            onChanged();
            return this;
        }

        public int getCompanionSkipoffset() {
            return this.companionSkipoffset_;
        }

        public Builder setCompanionSkipoffset(int i) {
            this.companionSkipoffset_ = i;
            onChanged();
            return this;
        }

        public Builder clearCompanionSkipoffset() {
            this.companionSkipoffset_ = 0;
            onChanged();
            return this;
        }

        public boolean getUseNativeClose() {
            return this.useNativeClose_;
        }

        public Builder setUseNativeClose(boolean z) {
            this.useNativeClose_ = z;
            onChanged();
            return this;
        }

        public Builder clearUseNativeClose() {
            this.useNativeClose_ = false;
            onChanged();
            return this;
        }

        public boolean getR1() {
            return this.r1_;
        }

        public Builder setR1(boolean z) {
            this.r1_ = z;
            onChanged();
            return this;
        }

        public Builder clearR1() {
            this.r1_ = false;
            onChanged();
            return this;
        }

        public boolean getR2() {
            return this.r2_;
        }

        public Builder setR2(boolean z) {
            this.r2_ = z;
            onChanged();
            return this;
        }

        public Builder clearR2() {
            this.r2_ = false;
            onChanged();
            return this;
        }

        public int getR1Delay() {
            return this.r1Delay_;
        }

        public Builder setR1Delay(int i) {
            this.r1Delay_ = i;
            onChanged();
            return this;
        }

        public Builder clearR1Delay() {
            this.r1Delay_ = 0;
            onChanged();
            return this;
        }

        public boolean hasCountdown() {
            return (this.countdownBuilder_ == null && this.countdown_ == null) ? false : true;
        }

        public ControlAsset getCountdown() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            ControlAsset controlAsset = this.countdown_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public Builder setCountdown(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(controlAsset);
            } else if (controlAsset != null) {
                this.countdown_ = controlAsset;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setCountdown(ControlAsset.Builder builder) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.countdown_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCountdown(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 == null) {
                ControlAsset controlAsset2 = this.countdown_;
                if (controlAsset2 != null) {
                    this.countdown_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.countdown_ = controlAsset;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(controlAsset);
            }
            return this;
        }

        public Builder clearCountdown() {
            if (this.countdownBuilder_ == null) {
                this.countdown_ = null;
                onChanged();
            } else {
                this.countdown_ = null;
                this.countdownBuilder_ = null;
            }
            return this;
        }

        public ControlAsset.Builder getCountdownBuilder() {
            onChanged();
            return getCountdownFieldBuilder().getBuilder();
        }

        public ControlAssetOrBuilder getCountdownOrBuilder() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            ControlAsset controlAsset = this.countdown_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getCountdownFieldBuilder() {
            if (this.countdownBuilder_ == null) {
                this.countdownBuilder_ = new SingleFieldBuilderV3<>(getCountdown(), getParentForChildren(), isClean());
                this.countdown_ = null;
            }
            return this.countdownBuilder_;
        }

        public boolean hasCloseButton() {
            return (this.closeButtonBuilder_ == null && this.closeButton_ == null) ? false : true;
        }

        public ControlAsset getCloseButton() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            ControlAsset controlAsset = this.closeButton_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public Builder setCloseButton(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(controlAsset);
            } else if (controlAsset != null) {
                this.closeButton_ = controlAsset;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setCloseButton(ControlAsset.Builder builder) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.closeButton_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCloseButton(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 == null) {
                ControlAsset controlAsset2 = this.closeButton_;
                if (controlAsset2 != null) {
                    this.closeButton_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.closeButton_ = controlAsset;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(controlAsset);
            }
            return this;
        }

        public Builder clearCloseButton() {
            if (this.closeButtonBuilder_ == null) {
                this.closeButton_ = null;
                onChanged();
            } else {
                this.closeButton_ = null;
                this.closeButtonBuilder_ = null;
            }
            return this;
        }

        public ControlAsset.Builder getCloseButtonBuilder() {
            onChanged();
            return getCloseButtonFieldBuilder().getBuilder();
        }

        public ControlAssetOrBuilder getCloseButtonOrBuilder() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            ControlAsset controlAsset = this.closeButton_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getCloseButtonFieldBuilder() {
            if (this.closeButtonBuilder_ == null) {
                this.closeButtonBuilder_ = new SingleFieldBuilderV3<>(getCloseButton(), getParentForChildren(), isClean());
                this.closeButton_ = null;
            }
            return this.closeButtonBuilder_;
        }

        public boolean hasProgress() {
            return (this.progressBuilder_ == null && this.progress_ == null) ? false : true;
        }

        public ControlAsset getProgress() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            ControlAsset controlAsset = this.progress_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public Builder setProgress(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(controlAsset);
            } else if (controlAsset != null) {
                this.progress_ = controlAsset;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setProgress(ControlAsset.Builder builder) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.progress_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeProgress(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 == null) {
                ControlAsset controlAsset2 = this.progress_;
                if (controlAsset2 != null) {
                    this.progress_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.progress_ = controlAsset;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(controlAsset);
            }
            return this;
        }

        public Builder clearProgress() {
            if (this.progressBuilder_ == null) {
                this.progress_ = null;
                onChanged();
            } else {
                this.progress_ = null;
                this.progressBuilder_ = null;
            }
            return this;
        }

        public ControlAsset.Builder getProgressBuilder() {
            onChanged();
            return getProgressFieldBuilder().getBuilder();
        }

        public ControlAssetOrBuilder getProgressOrBuilder() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            ControlAsset controlAsset = this.progress_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getProgressFieldBuilder() {
            if (this.progressBuilder_ == null) {
                this.progressBuilder_ = new SingleFieldBuilderV3<>(getProgress(), getParentForChildren(), isClean());
                this.progress_ = null;
            }
            return this.progressBuilder_;
        }

        public int getProgressDuration() {
            return this.progressDuration_;
        }

        public Builder setProgressDuration(int i) {
            this.progressDuration_ = i;
            onChanged();
            return this;
        }

        public Builder clearProgressDuration() {
            this.progressDuration_ = 0;
            onChanged();
            return this;
        }

        public boolean getIgnoresSafeAreaLayoutGuide() {
            return this.ignoresSafeAreaLayoutGuide_;
        }

        public Builder setIgnoresSafeAreaLayoutGuide(boolean z) {
            this.ignoresSafeAreaLayoutGuide_ = z;
            onChanged();
            return this;
        }

        public Builder clearIgnoresSafeAreaLayoutGuide() {
            this.ignoresSafeAreaLayoutGuide_ = false;
            onChanged();
            return this;
        }

        public String getStoreUrl() {
            Object obj = this.storeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeUrl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getStoreUrlBytes() {
            Object obj = this.storeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeUrl_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setStoreUrl(String str) {
            if (str != null) {
                this.storeUrl_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearStoreUrl() {
            this.storeUrl_ = AdExtension.getDefaultInstance().getStoreUrl();
            onChanged();
            return this;
        }

        public Builder setStoreUrlBytes(ByteString byteString) {
            if (byteString != null) {
                AdExtension.checkByteStringIsUtf8(byteString);
                this.storeUrl_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public int getViewabilityTimeThreshold() {
            return this.viewabilityTimeThreshold_;
        }

        public Builder setViewabilityTimeThreshold(int i) {
            this.viewabilityTimeThreshold_ = i;
            onChanged();
            return this;
        }

        public Builder clearViewabilityTimeThreshold() {
            this.viewabilityTimeThreshold_ = 0;
            onChanged();
            return this;
        }

        public float getViewabilityPixelThreshold() {
            return this.viewabilityPixelThreshold_;
        }

        public Builder setViewabilityPixelThreshold(float f2) {
            this.viewabilityPixelThreshold_ = f2;
            onChanged();
            return this;
        }

        public Builder clearViewabilityPixelThreshold() {
            this.viewabilityPixelThreshold_ = 0.0f;
            onChanged();
            return this;
        }

        public float getViewabilityDurationThreshold() {
            return this.viewabilityDurationThreshold_;
        }

        public Builder setViewabilityDurationThreshold(float f2) {
            this.viewabilityDurationThreshold_ = f2;
            onChanged();
            return this;
        }

        public Builder clearViewabilityDurationThreshold() {
            this.viewabilityDurationThreshold_ = 0.0f;
            onChanged();
            return this;
        }

        public boolean getViewabilityIgnoreWindowFocus() {
            return this.viewabilityIgnoreWindowFocus_;
        }

        public Builder setViewabilityIgnoreWindowFocus(boolean z) {
            this.viewabilityIgnoreWindowFocus_ = z;
            onChanged();
            return this;
        }

        public Builder clearViewabilityIgnoreWindowFocus() {
            this.viewabilityIgnoreWindowFocus_ = false;
            onChanged();
            return this;
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

        public int getAdMarkupLoadingTimeout() {
            return this.adMarkupLoadingTimeout_;
        }

        public Builder setAdMarkupLoadingTimeout(int i) {
            this.adMarkupLoadingTimeout_ = i;
            onChanged();
            return this;
        }

        public Builder clearAdMarkupLoadingTimeout() {
            this.adMarkupLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public boolean getUseEmbeddedBrowser() {
            return this.useEmbeddedBrowser_;
        }

        public Builder setUseEmbeddedBrowser(boolean z) {
            this.useEmbeddedBrowser_ = z;
            onChanged();
            return this;
        }

        public Builder clearUseEmbeddedBrowser() {
            this.useEmbeddedBrowser_ = false;
            onChanged();
            return this;
        }

        public boolean getPreloadAd() {
            return this.preloadAd_;
        }

        public Builder setPreloadAd(boolean z) {
            this.preloadAd_ = z;
            onChanged();
            return this;
        }

        public Builder clearPreloadAd() {
            this.preloadAd_ = false;
            onChanged();
            return this;
        }

        public int getCreativeLoadingMethodValue() {
            return this.creativeLoadingMethod_;
        }

        public Builder setCreativeLoadingMethodValue(int i) {
            this.creativeLoadingMethod_ = i;
            onChanged();
            return this;
        }

        public CreativeLoadingMethod getCreativeLoadingMethod() {
            CreativeLoadingMethod valueOf = CreativeLoadingMethod.valueOf(this.creativeLoadingMethod_);
            return valueOf == null ? CreativeLoadingMethod.UNRECOGNIZED : valueOf;
        }

        public Builder setCreativeLoadingMethod(CreativeLoadingMethod creativeLoadingMethod) {
            if (creativeLoadingMethod != null) {
                this.creativeLoadingMethod_ = creativeLoadingMethod.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearCreativeLoadingMethod() {
            this.creativeLoadingMethod_ = 0;
            onChanged();
            return this;
        }

        public float getPlaceholderTimeout() {
            return this.placeholderTimeout_;
        }

        public Builder setPlaceholderTimeout(float f2) {
            this.placeholderTimeout_ = f2;
            onChanged();
            return this;
        }

        public Builder clearPlaceholderTimeout() {
            this.placeholderTimeout_ = 0.0f;
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

    public static AdExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AdExtension> parser() {
        return PARSER;
    }

    public Parser<AdExtension> getParserForType() {
        return PARSER;
    }

    public AdExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
