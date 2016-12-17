package com.example.redfame.project4;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class Database extends SQLiteOpenHelper {
    private static final String DB_NAME = "Pokemon";
    private static final int DB_VERSION = 2;

    public static final String TABLE_NAME = "PokemonData";

    public static final String PO_ENNAME = "p_name_en";
    public static final String PO_JPNAME = "p_name_jp";
    public static final String PO_TYPE = "p_type";
    public static final String PO_SPECIES = "p_species";
    public static final String PO_HEIGHT = "p_height";
    public static final String PO_WEIGHT = "p_weight";
    public static final String PO_Pic = "p_pic";

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME
                +" (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PO_ENNAME + " TEXT, "
                + PO_JPNAME + " TEXT, "
                + PO_TYPE + " TEXT, "
                + PO_SPECIES + " TEXT, "
                + PO_HEIGHT + " TEXT, "
                + PO_WEIGHT + " TEXT, "
                + PO_Pic + " TEXT );");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT + ", " +PO_Pic
                + ") VALUES ('Bulbasaur', 'Fushigidane', 'Grass+Poison', 'Seed'"
                + ", '0.71m', '6.9 kg', 'Bulbasaur.png');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT +", " +PO_Pic
                + ") VALUES ('Ivysaur', 'Fushigisou', 'Grass+Poison', 'Seed'"
                + ", '0.99m', '13.0 kg', 'Ivysaur.png');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Venusaur', 'Fushigibana', 'Grass+Poison', 'Seed'"
                + ", '2.01m', '100.0 kg', 'Venusaur.png');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Charmander', 'Hitokage', 'Fire', 'Lizard'"
                + ", '0.61m', '8.5 kg', 'Charmander.png');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Charmeleon', 'Rizado', 'Fire', 'Lizard'"
                + ", '0.61m', '8.5 kg', 'Charmeleon.png');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Charizard', 'Rizadon', 'Fire+Flying', 'Flame'"
                + ", '1.70m', '90.5 kg', 'Charizard.png');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Squirtle', 'Zenigame', 'Water', 'Tiny Turtle'"
                + ", '0.51m', '9.0 kg', 'Squirtle.png');");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Wartortle', 'Kameru', 'Water', 'Turtle'"
                + ", '0.99m', '22.5 kg', 'Wartortle.png');");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Blastoise', 'Kamekkusu', 'Water', 'Shellfish'"
                + ", '1.60m', '85.5 kg', 'Blastoise.png');");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Caterpie', 'Kyatapi', 'Bug', 'Worm'"
                + ", '0.30m', '2.9 kg', 'Caterpie.png');");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Metapod', 'Toranseru', 'Bug', 'Cocoon'"
                + ", '0.71m', '9.9 kg', 'Metapod.png');");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Butterfree', 'Batafuri', 'Bug+Flying', 'Butterfly'"
                + ", '1.09m', '32.0 kg', 'Butterfree.png');");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Weedle', 'Bidoru', 'Bug+Poison', 'Hairy Bug'"
                + ", '0.30m', '3.2 kg', 'Weedle.png');");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Kakuna', 'Kokun', 'Bug+Poison', 'Cocoon'"
                + ", '0.61m', '10.0 kg', 'Kakuna.png');");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + PO_ENNAME
                + ", " + PO_JPNAME + ", " + PO_TYPE + ", "
                + PO_SPECIES + ", " + PO_HEIGHT + ", " + PO_WEIGHT+", " +PO_Pic
                + ") VALUES ('Beedrill', 'Supia', 'Bug+Poison', 'Poison Bee'"
                + ", '0.99m', '29.5 kg', 'Beedrill.png');");



    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion
            , int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
}
