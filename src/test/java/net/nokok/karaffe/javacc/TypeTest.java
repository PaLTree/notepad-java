package net.nokok.karaffe.javacc;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class TypeTest {

    @Test(expected = RuntimeException.class)
    public void testStartWithLowerCaseTypeName() {
        Type t = new Type(new Name("hoge"));
    }

    @Test
    public void testIsTypeParameter() {
        Type t = new Type(new Name("a"));
        assertThat(t.isTypeParameter(), is(true));
        assertThat(t.isInterface(), is(false));
    }

    @Test
    public void testIsNotTypeParameter() {
        Type t = new Type(new Name("HogeType"));
        assertThat(t.isTypeParameter(), is(false));
        assertThat(t.isInterface(), is(false));
    }

    @Test
    public void testIsInterface() {
        Type t = new Type(new Name("IHoge"));
        assertThat(t.isInterface(), is(true));
    }

}
