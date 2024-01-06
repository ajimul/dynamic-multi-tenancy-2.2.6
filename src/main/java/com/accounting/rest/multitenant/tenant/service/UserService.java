package com.accounting.rest.multitenant.tenant.service;

public class UserService {

//	public void changePassword(ChangePasswordRequest request, Principal connectedUser) {
//
//		var user = (User) ((UsernamePasswordAuthenticationToken) connectedUser).getPrincipal();
//
//		// check if the current password is correct
//		if (!passwordEncoder.matches(request.getCurrentPassword(), user.getPassword())) {
//			throw new IllegalStateException("Wrong password");
//		}
//		// check if the two new passwords are the same
//		if (!request.getNewPassword().equals(request.getConfirmationPassword())) {
//			throw new IllegalStateException("Password are not the same");
//		}
//
//		// update the password
//		user.setPassword(passwordEncoder.encode(request.getNewPassword()));
//
//		// save the new password
//		repository.save(user);
//	}
}
