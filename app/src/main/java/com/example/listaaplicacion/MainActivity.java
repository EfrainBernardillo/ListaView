package com.example.listaaplicacion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.listaaplicacion.adaptars.ContactoAdaptador;
import com.example.listaaplicacion.helpers.QueueUtils;
import com.example.listaaplicacion.models.Contacto;

public class MainActivity extends AppCompatActivity {
    QueueUtils.QueueObject queue = null;
    ListView contactosList;
    ContactoAdaptador contactoAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = QueueUtils.getInstance(this.getApplicationContext());
        contactosList = findViewById(R.id.contactosList);
        contactoAdaptador = new ContactoAdaptador(this, Contacto.getCollection(), queue.getImageLoader());
        contactosList.setAdapter(contactoAdaptador);
    }
}