package br.com.metaway.android.test.model.v3;

/**
 * Created by gsmiro on 17/07/2014.
 */
public class ChildV3 implements HasId {
    private Integer id;

    public ChildV3() {
    }

    public ChildV3(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
