package br.com.metaway.android.test.model.v4;

import java.util.List;

import br.com.metaway.android.test.model.v1.ParentInfo;

/**
 * Created by gsmiro on 16/07/2014.
 */
public class ParentV4 {

    private ParentInfo info;

    public ParentV4() {
    }

    public ParentInfo getInfo() {
        return info;
    }

    public void setInfo(ParentInfo info) {
        this.info = info;
    }

    public ParentV4(ParentInfo info, List<ChildInheritV4> children) {

        this.info = info;
        this.children = children;
    }

    private List<ChildInheritV4> children;

    public List<ChildInheritV4> getChildren() {
        return children;
    }

    public void setChildren(List<ChildInheritV4> children) {
        this.children = children;
    }
}
