  * The first step to generate a web application that relies on a document data model, is to create a Papyrus model inside a Java project.

![https://lh5.googleusercontent.com/-ZnUgNg7fA2Y/UJTrfh3iN6I/AAAAAAAAAOQ/PMfxH-J3QCE/s640/document-papyrus_med.png](https://lh5.googleusercontent.com/-ZnUgNg7fA2Y/UJTrfh3iN6I/AAAAAAAAAOQ/PMfxH-J3QCE/s640/document-papyrus_med.png)

  * The Papyrus model needs to be a UML Class Diagram, loaded with the basic UML primitive types.

![https://lh5.googleusercontent.com/-5gvGEQ3CvBA/UJTrfCbEMQI/AAAAAAAAAN8/Gtw-3ThhGJE/s640/document-papyrus-creation_med.png](https://lh5.googleusercontent.com/-5gvGEQ3CvBA/UJTrfCbEMQI/AAAAAAAAAN8/Gtw-3ThhGJE/s640/document-papyrus-creation_med.png)

  * We then specify the entities of our application, using the Papyrus UML editor:

![https://lh3.googleusercontent.com/-2pbLLoW660o/UJTrdV7Bz_I/AAAAAAAAANI/ysLeQQMaUfU/s640/document-classes_med.png](https://lh3.googleusercontent.com/-2pbLLoW660o/UJTrdV7Bz_I/AAAAAAAAANI/ysLeQQMaUfU/s640/document-classes_med.png)

  * We can control the transformation of this diagram into Spring Roo commands, by specifying values to the UML profiles provided by Model2Roo. To use this profiles, we select the UML package containig our application entities, open the Properties editor, and choose the Apply profiles button.

![https://lh6.googleusercontent.com/-aAWPeCeacoc/UJTrf9yKmgI/AAAAAAAAAOg/bhByk8imfoE/s576/document-profiles_med.png](https://lh6.googleusercontent.com/-aAWPeCeacoc/UJTrf9yKmgI/AAAAAAAAAOg/bhByk8imfoE/s576/document-profiles_med.png)

  * By using the RooCommand profile, we can specify that the application entities need to be associated to a document data store (MongoDB). This is achieved through the dataModel stereotype.

![https://lh3.googleusercontent.com/-9LghZY7Qxi0/UJTrd_XrzQI/AAAAAAAAANc/2Up4S4zei3w/s576/document-datamodel_med.png](https://lh3.googleusercontent.com/-9LghZY7Qxi0/UJTrd_XrzQI/AAAAAAAAANc/2Up4S4zei3w/s576/document-datamodel_med.png)

  * By using Model2Roo we can transform this UML diagram into Spring Roo commands. For this, we select the UML file with a right-click and then select the Model2Roo -> Generate Spring Roo commands menu.

![https://lh3.googleusercontent.com/-vDferiandac/UJTreq64Z7I/AAAAAAAAANk/Rf42hPzwp94/s576/document-generate_med.png](https://lh3.googleusercontent.com/-vDferiandac/UJTreq64Z7I/AAAAAAAAANk/Rf42hPzwp94/s576/document-generate_med.png)

  * Model2roo then generates the appropriate Spring Roo commands, and executes them through the spring Roo console.

![https://lh5.googleusercontent.com/-l-n-Kgc6FbU/UJTrePH0lgI/AAAAAAAAAN4/z1vQ7vGpU6w/s576/document-execution_med.png](https://lh5.googleusercontent.com/-l-n-Kgc6FbU/UJTrePH0lgI/AAAAAAAAAN4/z1vQ7vGpU6w/s576/document-execution_med.png)

  * As a result of the execution of the Spring Roo commands, we generate the Java source code of a fully functional Java web application.

![https://lh3.googleusercontent.com/-leFWdAtfGbI/UJTrd4KPy4I/AAAAAAAAANQ/DnvB8mq8j4M/s576/document-code_med.png](https://lh3.googleusercontent.com/-leFWdAtfGbI/UJTrd4KPy4I/AAAAAAAAANQ/DnvB8mq8j4M/s576/document-code_med.png)

  * We can then deploy this application inside a web container. In this case, we will do it through the Maven tomcat plugin.

![https://lh4.googleusercontent.com/-yxJnZoTYhnI/UJTrgVUuJ3I/AAAAAAAAAOc/nIeuIqO6YkE/s720/document-tomcat_med.png](https://lh4.googleusercontent.com/-yxJnZoTYhnI/UJTrgVUuJ3I/AAAAAAAAAOc/nIeuIqO6YkE/s720/document-tomcat_med.png)

  * The generated Java web application is shown in the following figure.

![https://lh5.googleusercontent.com/-hMNCffwDonA/UJTrcyPV32I/AAAAAAAAANE/imaE56RBzpk/s512/document-application_med.png](https://lh5.googleusercontent.com/-hMNCffwDonA/UJTrcyPV32I/AAAAAAAAANE/imaE56RBzpk/s512/document-application_med.png)