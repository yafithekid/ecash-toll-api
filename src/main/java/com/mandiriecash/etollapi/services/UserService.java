package com.mandiriecash.etollapi.services;

import com.mandiriecash.etollapi.mea.exceptions.MEAIOException;
import com.mandiriecash.etollapi.mea.exceptions.MEALoginFailedException;
import com.mandiriecash.etollapi.mea.exceptions.MEAUnknownErrorException;
import com.mandiriecash.etollapi.mea.responses.MEABalanceInquiryResponse;
import com.mandiriecash.etollapi.models.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by Ichwan Haryo Sembodo on 31/01/2016.
 */

public interface UserService {
    public List<User> getUserById(int id);
    public void createUser(User user);
    public String loginUser(String uid,String msisdn,String credentials) throws IOException, MEALoginFailedException;
    public MEABalanceInquiryResponse balanceInquiry(String token, String msisdn) throws MEAIOException, MEAUnknownErrorException;
}
