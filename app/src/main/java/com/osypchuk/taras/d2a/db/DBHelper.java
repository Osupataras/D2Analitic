package com.osypchuk.taras.d2a.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taras on 29.11.2016.
 */

public class DBHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "heroesINFO";
    private static final String TABLE_HEROES = "heroes";
    private static final String ID = "id";
    private static final String HERO_NAME_ID = "hero_id";
    private static final String HERO_NAME_FULL = "hero_name";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_HEROES_TABLE = "CREATE TABLE" + TABLE_HEROES + "("
                + ID + " INTEGER PRIMARY KEY," + HERO_NAME_ID + " TEXT,"
                + HERO_NAME_FULL + " TEXT" + ")";
        db.execSQL(CREATE_HEROES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HEROES);
        onCreate(db);
    }

    public void addItem(DBItem dbItem) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(HERO_NAME_ID, dbItem.getHERO_NAME());
        values.put(HERO_NAME_FULL, dbItem.getHERO_NAME_FULL());

        db.insert(TABLE_HEROES, null, values);
        db.close();
    }

    public DBItem getDBItem(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_HEROES, new String[]{ID,
                        HERO_NAME_ID, HERO_NAME_FULL}, ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        DBItem dbItem = new DBItem(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));

        return dbItem;
    }


    public List<DBItem> getAllHeroes() {
        List<DBItem> ItemList = new ArrayList<DBItem>();
        String selectQuery = "SELECT * FROM" + TABLE_HEROES;
//        Read More:5 Most Common Android Animations ' Code
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);


        if (cursor.moveToFirst()) {
            do {
                DBItem dbItem = new DBItem();
                dbItem.setID(Integer.parseInt(cursor.getString(0)));
                dbItem.setHERO_NAME(cursor.getString(1));
                dbItem.setHERO_NAME_FULL(cursor.getString(2));
                ItemList.add(dbItem);
            } while (cursor.moveToNext());
        }


        return ItemList;
    }


    public int getHeroesCount() {
        String countQuery = "SELECT * FROM" + TABLE_HEROES;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();


        return cursor.getCount();
    }


    public int updateHero(DBItem dbItem) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(HERO_NAME_ID, dbItem.getHERO_NAME());
        values.put(HERO_NAME_FULL, dbItem.getHERO_NAME_FULL());

        return db.update(TABLE_HEROES, values, ID +" =?",
        new String[]{String.valueOf(dbItem.getID())});
    }


    public void deleteHero(DBItem dbItem) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_HEROES, ID + " =?",
        new String[]{String.valueOf(dbItem.getID())});
        db.close();
    }
}

