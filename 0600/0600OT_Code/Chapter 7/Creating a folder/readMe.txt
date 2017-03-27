Deploy - 
Deploy the 3 files at tomcat\shared\classes\alfresco\extension\templates\webscripts\
example inside your alfresco installed directory.

Register the webscript
http://localhost:8080/alfresco/service/index
Click on Refresh Web Scripts

Invoke webscript through browser plugin such as poster as it is a POST method.
http://localhost:8080/alfresco/service/example/createfolder?foldername=TestWebScript