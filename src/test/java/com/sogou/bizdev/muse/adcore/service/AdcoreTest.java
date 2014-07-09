package com.sogou.bizdev.muse.adcore.service;

import java.rmi.RemoteException;

import org.junit.Test;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import com.sogou.bizdev.muse.adcore.app.dto.AdcoreDto;
import com.sogou.bizdev.muse.adcore.app.service.AdcoreService;
import com.sogou.bizdev.utils.DateUtils;


public class AdcoreTest extends AbstractDependencyInjectionSpringContextTests{

	private AdcoreService adcoreService;
	
	/*public AdcoreService getAdcoreService() {
		return adcoreService;
	}
	
	public void setAdcoreService(AdcoreService adcoreService) {
		this.adcoreService = adcoreService;
	}*/


	/*	public AdcoreDto addAdcore(AdcoreDto adcoreDto);
	public void updateAdcore(AdcoreDto adcoreDto);
	public void deleteAdcore(Long cpcId);*/
	@Test
	public void testAdcore(){
		/*AdcoreDto aDto = new AdcoreDto();
		aDto.setAccountId(500L);
		aDto.setKey("新人任务");
		aDto.setUrl("www.sogou-inc.com");
		aDto.setCreateDate(DateUtils.getToday());
		aDto.setChgDate(DateUtils.getToday());
		aDto.setMaxPrice(998);
		try {
			aDto = adcoreService.addAdcore(aDto);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		aDto.setKey("修改后任务");
		try {
			adcoreService.updateAdcore(aDto);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			adcoreService.deleteAdcore(aDto.getId());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*TaskDto t = new TaskDto();
		t.setType(11);
		t.setTaskName("justTest12");
		t.setSupTaskId(Long.parseLong("12"));
		t.setSystem(Long.parseLong("12"));
		t.setDescription("test12");
		t.setCreateDate(DateUtils.getToday());
		t.setSchedule(5);
		t.setSource("atlas");
		
		PlanDto pDto = new PlanDto();
		pDto.setDevelopmentCost(540);
		pDto.setIntroduction("This is test120!");
		pDto.setOnlineDate(DateUtils.getToday());
		pDto.setStartDate(DateUtils.getToday());
		pDto.setTestCost(4321);
		pDto.setTestDate(DateUtils.getToday());
		pDto.setTestRunDate(DateUtils.getToday());
		pDto.setTotalCost(987);
		
		List<DocumentDto> dDtoList = new ArrayList<DocumentDto>();
		for(int i = 0; i < 2; i++){
			DocumentDto dDto = new DocumentDto();
			dDto.setCreateDate(DateUtils.getToday());
			dDto.setContent("This is plan Document:"+i);
			dDto.setUrl("www.sogou.com.");			
			//dDto = documentService.addDocument(dDto);
			dDtoList.add(dDto);
		}		
		pDto.setDetailPlan(dDtoList);
		t.setPlanDto(pDto);
		
		List<DocumentDto> dDtoList1 = new ArrayList<DocumentDto>();
		for(int i = 0; i < 2; i++){
			DocumentDto dDto = new DocumentDto();
			dDto.setCreateDate(DateUtils.getToday());
			dDto.setContent("This is task Document:"+i);
			dDto.setUrl("www.sogou.com.");			
			//dDto = documentService.addDocument(dDto);
			dDtoList1.add(dDto);
		}
		t.setConclusion(dDtoList1);
		
		List<DocumentDto> dDtoList2 = new ArrayList<DocumentDto>();
		for(int i = 0; i < 2; i++){
			DocumentDto dDto = new DocumentDto();
			dDto.setCreateDate(DateUtils.getToday());
			dDto.setContent("This is test Conclusion Document:"+i);
			dDto.setUrl("www.sogou.com.");			
			dDtoList2.add(dDto);
		}
		t.setDocumentList(dDtoList2);
		
		List<MemberDto> memberDtoList = new ArrayList<MemberDto>();
		for(int i = 0; i < 2; i++){
			MemberDto mDto = new MemberDto();
			mDto.setId((long) i);
			mDto.setDepartment(new StringBuilder(i).toString());
			mDto.setMail("zzm@sogou-inc.com");
			memberDtoList.add(mDto);
		}
		t.setDocumentList(dDtoList2);
		t.setId((long) 9);
		taskService.updateTaskAll(t);*/
		
		/*taskService.updateTaskName((long) 9, "updateTest");
		taskService.updateDescription((long) 9, "This is updateTest");
		taskService.updateSystem((long)9, (long) 13);
		taskService.updateType((long) 9, 14);
		taskService.updateSchedule((long) 9, 100);
		taskService.updateSource((long) 9, "xreport");
		taskService.updateUsers((long) 9, memberDtoList);
		taskService.updateDocuments((long) 9, dDtoList2);
		taskService.updateConclusionDocuments((long) 9, dDtoList);
		taskService.updatePlan((long) 9, pDto);*/
		
		/*List<TaskDto> tdList;
		tdList = taskService.getAllTask();
		//tdList = taskService.findTaskByMember();
		tdList = taskService.findTaskBySystem(Long.parseLong("2"));
		tdList = taskService.findTaskByType(3);*/
		
		/*TaskDto t = new TaskDto();
		t.setType(4);
		t.setTaskName("justTest");
		t.setSupTaskId(Long.parseLong("1"));
		t.setSystem(Long.parseLong("1"));
		t.setDescription("test");
		t.setCreateDate(DateUtils.getToday());
		t.setSchedule(5);
		t.setSource("atlas");
		
		PlanDto pDto = new PlanDto();
		pDto.setDevelopmentCost(540);
		pDto.setIntroduction("This is test!");
		pDto.setOnlineDate(DateUtils.getToday());
		pDto.setStartDate(DateUtils.getToday());
		pDto.setTestCost(4321);
		pDto.setTestDate(DateUtils.getToday());
		pDto.setTestRunDate(DateUtils.getToday());
		pDto.setTotalCost(987);
		
		List<DocumentDto> dDtoList = new ArrayList<DocumentDto>();
		for(int i = 0; i < 2; i++){
			DocumentDto dDto = new DocumentDto();
			dDto.setCreateDate(DateUtils.getToday());
			dDto.setContent("This is plan Document:"+i);
			dDto.setUrl("www.sogou.com.");			
			//dDto = documentService.addDocument(dDto);
			dDtoList.add(dDto);
		}		
		pDto.setDetailPlan(dDtoList);
		t.setPlanDto(pDto);
		
		List<DocumentDto> dDtoList1 = new ArrayList<DocumentDto>();
		for(int i = 0; i < 2; i++){
			DocumentDto dDto = new DocumentDto();
			dDto.setCreateDate(DateUtils.getToday());
			dDto.setContent("This is task Document:"+i);
			dDto.setUrl("www.sogou.com.");			
			//dDto = documentService.addDocument(dDto);
			dDtoList1.add(dDto);
		}
		t.setConclusion(dDtoList1);
		
		List<DocumentDto> dDtoList2 = new ArrayList<DocumentDto>();
		for(int i = 0; i < 2; i++){
			DocumentDto dDto = new DocumentDto();
			dDto.setCreateDate(DateUtils.getToday());
			dDto.setContent("This is test Conclusion Document:"+i);
			dDto.setUrl("www.sogou.com.");			
			//dDto = documentService.addDocument(dDto);
			dDtoList2.add(dDto);
		}
		t.setDocumentList(dDtoList2);
		
		CostDto cDto = new CostDto();	
		cDto.setDevelopmentCost(11);
		cDto.setTestCost(12);
		cDto.setTotalCost(13);		
		t.setCostDto(cDto);
		//
		t = taskService.addTask(t);
		//
		t.setTaskName("onlyTest");
		//taskService.updateTask(t);
		//
		taskService.deleteTask(t);*/
		
	}
	
	@Override
	protected String[] getConfigPaths() {
		return new String[] {"/appContext-adcore.xml"};
	}
}
