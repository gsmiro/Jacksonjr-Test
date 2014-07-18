package br.com.metaway.android.test.model.v1;

/**
 * Created by gsmiro on 16/07/2014.
 */
public class ParentInfo {

    private String name;

    private Integer id;

    public ParentInfo(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public ParentInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
