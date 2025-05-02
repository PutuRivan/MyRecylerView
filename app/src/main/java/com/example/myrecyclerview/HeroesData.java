package com.example.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Ahmad Dahlan",
            "Ahmad Yani",
            "Sutomo",
            "Gatot Soebroto",
            "Ki Hadjar Dewantara",
            "Mohammad Hatta",
            "Soedirman",
            "Soekarno",
            "Soepomo",
            "Tan Malaka",
            "Putu Rivan Anggana Dharmawangsa"
    };
    private static String[] heroDetails = {
            "Salah seorang ulama dan khatib terkemuka di Masjid Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H.Ahmad Dahlan adalah puteri dari H.Ibrahim yang juga menjabat penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu.",
            "Jenderal TNI Anumerta Ahmad Yani (lahir di Purworejo, Jawa Tengah, 19Juni 1922 – meninggal di Lubang Buaya, Jakarta, 1Oktober 1965) adalah komandan TNI AD, dan dibunuh oleh anggota Gerakan 30September .",
            "Sutomo (lahir di Surabaya, 3 Oktober 1920 – meninggal di Padang Arafah, 7Oktober 1981), dikenal sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam pertempuran 10November 1945di Surabaya .",
            "Jenderal TNI (Purn.) Gatot Soebroto (lahir di Sumpiuh, 10 Oktober 1907 – meninggal di Jakarta,11Juni 1962) adalah tokoh perjuangan militer Indonesia dan dimakamkan di Ungaran, Semarang.",
            "Raden Mas Soewardi Soerjaningrat atau Ki Hadjar Dewantara ( lahir di Pakualaman,2Mei 1889 – meninggal di Yogyakarta,26April 1959) adalah aktivis kemerdekaan,politisi, dan pelopor pendidikan melalui Perguruan Taman Siswa .",
            "Mohammad Hatta (lahir di Bukittinggi, 12 Agustus 1902 – meninggal di Jakarta,14Maret 1980) adalah tokoh proklamator,wakil presiden pertama RI, dan dikenal sebagai Bapak Koperasi Indonesia.",
            "Jenderal Besar Soedirman (lahir 24 Januari 1916 – meninggal 29 Januari 1950) adalah panglima besar pertama TNI dan pemimpin gerilya pada masa revolusi kemerdekaan .",
            "Ir. Soekarno (lahir 6 Juni 1901 – meninggal 21 Juni 1970) adalah Presiden pertama RI, proklamator kemerdekaan Indonesia, dan pencetus Pancasila .",
            "Prof. Mr. Dr. Soepomo (lahir 22 Januari 1903 – meninggal 12 September 1958) adalah arsitek UUD 1945 dan salah satu pahlawan nasional Indonesia .",
            "Tan Malaka (lahir 2 Juni 1897 – meninggal 21 Februari 1949) adalah tokoh kemerdekaan, pendiri Partai Murba, dan juga pernah terlibat dalam Partai Komunis Indonesia."
    };
    private static int[] heroesImages = {
            R.drawable.ahmad_dahlan,
            R.drawable.ahmad_yani,
            R.drawable.bung_tomo,
            R.drawable.gatot_subroto,
            R.drawable.ki_hadjar_dewantara,
            R.drawable.mohammad_hatta,
            R.drawable.sudirman,
            R.drawable.sukarno,
            R.drawable.supomo,
            R.drawable.tan_malaka
    };

    public static ArrayList<Hero> getListData() {
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
