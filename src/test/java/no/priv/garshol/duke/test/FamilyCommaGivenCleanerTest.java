
package no.priv.garshol.duke.test;

import org.junit.Test;
import org.junit.Before;
import static junit.framework.Assert.assertEquals;

import no.priv.garshol.duke.cleaners.FamilyCommaGivenCleaner;

public class FamilyCommaGivenCleanerTest {
  private FamilyCommaGivenCleaner cleaner;
  
  @Before
  public void setup() {
    cleaner = new FamilyCommaGivenCleaner();
  }
  
  @Test
  public void testEmpty() {
    test("", "");
  }

  @Test
  public void testHenrikIbsen() {
    test("henrik ibsen", "Henrik Ibsen");
  }
  
  @Test
  public void testIbsenHenrik() {
    test("henrik ibsen", "Ibsen, Henrik");
  }
  
  @Test
  public void testJRAckerley() {
    test("j. r. ackerley", "Ackerley, J.R.");
  }
  
  private void test(String s1, String s2) {
    assertEquals(s1, cleaner.clean(s2));
  }
  
}