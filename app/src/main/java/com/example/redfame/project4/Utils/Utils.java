package com.example.redfame.project4.Utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Utils {
    public static Drawable getDrawable(Context context,String pictrue){
        AssetManager am = context.getAssets();
        try{
            InputStream stream = am.open(pictrue);
            Drawable drawable =  Drawable.createFromStream(stream,null);
            return  drawable;
        }catch ( IOException e){
            e.printStackTrace();
            try {

                InputStream stream = new FileInputStream(pictrue);
                Drawable drawable = Drawable.createFromStream(stream, null);
                return drawable;

            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }

        }
        return null;

    }

}
