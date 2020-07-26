package svecw.sushma.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDao  {

    @Insert
    void  insertData(StudentEntity studentEntity);
    @Query("select * from studentEntity")
    List<StudentEntity>getAll();
}
