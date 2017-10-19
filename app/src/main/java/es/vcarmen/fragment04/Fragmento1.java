package es.vcarmen.fragment04;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class Fragmento1 extends DialogFragment {
    static Fragmento1 nuevaInstancia(String titulo){
        Fragmento1 fragmento = new Fragmento1();
        Bundle args = new Bundle();
        args.putString("titulo", titulo);
        fragmento.setArguments(args);

        return fragmento;

    }



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String titulo = getArguments().getString("titulo");
        return new AlertDialog.Builder(getActivity()).setTitle(titulo).setIcon(R.mipmap.ic_launcher).setNegativeButton("Rechazar", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int wich){
                ((Fragment04)getActivity()).negativo();
            }
        }).setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((Fragment04)getActivity()).positivo();
            }
        }).create();
    }
}
