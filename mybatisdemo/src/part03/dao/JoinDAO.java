package part03.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import part01.dto.EmpDTO;

public class JoinDAO {

	public List<EmpDTO> emp_deptMethod(SqlSession sqlSession){
		return sqlSession.selectList("join.emp_dept");
	}
}//c
