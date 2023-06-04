package com.example.tarifuyg;

public class Model {

    int image;
    String name,tarif;


    public Model(int image,String name,String tarif){
        this.image=image;
        this.name= name;
        this.tarif=tarif;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
}
