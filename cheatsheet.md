1. New Spring Starter Project
    - Maven, Packaging: War, Java 8 / 1.8
    - Name your project, group, and main package.
    - Add Starter Dependencies:
        MySQL Driver,
        Spring Boot DevTools,
        Spring Data JPA
        Spring Web
    - Finish! App will take a minute or so to build, let it work.

2. Update your Dependencies in pom.xml
    - We added some of our dependencies when we built, but we also need:
        jstl,
        tomcat-embedded-jasper,
        spring-boot-starter-validation,
        jbcrypt : 0.4,
        spring-boot-starter-tomcat
    - Go to your pom.xml and add these dependencies now.
    - Your app will now crash on start. This is expected, we have not added a SQL connector yet.

3. Update application.properties in the java/resources folder.
    - You need your datasource for mysql, the connection details, and the name of the schema
    - You will also set your view route here to /WEB-INF/
    - Do not continue until the error message on start is gone. It should be able to boot correctly with a SQL connection. If you get errors at this step, confirm SQL is running, and confirm there are no typos in application.properties.

4. Create your models
    - The fields of a model depend entirely on what it is your building. Heroes, songs, posts, comments.
    - Avoid fields named after the model ie “comment.comment” or “task.task”
    - All models require an id field, createdAt, and updatedAt. This is best practices.
    - Do not add the getters and setters until all your relationships are defined, and if you have to change fields of your model, don’t forget about the already created getters/setters.
    - Models should always have at least one empty constructor.
    - Valid models will create the tables on your SQL workbench on app startup. *Do not continue with your functionality until you have confirmed the tables on SQL look correct.*
    - Before moving onto the next step, confirm the app starts with no errors.

5. Create repos and services
    - Usually when people get errors here, it's because they added their models wrong and are only now testing it
    - Don't forget the @Service annotation!

6. Create controllers
    - Usually no issues, make sure one route doesn't exist in two controllers

7. Serve hello world index.jsp
    - Prove that you can serve jsp files and your controllers can see your /WEB-INF/ folder

