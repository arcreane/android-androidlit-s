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
    public static final String PLAYER = "PLAYER";
    public static final String PLAYER_ID = "PLAYER_ID";
    public static final String PLAYER_Name = "PLAYER_Name";
    public static final String QUESTION = "QUESTION";
    public static final String QUESTION_ID = "QUESTION_ID";
    public static final String QUESTION_Entitled = "QUESTION_Entitled";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "TrueOrDare.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder createTableStatement = new StringBuilder("CREATE TABLE " + PARTY + " (" + PARTY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + PARTY_DATE + " Date)");
        createTableStatement.append("CREATE TABLE " + PLAYER + " (" + PLAYER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + PLAYER_Name + " Varchar)");
        createTableStatement.append("CREATE TABLE " + QUESTION + " (" + QUESTION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + QUESTION_Entitled + " Varchar)");
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
