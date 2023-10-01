package jaxb;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CreditCardMarshalling {

  public static <T> void toXml(T model) throws JAXBException {

    StringWriter writer = new StringWriter();

    JAXBContext context = JAXBContext.newInstance(model.getClass());
    Marshaller marshaller = context.createMarshaller();
    marshaller.marshal(model, writer);

    System.out.println(writer);
  }
}