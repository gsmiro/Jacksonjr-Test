package br.com.metaway.android.test.model.v1;

import java.util.List;

/**
 * Created by gsmiro on 16/07/2014.
 */
public class Parent {

    private ParentInfo info;

    public Parent() {
    }

    public ParentInfo getInfo() {
        return info;
    }

    public void setInfo(ParentInfo info) {
        this.info = info;
    }

    public Parent(ParentInfo info, List<ChildInherit> children) {

        this.info = info;
        this.children = children;
    }

    private List<ChildInherit> children;

    public List<ChildInherit> getChildren() {
        return children;
    }

    public void setChildren(List<ChildInherit> children) {
        this.children = children;
    }
}
