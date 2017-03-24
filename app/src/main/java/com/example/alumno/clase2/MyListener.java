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

        if (v.getId() == R.id.boton1){
            Log.d("CLICK", "SE HIZO CLICK boton 1");
        }else {
            if (v.getId() == R.id.boto2){
                Log.d("CLICK", "SE HIZO CLICK boton 2");
            }
        }
    }
}
