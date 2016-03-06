package win.hezhihu89.schoolyearbook.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hezhihu89 on 16/3/6.
 */
public class DBHelp extends SQLiteOpenHelper {


    private static final String TAG = " DBHelp : ";


    public DBHelp(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists hero_info("
                + "id integer primary key," //id 存储顺序
                + "name varchar,"     //姓名
                + "motto varchar"     //格言警句
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
