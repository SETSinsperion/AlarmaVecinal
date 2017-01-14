package com.insperion.sets.alarma;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by sets on 11/01/17.
 */

public class EULADialog extends Dialog implements View.OnClickListener {

    private CheckBox cb_eula_OK;
    private Button bt_OK;

    public EULADialog(Context context) {

        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_eula_main);

        cb_eula_OK = (CheckBox)findViewById(R.id.cb_EULA);
        bt_OK = (Button)findViewById(R.id.bt_eula_OK);
        bt_OK.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (cb_eula_OK.isChecked())
            this.dismiss();

    }
}
