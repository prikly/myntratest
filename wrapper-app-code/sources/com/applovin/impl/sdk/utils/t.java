package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class t {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final v f15954a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Stack<a> f15955b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public StringBuilder f15956c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f15957d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public a f15958e;

    private static class a extends s {
        a(String str, Map<String, String> map, s sVar) {
            super(str, map, sVar);
        }

        /* access modifiers changed from: package-private */
        public void a(s sVar) {
            if (sVar != null) {
                this.f15950c.add(sVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        /* access modifiers changed from: package-private */
        public void d(String str) {
            this.f15949b = str;
        }
    }

    t(n nVar) {
        if (nVar != null) {
            this.f15954a = nVar.D();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public static s a(String str, n nVar) throws SAXException {
        return new t(nVar).a(str);
    }

    /* access modifiers changed from: private */
    public Map<String, String> a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        Map<String, String> map = CollectionUtils.map(length);
        for (int i = 0; i < length; i++) {
            map.put(attributes.getQName(i), attributes.getValue(i));
        }
        return map;
    }

    public s a(String str) throws SAXException {
        if (str != null) {
            this.f15956c = new StringBuilder();
            this.f15955b = new Stack<>();
            this.f15958e = null;
            Xml.parse(str, new ContentHandler() {
                public void characters(char[] cArr, int i, int i2) {
                    String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                    if (StringUtils.isValidString(trim)) {
                        t.this.f15956c.append(trim);
                    }
                }

                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - t.this.f15957d;
                    v unused = t.this.f15954a;
                    if (v.a()) {
                        v a2 = t.this.f15954a;
                        a2.b("XmlParser", "Finished parsing in " + seconds + " seconds");
                    }
                }

                public void endElement(String str, String str2, String str3) {
                    t tVar = t.this;
                    a unused = tVar.f15958e = (a) tVar.f15955b.pop();
                    t.this.f15958e.d(t.this.f15956c.toString().trim());
                    t.this.f15956c.setLength(0);
                }

                public void endPrefixMapping(String str) {
                }

                public void ignorableWhitespace(char[] cArr, int i, int i2) {
                }

                public void processingInstruction(String str, String str2) {
                }

                public void setDocumentLocator(Locator locator) {
                }

                public void skippedEntity(String str) {
                }

                public void startDocument() {
                    v unused = t.this.f15954a;
                    if (v.a()) {
                        t.this.f15954a.b("XmlParser", "Begin parsing...");
                    }
                    long unused2 = t.this.f15957d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
                    a aVar = null;
                    try {
                        if (!t.this.f15955b.isEmpty()) {
                            aVar = (a) t.this.f15955b.peek();
                        }
                        a aVar2 = new a(str2, t.this.a(attributes), aVar);
                        if (aVar != null) {
                            aVar.a(aVar2);
                        }
                        t.this.f15955b.push(aVar2);
                    } catch (Exception e2) {
                        v unused = t.this.f15954a;
                        if (v.a()) {
                            v a2 = t.this.f15954a;
                            a2.b("XmlParser", "Unable to process element <" + str2 + ">", e2);
                        }
                        throw new SAXException("Failed to start element", e2);
                    }
                }

                public void startPrefixMapping(String str, String str2) {
                }
            });
            a aVar = this.f15958e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
