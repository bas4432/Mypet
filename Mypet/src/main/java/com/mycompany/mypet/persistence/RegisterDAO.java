package com.mycompany.mypet.persistence;

import java.util.List;

import com.mycompany.mypet.common.paging.Criteria;
import com.mycompany.mypet.domain.RegisterVO;

public interface RegisterDAO {
    //게시글 리스트 등록 수정 삭제 
	void create(RegisterVO registerVO) throws Exception;

	RegisterVO read(Integer registerVO) throws Exception;

	void update(RegisterVO articleVO) throws Exception;

	void delete(Integer register_no) throws Exception;

	List<RegisterVO> listAll() throws Exception;
	
	
	//페이지 등록 인터페이스
	List<RegisterVO> listCriteria(Criteria criteria) throws Exception;
}
