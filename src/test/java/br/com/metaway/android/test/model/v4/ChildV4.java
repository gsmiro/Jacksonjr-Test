package br.com.metaway.android.test.model.v4;

/**
 * Created by gsmiro on 17/07/2014.
 */
public class ChildV4 implements HasId<Long> {
    private Long id;

    public ChildV4() {
    }

    public ChildV4(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
