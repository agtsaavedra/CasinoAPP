package com.example.el_ez.practicas;

import android.app.AlertDialog;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import static android.app.PendingIntent.getActivity;

public class Conexion extends AsyncTask<String,String,String> {

    @Override
    protected String doInBackground(String... strings) {

        HttpURLConnection Coneccion = null;
        URL url = null;
        try {
            url = new URL(strings[0]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            Coneccion = (HttpURLConnection) url.openConnection ();
            Coneccion.connect();
            int code = Coneccion.getResponseCode();
            if (code == Coneccion.HTTP_OK){
                InputStream in = new BufferedInputStream(Coneccion.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String line = "";
                StringBuffer buffer = new StringBuffer();
                while((line = reader.readLine()) != null){
                    buffer.append(line);
                 }return buffer.toString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
