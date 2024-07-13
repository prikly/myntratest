package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class CrashProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private Context f8014a;

    /* renamed from: b  reason: collision with root package name */
    private f f8015b;

    /* renamed from: c  reason: collision with root package name */
    private String f8016c;

    /* renamed from: d  reason: collision with root package name */
    private UriMatcher f8017d = new UriMatcher(-1);

    /* renamed from: e  reason: collision with root package name */
    private Uri f8018e;

    /* renamed from: f  reason: collision with root package name */
    private int f8019f = 1;

    /* renamed from: g  reason: collision with root package name */
    private int f8020g = 2;

    /* renamed from: h  reason: collision with root package name */
    private String f8021h;
    private String i;
    private String j = "REPORTS";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        int match = this.f8017d.match(uri);
        if (match == 1) {
            return this.f8021h;
        }
        if (match == 2) {
            return this.i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f8014a = getContext();
        this.f8015b = new f(this.f8014a);
        this.f8016c = this.f8014a.getPackageName();
        this.f8018e = Uri.parse("content://" + this.f8016c + "/REPORTS");
        this.f8021h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f8017d.match(uri);
        if (match == 1) {
            return f.b();
        }
        if (match == 2) {
            return f.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
