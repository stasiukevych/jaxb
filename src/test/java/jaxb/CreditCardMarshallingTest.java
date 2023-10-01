package jaxb;

import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditCardMarshallingTest {

  @Test
  public void testMarshallingCreditCard() throws JAXBException {

    CreditCard creditCard = new CreditCard(
        "1001", "2024/01/01", 2565, "PREMIUM"
    );

    CreditCardMarshalling.toXml(creditCard);
    Assertions.assertNotNull(creditCard);
  }

  @Test
  public void testMarshallingCreditCardV2() throws JAXBException {

    CreditCardV2 creditCard = new CreditCardV2(
        "1001", "2024/01/01", 2565, "PREMIUM"
    );

    CreditCardMarshalling.toXml(creditCard);
    Assertions.assertNotNull(creditCard);
  }
}