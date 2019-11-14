package com.example.submission;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Waistbag Tenun",
            "Tas Ransel",
            "Tas Lombok ",
            "Tas Serut",
            "Kemeja Hawai",
            "Tas Toraja",
            "Tas Koja",
            "Slingbag Walker",
            "Blanket Sumba",
            "Blanket Toraja"
    };

    private static String[] heroDetails = {
            "Weistbag Tenun merupakan produk lokal yang berbahan dasar dari perpaduan antara Kain kanvas dan tenun asli lombok.",
            "Tas Ransel merupakan produk lokal yang berbahan dasar dari tenun asli lombok yang di desain menjadi model ransel, sangat cocok untuk kamu pecinta ethnic dan fashion outdoor.",
            "Tas Lombok merupakan produk lokal yang terbuat dari full tenun lombok dari desa sade, produk ini sangat digemari dan menjadi oleh oleh khas dari lombok.",
            "Tas Serut ( produk lokal handmade satu ini terbuat dari bahan tenun Toraja, dengan model tas serut.",
            "Kemeja Hawai merupakan produk lokal yang berbahan dasar dari perpaduan antara Kain kanvas dan tenun asli lombok.",
            "Tas Toraja merupakan produk lokal yang berbahan dasar dari perpaduan antara Kain kanvas dan tenun asli lombok.",
            "Tas Koja merupakan produk lokal yang berbahan dasar dari perpaduan antara Kain kanvas dan tenun asli lombok.",
            "Slingbag Walker merupakan produk lokal yang berbahan dasar dari perpaduan antara Kain kanvas dan tenun asli lombok.",
            "Blanket Sumba merupakan produk lokal yang berbahan dasar dari perpaduan antara Kain kanvas dan tenun asli lombok.",
            "Blanket Toraja merupakan produk lokal yang berbahan dasar dari perpaduan antara Kain kanvas dan tenun asli lombok."
    };

    private static int[] heroesImages = {
            R.drawable.waistbag_tenun,
            R.drawable.tas_ransel,
            R.drawable.tas_lombok,
            R.drawable.tas_serut,
            R.drawable.kemeja_hawai,
            R.drawable.tas_toraja,
            R.drawable.tas_koja,
            R.drawable.slingbag_walker,
            R.drawable.blanket_sumba,
            R.drawable.blanket_toraja
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}