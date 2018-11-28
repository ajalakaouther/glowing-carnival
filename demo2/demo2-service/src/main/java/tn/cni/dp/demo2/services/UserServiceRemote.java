package tn.cni.dp.demo2.services;

import javax.ejb.Remote;

import tn.cni.dp.demo2.entities.User;
import tn.cni.dp.demo2.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
