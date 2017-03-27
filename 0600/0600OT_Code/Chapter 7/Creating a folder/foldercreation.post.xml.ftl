<?xml version="1.0" encoding="UTF-8"?>
<folderNode>
  <#if foldernode?exists>
    ${foldernode.nodeRef}
  <#else>
    ${message}
  </#if>
</folderNode>

