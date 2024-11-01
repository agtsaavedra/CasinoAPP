package com.example.el_ez.practicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EERR extends AppCompatActivity {
    String nomcas;
    String tabla;
    String fecha;
    String campo;

    //TextViews Diarios
    TextView txt25MD;
    TextView txtConcepcionD;
    TextView txtDiamanteD;
    TextView txtGalanD;
    TextView txtJockeyD;

    //TextViewsMensuales
    TextView txt25MM;
    TextView txtConcepcionM;
    TextView txtDiamanteM;
    TextView txtGalanM;
    TextView txtJockeyM;


    private RequestQueue queue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_eerr);
        queue = Volley.newRequestQueue(this);
        //Diario
        MostrarDiario25Mayo();
        MostrarDiarioConcepcion();
        MostrarDiarioDiamante();
        MostrarDiarioGalan();
        MostrarDiarioJockey();

        //Mensual
        MostrarMensual25Mayo();
        MostrarMensualConcepcion();
        MostrarMensualDiamante();
        MostrarMensualGalan();
        MostrarMensualJockey();

    }

    //Mostrar diarioEERR-----------------------------------------------------------------------------------------------------

    public void MostrarDiario25Mayo(){

        nomcas = "25 de Mayo";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txt25MD = (TextView)findViewById(R.id.txtWinDiario25mayo);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txt25MD.setText(txtSuma);

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

    public void MostrarDiarioConcepcion(){

        nomcas = "Concepcion";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtConcepcionD = (TextView)findViewById(R.id.txtWinDiarioConcepcion);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtConcepcionD.setText(txtSuma);

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

        public void MostrarDiarioDiamante(){

        nomcas = "Diamante";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtDiamanteD = (TextView)findViewById(R.id.txtWinDiarioDiamante);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                       txtDiamanteD.setText(txtSuma);

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


    public void MostrarDiarioGalan(){

        nomcas = "Galan";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtGalanD = (TextView)findViewById(R.id.txtWinDiarioGalan);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                       txtGalanD.setText(txtSuma);

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


    public void MostrarDiarioJockey(){

        nomcas = "Jockey";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtJockeyD = (TextView)findViewById(R.id.txtWinDiarioJockey);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtJockeyD.setText(txtSuma);

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


//MOSTRAR MENSUALES AQUI---------------------------------------------------

    public void MostrarMensual25Mayo() {


    nomcas = "25 de Mayo";


    String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


    RequestQueue queue = Volley.newRequestQueue(this);

    txt25MM = (TextView) findViewById(R.id.txtWinMensual25mayo);

    JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {

            try {
                JSONArray array = response.getJSONArray("Casino");
                for (int i = 0; i < array.length(); i++) {
                    JSONObject consulta = array.getJSONObject(i);
                    double suma1 = 0;
                    String txtSuma;
                    suma1 = consulta.getDouble("SUMA");
                    txtSuma = Double.toString(suma1);
                    txt25MM.setText(txtSuma);

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


    public void MostrarMensualConcepcion() {


        nomcas = "Concepcion";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

        txtConcepcionM = (TextView) findViewById(R.id.txtWinMensualConcepcion);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtConcepcionM.setText(txtSuma);

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

        public void MostrarMensualDiamante() {


        nomcas = "Diamante";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

        txtDiamanteM = (TextView) findViewById(R.id.txtWinMensualDiamante);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtDiamanteM.setText(txtSuma);

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

    public void MostrarMensualGalan() {


        nomcas = "Galan";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

        txtGalanM = (TextView) findViewById(R.id.txtWinMensualGalan);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtGalanM.setText(txtSuma);

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

    public void MostrarMensualJockey() {


        nomcas = "Jockey";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

        txtJockeyM = (TextView) findViewById(R.id.txtWinMensualJockey);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtJockeyM.setText(txtSuma);

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




 //LANZAR DETALLES EERR

    public void lanzarDetalle25Mayo(View view) {
        Intent detalle = new Intent(getApplicationContext(),Detalle25Mayo.class);
        startActivity(detalle);

    }

    public void lanzarDetalleConcepcion(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleConcepcion.class);
        startActivity(detalle);

    }

    public void lanzarDetalleDiamante(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleDiamante.class);
        startActivity(detalle);

    }

    public void lanzarDetalleGalan(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleGalan.class);
        startActivity(detalle);

    }

    public void lanzarDetalleJockey(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleJockey.class);
        startActivity(detalle);

    }





}




