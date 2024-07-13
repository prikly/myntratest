package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.impl.a.a.a.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.l;
import com.applovin.sdk.R;

public class c extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public a f13986a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public n f13987b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f13988c;

    /* renamed from: d  reason: collision with root package name */
    private Button f13989d;

    private void a() {
        l lVar = new l();
        lVar.a(this.f13987b.an().a(this.f13986a));
        String b2 = this.f13987b.an().b(this.f13986a.c());
        if (b2 != null) {
            lVar.a("\nBid Response Preview:\n");
            lVar.a(b2);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f13988c = textView;
        textView.setText(lVar.toString());
        this.f13988c.setTextColor(-16777216);
    }

    public void a(a aVar, n nVar) {
        this.f13986a = aVar;
        this.f13987b = nVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.f13986a.a() + " - " + this.f13986a.b());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        a();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f13989d = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                c.this.f13987b.an().a(c.this.f13986a, c.this, true);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f13987b.an().a(this.f13986a, this, false);
        return true;
    }
}
