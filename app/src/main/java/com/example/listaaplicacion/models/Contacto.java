package com.example.listaaplicacion.models;

import java.util.ArrayList;

public class Contacto {
    public String phone;
    public String nickname;
    public String image;


    public String getSmallImage(){
        return this.image;
    }

    public Contacto(String _phone, String _nickname, String _image) {
        this.phone = _phone;
        this.nickname = _nickname;
        this.image = _image;
    }

    public static ArrayList getCollection() {
        ArrayList<Contacto> collection = new ArrayList<>();
        collection.add(new Contacto("981999923", "Bichito", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-4.jpg"));
        collection.add(new Contacto("9859913923", "Plaga", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-7.jpg" ));
        collection.add(new Contacto("981914213", "Libelula", "https://mymodernmet.com/wp/wp-content/uploads/2019/09/100k-ai-faces-8.jpg"));
        return collection;
    }
}
