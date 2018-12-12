package com.example.dasoler.listviewdinamic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class DescripcionEquipos extends AppCompatActivity {

    TextView tv;
    String equipoSelect;
    String descBetis = "El Real Betis Balompié, también conocido como Real Betis o simplemente Betis, es una entidad polideportiva con sede en Sevilla, España. Fue establecida en septiembre de 1908 para la práctica del fútbol —aunque sus orígenes datan de 1907 y así consta como fecha fundacional por el propio club—, y oficialmente registrada el 1 de febrero de 1909.";
    String descBarca = "El Fútbol Club Barcelona (en catalán, Futbol Club Barcelona) es una entidad polideportiva de Barcelona (España). Fue fundado como club de fútbol el 29 de noviembre de 1899.";
    String descAtletico ="El Club Atlético de Madrid es un club de fútbol español de la ciudad de Madrid, fundado el 26 de abril de 1903. Su primer equipo masculino milita en la Primera División de España y disputa sus partidos como local desde la temporada 2017/18, en el Estadio Metropolitano, con capacidad de 69 829 espectadores.";
    String descVillarreal ="El Villarreal CF se fundó el 10 de marzo de 1923 bajo el nombre de Club Deportivo Villarreal, y desde el 17 de junio de 1923 disputa sus encuentros en el Estadio de la Cerámica, con capacidad para 23 500 espectadores.";
    String descValencia ="El Valencia Club de Fútbol es una sociedad anónima deportiva con sede en la ciudad de Valencia, España. El club de fútbol fue fundado el 18 de marzo de 1919. Su primer equipo juega en la LaLiga Santander, la máxima competición de fútbol en España, y disputa sus encuentros como local en el estadio de Mestalla, que dispone de una capacidad para 50.242 espectadores.";
    String descMadrid ="El Real Madrid Club de Fútbol, más conocido simplemente como Real Madrid, es una entidad polideportiva con sede en Madrid, España. Fue declarada oficialmente registrada como club de fútbol por sus socios el 6 de marzo de 1902 con el objeto de la práctica y desarrollo de este deporte —si bien sus orígenes datan al año 1900, y su denominación de (Sociedad) Madrid Foot-ball Club a noviembre de 1901—. Tuvo a Julián Palacios y los hermanos Juan Padrós y Carlos Padrós como principales valedores de su creación.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_equipos);

        tv = (TextView) findViewById(R.id.tvDescripcion);
        equipoSelect = getIntent().getExtras().getString("nombreEquipo");

        switch(equipoSelect)
        {
            case "Betis":
                        tv.setText(descBetis);
                        break;
            case "Barca":
                        tv.setText(descBarca);
                        break;
            case "Atletico":
                        tv.setText(descAtletico);
                        break;
            case "Villarreal":
                        tv.setText(descVillarreal);
                        break;
            case "Valencia":
                        tv.setText(descValencia);
                        break;
            case "Madrid":
                        tv.setText(descMadrid);
                        break;

        }

    }
}
