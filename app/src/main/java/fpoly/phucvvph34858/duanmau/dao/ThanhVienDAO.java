package fpoly.phucvvph34858.duanmau.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import fpoly.phucvvph34858.duanmau.database.DBhelper;
import fpoly.phucvvph34858.duanmau.model.ThanhVien;

public class ThanhVienDAO {
    DBhelper dBhelper;

    public
    ThanhVienDAO(Context context) {
        dBhelper = new DBhelper(context);
    }

    public ArrayList<ThanhVien> getDSThanhVien() {
        ArrayList<ThanhVien> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dBhelper.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM THANHVIEN",null);
        if(cursor.getCount() != 0) {
            cursor.moveToFirst();
            do{
                list.add(new ThanhVien(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString (3)));
            }while (cursor.moveToNext());
        }
        return list;
    }

    public boolean themThanhVien(String hoten,String namsinh,String stk) {
        SQLiteDatabase sqLiteDatabase = dBhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hoten",hoten);
        contentValues.put("namsinh",namsinh);
        contentValues.put ("stk",stk);
        long check = sqLiteDatabase.insert("THANHVIEN",null,contentValues);
        if(check == -1)
            return false;
        return true;
    }

    public boolean xoaThanhVien(int matv) {
        SQLiteDatabase sqLiteDatabase = dBhelper.getWritableDatabase();
        long check = sqLiteDatabase.delete("THANHVIEN","matv = ?", new String[]{String.valueOf(matv)});
        return check != -1;
    }

}
