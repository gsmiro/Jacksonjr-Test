package br.com.metaway.android.test;

import android.metaway.com.br.jacksonjr.R;
import android.test.ActivityInstrumentationTestCase2;

import com.fasterxml.jackson.jr.ob.JSON;

import java.io.IOException;

import br.com.metaway.android.MainActivity;
import br.com.metaway.android.test.model.v1.Parent;
import br.com.metaway.android.test.model.v2.ParentV2;
import br.com.metaway.android.test.model.v3.ParentV3;
import br.com.metaway.android.test.model.v4.ParentV4;

/**
 * Created by gsmiro on 16/07/2014.
 */
public class CollectionsPropertyTest extends ActivityInstrumentationTestCase2 {

    public CollectionsPropertyTest() {
        super(MainActivity.class);
    }


    public void testHierarchyV1() throws IOException {
        Parent p = JSON.std.beanFrom(Parent.class, getActivity().getResources().openRawResource(R.raw.data));
        assertNotNull(p.getChildren());
        assertEquals(3, p.getChildren().size());
    }


    public void testHierarchyV2() throws IOException {
        ParentV2 p = JSON.std.beanFrom(ParentV2.class, getActivity().getResources().openRawResource(R.raw.data));
        assertNotNull(p.getChildren());
        assertEquals(3, p.getChildren().size());
    }

    public void testHierarchyV3() throws IOException {
        ParentV3 p = JSON.std.beanFrom(ParentV3.class, getActivity().getResources().openRawResource(R.raw.data));
        assertNotNull(p.getChildren());
        assertEquals(3, p.getChildren().size());
    }

    public void testHierarchyV4() throws IOException {
        ParentV4 p = JSON.std.beanFrom(ParentV4.class, getActivity().getResources().openRawResource(R.raw.datalong));
        assertNotNull(p.getChildren());
        assertEquals(3, p.getChildren().size());
    }

}
