package tn.cni.dp.demo2.services;

import javax.ejb.Local;

import tn.cni.dp.demo2.entities.User;
import tn.cni.dp.demo2.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
