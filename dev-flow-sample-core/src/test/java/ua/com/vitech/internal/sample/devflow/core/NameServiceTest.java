package ua.com.vitech.internal.sample.devflow.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NameServiceTest {

  private NameService nameService;

  @Before
  public void setUp() {
    nameService = new NameService();
  }

  @Test
  public void testExtractFirstName() {
    String firstName = nameService.extractFirstName("Andrii Zaiats");
    Assert.assertEquals("First name", "Andrii", firstName);
  }

  @Test
  public void testExtractFirstNameFromNull() {
    String firstName = nameService.extractFirstName(null);
    Assert.assertEquals("First name from null", "", firstName);
  }
}

