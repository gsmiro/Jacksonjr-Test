package br.com.metaway.android.test.model.v3;

/**
 * Created by gsmiro on 17/07/2014.
 */
public class ChildInheritV3 extends ChildV3 {
    private String name;

    public ChildInheritV3(Integer code, String name) {
        super(code);
        this.name = name;
    }

    public ChildInheritV3() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
