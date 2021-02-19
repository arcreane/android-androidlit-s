package Extension;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.Date;

import model.Party;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String PARTY = "Party";
    public static final String PARTY_DATE = "PARTY_DATE";
    public static final String PARTY_ID = "PARTY_ID";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "TrueOrDare.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + PARTY + " (" + PARTY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + PARTY_DATE + " Date)";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean CreateParty(Party pPartyModel) {
        SQLiteDatabase db = this.getWritableDatabase();

        Date dateCreated = new Date(System.currentTimeMillis());
        ContentValues contentValues = new ContentValues();

        contentValues.put(PARTY_DATE, String.valueOf(dateCreated));

        long insert = db.insert(PARTY, null, contentValues);
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }
}
