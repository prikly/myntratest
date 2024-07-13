package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import ms.bd.o.Pgl.c;

public class ExifInterface {
    static final Charset ASCII;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final ExifTag[] EXIF_POINTER_TAGS = {new ExifTag("SubIFDPointer", c.COLLECT_MODE_TIKTOKLITE, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
    static final ExifTag[][] EXIF_TAGS;
    private static final List<Integer> FLIPPED_ROTATION_ORDER = Arrays.asList(new Integer[]{2, 7, 4, 5});
    static final byte[] IDENTIFIER_EXIF_APP1;
    private static final ExifTag[] IFD_EXIF_TAGS = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    private static final ExifTag[] IFD_GPS_TAGS = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3)};
    private static final ExifTag[] IFD_INTEROPERABILITY_TAGS = {new ExifTag("InteroperabilityIndex", 1, 2)};
    private static final ExifTag[] IFD_THUMBNAIL_TAGS = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new ExifTag("ThumbnailImageWidth", 256, 3, 4), new ExifTag("ThumbnailImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", c.COLLECT_MODE_TIKTOKLITE, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
    private static final ExifTag[] IFD_TIFF_TAGS = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", IronSourceConstants.OFFERWALL_OPENED, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", c.COLLECT_MODE_TIKTOKLITE, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7)};
    private static final ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = new ExifTag("JPEGInterchangeFormatLength", IronSourceConstants.INIT_COMPLETE, 4);
    private static final ExifTag JPEG_INTERCHANGE_FORMAT_TAG = new ExifTag("JPEGInterchangeFormat", 513, 4);
    static final byte[] JPEG_SIGNATURE = {-1, -40, -1};
    private static final ExifTag[] ORF_CAMERA_SETTINGS_TAGS = {new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)};
    private static final ExifTag[] ORF_IMAGE_PROCESSING_TAGS = {new ExifTag("AspectFrame", 4371, 3)};
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = {79, 76, 89, 77, 80, 0};
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final ExifTag[] ORF_MAKER_NOTE_TAGS = {new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)};
    private static final ExifTag[] PEF_TAGS;
    private static final List<Integer> ROTATION_ORDER = Arrays.asList(new Integer[]{1, 6, 3, 8});
    private static final ExifTag TAG_RAF_IMAGE_SIZE = new ExifTag("StripOffsets", 273, 3);
    private static final HashMap<Integer, Integer> sExifPointerTagMap = new HashMap<>();
    private static final HashMap<Integer, ExifTag>[] sExifTagMapsForReading;
    private static final HashMap<String, ExifTag>[] sExifTagMapsForWriting;
    private static SimpleDateFormat sFormatter;
    private static final Pattern sGpsTimestampPattern = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    private static final Pattern sNonZeroTimePattern = Pattern.compile(".*[1-9].*");
    private static final HashSet<String> sTagSetForCompatibility = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private final AssetManager.AssetInputStream mAssetInputStream;
    private final HashMap<String, ExifAttribute>[] mAttributes = new HashMap[EXIF_TAGS.length];
    private Set<Integer> mAttributesOffsets = new HashSet(EXIF_TAGS.length);
    private ByteOrder mExifByteOrder = ByteOrder.BIG_ENDIAN;
    private int mExifOffset;
    private final String mFilename;
    private boolean mHasThumbnail;
    private boolean mIsSupportedFile;
    private int mMimeType;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private int mRw2JpgFromRawOffset;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;

    static {
        ExifTag[] exifTagArr = {new ExifTag("ColorSpace", 55, 3)};
        PEF_TAGS = exifTagArr;
        ExifTag[] exifTagArr2 = IFD_TIFF_TAGS;
        EXIF_TAGS = new ExifTag[][]{exifTagArr2, IFD_EXIF_TAGS, IFD_GPS_TAGS, IFD_INTEROPERABILITY_TAGS, IFD_THUMBNAIL_TAGS, exifTagArr2, ORF_MAKER_NOTE_TAGS, ORF_CAMERA_SETTINGS_TAGS, ORF_IMAGE_PROCESSING_TAGS, exifTagArr};
        ExifTag[][] exifTagArr3 = EXIF_TAGS;
        sExifTagMapsForReading = new HashMap[exifTagArr3.length];
        sExifTagMapsForWriting = new HashMap[exifTagArr3.length];
        Charset forName = Charset.forName("US-ASCII");
        ASCII = forName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        sFormatter = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            sExifTagMapsForReading[i] = new HashMap<>();
            sExifTagMapsForWriting[i] = new HashMap<>();
            for (ExifTag exifTag : EXIF_TAGS[i]) {
                sExifTagMapsForReading[i].put(Integer.valueOf(exifTag.number), exifTag);
                sExifTagMapsForWriting[i].put(exifTag.name, exifTag);
            }
        }
        sExifPointerTagMap.put(Integer.valueOf(EXIF_POINTER_TAGS[0].number), 5);
        sExifPointerTagMap.put(Integer.valueOf(EXIF_POINTER_TAGS[1].number), 1);
        sExifPointerTagMap.put(Integer.valueOf(EXIF_POINTER_TAGS[2].number), 2);
        sExifPointerTagMap.put(Integer.valueOf(EXIF_POINTER_TAGS[3].number), 3);
        sExifPointerTagMap.put(Integer.valueOf(EXIF_POINTER_TAGS[4].number), 7);
        sExifPointerTagMap.put(Integer.valueOf(EXIF_POINTER_TAGS[5].number), 8);
    }

    private static class Rational {
        public final long denominator;
        public final long numerator;

        Rational(long j, long j2) {
            if (j2 == 0) {
                this.numerator = 0;
                this.denominator = 1;
                return;
            }
            this.numerator = j;
            this.denominator = j2;
        }

        public String toString() {
            return this.numerator + "/" + this.denominator;
        }

        public double calculate() {
            return ((double) this.numerator) / ((double) this.denominator);
        }
    }

    private static class ExifAttribute {
        public final byte[] bytes;
        public final int format;
        public final int numberOfComponents;

        ExifAttribute(int i, int i2, byte[] bArr) {
            this.format = i;
            this.numberOfComponents = i2;
            this.bytes = bArr;
        }

        public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new ExifAttribute(3, iArr.length, wrap.array());
        }

        public static ExifAttribute createUShort(int i, ByteOrder byteOrder) {
            return createUShort(new int[]{i}, byteOrder);
        }

        public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new ExifAttribute(4, jArr.length, wrap.array());
        }

        public static ExifAttribute createULong(long j, ByteOrder byteOrder) {
            return createULong(new long[]{j}, byteOrder);
        }

        public static ExifAttribute createString(String str) {
            byte[] bytes2 = (str + 0).getBytes(ExifInterface.ASCII);
            return new ExifAttribute(2, bytes2.length, bytes2);
        }

        public static ExifAttribute createURational(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * rationalArr.length)]);
            wrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                wrap.putInt((int) rational.numerator);
                wrap.putInt((int) rational.denominator);
            }
            return new ExifAttribute(5, rationalArr.length, wrap.array());
        }

        public static ExifAttribute createURational(Rational rational, ByteOrder byteOrder) {
            return createURational(new Rational[]{rational}, byteOrder);
        }

        public String toString() {
            return "(" + ExifInterface.IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + ")";
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01ab A[SYNTHETIC, Splitter:B:164:0x01ab] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object getValue(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                byte[] r4 = r10.bytes     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                r3.setByteOrder(r11)     // Catch:{ IOException -> 0x0191 }
                int r11 = r10.format     // Catch:{ IOException -> 0x0191 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x014c;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x014c;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0191 }
            L_0x0016:
                goto L_0x0188
            L_0x0018:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x001c:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0036:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0191 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                androidx.exifinterface.media.ExifInterface$Rational[] r11 = new androidx.exifinterface.media.ExifInterface.Rational[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0051:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0191 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0191 }
                androidx.exifinterface.media.ExifInterface$Rational r4 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch:{ IOException -> 0x0191 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0076:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0090:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                androidx.exifinterface.media.ExifInterface$Rational[] r11 = new androidx.exifinterface.media.ExifInterface.Rational[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00aa:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.readUnsignedInt()     // Catch:{ IOException -> 0x0191 }
                long r8 = r3.readUnsignedInt()     // Catch:{ IOException -> 0x0191 }
                androidx.exifinterface.media.ExifInterface$Rational r4 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch:{ IOException -> 0x0191 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00cd:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.readUnsignedInt()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00e7:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                byte[] r6 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch:{ IOException -> 0x0191 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0191 }
                if (r11 < r6) goto L_0x011e
                r11 = 0
            L_0x0105:
                byte[] r6 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch:{ IOException -> 0x0191 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0191 }
                if (r11 >= r6) goto L_0x0119
                byte[] r6 = r10.bytes     // Catch:{ IOException -> 0x0191 }
                byte r6 = r6[r11]     // Catch:{ IOException -> 0x0191 }
                byte[] r7 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch:{ IOException -> 0x0191 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0191 }
                if (r6 == r7) goto L_0x0116
                r4 = 0
                goto L_0x0119
            L_0x0116:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0119:
                if (r4 == 0) goto L_0x011e
                byte[] r11 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch:{ IOException -> 0x0191 }
                int r5 = r11.length     // Catch:{ IOException -> 0x0191 }
            L_0x011e:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0191 }
                r11.<init>()     // Catch:{ IOException -> 0x0191 }
            L_0x0123:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x013f
                byte[] r4 = r10.bytes     // Catch:{ IOException -> 0x0191 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0191 }
                if (r4 != 0) goto L_0x012e
                goto L_0x013f
            L_0x012e:
                r6 = 32
                if (r4 < r6) goto L_0x0137
                char r4 = (char) r4     // Catch:{ IOException -> 0x0191 }
                r11.append(r4)     // Catch:{ IOException -> 0x0191 }
                goto L_0x013c
            L_0x0137:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0191 }
            L_0x013c:
                int r5 = r5 + 1
                goto L_0x0123
            L_0x013f:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0147 }
                goto L_0x014b
            L_0x0147:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x014b:
                return r11
            L_0x014c:
                byte[] r11 = r10.bytes     // Catch:{ IOException -> 0x0191 }
                int r11 = r11.length     // Catch:{ IOException -> 0x0191 }
                if (r11 != r4) goto L_0x0176
                byte[] r11 = r10.bytes     // Catch:{ IOException -> 0x0191 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0191 }
                if (r11 < 0) goto L_0x0176
                byte[] r11 = r10.bytes     // Catch:{ IOException -> 0x0191 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0191 }
                if (r11 > r4) goto L_0x0176
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0191 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0191 }
                byte[] r6 = r10.bytes     // Catch:{ IOException -> 0x0191 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0191 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0191 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0191 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0171 }
                goto L_0x0175
            L_0x0171:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0175:
                return r11
            L_0x0176:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0191 }
                byte[] r4 = r10.bytes     // Catch:{ IOException -> 0x0191 }
                java.nio.charset.Charset r5 = androidx.exifinterface.media.ExifInterface.ASCII     // Catch:{ IOException -> 0x0191 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0187
            L_0x0183:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0187:
                return r11
            L_0x0188:
                r3.close()     // Catch:{ IOException -> 0x018c }
                goto L_0x0190
            L_0x018c:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0190:
                return r2
            L_0x0191:
                r11 = move-exception
                goto L_0x0197
            L_0x0193:
                r11 = move-exception
                goto L_0x01a9
            L_0x0195:
                r11 = move-exception
                r3 = r2
            L_0x0197:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x01a7 }
                if (r3 == 0) goto L_0x01a6
                r3.close()     // Catch:{ IOException -> 0x01a2 }
                goto L_0x01a6
            L_0x01a2:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x01a6:
                return r2
            L_0x01a7:
                r11 = move-exception
                r2 = r3
            L_0x01a9:
                if (r2 == 0) goto L_0x01b3
                r2.close()     // Catch:{ IOException -> 0x01af }
                goto L_0x01b3
            L_0x01af:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01b3:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.ExifAttribute.getValue(java.nio.ByteOrder):java.lang.Object");
        }

        public double getDoubleValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (value instanceof String) {
                return Double.parseDouble((String) value);
            } else {
                if (value instanceof long[]) {
                    long[] jArr = (long[]) value;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof int[]) {
                    int[] iArr = (int[]) value;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof double[]) {
                    double[] dArr = (double[]) value;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof Rational[]) {
                    Rational[] rationalArr = (Rational[]) value;
                    if (rationalArr.length == 1) {
                        return rationalArr[0].calculate();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int getIntValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (value instanceof String) {
                return Integer.parseInt((String) value);
            } else {
                if (value instanceof long[]) {
                    long[] jArr = (long[]) value;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof int[]) {
                    int[] iArr = (int[]) value;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String getStringValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                return null;
            }
            if (value instanceof String) {
                return (String) value;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(value instanceof Rational[])) {
                return null;
            } else {
                Rational[] rationalArr = (Rational[]) value;
                while (i < rationalArr.length) {
                    sb.append(rationalArr[i].numerator);
                    sb.append('/');
                    sb.append(rationalArr[i].denominator);
                    i++;
                    if (i != rationalArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }
    }

    static class ExifTag {
        public final String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        ExifTag(String str, int i, int i2) {
            this.name = str;
            this.number = i;
            this.primaryFormat = i2;
            this.secondaryFormat = -1;
        }

        ExifTag(String str, int i, int i2, int i3) {
            this.name = str;
            this.number = i;
            this.primaryFormat = i2;
            this.secondaryFormat = i3;
        }

        /* access modifiers changed from: package-private */
        public boolean isFormatCompatible(int i) {
            int i2;
            int i3 = this.primaryFormat;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.secondaryFormat) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.primaryFormat == 9 || this.secondaryFormat == 9) && i == 8) {
                return true;
            }
            if ((this.primaryFormat == 12 || this.secondaryFormat == 12) && i == 11) {
                return true;
            }
            return false;
        }
    }

    public ExifInterface(String str) throws IOException {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.mAssetInputStream = null;
            this.mFilename = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    loadAttributes(fileInputStream2);
                    closeQuietly(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    private ExifAttribute getExifAttribute(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            ExifAttribute exifAttribute = this.mAttributes[i].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public String getAttribute(String str) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mExifByteOrder);
            }
            if (!str.equals("GPSTimeStamp")) {
                try {
                    return Double.toString(exifAttribute.getDoubleValue(this.mExifByteOrder));
                } catch (NumberFormatException unused) {
                }
            } else if (exifAttribute.format == 5 || exifAttribute.format == 10) {
                Rational[] rationalArr = (Rational[]) exifAttribute.getValue(this.mExifByteOrder);
                if (rationalArr == null || rationalArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                    return null;
                }
                return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) rationalArr[0].numerator) / ((float) rationalArr[0].denominator))), Integer.valueOf((int) (((float) rationalArr[1].numerator) / ((float) rationalArr[1].denominator))), Integer.valueOf((int) (((float) rationalArr[2].numerator) / ((float) rationalArr[2].denominator)))});
            } else {
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + exifAttribute.format);
                return null;
            }
        }
        return null;
    }

    public int getAttributeInt(String str, int i) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return i;
        }
        try {
            return exifAttribute.getIntValue(this.mExifByteOrder);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.mIsSupportedFile = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        addDefaultValuesForCompatibility();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadAttributes(java.io.InputStream r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r2 = EXIF_TAGS     // Catch:{ IOException -> 0x004a }
            int r2 = r2.length     // Catch:{ IOException -> 0x004a }
            if (r1 >= r2) goto L_0x0013
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r4.mAttributes     // Catch:{ IOException -> 0x004a }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x004a }
            r3.<init>()     // Catch:{ IOException -> 0x004a }
            r2[r1] = r3     // Catch:{ IOException -> 0x004a }
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0013:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x004a }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x004a }
            r5 = r1
            java.io.BufferedInputStream r5 = (java.io.BufferedInputStream) r5     // Catch:{ IOException -> 0x004a }
            int r5 = r4.getMimeType(r5)     // Catch:{ IOException -> 0x004a }
            r4.mMimeType = r5     // Catch:{ IOException -> 0x004a }
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r5 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ IOException -> 0x004a }
            r5.<init>((java.io.InputStream) r1)     // Catch:{ IOException -> 0x004a }
            int r1 = r4.mMimeType     // Catch:{ IOException -> 0x004a }
            switch(r1) {
                case 0: goto L_0x003e;
                case 1: goto L_0x003e;
                case 2: goto L_0x003e;
                case 3: goto L_0x003e;
                case 4: goto L_0x003a;
                case 5: goto L_0x003e;
                case 6: goto L_0x003e;
                case 7: goto L_0x0036;
                case 8: goto L_0x003e;
                case 9: goto L_0x0032;
                case 10: goto L_0x002e;
                case 11: goto L_0x003e;
                default: goto L_0x002d;
            }     // Catch:{ IOException -> 0x004a }
        L_0x002d:
            goto L_0x0041
        L_0x002e:
            r4.getRw2Attributes(r5)     // Catch:{ IOException -> 0x004a }
            goto L_0x0041
        L_0x0032:
            r4.getRafAttributes(r5)     // Catch:{ IOException -> 0x004a }
            goto L_0x0041
        L_0x0036:
            r4.getOrfAttributes(r5)     // Catch:{ IOException -> 0x004a }
            goto L_0x0041
        L_0x003a:
            r4.getJpegAttributes(r5, r0, r0)     // Catch:{ IOException -> 0x004a }
            goto L_0x0041
        L_0x003e:
            r4.getRawAttributes(r5)     // Catch:{ IOException -> 0x004a }
        L_0x0041:
            r4.setThumbnailData(r5)     // Catch:{ IOException -> 0x004a }
            r5 = 1
            r4.mIsSupportedFile = r5     // Catch:{ IOException -> 0x004a }
            goto L_0x004c
        L_0x0048:
            r5 = move-exception
            goto L_0x0050
        L_0x004a:
            r4.mIsSupportedFile = r0     // Catch:{ all -> 0x0048 }
        L_0x004c:
            r4.addDefaultValuesForCompatibility()
            return
        L_0x0050:
            r4.addDefaultValuesForCompatibility()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.loadAttributes(java.io.InputStream):void");
    }

    private int getMimeType(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (isJpegFormat(bArr)) {
            return 4;
        }
        if (isRafFormat(bArr)) {
            return 9;
        }
        if (isOrfFormat(bArr)) {
            return 7;
        }
        return isRw2Format(bArr) ? 10 : 0;
    }

    private static boolean isJpegFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = JPEG_SIGNATURE;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isRafFormat(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isOrfFormat(byte[] bArr) throws IOException {
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        byteOrderedDataInputStream.setByteOrder(readByteOrder);
        short readShort = byteOrderedDataInputStream.readShort();
        byteOrderedDataInputStream.close();
        return readShort == 20306 || readShort == 21330;
    }

    private boolean isRw2Format(byte[] bArr) throws IOException {
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        byteOrderedDataInputStream.setByteOrder(readByteOrder);
        short readShort = byteOrderedDataInputStream.readShort();
        byteOrderedDataInputStream.close();
        return readShort == 85;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getJpegAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.setByteOrder(r0)
            long r0 = (long) r11
            r10.seek(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long) r5, (java.nio.ByteOrder) r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r0 = r9.mAttributes
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long) r5, (java.nio.ByteOrder) r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.getAttribute(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r5 = r9.mAttributes
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = ASCII
            r7.<init>(r0, r8)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = IDENTIFIER_EXIF_APP1
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.mExifOffset = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.readExifSegment(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.mExifByteOrder
            r10.setByteOrder(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getJpegAttributes(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    private void getRawAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        ExifAttribute exifAttribute;
        parseTiffHeaders(byteOrderedDataInputStream, byteOrderedDataInputStream.available());
        readImageFileDirectory(byteOrderedDataInputStream, 0);
        updateImageSizeValues(byteOrderedDataInputStream, 0);
        updateImageSizeValues(byteOrderedDataInputStream, 5);
        updateImageSizeValues(byteOrderedDataInputStream, 4);
        validateImages(byteOrderedDataInputStream);
        if (this.mMimeType == 8 && (exifAttribute = this.mAttributes[1].get("MakerNote")) != null) {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(exifAttribute.bytes);
            byteOrderedDataInputStream2.setByteOrder(this.mExifByteOrder);
            byteOrderedDataInputStream2.seek(6);
            readImageFileDirectory(byteOrderedDataInputStream2, 9);
            ExifAttribute exifAttribute2 = this.mAttributes[9].get("ColorSpace");
            if (exifAttribute2 != null) {
                this.mAttributes[1].put("ColorSpace", exifAttribute2);
            }
        }
    }

    private void getRafAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        byteOrderedDataInputStream.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byteOrderedDataInputStream.read(bArr);
        byteOrderedDataInputStream.skipBytes(4);
        byteOrderedDataInputStream.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        getJpegAttributes(byteOrderedDataInputStream, i, 5);
        byteOrderedDataInputStream.seek((long) i2);
        byteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        int readInt = byteOrderedDataInputStream.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (readUnsignedShort == TAG_RAF_IMAGE_SIZE.number) {
                short readShort = byteOrderedDataInputStream.readShort();
                short readShort2 = byteOrderedDataInputStream.readShort();
                ExifAttribute createUShort = ExifAttribute.createUShort((int) readShort, this.mExifByteOrder);
                ExifAttribute createUShort2 = ExifAttribute.createUShort((int) readShort2, this.mExifByteOrder);
                this.mAttributes[0].put("ImageLength", createUShort);
                this.mAttributes[0].put("ImageWidth", createUShort2);
                return;
            }
            byteOrderedDataInputStream.skipBytes(readUnsignedShort2);
        }
    }

    private void getOrfAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        getRawAttributes(byteOrderedDataInputStream);
        ExifAttribute exifAttribute = this.mAttributes[1].get("MakerNote");
        if (exifAttribute != null) {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(exifAttribute.bytes);
            byteOrderedDataInputStream2.setByteOrder(this.mExifByteOrder);
            byte[] bArr = new byte[ORF_MAKER_NOTE_HEADER_1.length];
            byteOrderedDataInputStream2.readFully(bArr);
            byteOrderedDataInputStream2.seek(0);
            byte[] bArr2 = new byte[ORF_MAKER_NOTE_HEADER_2.length];
            byteOrderedDataInputStream2.readFully(bArr2);
            if (Arrays.equals(bArr, ORF_MAKER_NOTE_HEADER_1)) {
                byteOrderedDataInputStream2.seek(8);
            } else if (Arrays.equals(bArr2, ORF_MAKER_NOTE_HEADER_2)) {
                byteOrderedDataInputStream2.seek(12);
            }
            readImageFileDirectory(byteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = this.mAttributes[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = this.mAttributes[7].get("PreviewImageLength");
            if (!(exifAttribute2 == null || exifAttribute3 == null)) {
                this.mAttributes[5].put("JPEGInterchangeFormat", exifAttribute2);
                this.mAttributes[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = this.mAttributes[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.getValue(this.mExifByteOrder);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    ExifAttribute createUShort = ExifAttribute.createUShort(i, this.mExifByteOrder);
                    ExifAttribute createUShort2 = ExifAttribute.createUShort(i2, this.mExifByteOrder);
                    this.mAttributes[0].put("ImageWidth", createUShort);
                    this.mAttributes[0].put("ImageLength", createUShort2);
                }
            }
        }
    }

    private void getRw2Attributes(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        getRawAttributes(byteOrderedDataInputStream);
        if (this.mAttributes[0].get("JpgFromRaw") != null) {
            getJpegAttributes(byteOrderedDataInputStream, this.mRw2JpgFromRawOffset, 5);
        }
        ExifAttribute exifAttribute = this.mAttributes[0].get("ISO");
        ExifAttribute exifAttribute2 = this.mAttributes[1].get("PhotographicSensitivity");
        if (exifAttribute != null && exifAttribute2 == null) {
            this.mAttributes[1].put("PhotographicSensitivity", exifAttribute);
        }
    }

    private void readExifSegment(byte[] bArr, int i) throws IOException {
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
        parseTiffHeaders(byteOrderedDataInputStream, bArr.length);
        readImageFileDirectory(byteOrderedDataInputStream, i);
    }

    private void addDefaultValuesForCompatibility() {
        String attribute = getAttribute("DateTimeOriginal");
        if (attribute != null && getAttribute("DateTime") == null) {
            this.mAttributes[0].put("DateTime", ExifAttribute.createString(attribute));
        }
        if (getAttribute("ImageWidth") == null) {
            this.mAttributes[0].put("ImageWidth", ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (getAttribute("ImageLength") == null) {
            this.mAttributes[0].put("ImageLength", ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (getAttribute("Orientation") == null) {
            this.mAttributes[0].put("Orientation", ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (getAttribute("LightSource") == null) {
            this.mAttributes[1].put("LightSource", ExifAttribute.createULong(0, this.mExifByteOrder));
        }
    }

    private ByteOrder readByteOrder(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short readShort = byteOrderedDataInputStream.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void parseTiffHeaders(ByteOrderedDataInputStream byteOrderedDataInputStream, int i) throws IOException {
        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        byteOrderedDataInputStream.setByteOrder(readByteOrder);
        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i2 = this.mMimeType;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = byteOrderedDataInputStream.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && byteOrderedDataInputStream.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readImageFileDirectory(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r24, int r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.mAttributesOffsets
            int r4 = r1.mPosition
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.mPosition
            int r3 = r3 + 2
            int r4 = r1.mLength
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r24.readShort()
            int r4 = r1.mPosition
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.mLength
            if (r4 > r5) goto L_0x0326
            if (r3 > 0) goto L_0x002b
            goto L_0x0326
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r9 = "ExifInterface"
            if (r5 >= r3) goto L_0x02b7
            int r10 = r24.readUnsignedShort()
            int r11 = r24.readUnsignedShort()
            int r12 = r24.readInt()
            int r13 = r24.peek()
            long r13 = (long) r13
            r15 = 4
            long r13 = r13 + r15
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r17 = sExifTagMapsForReading
            r4 = r17[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r8)
            androidx.exifinterface.media.ExifInterface$ExifTag r4 = (androidx.exifinterface.media.ExifInterface.ExifTag) r4
            r8 = 7
            if (r4 != 0) goto L_0x006b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "Skip the tag entry since tag number is not defined: "
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = r15.toString()
            android.util.Log.w(r9, r6)
            goto L_0x00e7
        L_0x006b:
            if (r11 <= 0) goto L_0x00d3
            int[] r6 = IFD_FORMAT_BYTES_PER_FORMAT
            int r6 = r6.length
            if (r11 < r6) goto L_0x0073
            goto L_0x00d3
        L_0x0073:
            boolean r6 = r4.isFormatCompatible(r11)
            if (r6 != 0) goto L_0x009c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = IFD_FORMAT_NAMES
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.name
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r9, r6)
            goto L_0x00e7
        L_0x009c:
            if (r11 != r8) goto L_0x00a0
            int r11 = r4.primaryFormat
        L_0x00a0:
            long r6 = (long) r12
            int[] r15 = IFD_FORMAT_BYTES_PER_FORMAT
            r15 = r15[r11]
            r16 = r9
            long r8 = (long) r15
            long r6 = r6 * r8
            r8 = 0
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x00bc
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r8 = 1
            r9 = r16
            goto L_0x00ea
        L_0x00bc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            r9 = r16
            android.util.Log.w(r9, r8)
            goto L_0x00e9
        L_0x00d3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format is invalid: "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r9, r6)
        L_0x00e7:
            r6 = 0
        L_0x00e9:
            r8 = 0
        L_0x00ea:
            if (r8 != 0) goto L_0x00f5
            r1.seek(r13)
            r16 = r3
            r18 = r5
            goto L_0x02ae
        L_0x00f5:
            java.lang.String r8 = "Compression"
            r15 = 4
            int r18 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x01a2
            int r15 = r24.readInt()
            r16 = r3
            int r3 = r0.mMimeType
            r18 = r5
            r5 = 7
            if (r3 != r5) goto L_0x0165
            java.lang.String r3 = r4.name
            java.lang.String r5 = "MakerNote"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0117
            r0.mOrfMakerNoteOffset = r15
            goto L_0x0160
        L_0x0117:
            r3 = 6
            if (r2 != r3) goto L_0x0160
            java.lang.String r5 = r4.name
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0160
            r0.mOrfThumbnailOffset = r15
            r0.mOrfThumbnailLength = r12
            java.nio.ByteOrder r3 = r0.mExifByteOrder
            r5 = 6
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort((int) r5, (java.nio.ByteOrder) r3)
            int r5 = r0.mOrfThumbnailOffset
            r20 = r11
            r19 = r12
            long r11 = (long) r5
            java.nio.ByteOrder r5 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long) r11, (java.nio.ByteOrder) r5)
            int r11 = r0.mOrfThumbnailLength
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long) r11, (java.nio.ByteOrder) r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r11 = r0.mAttributes
            r12 = 4
            r11 = r11[r12]
            r11.put(r8, r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r12]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r3.put(r11, r5)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r12]
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            r3.put(r5, r2)
            goto L_0x0179
        L_0x0160:
            r20 = r11
            r19 = r12
            goto L_0x0179
        L_0x0165:
            r20 = r11
            r19 = r12
            r2 = 10
            if (r3 != r2) goto L_0x0179
            java.lang.String r2 = r4.name
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0179
            r0.mRw2JpgFromRawOffset = r15
        L_0x0179:
            long r2 = (long) r15
            long r11 = r2 + r6
            int r5 = r1.mLength
            r21 = r4
            long r4 = (long) r5
            int r22 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r22 > 0) goto L_0x0189
            r1.seek(r2)
            goto L_0x01ac
        L_0x0189:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r9, r2)
            r1.seek(r13)
            goto L_0x02ae
        L_0x01a2:
            r16 = r3
            r21 = r4
            r18 = r5
            r20 = r11
            r19 = r12
        L_0x01ac:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = sExifPointerTagMap
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            r4 = 3
            if (r2 == 0) goto L_0x0245
            r5 = -1
            r11 = r20
            if (r11 == r4) goto L_0x01e2
            r4 = 4
            if (r11 == r4) goto L_0x01dd
            if (r11 == r3) goto L_0x01d8
            r3 = 9
            if (r11 == r3) goto L_0x01d3
            r3 = 13
            if (r11 == r3) goto L_0x01d3
        L_0x01d0:
            r3 = 0
            goto L_0x01e8
        L_0x01d3:
            int r3 = r24.readInt()
            goto L_0x01e6
        L_0x01d8:
            short r3 = r24.readShort()
            goto L_0x01e6
        L_0x01dd:
            long r5 = r24.readUnsignedInt()
            goto L_0x01d0
        L_0x01e2:
            int r3 = r24.readUnsignedShort()
        L_0x01e6:
            long r5 = (long) r3
            goto L_0x01d0
        L_0x01e8:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x022d
            int r3 = r1.mLength
            long r3 = (long) r3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x022d
            java.util.Set<java.lang.Integer> r3 = r0.mAttributesOffsets
            int r4 = (int) r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x020b
            r1.seek(r5)
            int r2 = r2.intValue()
            r0.readImageFileDirectory(r1, r2)
            goto L_0x0241
        L_0x020b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.w(r9, r2)
            goto L_0x0241
        L_0x022d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r9, r2)
        L_0x0241:
            r1.seek(r13)
            goto L_0x02ae
        L_0x0245:
            r11 = r20
            int r2 = (int) r6
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            r6 = r19
            r5.<init>(r11, r6, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r25]
            r6 = r21
            java.lang.String r7 = r6.name
            r2.put(r7, r5)
            java.lang.String r2 = r6.name
            java.lang.String r7 = "DNGVersion"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x026b
            r0.mMimeType = r4
        L_0x026b:
            java.lang.String r2 = r6.name
            java.lang.String r4 = "Make"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x027f
            java.lang.String r2 = r6.name
            java.lang.String r4 = "Model"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x028d
        L_0x027f:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            java.lang.String r2 = r5.getStringValue(r2)
            java.lang.String r4 = "PENTAX"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x02a0
        L_0x028d:
            java.lang.String r2 = r6.name
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x02a2
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            int r2 = r5.getIntValue(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L_0x02a2
        L_0x02a0:
            r0.mMimeType = r3
        L_0x02a2:
            int r2 = r24.peek()
            long r2 = (long) r2
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x02ae
            r1.seek(r13)
        L_0x02ae:
            int r5 = r18 + 1
            short r5 = (short) r5
            r2 = r25
            r3 = r16
            goto L_0x002c
        L_0x02b7:
            int r2 = r24.peek()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.mLength
            if (r2 > r3) goto L_0x0326
            int r2 = r24.readInt()
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0312
            int r5 = r1.mLength
            if (r2 >= r5) goto L_0x0312
            java.util.Set<java.lang.Integer> r5 = r0.mAttributesOffsets
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02fd
            r1.seek(r3)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02ee
            r0.readImageFileDirectory(r1, r3)
            goto L_0x0326
        L_0x02ee:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0326
            r0.readImageFileDirectory(r1, r3)
            goto L_0x0326
        L_0x02fd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
            goto L_0x0326
        L_0x0312:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
        L_0x0326:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.readImageFileDirectory(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int):void");
    }

    private void retrieveJpegImageSize(ByteOrderedDataInputStream byteOrderedDataInputStream, int i) throws IOException {
        ExifAttribute exifAttribute;
        ExifAttribute exifAttribute2 = this.mAttributes[i].get("ImageLength");
        ExifAttribute exifAttribute3 = this.mAttributes[i].get("ImageWidth");
        if ((exifAttribute2 == null || exifAttribute3 == null) && (exifAttribute = this.mAttributes[i].get("JPEGInterchangeFormat")) != null) {
            getJpegAttributes(byteOrderedDataInputStream, exifAttribute.getIntValue(this.mExifByteOrder), i);
        }
    }

    private void setThumbnailData(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        HashMap<String, ExifAttribute> hashMap = this.mAttributes[4];
        ExifAttribute exifAttribute = hashMap.get("Compression");
        if (exifAttribute != null) {
            int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
            this.mThumbnailCompression = intValue;
            if (intValue != 1) {
                if (intValue == 6) {
                    handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
                    return;
                } else if (intValue != 7) {
                    return;
                }
            }
            if (isSupportedDataType(hashMap)) {
                handleThumbnailFromStrips(byteOrderedDataInputStream, hashMap);
                return;
            }
            return;
        }
        this.mThumbnailCompression = 6;
        handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
    }

    private void handleThumbnailFromJfif(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) throws IOException {
        int i;
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("JPEGInterchangeFormatLength");
        if (exifAttribute != null && exifAttribute2 != null) {
            int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
            int min = Math.min(exifAttribute2.getIntValue(this.mExifByteOrder), byteOrderedDataInputStream.available() - intValue);
            int i2 = this.mMimeType;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.mExifOffset;
            } else {
                if (i2 == 7) {
                    i = this.mOrfMakerNoteOffset;
                }
                if (intValue > 0 && min > 0) {
                    this.mHasThumbnail = true;
                    this.mThumbnailOffset = intValue;
                    this.mThumbnailLength = min;
                    if (this.mFilename == null && this.mAssetInputStream == null) {
                        byte[] bArr = new byte[min];
                        byteOrderedDataInputStream.seek((long) intValue);
                        byteOrderedDataInputStream.readFully(bArr);
                        this.mThumbnailBytes = bArr;
                        return;
                    }
                    return;
                }
            }
            intValue += i;
            if (intValue > 0) {
            }
        }
    }

    private void handleThumbnailFromStrips(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("StripOffsets");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("StripByteCounts");
        if (exifAttribute != null && exifAttribute2 != null) {
            long[] convertToLongArray = convertToLongArray(exifAttribute.getValue(this.mExifByteOrder));
            long[] convertToLongArray2 = convertToLongArray(exifAttribute2.getValue(this.mExifByteOrder));
            if (convertToLongArray == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
            } else if (convertToLongArray2 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
            } else {
                long j = 0;
                for (long j2 : convertToLongArray2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < convertToLongArray.length; i4++) {
                    int i5 = (int) convertToLongArray[i4];
                    int i6 = (int) convertToLongArray2[i4];
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    byteOrderedDataInputStream.seek((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    byteOrderedDataInputStream.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.mHasThumbnail = true;
                this.mThumbnailBytes = bArr;
                this.mThumbnailLength = i;
            }
        }
    }

    private boolean isSupportedDataType(HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute;
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("BitsPerSample");
        if (exifAttribute2 == null) {
            return false;
        }
        int[] iArr = (int[]) exifAttribute2.getValue(this.mExifByteOrder);
        if (Arrays.equals(BITS_PER_SAMPLE_RGB, iArr)) {
            return true;
        }
        if (this.mMimeType != 3 || (exifAttribute = (ExifAttribute) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        if ((intValue != 1 || !Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) && (intValue != 6 || !Arrays.equals(iArr, BITS_PER_SAMPLE_RGB))) {
            return false;
        }
        return true;
    }

    private boolean isThumbnail(HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.getIntValue(this.mExifByteOrder) <= 512 && exifAttribute2.getIntValue(this.mExifByteOrder) <= 512;
    }

    private void validateImages(InputStream inputStream) throws IOException {
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        ExifAttribute exifAttribute = this.mAttributes[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = this.mAttributes[1].get("PixelYDimension");
        if (!(exifAttribute == null || exifAttribute2 == null)) {
            this.mAttributes[0].put("ImageWidth", exifAttribute);
            this.mAttributes[0].put("ImageLength", exifAttribute2);
        }
        if (this.mAttributes[4].isEmpty() && isThumbnail(this.mAttributes[5])) {
            HashMap<String, ExifAttribute>[] hashMapArr = this.mAttributes;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!isThumbnail(this.mAttributes[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private void updateImageSizeValues(ByteOrderedDataInputStream byteOrderedDataInputStream, int i) throws IOException {
        ExifAttribute exifAttribute;
        ExifAttribute exifAttribute2;
        ExifAttribute exifAttribute3 = this.mAttributes[i].get("DefaultCropSize");
        ExifAttribute exifAttribute4 = this.mAttributes[i].get("SensorTopBorder");
        ExifAttribute exifAttribute5 = this.mAttributes[i].get("SensorLeftBorder");
        ExifAttribute exifAttribute6 = this.mAttributes[i].get("SensorBottomBorder");
        ExifAttribute exifAttribute7 = this.mAttributes[i].get("SensorRightBorder");
        if (exifAttribute3 != null) {
            if (exifAttribute3.format == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute3.getValue(this.mExifByteOrder);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                }
                exifAttribute2 = ExifAttribute.createURational(rationalArr[0], this.mExifByteOrder);
                exifAttribute = ExifAttribute.createURational(rationalArr[1], this.mExifByteOrder);
            } else {
                int[] iArr = (int[]) exifAttribute3.getValue(this.mExifByteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                exifAttribute2 = ExifAttribute.createUShort(iArr[0], this.mExifByteOrder);
                exifAttribute = ExifAttribute.createUShort(iArr[1], this.mExifByteOrder);
            }
            this.mAttributes[i].put("ImageWidth", exifAttribute2);
            this.mAttributes[i].put("ImageLength", exifAttribute);
        } else if (exifAttribute4 == null || exifAttribute5 == null || exifAttribute6 == null || exifAttribute7 == null) {
            retrieveJpegImageSize(byteOrderedDataInputStream, i);
        } else {
            int intValue = exifAttribute4.getIntValue(this.mExifByteOrder);
            int intValue2 = exifAttribute6.getIntValue(this.mExifByteOrder);
            int intValue3 = exifAttribute7.getIntValue(this.mExifByteOrder);
            int intValue4 = exifAttribute5.getIntValue(this.mExifByteOrder);
            if (intValue2 > intValue && intValue3 > intValue4) {
                ExifAttribute createUShort = ExifAttribute.createUShort(intValue2 - intValue, this.mExifByteOrder);
                ExifAttribute createUShort2 = ExifAttribute.createUShort(intValue3 - intValue4, this.mExifByteOrder);
                this.mAttributes[i].put("ImageLength", createUShort);
                this.mAttributes[i].put("ImageWidth", createUShort2);
            }
        }
    }

    private static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
        private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        private ByteOrder mByteOrder;
        private DataInputStream mDataInputStream;
        final int mLength;
        int mPosition;

        public ByteOrderedDataInputStream(InputStream inputStream) throws IOException {
            this.mByteOrder = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.mDataInputStream = dataInputStream;
            int available = dataInputStream.available();
            this.mLength = available;
            this.mPosition = 0;
            this.mDataInputStream.mark(available);
        }

        public ByteOrderedDataInputStream(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        public void seek(long j) throws IOException {
            int i = this.mPosition;
            if (((long) i) > j) {
                this.mPosition = 0;
                this.mDataInputStream.reset();
                this.mDataInputStream.mark(this.mLength);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int peek() {
            return this.mPosition;
        }

        public int available() throws IOException {
            return this.mDataInputStream.available();
        }

        public int read() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.read();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.mDataInputStream.read(bArr, i, i2);
            this.mPosition += read;
            return read;
        }

        public int readUnsignedByte() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.readUnsignedByte();
        }

        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public boolean readBoolean() throws IOException {
            this.mPosition++;
            return this.mDataInputStream.readBoolean();
        }

        public char readChar() throws IOException {
            this.mPosition += 2;
            return this.mDataInputStream.readChar();
        }

        public String readUTF() throws IOException {
            this.mPosition += 2;
            return this.mDataInputStream.readUTF();
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.mPosition + i2;
            this.mPosition = i3;
            if (i3 > this.mLength) {
                throw new EOFException();
            } else if (this.mDataInputStream.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.mPosition + bArr.length;
            this.mPosition = length;
            if (length > this.mLength) {
                throw new EOFException();
            } else if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public byte readByte() throws IOException {
            int i = this.mPosition + 1;
            this.mPosition = i;
            if (i <= this.mLength) {
                int read = this.mDataInputStream.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.mPosition + 2;
            this.mPosition = i;
            if (i <= this.mLength) {
                int read = this.mDataInputStream.read();
                int read2 = this.mDataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.mByteOrder;
                    if (byteOrder == LITTLE_ENDIAN) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == BIG_ENDIAN) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.mByteOrder);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int readInt() throws IOException {
            int i = this.mPosition + 4;
            this.mPosition = i;
            if (i <= this.mLength) {
                int read = this.mDataInputStream.read();
                int read2 = this.mDataInputStream.read();
                int read3 = this.mDataInputStream.read();
                int read4 = this.mDataInputStream.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.mByteOrder;
                    if (byteOrder == LITTLE_ENDIAN) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == BIG_ENDIAN) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.mByteOrder);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.mLength - this.mPosition);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.mDataInputStream.skipBytes(min - i2);
            }
            this.mPosition += i2;
            return i2;
        }

        public int readUnsignedShort() throws IOException {
            int i = this.mPosition + 2;
            this.mPosition = i;
            if (i <= this.mLength) {
                int read = this.mDataInputStream.read();
                int read2 = this.mDataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.mByteOrder;
                    if (byteOrder == LITTLE_ENDIAN) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == BIG_ENDIAN) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.mByteOrder);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public long readUnsignedInt() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public long readLong() throws IOException {
            int i = this.mPosition + 8;
            this.mPosition = i;
            if (i <= this.mLength) {
                int read = this.mDataInputStream.read();
                int read2 = this.mDataInputStream.read();
                int read3 = this.mDataInputStream.read();
                int read4 = this.mDataInputStream.read();
                int read5 = this.mDataInputStream.read();
                int read6 = this.mDataInputStream.read();
                int read7 = this.mDataInputStream.read();
                int read8 = this.mDataInputStream.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.mByteOrder;
                    if (byteOrder == LITTLE_ENDIAN) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == BIG_ENDIAN) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.mByteOrder);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }
    }

    private void swapBasedOnImageSize(int i, int i2) throws IOException {
        if (!this.mAttributes[i].isEmpty() && !this.mAttributes[i2].isEmpty()) {
            ExifAttribute exifAttribute = this.mAttributes[i].get("ImageLength");
            ExifAttribute exifAttribute2 = this.mAttributes[i].get("ImageWidth");
            ExifAttribute exifAttribute3 = this.mAttributes[i2].get("ImageLength");
            ExifAttribute exifAttribute4 = this.mAttributes[i2].get("ImageWidth");
            if (exifAttribute != null && exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null) {
                int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
                int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
                int intValue3 = exifAttribute3.getIntValue(this.mExifByteOrder);
                int intValue4 = exifAttribute4.getIntValue(this.mExifByteOrder);
                if (intValue < intValue3 && intValue2 < intValue4) {
                    HashMap<String, ExifAttribute>[] hashMapArr = this.mAttributes;
                    HashMap<String, ExifAttribute> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static long[] convertToLongArray(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
