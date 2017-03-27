Deploy - 
1. Put custom-javascript-extension-context.xml at location tomcat\shared\classes\alfresco\extension insider your alfresco installation directory.
2. Compile the CustomAdminAPI.java and put the compiled class at location tomcat\webapps\alfresco\WEB-INF\classes\com\example
3. You will need - acegi-security-***_patched.jar and alfresco-data-model-***.jar as dependency. Those are available at tomcat\webapps
alfresco\WEB-INF\lib location inside you alfresco installation directory.

Usage - 
Now, modify nodeoperations.get.js to exclude permission check and perform the whole logic with system user as shown below.

customauth.saveCurrentUserAuthentication();
customauth.executeAsSystemUser();
//Your piece of code you want to run as system user.
customauth.setBackOriginalUserAuthentication();

Then hit the webscript url - http://localhost:8080/alfresco/service/example/nodeinaction?nodeid=yournodeid
You should be able to see the SOP statements on the console about which user is currently invoking the functionality.
