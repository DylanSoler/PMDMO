package com.example.nitropc.listviewheterogenea;

import android.app.ListActivity;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    private static final Equipo betis = new Equipo(R.drawable.betis, "Betis");
    private static final Equipo barca = new Equipo(R.drawable.barca, "Barca");
    private static final Equipo atletico = new Equipo(R.drawable.atletico, "Atletico");
    private static final Equipo villarreal = new Equipo(R.drawable.villarreal, "Villarreal");
    private static final Equipo valencia = new Equipo(R.drawable.valencia, "Valencia");
    private static final Equipo madrid = new Equipo(R.drawable.madrid, "Madrid");
    private static final Equipo betis2 = new Equipo(R.drawable.betis, "Betis");
    private static final Equipo barca2 = new Equipo(R.drawable.barca, "Barca");
    private static final Equipo atletico2 = new Equipo(R.drawable.atletico, "Atletico");
    private static final Equipo villarreal2 = new Equipo(R.drawable.villarreal, "Villarreal");
    private static final Equipo valencia2 = new Equipo(R.drawable.valencia, "Valencia");
    private static final Equipo madrid2 = new Equipo(R.drawable.madrid, "Madrid");

    private static final ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equipos.add(betis);
        equipos.add(barca);
        equipos.add(atletico);
        equipos.add(villarreal);
        equipos.add(valencia);
        equipos.add(madrid);
        equipos.add(betis2);
        equipos.add(barca2);
        equipos.add(atletico2);
        equipos.add(villarreal2);
        equipos.add(valencia2);
        equipos.add(madrid2);

        setListAdapter(new CustomListAdapter(this, equipos));


    }

    class CustomListAdapter extends BaseAdapter {

        private Context context; //context
        private ArrayList<Equipo> equipos; //data source of the list adapter

        //public constructor
        public CustomListAdapter(Context context, ArrayList<Equipo> items) {
            this.context = context;
            this.equipos = items;
        }

        @Override
        public int getCount() {
            return equipos.size(); //returns total of items in the list
        }

        @Override
        public Object getItem(int position) {
            return equipos.get(position); //returns list item at the specified position
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }

        @Override
        public int getItemViewType(int position) {
            int type;
            if (position % 2 == 0) {
                type = 0;
            } else {
                type = 1;
            }

            return type;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            ViewHolder1 holder1;
            ViewHolder2 holder2;
            TextView tVrow1;
            TextView tVrow2;
            ImageView iVrow1;
            ImageView iVrow2;
            ImageView iVrow22;

            if (row == null) {
                LayoutInflater inflater = getLayoutInflater();

                if (getItemViewType(position) == 0) {
                    row = inflater.inflate(R.layout.row1, parent, false);

                    tVrow1 = (TextView) row.findViewById(R.id.tVrow1);
                    iVrow1 = (ImageView) row.findViewById(R.id.iVrow1);
                    holder1 = new ViewHolder1(tVrow1, iVrow1);
                    row.setTag(holder1);
                } else {
                    row = inflater.inflate(R.layout.row2, parent, false);

                    iVrow2 = (ImageView) row.findViewById(R.id.iVrow2);
                    tVrow2 = (TextView) row.findViewById(R.id.tVrow2);
                    iVrow22 = (ImageView) row.findViewById(R.id.iVrow22);
                    holder2 = new ViewHolder2(iVrow2, tVrow2, iVrow22);
                    row.setTag(holder2);
                }
            }

            if (getItemViewType(position) == 0) {
                holder1 = (ViewHolder1) row.getTag();
                holder1.getLab().setText(equipos.get(position).getNombre());
                holder1.getImg().setImageResource(equipos.get(position).getEscudo());
            } else {
                holder2 = (ViewHolder2) row.getTag();
                holder2.getImg().setImageResource(equipos.get(position).getEscudo());
                holder2.getLab().setText(equipos.get(position).getNombre());
                holder2.getImg2().setImageResource(equipos.get(position).getEscudo());
            }

            return (row);

        }
    }


        class ViewHolder1 {
            TextView tv;
            ImageView iv;

            ViewHolder1(TextView tv, ImageView iv) {
                this.tv = tv;
                this.iv = iv;
            }

            public TextView getLab() {
                return this.tv;
            }

            public ImageView getImg() {
                return this.iv;
            }
        }

        class ViewHolder2 {
            ImageView iv;
            TextView tv;
            ImageView iv2;

            ViewHolder2(ImageView iv, TextView tv, ImageView iv2) {
                this.iv = iv;
                this.tv = tv;
                this.iv2 = iv2;
            }

            public ImageView getImg() {
                return this.iv;
            }

            public TextView getLab() {
                return this.tv;
            }

            public ImageView getImg2() {
                return this.iv2;
            }
        }
}


