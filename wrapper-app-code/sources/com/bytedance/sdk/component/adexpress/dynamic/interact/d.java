package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;

/* compiled from: InteractViewFactory */
public class d {
    public static b a(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar, int i, int i2) {
        if (context == null || dynamicBaseWidget == null || gVar == null) {
            return null;
        }
        String D = gVar.D();
        char c2 = 65535;
        int hashCode = D.hashCode();
        if (hashCode != 50) {
            switch (hashCode) {
                case 53:
                    if (D.equals("5")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 54:
                    if (D.equals("6")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 55:
                    if (D.equals("7")) {
                        c2 = 9;
                        break;
                    }
                    break;
                case 56:
                    if (D.equals("8")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 57:
                    if (D.equals("9")) {
                        c2 = 0;
                        break;
                    }
                    break;
                default:
                    switch (hashCode) {
                        case 1568:
                            if (D.equals("11")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 1569:
                            if (D.equals("12")) {
                                c2 = 6;
                                break;
                            }
                            break;
                        case 1570:
                            if (D.equals("13")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1571:
                            if (D.equals("14")) {
                                c2 = 10;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode) {
                                case 1573:
                                    if (D.equals("16")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 1574:
                                    if (D.equals("17")) {
                                        c2 = 11;
                                        break;
                                    }
                                    break;
                                case 1575:
                                    if (D.equals("18")) {
                                        c2 = 12;
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else if (D.equals("2")) {
            c2 = 8;
        }
        switch (c2) {
            case 0:
            case 1:
                return new h(context, dynamicBaseWidget, gVar, D, i);
            case 2:
                return new j(context, dynamicBaseWidget, gVar);
            case 3:
            case 4:
                return new g(context, dynamicBaseWidget, gVar);
            case 5:
                return new f(context, dynamicBaseWidget, gVar);
            case 6:
            case 7:
                return new i(context, dynamicBaseWidget, gVar);
            case 8:
                return new a(context, dynamicBaseWidget, gVar);
            case 9:
            case 10:
                return new e(context, dynamicBaseWidget, gVar);
            case 11:
            case 12:
                return new k(context, dynamicBaseWidget, gVar, D, i2);
            default:
                return null;
        }
    }
}
