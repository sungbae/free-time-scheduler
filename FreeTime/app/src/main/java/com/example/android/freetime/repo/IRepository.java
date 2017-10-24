package com.example.android.freetime.repo;

import java.util.List;

/**
 * Created by sungbae on 10/18/17.
 */

public interface IRepository {
    public int create(Object item);
    public int update(Object item);
    public int delete(Object item);
    public Object findById(int id);
}
