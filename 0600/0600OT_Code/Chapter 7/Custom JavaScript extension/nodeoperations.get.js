if (args.nodeid != null && args.nodeid != "") { 
  var node = search.findNode("workspace://SpacesStore/" + args.nodeid);

  if (node != null) {
	customauth.saveCurrentUserAuthentication();
	customauth.executeAsSystemUser();

	var nodepath = node.displayPath;
	var description = node.properties.description;
	logger.log("before change description value :" + description);
	logger.log("**** 1 : " + node.properties["description"]);
	logger.log("**** 2 : " + node.properties["cm:description"]);
	logger.log("**** 3 : " + node.properties["{http://www.alfresco.org/model/content/1.0}description"]);


	node.properties.description = "change in description";

	logger.log(person.properties.userName + " --- " + 
			person.properties.email + "--- executed webscript");
	model.node=node;
	model.description = node.properties.description;
	model.displaypath = nodepath;
	customauth.setBackOriginalUserAuthentication();		
  } else {
        model.message = "Node not found";
  }
  
} else {
  model.message = "Arguments not provided";
}
