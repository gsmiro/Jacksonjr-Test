package br.com.metaway.android.test.model.v2;

/**
 * Created by gsmiro on 17/07/2014.
 */
public interface HasId<T> {

    void setId(T id);
    T getId();
}
