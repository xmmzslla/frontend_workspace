package part02.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import common.SqlSessionTemplate;
import oracle.net.aso.f;
import part02.dao.MemDAO;
import part02.dto.MemDTO;

public class MemService {
	
	private MemDAO dao;
	private SqlSessionFactory factory;
	
	public MemService() {
		dao = new MemDAO();
		factory = SqlSessionTemplate.setSqlSessionFactory();
	}
	
	public List<MemDTO>getAllListProcess(){
		SqlSession sqlSession = null;
		List<MemDTO> aList = null;
		try {
			sqlSession = factory.openSession(false);
			aList = dao.getAllListMethod(sqlSession);
			sqlSession.commit();
		}catch(Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return aList;
		
	}

	public int setInsertProcess(MemDTO dto){
		SqlSession sqlSession = null;
		List<MemDTO> aList = null;
		int chk = 0;
		try {
			sqlSession = factory.openSession(false);
			chk = dao.setInsertMethod(sqlSession, dto);
			sqlSession.commit();
		}catch(Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return chk;
		
	}//setInsertProcess()
	
	public int setUpdateProcess(MemDTO dto) {
		
		SqlSession sqlSession = null;
		int chk = 0;
		try {
			sqlSession = factory.openSession(false);
			chk = dao.setUpdateMethod(sqlSession, dto);
			sqlSession.commit();
		}catch(Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return chk;
	}//setUpdateProcess()
	
	public int setDeleteProcess(int num) {
		
		SqlSession sqlSession = null;
		int chk = 0;
		try {
			sqlSession = factory.openSession(false);
			chk = dao.setDeleteMethod(sqlSession, num);
			sqlSession.commit();
		}catch(Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return chk;
		
	}//setDeleteProcess
	
	////////////////////////////////////////////////////////////
	
	public int setInsertListProcess(List<MemDTO> memList) {
		SqlSession sqlSession = null;
		int chk = 0;
		try {
			sqlSession = factory.openSession(false);
			for(int i = 0 ; i < memList.size() ; i++) {
				MemDTO memDTO = memList.get(i);
				memDTO.setNum(dao.getkeyNumMethod(sqlSession));
			}
			chk = dao.setInsertListMethod(sqlSession, memList);
			sqlSession.commit();
		}catch (Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return chk;
	}
	
	public int setDeleteArrayProcess(int[] num) {
		SqlSession sqlSession = null;
		int chk = 0;
		try {
			sqlSession = factory.openSession(false);
			chk = dao.setDeleteArrayMethod(sqlSession, num);
			sqlSession.commit();
		}catch (Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return chk;
	}//setDeleteArrayProcess
	
	public List<MemDTO> getPartSearchProcess(MemDTO dto){
		SqlSession sqlSession = null;
		List<MemDTO> aList = null;
		try {
			sqlSession = factory.openSession(false);
			aList = dao.getPartSearchMethod(sqlSession, dto);
			sqlSession.commit();
		} catch (Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return aList;
	}//getPartSearchProcess
	
	public int setUpdateMultiProcess(MemDTO dto) {
		SqlSession sqlSession = null;
		int chk = 0;
		try {
			sqlSession = factory.openSession(false);
			chk = dao.setUpdateMultiMethod(sqlSession, dto);
			sqlSession.commit();
		} catch (Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return chk;
	}//setUpdateMultiProcess
	
	public int setInsertDataProcess(MemDTO dto) {
		SqlSession sqlSession = null;
		int chk = 0;
		try {
			sqlSession = factory.openSession(false);
			chk = dao.setInsertDataMethod(sqlSession, dto);
			sqlSession.commit();
		} catch (Exception e) {
			System.out.println(e.toString());
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
		return chk;
	}//setInsertDataProcess
	
}//c
