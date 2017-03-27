if (args.nodeid != null && args.nodeid != "") { 
  var node = search.findNode("workspace://SpacesStore/" + args.nodeid);

  if (node != null) {
    var permission = node.hasPermission("Read"); 
	if(permission) {
	  var nodepath = node.displayPath;
	  var description = node.properties.description;			
	  logger.log("before change description value :" + description);

	  node.properties.description = "change in description";

	  logger.log(person.properties.userName + " --- " + 
	      person.properties.email + "--- executed webscript");
	  model.node = node;
	  model.description = node.properties.description;
	  model.displaypath = nodepath;
	} else {
	  model.message = "User does not have permission";
	}
  } else {
	model.message = "Node not found";
  }
  
} else {
	model.message = "Arguments not provided";
}
