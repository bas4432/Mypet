package com.mycompany.mypet.service;

import java.util.List;

import com.mycompany.mypet.domain.RegisterVO;

public interface RegisterService {
	void create(RegisterVO registerVO) throws Exception;

	RegisterVO read(Integer register_no) throws Exception;

	void update(RegisterVO registerVO) throws Exception;

	void delete(Integer register_no) throws Exception;

	List<RegisterVO> listAll() throws Exception;

}
