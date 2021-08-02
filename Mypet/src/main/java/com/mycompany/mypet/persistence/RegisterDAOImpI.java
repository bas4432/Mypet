package com.mycompany.mypet.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mycompany.mypet.domain.RegisterVO;

@Repository
public class RegisterDAOImpI implements RegisterDAO {

	private static final String NAMESPACE = "com.mycompany.mypet.mappers.register.registerMapper";

	private final SqlSession sqlSession;

	@Inject
	public RegisterDAOImpI(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void create(RegisterVO registerVO) throws Exception {
		sqlSession.insert(NAMESPACE + ".create", registerVO);
	}

	@Override
	public RegisterVO read(Integer register_no) throws Exception {
		return sqlSession.selectOne(NAMESPACE + ".read", register_no);
	}

	@Override
	public void update(RegisterVO registerVO) throws Exception {
		sqlSession.update(NAMESPACE + ".update", registerVO);
	}

	@Override
	public void delete(Integer register_no) throws Exception {
		sqlSession.delete(NAMESPACE + ".delete", register_no);
	}

	@Override
	public List<RegisterVO> listAll() throws Exception {
		return sqlSession.selectList(NAMESPACE + ".listAll");
	}

}
