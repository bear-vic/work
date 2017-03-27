package com.example;

import net.sf.acegisecurity.Authentication;

import org.alfresco.repo.security.authentication.AuthenticationUtil;

public class CustomAdminAPI extends org.alfresco.repo.processor.BaseProcessorExtension{

	private Authentication auth;
	
	public void saveCurrentUserAuthentication() {
		   auth = AuthenticationUtil.getFullAuthentication();
		   System.out.println("current user : " + AuthenticationUtil.getRunAsUser());
		}
	public void executeAsSystemUser() {
		AuthenticationUtil.setRunAsUserSystem();
		AuthenticationUtil.setFullyAuthenticatedUser(AuthenticationUtil.SYSTEM_USER_NAME);
		System.out.println("current user :" + AuthenticationUtil.getRunAsUser());
	}
	public void setBackOriginalUserAuthentication(){
    	AuthenticationUtil.clearCurrentSecurityContext();
		AuthenticationUtil.setFullAuthentication(this.auth);	
		System.out.println("current user :" + AuthenticationUtil.getRunAsUser());
	} 

}
