package br.com.metaway.android.test.model.v4;

/**
 * Created by gsmiro on 17/07/2014.
 */
public class ChildInheritV4 extends ChildV4 {
    private String name;

    public ChildInheritV4(Long code, String name) {
        super(code);
        this.name = name;
    }

    public ChildInheritV4() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
