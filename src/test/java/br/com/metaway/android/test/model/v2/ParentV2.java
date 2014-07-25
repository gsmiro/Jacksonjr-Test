package br.com.metaway.android.test.model.v2;

import java.util.List;

import br.com.metaway.android.test.model.v2.ChildInheritV2;
import br.com.metaway.android.test.model.v1.ParentInfo;

/**
 * Created by gsmiro on 16/07/2014.
 */
public class ParentV2 {

    private ParentInfo info;

    public ParentV2() {
    }

    public ParentInfo getInfo() {
        return info;
    }

    public void setInfo(ParentInfo info) {
        this.info = info;
    }

    public ParentV2(ParentInfo info, List<ChildInheritV2> children) {

        this.info = info;
        this.children = children;
    }

    private List<ChildInheritV2> children;

    public List<ChildInheritV2> getChildren() {
        return children;
    }

    public void setChildren(List<ChildInheritV2> children) {
        this.children = children;
    }
}
