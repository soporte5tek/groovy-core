class StringTest extends GroovyTestCase {

    void testString() {
        s = "abcd"
        assert s.length() == 4
        assert 4 == s.length()
        
        // test polymorphic size() method like collections
        assert s.size() == 4
        
        s = s + "efg" + "hijk"
        
        assert s.size() == 11
        /** @todo parser
        */
        assert "abcdef".size() == 6
    }

    void testStringPlusNull() {
        /** @todo when fixed the method invocation code 
        y = null
        
        x = "hello " + y
        
        assert x == "hello null"
        */
    }
}
