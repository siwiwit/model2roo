  * The first step to generate a web application that relies on a document data model, is to create a Papyrus model inside a Java project. This model needs to be a UML Class Diagram, loaded with the basic UML primitive types. We then specify the entities of our application, using the Papyrus UML editor. (This is the same procedure as the one used for the the document and graph data models).

![https://lh5.googleusercontent.com/-ZnUgNg7fA2Y/UJTrfh3iN6I/AAAAAAAAAOQ/PMfxH-J3QCE/s640/document-papyrus_med.png](https://lh5.googleusercontent.com/-ZnUgNg7fA2Y/UJTrfh3iN6I/AAAAAAAAAOQ/PMfxH-J3QCE/s640/document-papyrus_med.png)

![https://lh5.googleusercontent.com/-5gvGEQ3CvBA/UJTrfCbEMQI/AAAAAAAAAN8/Gtw-3ThhGJE/s640/document-papyrus-creation_med.png](https://lh5.googleusercontent.com/-5gvGEQ3CvBA/UJTrfCbEMQI/AAAAAAAAAN8/Gtw-3ThhGJE/s640/document-papyrus-creation_med.png)

![https://lh3.googleusercontent.com/-2pbLLoW660o/UJTrdV7Bz_I/AAAAAAAAANI/ysLeQQMaUfU/s640/document-classes_med.png](https://lh3.googleusercontent.com/-2pbLLoW660o/UJTrdV7Bz_I/AAAAAAAAANI/ysLeQQMaUfU/s640/document-classes_med.png)

  * We can control the transformation of this diagram into Spring Roo commands, by specifying values to the UML profiles provided by Model2Roo. To use this profiles, we select the UML package containig our application entities, open the Properties editor, and choose the Apply profiles button.

![https://lh6.googleusercontent.com/-aAWPeCeacoc/UJTrf9yKmgI/AAAAAAAAAOg/bhByk8imfoE/s576/document-profiles_med.png](https://lh6.googleusercontent.com/-aAWPeCeacoc/UJTrf9yKmgI/AAAAAAAAAOg/bhByk8imfoE/s576/document-profiles_med.png)

  * By using the RooCommand profile, we can specify that we will use different data models for the application entities. This is achieved by specifying the Polyglot value for the dataModel stereotype.

![https://lh5.googleusercontent.com/-HkAJG6_tIow/UJTrqAdkB0I/AAAAAAAAASU/acnlrqr20W8/s640/polyglot-datamodel_med.png](https://lh5.googleusercontent.com/-HkAJG6_tIow/UJTrqAdkB0I/AAAAAAAAASU/acnlrqr20W8/s640/polyglot-datamodel_med.png)

  * To associate a particular data model to the application entities, we rely on the following stereotypes provided by Model2Roo: DocumentEntity, RelationalEntity and GraphEntity. These stereotypes are available when a particular class is selected in the Papyrus UML editor.

![https://lh3.googleusercontent.com/-pBeI7BRXu50/UJTrqWdlq2I/AAAAAAAAASg/OG1GoUtSi4A/s640/polyglot-entities.png](https://lh3.googleusercontent.com/-pBeI7BRXu50/UJTrqWdlq2I/AAAAAAAAASg/OG1GoUtSi4A/s640/polyglot-entities.png)

  * By using Model2Roo we can transform this UML diagram into Spring Roo commands. For this, we select the UML file with a right-click and then select the Model2Roo -> Generate Spring Roo commands menu.

![https://lh5.googleusercontent.com/-0XZoT4Rx-JU/UJTrox59PcI/AAAAAAAAASA/PCT8B62-OWg/s640/polyglot-commands.png](https://lh5.googleusercontent.com/-0XZoT4Rx-JU/UJTrox59PcI/AAAAAAAAASA/PCT8B62-OWg/s640/polyglot-commands.png)

  * Model2roo then generates the appropriate Spring Roo commands, and executes them through the spring Roo console. As a result of the execution of the Spring Roo commands, we generate the Java source code of a fully functional Java web application.

![https://lh6.googleusercontent.com/-E06Lhh4ouPg/UJTrok6z04I/AAAAAAAAAR4/SS2NZMF-79w/s640/polyglot-code.png](https://lh6.googleusercontent.com/-E06Lhh4ouPg/UJTrok6z04I/AAAAAAAAAR4/SS2NZMF-79w/s640/polyglot-code.png)

  * We can then deploy this application inside a web container. In this case, we will do it through the Maven tomcat plugin.

![https://lh3.googleusercontent.com/-xWAmPVHwmfk/UJTrq1zfFbI/AAAAAAAAASs/Ii0lOleu03Y/s720/polyglot-tomcat.png](https://lh3.googleusercontent.com/-xWAmPVHwmfk/UJTrq1zfFbI/AAAAAAAAASs/Ii0lOleu03Y/s720/polyglot-tomcat.png)

  * The generated Java web application is shown in the following figure.

![https://lh4.googleusercontent.com/-XxBkjkbgqng/UJTroEZPb7I/AAAAAAAAARo/pEMCQw33S1w/s512/polyglot-application_med.png](https://lh4.googleusercontent.com/-XxBkjkbgqng/UJTroEZPb7I/AAAAAAAAARo/pEMCQw33S1w/s512/polyglot-application_med.png)