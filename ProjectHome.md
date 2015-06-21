## Introduction ##

<table><tr><td align='justify'>
Inherent complexity in web application development is continually increasing due to changes in both functional and non-functional requirements, as well as to technological changes like new programming languages, tools, frameworks and development processes. An adequate management of this complexity is required in order to generate high quality software systems.<br>
<br>
We propose an approach based on model-driven techniques in order to guide the development of web applications, by focusing on model abstractions rather than implementation details. In order to do so, we propose a set of model extensions, such as profiles and annotations, to describe both the static structure and a subset of functional and non-functional requirements usually associated to web applications.<br>
<br>
The generated applications take advantage of polyglot persistence environments, by seamlessly supporting different relational, document and graph data stores, through the <a href='http://www.springsource.org/spring-data'>Spring Data projects</a>.<br>
<br>
**Note:<br>
Model2Roo is a work in progress. Please consider that the current version doesn't support the full gamut of Spring Roo commands, and that there are still some details that need refinement. To see the list of supported commands, please check the SupportedCommands page.<br>
</td></tr></table>**


---

## Model2Roo in action! ##

  * **Generating a Spring Roo script from a UML diagram** (_Try it out by downloading the [documentation bundle](https://model2roo.googlecode.com/files/Model2Roo_documentation.zip), or by taking a look at the UserManual_):

<p align='center'>
<a href='http://www.youtube.com/watch?feature=player_embedded&v=V559i1PW5UQ' target='_blank'><img src='http://img.youtube.com/vi/V559i1PW5UQ/0.jpg' width='425' height=344 /></a><br>
</p>
<br />


  * **Generating a Spring Roo script from an Ecore diagram** (_Try it out by downloading the [documentation bundle](https://model2roo.googlecode.com/files/Model2Roo_documentation.zip), or by taking a look at the UserManual_):

<p align='center'>
<a href='http://www.youtube.com/watch?feature=player_embedded&v=jPjXTYdNqrU' target='_blank'><img src='http://img.youtube.com/vi/jPjXTYdNqrU/0.jpg' width='425' height=344 /></a><br>
</p>
<br />


  * **Polyglot persistence in a multi-cloud environment** (_Try it out by downloading the [practice guide](https://model2roo.googlecode.com/files/Model2Roo-PolyglotPersistence_v1.2.1.zip)_). This practice is part of the course on [Data and Services Management in Cloud](http://vargas-solar.imag.fr/academika/cloud-data-management/) given by the Grenoble INP – Ensimag (France).
    * The objective of this practice is to generate a web system for managing contacts information and posts published in social networks. This system will rely on a polyglot approach to persistence (_relational_, _document_ and _graph_ databases), and will also depend on multiple cloud providers (OpenShift, AppFog, ClearDB and MongoLab).
    * As shown in the following figure, our system is comprised of two Spring Java web applications (_MyNet_ and _MyNetContacts_) that are in charge of different sets of data, and that expose services through REST interfaces. The applications are deployed in different Platform as a Service (PaaS) providers, and access data through Database as a Service (DaaS) vendors.

![https://lh3.googleusercontent.com/-l8iYl22Fdl8/Uek5BjxQULI/AAAAAAAAAXw/bXmmvLiUYMM/w899-h529-no/PolyglotPersistence_Overview_1.2.png](https://lh3.googleusercontent.com/-l8iYl22Fdl8/Uek5BjxQULI/AAAAAAAAAXw/bXmmvLiUYMM/w899-h529-no/PolyglotPersistence_Overview_1.2.png)

  * We first model the application entities in UML diagrams. We then transform these diagrams into Spring Roo commands by using the Model2Roo project. By executing these commands we generate the source code of our Java web applications. Finally, we make changes to the generated source code, and deploy the applications in the specified PaaS providers.


**Notes:
  * In the latest version of Model2Roo, the top-level menu has been disabled. The Ecore actions are now available when you make a right-click over the Ecore file that you want to transform.
  * The latest version of Model2Roo requires that the application entities are declared within an UML or Ecore package.

---

## Installation ##**

### Recommended steps ###

  * Download and extract the latest distribution of **Eclipse Modeling Tools**, from http://www.eclipse.org/downloads/
  * Inside your Eclipse distribution install the following packages:
    * **Model2Roo**, by selecting the _Help -> Install New Software_ menu, and then specify the following update site: https://model2roo.googlecode.com/git/fr.imag.model2roo.update.site
![https://lh4.googleusercontent.com/-huHL9ELJXok/UJT7mWLiN1I/AAAAAAAAAU8/LJz1U9gCe1s/s640/InstallationSite.png](https://lh4.googleusercontent.com/-huHL9ELJXok/UJT7mWLiN1I/AAAAAAAAAU8/LJz1U9gCe1s/s640/InstallationSite.png)
    * **Papyrus**, by selecting the _Help -> Install Modeling Components_ menu
![https://lh3.googleusercontent.com/-mqo0Sue3ps0/UJTrnwlvNBI/AAAAAAAAARY/KAk4hZzpNqk/s640/papyrus-installation_med.png](https://lh3.googleusercontent.com/-mqo0Sue3ps0/UJTrnwlvNBI/AAAAAAAAARY/KAk4hZzpNqk/s640/papyrus-installation_med.png)
  * Download the latest of the **Spring Roo** distribution, from http://www.springsource.org/spring-roo
    * Extract the downloaded file
    * Make the roo executable available in the command line (See Additional notes)

  * Install the Model2Roo Spring Roo **add-ons**, by opening a terminal window to issue the following commands:
    * roo osgi start --url https://model2roo.googlecode.com/git/fr.imag.model2roo.addon.graph/dist/fr.imag.model2roo.addon.graph-0.1.0.0.jar
    * roo osgi start --url https://model2roo.googlecode.com/git/fr.imag.model2roo.addon.polyglot/dist/fr.imag.model2roo.addon.polyglot-0.1.0.0.jar
![https://lh4.googleusercontent.com/-zK6Q9RxkxE4/UJTrcVEq8KI/AAAAAAAAAM0/VQw3SWmRGBk/s699/addon-installation_med.png](https://lh4.googleusercontent.com/-zK6Q9RxkxE4/UJTrcVEq8KI/AAAAAAAAAM0/VQw3SWmRGBk/s699/addon-installation_med.png)
    * Install the latest distribution of **Apache Maven** (from http://maven.apache.org/download.html) to run and distribute the web applications generated by Model2Roo.

### Alternative steps ###

You may install the Model2Roo plugin in alternative Eclipse distributions, such as the [SpringSource Tool Suite](http://www.springsource.com/developer/sts). In this case, if you follow the [recommended steps](https://code.google.com/p/model2roo/#Recommended_steps) described earlier, you'll be able to generate the Roo scripts from UML diagrams. If you also want to use Ecore diagrams, please install the 'Ecore Tools SDK' from the _Help -> Install New Software_ menu, working with _All available Sites_.

### Additional notes ###

Make sure the Roo executable is available in the command line:

  * Windows users: add %ROO\_HOME%\bin to your path
  * `*`nix users: create a symbolic link to $ROO\_HOME/bin/roo.sh (eg sudo ln -s ~/spring-roo-1.x.x/bin/roo.sh /usr/bin/roo)

---

## Uninstall ##

  1. Open the Eclipse Installation Details (**Eclipse -> About Eclipse -> Installation Details**)
  1. Select **Model2Roo** and click **Uninstall**

_Note: If you have an old version of Model2Roo (previous to April 2012) installed in your Eclipse distribution, you can uninstall it by deleting the 'mx.itesm.model2roo\_0.1.x.jar' from your Eclipse 'plugins' directory.

---

## Reference ##
  * Castrejón, J., Vargas-Solar, G., Lozano, R., : “Model2Roo: Web Application Development based on the Eclipse Modeling Framework and Spring Roo”. In: First Workshop on Academics Modeling with Eclipse (ACME 2012). Co-located with ECMFA’12. (Note: A public version of this paper can be found [right here](http://model2roo.googlecode.com/files/Model2Roo_ACME.pdf), and its presentation [right here](http://www.slideshare.net/jccastrejon/model2roo-acme))._

  * Castrejón, J., López-Landa, R., Lozano, R.: "Model2Roo: A Model Driven Approach for Web Application Development based on the Eclipse Modeling Framework and Spring Roo". In: Electrical Communications and Computers (CONIELECOMP), 2011 21st International Conference on, pp. 82-87, Feb. 28 2011-March 2 2011. doi: [10.1109/CONIELECOMP.2011.5749344](http://ieeexplore.ieee.org/xpl/freeabs_all.jsp?arnumber=5749344). (Note: A public version of this paper can be found right [here](http://model2roo.googlecode.com/files/Model2Roo_accepted_version.pdf)).