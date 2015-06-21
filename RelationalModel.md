  * As a first step, we need to create a Java project that will contain the source code of our web application:

![https://lh4.googleusercontent.com/-kvC8g-rPpHE/UJTrrhctIYI/AAAAAAAAAS4/Y01JKm8BVqU/s640/relational-newproject_med.png](https://lh4.googleusercontent.com/-kvC8g-rPpHE/UJTrrhctIYI/AAAAAAAAAS4/Y01JKm8BVqU/s640/relational-newproject_med.png)

  * Inside this project, we need to create a new Ecore Diagram, using the standard New... context menu

![https://lh6.googleusercontent.com/-utdx2MhzMbs/UJTrcj8_HUI/AAAAAAAAANA/Rqz4XEe7ofE/s640/createecore_med.png](https://lh6.googleusercontent.com/-utdx2MhzMbs/UJTrcj8_HUI/AAAAAAAAANA/Rqz4XEe7ofE/s640/createecore_med.png)

  * We then specify the entities of our application, using the Ecore Diagram tools:

![https://lh6.googleusercontent.com/-u5yXzG3Ank0/UJTrh4cGfrI/AAAAAAAAAPM/hmTr4vZR6G4/s640/ecore-classes_med.png](https://lh6.googleusercontent.com/-u5yXzG3Ank0/UJTrh4cGfrI/AAAAAAAAAPM/hmTr4vZR6G4/s640/ecore-classes_med.png)

  * We can control the transformation of this diagram into Spring Roo commands, by specifying values to the Ecore Annotations provided by Model2Roo. To annotate our model, we select the Ecore file with a right-click and select the Model2Roo -> Annotate model with Spring Roo details menu.

![https://lh6.googleusercontent.com/-AyuBze2txjQ/UJTrhHrZhwI/AAAAAAAAAO0/8lEu_yiWnb8/s640/ecore-annotations_med.png](https://lh6.googleusercontent.com/-AyuBze2txjQ/UJTrhHrZhwI/AAAAAAAAAO0/8lEu_yiWnb8/s640/ecore-annotations_med.png)

  * We can then specify values for all of the Ecore Annotations provided by Model2Roo. In particular, for this sample application we specify a relational persistence provider (Hibernate), with an instance of a Hypersonic database.

![https://lh5.googleusercontent.com/-7BOkGyCUYzM/UJTrgt-S38I/AAAAAAAAAO4/Cq0iOm3HK3w/s640/ecore-annotations-specifica_med.png](https://lh5.googleusercontent.com/-7BOkGyCUYzM/UJTrgt-S38I/AAAAAAAAAO4/Cq0iOm3HK3w/s640/ecore-annotations-specifica_med.png)

  * By using Model2Roo we can transform this Ecore diagram into Spring Roo commands. For this, we select the Ecore file with a right-click and then select the Model2Roo -> Generate Spring Roo commands menu.

![https://lh3.googleusercontent.com/-cXKxDGU1WQc/UJTri4kL5qI/AAAAAAAAAPY/m9pfin56r8k/s640/ecore-roo_med.png](https://lh3.googleusercontent.com/-cXKxDGU1WQc/UJTri4kL5qI/AAAAAAAAAPY/m9pfin56r8k/s640/ecore-roo_med.png)

  * Model2roo then generates the appropriate Spring Roo commands, and executes them through the spring Roo console.

![https://lh4.googleusercontent.com/-F91H4JCmAoQ/UJTriS5KbhI/AAAAAAAAAPg/fCJbMuf4vgY/s640/ecore-commands_med.png](https://lh4.googleusercontent.com/-F91H4JCmAoQ/UJTriS5KbhI/AAAAAAAAAPg/fCJbMuf4vgY/s640/ecore-commands_med.png)

  * As a result of the execution of the Spring Roo commands, we generate the Java source code of a fully functional Java web application.

![https://lh3.googleusercontent.com/-K0pw9adbW7k/UJTrkmOUPaI/AAAAAAAAAQM/qNqUcxaRl9c/s576/graph-code_med.png](https://lh3.googleusercontent.com/-K0pw9adbW7k/UJTrkmOUPaI/AAAAAAAAAQM/qNqUcxaRl9c/s576/graph-code_med.png)

  * We can then deploy this application inside a web container. In this case, we will do it through the Maven tomcat plugin.

![https://lh3.googleusercontent.com/-gQ_yTx9Y2ow/UJTrjY3lBmI/AAAAAAAAAP4/0A5NvqFowz4/s720/ecore-tomcat_med.png](https://lh3.googleusercontent.com/-gQ_yTx9Y2ow/UJTrjY3lBmI/AAAAAAAAAP4/0A5NvqFowz4/s720/ecore-tomcat_med.png)

  * The generated Java web application is shown in the following figure.

![https://lh6.googleusercontent.com/-FTZQyzp7fco/UJTrh8GeLhI/AAAAAAAAAPE/wPFyxUH-Q2M/s512/ecore-application_med.png](https://lh6.googleusercontent.com/-FTZQyzp7fco/UJTrh8GeLhI/AAAAAAAAAPE/wPFyxUH-Q2M/s512/ecore-application_med.png)