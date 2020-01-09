package com.example.listaaplicacion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.listaaplicacion.adaptars.ContactoAdaptador;
import com.example.listaaplicacion.helpers.QueueUtils;
import com.example.listaaplicacion.models.Contacto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    QueueUtils.QueueObject queue = null;
    ListView contactosList;
    ContactoAdaptador contactoAdaptador;
    ArrayList<Contacto> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = QueueUtils.getInstance(this.getApplicationContext());
        contactosList = findViewById(R.id.contactosList);
        items = new ArrayList<>();
        Contacto.injectContactsFromCloud(queue, items, this);
        contactoAdaptador = new ContactoAdaptador(this, items, queue.getImageLoader());
        contactosList.setAdapter(contactoAdaptador);

        Contacto.sendRequestPOST(queue, this);


    }

    public void refreshList(){
        if ( contactoAdaptador!= null ) {
            contactoAdaptador.notifyDataSetChanged();
        }
    }
}