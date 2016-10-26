if (args.foldername != null && args.foldername != "") {
  var folderName = args.foldername;
  model.foldernode = companyhome.createFolder(folderName);	
} else {
  model.message = "Arguments not provided";
}