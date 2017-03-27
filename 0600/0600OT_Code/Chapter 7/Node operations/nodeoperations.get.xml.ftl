<?xml version="1.0" encoding="UTF-8"?>
<folderNode>
<#if node?exists>
<noderef>${node.nodeRef}</noderef>
<description>${description}</description>
<displaypath>${displaypath}</displaypath>
<#else>
${message}
</#if>
</folderNode>