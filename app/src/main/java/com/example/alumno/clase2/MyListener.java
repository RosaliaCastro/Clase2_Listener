package com.example.alumno.clase2;

import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 23/03/2017.
 */

public class MyListener implements View.OnClickListener {

//me pasa por parametro quien ejecuto el metodo.
    @Override
    public void onClick(View v) {
        Log.d("CLICK", "SE HIZO CLICK");
    }
}
