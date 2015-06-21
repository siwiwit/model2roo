  * The first step to generate a web application that relies on a document data model, is to create a Papyrus model inside a Java project. This model needs to be a UML Class Diagram, loaded with the basic UML primitive types. We then specify the entities of our application, using the Papyrus UML editor. (This is the same procedure as the one used for the the document and polyglot data models).

![https://lh5.googleusercontent.com/-ZnUgNg7fA2Y/UJTrfh3iN6I/AAAAAAAAAOQ/PMfxH-J3QCE/s640/document-papyrus_med.png](https://lh5.googleusercontent.com/-ZnUgNg7fA2Y/UJTrfh3iN6I/AAAAAAAAAOQ/PMfxH-J3QCE/s640/document-papyrus_med.png)

![https://lh5.googleusercontent.com/-5gvGEQ3CvBA/UJTrfCbEMQI/AAAAAAAAAN8/Gtw-3ThhGJE/s640/document-papyrus-creation_med.png](https://lh5.googleusercontent.com/-5gvGEQ3CvBA/UJTrfCbEMQI/AAAAAAAAAN8/Gtw-3ThhGJE/s640/document-papyrus-creation_med.png)

![https://lh3.googleusercontent.com/-2pbLLoW660o/UJTrdV7Bz_I/AAAAAAAAANI/ysLeQQMaUfU/s640/document-classes_med.png](https://lh3.googleusercontent.com/-2pbLLoW660o/UJTrdV7Bz_I/AAAAAAAAANI/ysLeQQMaUfU/s640/document-classes_med.png)

  * We can control the transformation of this diagram into Spring Roo commands, by specifying values to the UML profiles provided by Model2Roo. To use this profiles, we select the UML package containig our application entities, open the Properties editor, and choose the Apply profiles button.

![https://lh6.googleusercontent.com/-aAWPeCeacoc/UJTrf9yKmgI/AAAAAAAAAOg/bhByk8imfoE/s576/document-profiles_med.png](https://lh6.googleusercontent.com/-aAWPeCeacoc/UJTrf9yKmgI/AAAAAAAAAOg/bhByk8imfoE/s576/document-profiles_med.png)

  * By using the RooCommand profile, we can specify that the application entities need to be associated to a graph data store (Neo4j). This is achieved through the dataModel stereotype.

![https://lh3.googleusercontent.com/-dh-gQEb897Q/UJTrk5SDucI/AAAAAAAAAQY/p4t4ViJaynU/s576/graph-dataModel.png](https://lh3.googleusercontent.com/-dh-gQEb897Q/UJTrk5SDucI/AAAAAAAAAQY/p4t4ViJaynU/s576/graph-dataModel.png)

  * By using Model2Roo we can transform this UML diagram into Spring Roo commands. For this, we select the UML file with a right-click and then select the Model2Roo -> Generate Spring Roo commands menu.

![https://lh3.googleusercontent.com/-5oAucwQfjTk/UJTrlcJZZHI/AAAAAAAAAQg/NeD4UaRGKEk/s640/graph-execution.png](https://lh3.googleusercontent.com/-5oAucwQfjTk/UJTrlcJZZHI/AAAAAAAAAQg/NeD4UaRGKEk/s640/graph-execution.png)

  * Model2roo then generates the appropriate Spring Roo commands, and executes them through the spring Roo console. As a result of the execution of the Spring Roo commands, we generate the Java source code of a fully functional Java web application.

![https://lh3.googleusercontent.com/-K0pw9adbW7k/UJTrkmOUPaI/AAAAAAAAAQM/qNqUcxaRl9c/s576/graph-code_med.png](https://lh3.googleusercontent.com/-K0pw9adbW7k/UJTrkmOUPaI/AAAAAAAAAQM/qNqUcxaRl9c/s576/graph-code_med.png)

  * We can then deploy this application inside a web container. In this case, we will do it through the Maven tomcat plugin.

![https://lh4.googleusercontent.com/-Rju79Bf0sm8/UJTrmPZHlWI/AAAAAAAAAQ0/AmbP54uoIuA/s720/graph-tomcat.png](https://lh4.googleusercontent.com/-Rju79Bf0sm8/UJTrmPZHlWI/AAAAAAAAAQ0/AmbP54uoIuA/s720/graph-tomcat.png)

  * The generated Java web application is shown in the following figure.

![https://lh6.googleusercontent.com/-1gGeVyxeGsU/UJTrjq6P3kI/AAAAAAAAAP8/9KTgRbiyMxg/s512/graph-application_med.png](https://lh6.googleusercontent.com/-1gGeVyxeGsU/UJTrjq6P3kI/AAAAAAAAAP8/9KTgRbiyMxg/s512/graph-application_med.png)