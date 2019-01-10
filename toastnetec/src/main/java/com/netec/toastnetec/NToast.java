package com.netec.toastnetec;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NToast {

    public NToast(Context contexto, String mensaje) {
        Toast t = Toast.makeText(contexto,mensaje, Toast.LENGTH_SHORT);

        // Customización
        t.setDuration(Toast.LENGTH_LONG);
        t.setText(mensaje);
        t.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        View toastView = t.getView();
        TextView toastMessage = (TextView) toastView.findViewById(android.R.id.message);
        toastMessage.setTextSize(15);
        toastMessage.setTextColor(Color.WHITE);
        toastMessage.setCompoundDrawablesWithIntrinsicBounds(android.R.drawable.ic_dialog_info, 0, 0, 0);
        toastMessage.setGravity(Gravity.CENTER);
        toastMessage.setCompoundDrawablePadding(20);
        toastView.setBackgroundColor(R.drawable.gradiente);
        t.show();
    }
}
