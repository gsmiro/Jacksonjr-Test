package br.com.metaway.android.test.model.v2;

/**
 * Created by gsmiro on 17/07/2014.
 */
public class ChildInheritV2 extends ChildV2 {
    private String name;

    public ChildInheritV2(Integer code, String name) {
        super(code);
        this.name = name;
    }

    public ChildInheritV2() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
