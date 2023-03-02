package part02.controller;

import java.util.ArrayList;
import java.util.List;

import part02.dto.MemDTO;

public class MainMulti {

	public static void main(String[] args) {
		
		MemMultiController mController = new MemMultiController();
		
//		memList(mController.getAllListExceute());
		
		/*다중 삽입*/
//		List<MemDTO>insertList = new ArrayList<MemDTO>();
//		insertList.add(new MemDTO("조현수", 23, "경기"));
//		insertList.add(new MemDTO("슈", 7, "우리집"));
//		int cnt = mController.setInsertListExceute(insertList);
//		System.out.printf("Insert Count:%d\n", cnt);
		
		/*다중 삭제*/
//		int cnt = mController.setDeleteArrayExecute(new int[] {17, 16});
//		System.out.printf("Delete Count: %d\n", cnt);
		
//		memList(mController.getAllListExceute());
		
//		MemDTO dto = new MemDTO();
//		dto.setName("길");
//		dto.setAge(20); //주석처리하면 age에는 0이 저장됨
//		
//		memList(mController.getPartSearchExecute(dto));
		
//		MemDTO dto = new MemDTO();
//		dto.setAge(25); 
//		dto.setNum(28); //num값이 28번일 때 나이를 25로 바꾸겠다
//		int chk = mController.setUpdateMultiExecute(dto);
//		System.out.printf("Update Count : %d\n", chk);
//		memList(mController.getAllListExceute());
		
		MemDTO dto = new MemDTO("김예솜", 30, null);
		int chk = mController.setInsertDataExecute(dto);
		System.out.printf("Insert Count : %d\n", chk);
		memList(mController.getAllListExceute());
		
	}//m
	
//	public static void memList(MemMultiController mController) {
//		
//		List<MemDTO> aList = mController.getAllListExceute();
//		for(MemDTO dto : aList)
//			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
//		
//	}//memList()
	
	public static void memList(List<MemDTO> aList) {
		for(MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		
	}//memList()

}//c
