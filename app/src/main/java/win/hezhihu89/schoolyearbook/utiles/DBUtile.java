package win.hezhihu89.schoolyearbook.utiles;

import android.content.ContentValues;

import win.hezhihu89.schoolyearbook.app.APP;
import win.hezhihu89.schoolyearbook.db.DBHelp;

/**
 * Created by hezhihu89 on 16/3/6.
 */
public class DBUtile {

    private DBHelp getInstance() {
        return SingleInstance.dbHelp;
    }

    static class SingleInstance {
        public static DBHelp dbHelp = new DBHelp(APP.getContext(), "schoolyearbook", null, 1);
    }


}
