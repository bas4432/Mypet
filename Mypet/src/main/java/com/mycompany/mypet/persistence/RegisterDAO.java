package com.mycompany.mypet.persistence;

import java.util.List;

import com.mycompany.mypet.domain.RegisterVO;

public interface RegisterDAO {

	void create(RegisterVO registerVO) throws Exception;

	RegisterVO read(Integer registerVO) throws Exception;

	void update(RegisterVO articleVO) throws Exception;

	void delete(Integer register_no) throws Exception;

	List<RegisterVO> listAll() throws Exception;

	

}
