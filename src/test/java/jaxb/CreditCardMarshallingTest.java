package jaxb;

import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditCardMarshallingTest {

  @Test
  public void testMarshallingRandomModel() throws JAXBException {

    CreditCard creditCard = new CreditCard(
        "1001", "2024/01/01", 2565, "PREMIUM"
    );

    CreditCardMarshalling.toXml(creditCard);
    Assertions.assertNotNull(creditCard);
  }
}