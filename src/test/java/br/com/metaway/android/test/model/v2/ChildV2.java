package br.com.metaway.android.test.model.v2;

/**
 * Created by gsmiro on 17/07/2014.
 */
public class ChildV2 implements HasId<Integer> {
    private Integer id;

    public ChildV2() {
    }

    public ChildV2(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
