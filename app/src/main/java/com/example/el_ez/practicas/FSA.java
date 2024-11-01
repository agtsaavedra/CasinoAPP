package com.example.el_ez.practicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

import java.util.ArrayList;

public class FSA extends AppCompatActivity {
    String suma1;
    TextView txtHotelWM;
    TextView txtHotelWM1;

    //TextViews Diarios
    TextView txtCircuito5D;
    TextView txtHotelCasinoD;
    TextView txtColoradoD;
    TextView txtClorindaD;
    TextView txtPiraneD;
    TextView txtSanMartinD;


    //TextViews Mensuales
    TextView txtHotelM;
    TextView txtCircuito5M;
    TextView txtColoradoM;
    TextView txtClorindaM;
    TextView txtSanMartinM;
    TextView txtPiraneM;


    String nomcas;
    String tabla;
    String sala;
    String fecha;
    String tipowin;
    RequestQueue queue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsa);

        //Metodos mostrar diario
        MostrarDiarioC5();
        MostrarDiarioColorado();
        MostrarDiarioSanMartin();
        MostrarDiarioHotelCasino();
        MostrarDiarioPirane();
        MostrarDiarioClorinda();

        // MostrarFinal();
        MostrarMensualHotelCasino();
        MostrarMensualPirane();
        MostrarMensualClorinda();
        MostrarMensualColorado();
        MostrarMensualSanMartin();
        MostrarMensualCircuito5();



    }


    //MOSTRAR DIARIO FSA--------------------------------------------------------------------------
    public void MostrarDiarioC5(){

        nomcas = "Circuito 5";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtCircuito5D = (TextView)findViewById(R.id.txtWinDiarioCirc5);

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
                        txtCircuito5D.setText(txtSuma);

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


    public void MostrarDiarioClorinda(){

        nomcas = "Clorinda";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtClorindaD = (TextView)findViewById(R.id.txtWinDiarioClorinda);

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
                        txtClorindaD.setText(txtSuma);

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


    public void MostrarDiarioColorado(){

        nomcas = "Colorado";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtColoradoD = (TextView)findViewById(R.id.txtWinDiarioColorado);

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
                        txtColoradoD.setText(txtSuma);

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



    public void MostrarDiarioHotelCasino(){

        nomcas = "Hotel Casino";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

            txtHotelCasinoD = (TextView)findViewById(R.id.txtWinDiarioHotelCasino);

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
                        txtHotelCasinoD.setText(txtSuma);

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


    public void MostrarDiarioPirane(){

        nomcas = "Pirane";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtPiraneD = (TextView)findViewById(R.id.txtWinDiarioPirane);

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
                        txtPiraneD.setText(txtSuma);

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

    public void MostrarDiarioSanMartin(){

        nomcas = "San Martin";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_diaria.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtSanMartinD = (TextView)findViewById(R.id.txtWinDiarioSanMartin);

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
                        txtSanMartinD.setText(txtSuma);

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



    //MostrarMensualFSA----------------------------------------------------------------------------

    public void MostrarMensualHotelCasino() {


        nomcas = "Hotel Casino";


            String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


            RequestQueue queue = Volley.newRequestQueue(this);

            txtHotelM = (TextView) findViewById(R.id.txtWinMensualHotelCasino);


            JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {

                            try {
                                JSONArray array = response.getJSONArray("Casino");


                                double sumatotal = 0;
                                for (int i = 0; i < array.length(); i++) {
                                    JSONObject consulta = array.getJSONObject(i);
                                    double suma1 = 0;
                                    String txtSuma;
                                    suma1 = consulta.getDouble("SUMA");
                                    txtSuma = Double.toString(suma1);
                                    txtHotelM.setText(txtSuma);

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


    public void MostrarMensualColorado() {


        nomcas = "Colorado";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

        txtColoradoM = (TextView) findViewById(R.id.txtWinMensualColorado);

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
                        txtColoradoM.setText(txtSuma);

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

    public void MostrarMensualClorinda() {


        nomcas = "Clorinda";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

       txtClorindaM = (TextView) findViewById(R.id.txtWinMensualClorinda);

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
                        txtClorindaM.setText(txtSuma);

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



    public void MostrarMensualPirane() {


        nomcas = "Pirane";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

        txtPiraneM = (TextView) findViewById(R.id.txtWinMensualPirane);

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
                        txtPiraneM.setText(txtSuma);

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

    public void MostrarMensualCircuito5() {


        nomcas = "Circuito 5";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

        txtCircuito5M = (TextView) findViewById(R.id.txtWinMensualCirc5);

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
                        txtCircuito5M.setText(txtSuma);

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

    public void MostrarMensualSanMartin() {


        nomcas = "San Martin";


        String url = "https://ezequiel1697.000webhostapp.com/consulta_casino_mensual.php?&nomcas=" + nomcas;


        RequestQueue queue = Volley.newRequestQueue(this);

        txtSanMartinM = (TextView) findViewById(R.id.txtWinMensualSanMartin);

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
                        txtSanMartinM.setText(txtSuma);

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


//Metodos Para lanzar Detalle -------------------------------------------------------------------------------------------------
    public void lanzarDetalleCircuito(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleCircuito.class);
        startActivity(detalle);

    }

    public void lanzarDetalleClorinda(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleClorinda.class);
        startActivity(detalle);

    }

    public void lanzarDetalleColorado(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleColorado.class);
        startActivity(detalle);

    }

    public void lanzarDetalleHotelCasino(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleHotelCasino.class);
        startActivity(detalle);

    }

    public void lanzarDetallePirane(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetallePirane.class);
        startActivity(detalle);

    }

    public void lanzarDetalleSanMartin(View view) {
        Intent detalle = new Intent(getApplicationContext(),DetalleSanMartin.class);
        startActivity(detalle);

    }

}