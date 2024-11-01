package com.example.el_ez.practicas;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.el_ez.practicas.EERR;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private RequestQueue queue;
    TextView txtmHotel;

    EditText Usuario;
    EditText Passw;
    Button GetButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Usuario = findViewById(R.id.TxtName);
         Passw = findViewById(R.id.Txtpass);
         GetButton = findViewById(R.id.btnaceptar);


        queue = Volley.newRequestQueue(this);
         GetButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 ObtenerDatos();
                 try {
                     EERR.class.getMethod("MostrarDatosEERR");
                 } catch (NoSuchMethodException e) {
                     e.printStackTrace();
                 }


             }
         });
         }
         private void ObtenerDatos (){

             String url = "https://ezequiel1697.000webhostapp.com/index.php?&user="+Usuario.getText()+"&pass="+Passw.getText();

             JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                 @Override
                 public void onResponse(JSONObject response) {

                     try {
                         JSONArray array = response.getJSONArray("usuarios");

                         if(array.length()>0 && array.length()< 2 ){
                             Toast.makeText(getApplicationContext(),"INICIO SESION EXITOSO",Toast.LENGTH_LONG).show();

                             Intent ListSong = new Intent(getApplicationContext(), Circuitos.class);
                             startActivity(ListSong);

                         }else {

                             AlertDialog alertdiag = new AlertDialog.Builder(MainActivity.this).create();
                             alertdiag.setTitle("Mensaje");
                             alertdiag.setMessage("Inicio de Sesion Fallido");
                             alertdiag.show();

                         }

                     } catch (JSONException e) {
                         e.printStackTrace();
                     }

                 }
             }, new Response.ErrorListener() {
                 @Override
                 public void onErrorResponse(VolleyError error) {

                 }
             });

            queue.add(request);




         }

        public  void lanzar (View view){
            Intent i = new Intent(this,Circuitos.class);
            startActivity(i);

        }

 }



