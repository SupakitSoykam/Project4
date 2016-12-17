package com.example.redfame.project4;


import android.app.Dialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.redfame.project4.Utils.Utils;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {

    SQLiteDatabase mDb;
    Database mHelper;
    Cursor mCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        mHelper = new Database(this);
        mDb = mHelper.getWritableDatabase();

        mCursor = mDb.rawQuery("SELECT * FROM "
                + Database.TABLE_NAME, null);

        ArrayList<String> dirArray = new ArrayList<String>();

        mCursor.moveToFirst();
        while ( !mCursor.isAfterLast() ){
            dirArray.add(mCursor.getString(mCursor.getColumnIndex
                    (Database.PO_JPNAME)));
            mCursor.moveToNext();
        }


        ListView listView1 = (ListView)findViewById(R.id.listView1);
        listView1.setAdapter(new ArrayAdapter(this
                , android.R.layout.simple_list_item_1, dirArray));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1
                    , int arg2, long arg3) {
                mCursor.moveToPosition(arg2);

                final Dialog dialog = new Dialog(AboutActivity.this);
                dialog.requestWindowFeature
                        (dialog.getWindow().FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_data);

                TextView textTHName =
                        (TextView)dialog.findViewById(R.id.textENName);
                textTHName.setText("Name English : "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.PO_ENNAME)));

                TextView textENName =
                        (TextView)dialog.findViewById(R.id.textJPName);
                textENName.setText("Name Japanese : "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.PO_JPNAME)));

                TextView textKingdom =
                        (TextView)dialog.findViewById(R.id.textType);
                textKingdom.setText("Type : "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.PO_TYPE)));

                TextView textPhylum =
                        (TextView)dialog.findViewById(R.id.textSpecies);
                textPhylum.setText("Species : "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.PO_SPECIES)));

                TextView textClass =
                        (TextView)dialog.findViewById(R.id.textHeight);
                textClass.setText("Height : "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.PO_HEIGHT)));

                TextView textOrder =
                        (TextView)dialog.findViewById(R.id.textWeight);
                textOrder.setText("Weight : "
                        + mCursor.getString(mCursor.getColumnIndex
                        (Database.PO_WEIGHT)));

                String pictrue = mCursor.getString(mCursor.getColumnIndex
                        (Database.PO_Pic));
                ImageView imageView = (ImageView)dialog.findViewById(R.id.imageView);
                Drawable drawable = Utils.getDrawable(AboutActivity.this,pictrue);
                imageView.setImageDrawable(drawable);

                Button buttonOK =
                        (Button)dialog.findViewById(R.id.buttonOK);
                buttonOK.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

                dialog.show();
            }
        });
    }

    public void onPause() {
        super.onPause();
        mHelper.close();
        mDb.close();
    }
}