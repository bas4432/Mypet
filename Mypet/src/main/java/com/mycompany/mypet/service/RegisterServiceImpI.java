package com.mycompany.mypet.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mycompany.mypet.domain.RegisterVO;
import com.mycompany.mypet.persistence.RegisterDAO;


@Service
public class RegisterServiceImpI implements RegisterService {

	private final RegisterDAO registerDAO;

	@Inject 
	public RegisterServiceImpI(RegisterDAO registerDAO) { 
		this.registerDAO = registerDAO; 
	}

	@Override
	public void create(RegisterVO registerVO) throws Exception {
		registerDAO.create(registerVO);

	}

	@Override
	public RegisterVO read(Integer register_no) throws Exception {
		// TODO Auto-generated method stub
		return registerDAO.read(register_no);
	}

	@Override
	public void update(RegisterVO registerVO) throws Exception {
		// TODO Auto-generated method stub
        registerDAO.update(registerVO);
	}

	@Override
	public void delete(Integer register_no) throws Exception {
		// TODO Auto-generated method stub
         registerDAO.delete(register_no);
	}

	@Override
	public List<RegisterVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return registerDAO.listAll();
	}

}
