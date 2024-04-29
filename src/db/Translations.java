package db;

import java.util.ArrayList;

public class  Translations  {

    public static ArrayList<ArrayList<String>> translations  =  new  ArrayList<>();

    static  {
        ArrayList<String>  kazakh  =  new  ArrayList<>();
        ArrayList<String>  spanish  =  new  ArrayList<>();
        ArrayList<String>  english  =  new  ArrayList<>();

        english.add("Full Name");
        english.add("Age");
        english.add("Country");
        english.add("Gender");
        english.add("Insurance Number");
        english.add("Send Document");
        english.add("Male");
        english.add("Female");

        spanish.add("Nombre completo");
        spanish.add("Edad");
        spanish.add("País");
        spanish.add("Género");
        spanish.add("Numero de seguro");
        spanish.add("Enviar documento");
        spanish.add("El varón");
        spanish.add("La hembra");

        kazakh.add("Tolıq atı");
        kazakh.add("Jası");
        kazakh.add("El");
        kazakh.add("Jınıs");
        kazakh.add("Saqtandırw nömiri");
        kazakh.add("Qujattı jiberw");
        kazakh.add("Еркек");
        kazakh.add("Äyel");

        translations.add(english);
        translations.add(kazakh);
        translations.add(spanish);
    }

}


