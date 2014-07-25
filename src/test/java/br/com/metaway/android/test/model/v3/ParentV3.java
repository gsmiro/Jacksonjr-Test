package br.com.metaway.android.test.model.v3;

import java.util.List;

import br.com.metaway.android.test.model.v1.ParentInfo;

/**
 * Created by gsmiro on 16/07/2014.
 */
public class ParentV3 {

    private ParentInfo info;

    public ParentV3() {
    }

    public ParentInfo getInfo() {
        return info;
    }

    public void setInfo(ParentInfo info) {
        this.info = info;
    }

    public ParentV3(ParentInfo info, List<ChildInheritV3> children) {

        this.info = info;
        this.children = children;
    }

    private List<ChildInheritV3> children;

    public List<ChildInheritV3> getChildren() {
        return children;
    }

    public void setChildren(List<ChildInheritV3> children) {
        this.children = children;
    }
}
