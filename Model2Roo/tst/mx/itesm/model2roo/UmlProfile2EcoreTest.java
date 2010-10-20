package mx.itesm.model2roo;

import java.io.File;
import java.io.IOException;

import mx.itesm.model2roo.UmlProfile2Ecore;

import org.jdom.JDOMException;
import org.junit.After;
import org.junit.Test;

/**
 * 
 * @author jccastrejon
 * 
 */
public class UmlProfile2EcoreTest extends EcoreTest {

    /**
     * 
     * @throws JDOMException
     * @throws IOException
     */
    @Test
    public void testTransformUmlProfiles() throws JDOMException, IOException {
        File sourceUmlFile;
        File targetEcoreFile;

        targetEcoreFile = new File("./tst/model/toys.ecore");
        sourceUmlFile = new File("./tst/model/Toys.uml");
        UmlProfile2Ecore.transformUmlProfiles(targetEcoreFile, sourceUmlFile);
        this.testAnnotatedClassifiers(targetEcoreFile);
    }

    @After
    public void afterTest() throws JDOMException, IOException {
        this.removeAnnotations(new File("./tst/model/toys.ecore"));
    }
}
