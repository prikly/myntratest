package com.appodeal.consent.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.widget.RelativeLayout;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.json.JSONObject;

public final class d {
    public static final a a(b bVar, c cVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "onClick");
        Context applicationContext = bVar.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "appContext");
        a aVar = new a(applicationContext);
        byte[] decode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAJEAAACRCAYAAADD2FojAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAAKwwAACsMBNCkkqwAAABl0RVh0Q29tbWVudABDcmVhdGVkIHdpdGggR0lNUFeBDhcAAAAcdEVYdFNvZnR3YXJlAEFkb2JlIEZpcmV3b3JrcyBDUzbovLKMAAAE1UlEQVR4nO3dva4bRRiH8efwJSj3EqAApYjScBVUiASJ6+IqiKKgVFxFOopISBGXsCURCJnieI4TzrG99rsz+378n9KytVP8tNqdnfHe7HY7lLL00dYDUPETImVOiJQ5IVLmhEiZEyJlToiUOSFS5oRImRMiZU6IlDkhUuaESJkTImVOiJQ5IVLmhEiZEyJlToiUOSFS5oRImftk5MHmeX4MPAGeT9P0z8hjZ26e54+BZ8DbaZpejz7+sDPRHtD3wFfAT/M8fzrq2JnbA/oR+Ab4bp7nb0ePYQii9wDd7D/6EkEy9x6gr9/7eDik7ogeANQSJENHALWGQuqK6ASgliBd0RlArWGQuiFaAKglSBe0EFBrCKSeZ6JHnAfUEqQFXQio9ajTcO7qiegl8McF3xekE10J6E/glz4jOtQN0TRN/wIvECRzFkAj5uO6XlgLkj3vgGDALb4gXV8EQDBoslGQLi8KIBj42EOQlhcJEAx+ii9I54sGCDZYCiJIx4sICDZaTyRI94sKCDZclCZIhyIDgo1XNgpSfEDgYHlsZUgZAIEDRFATUhZA4AQR1IKUCRA4QgQ1IGUDBM4QQW5IGQGBQ0SQE1JWQOAUEeSClBkQOEYEOSBlBwTOEUFsSBUAQQBEEBNSFUAQBBHEglQJEARCBDEgVQMEwRCBb0gVAUFAROATUlVAEBQR+IJUGRAERgQ+IFUHBMERwbaQBOi28IhgG0gCdCgFIhgLSYA+LA0iGANJgO6XChH0hSRAD5cOEfSBJEDHS4kI1oUkQKdLiwjWgSRA57vZ7XZbj6F7BggvuP3zUgE6UQlEcDWkd8DnF3y/HCAohAiuhrS0koAg+TXR/7vyGmlJZQFBMUTQBVJpQFAQEawKqTwgKIoIVoEkQPvKIoI7SL8Cf13407+BlwJ0W2lE+7u1H4AvLvzpZ8DTrfe1eaksohVu911skPRQSUQrzhcJEgURdZhwLA+pFKKOM9alIZVBZHh2trSykEogMjzF/xkH+9q8lx6RcT3QO5xskPRcakRrLCjzsEHSe2kRrbkiUZBOlxJRjyWtgnS8dIh6rokWpIdLhWjEonpBul8aRCN3ZQjSh6VAtMW2HkE6FB7RlvvCBOm20Ig8bCwUpMCIPABqVYcUEpEnQK3KkMIh8gioVRVSKESeAbUqQgqDKAKgVjVIIRBFAtSqBMk9ooiAWlUguUYUGVCrAiS3iDIAamWH5BJRJkCtzJDcIcoIqJUVkitEmQG1MkJyg6gCoFY2SC4QVQLUygRpc0QVAbWyQNoUUWVArQyQNkMkQIeiQ9oEkQDdLzKk4YgE6HhRIQ1FJEDniwhpGCIBWl40SEMQCdDlRYLUHZEAXV8USF0RCZC9CJC6IRKg9fIOqeeZ6CkCtFoWSH1GdKgnojfA0jfyCdCCroT0ptNw7uqGaJqm34FXnIckQBd0IaTfpml63XlIfS+sF0ASoCtaCGkIIBhwi38CkgAZOgNpGCAYNNn4ACQBWqEjkIYCgsFvo57n+THwBHguQOu1n055BrwdDQiKvdJc9Wnz5bEqfkKkzAmRMidEypwQKXNCpMwJkTInRMqcEClzQqTMCZEyJ0TKnBApc0KkzAmRMidEypwQKXNCpMwJkTInRMqcEClzQqTMCZEy9x9PtEuyzhRHVgAAAABJRU5ErkJggg==\n", 0);
        aVar.setImage(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        aVar.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                d.a(Function0.this, view);
            }
        });
        int roundToInt = MathKt.roundToInt((((float) applicationContext.getResources().getDisplayMetrics().densityDpi) / ((float) 160)) * 50.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(roundToInt, roundToInt);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        aVar.setLayoutParams(layoutParams);
        return aVar;
    }

    public static final String a(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Drawable applicationIcon = bVar.getContext().getPackageManager().getApplicationIcon(bVar.getContext().getApplicationInfo());
        Intrinsics.checkNotNullExpressionValue(applicationIcon, "context.packageManager.g…(context.applicationInfo)");
        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Intrinsics.stringPlus("data:image/png;base64,", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
    }

    public static final void a(Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(function0, "$onClick");
        function0.invoke();
    }

    public static final boolean a(String str) {
        try {
            new URL(str);
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static final String b(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.getContext().getApplicationInfo().loadLabel(bVar.getContext().getPackageManager()).toString();
    }

    public static final JSONObject b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
