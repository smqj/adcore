package com.sogou.bizdev.muse.adcore.app.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sogou.bizdev.muse.adcore.app.dao.AdcoreDao;
import com.sogou.bizdev.muse.adcore.app.dto.AdcoreDto;
import com.sogou.bizdev.muse.adcore.app.po.Adcore;
import com.sogou.bizdev.muse.adcore.app.service.AdcoreService;

public class AdcoreServiceImpl implements AdcoreService {
	
	private Logger logger = Logger.getLogger(AdcoreServiceImpl.class);
	private AdcoreDao adcoreDao;

	public AdcoreDao getAdcoreDao() {
		return adcoreDao;
	}

	public void setAdcoreDao(AdcoreDao adcoreDao) {
		this.adcoreDao = adcoreDao;
	}
	
	@Override
	public AdcoreDto addAdcore(AdcoreDto adcoreDto) throws RemoteException{
		Adcore adcore  = adcoreDto2Po(adcoreDto);
		Adcore a = adcoreDao.addAdcore(adcoreDto2Po(adcoreDto));	
		adcoreDto.setId(a.getId());	
		return adcoreDto;
	}

	@Override
	public void updateAdcore(AdcoreDto adcoreDto)  throws RemoteException{
		if (adcoreDto != null) {
			adcoreDao.updateAdcore(adcoreDto2Po(adcoreDto));
		}
	}

	@Override
	public void deleteAdcore(Long cpcId)  throws RemoteException{
		adcoreDao.delAdcore(cpcId);
	}

	private Adcore adcoreDto2Po(AdcoreDto adcoreDto){
		Adcore adcore = new Adcore();
		if (adcoreDto != null) {
			adcore.setCpcId(adcoreDto.getCpcId());
			adcore.setAccountId(adcoreDto.getAccountId());
			adcore.setKey(adcoreDto.getKey());
			adcore.setUrl(adcoreDto.getUrl());
			adcore.setCreateDate(adcoreDto.getCreateDate());
			adcore.setChgDate(adcoreDto.getChgDate());
			adcore.setMaxPrice(adcoreDto.getMaxPrice());
		}
		else {
			logger.error("adcoreDto2Po fail, adcoreDto is null");
		}
		
		return adcore;
	}

	private AdcoreDto adcorePo2Dto(Adcore adcore){
		AdcoreDto adcoreDto = new AdcoreDto();
		if (adcore != null) {
			adcoreDto.setCpcId(adcore.getCpcId());
			adcoreDto.setAccountId(adcore.getAccountId());
			adcoreDto.setKey(adcore.getKey());
			adcoreDto.setUrl(adcore.getUrl());
			adcoreDto.setCreateDate(adcore.getCreateDate());
			adcoreDto.setChgDate(adcore.getChgDate());
			adcoreDto.setMaxPrice(adcore.getMaxPrice());
		}
		else {
			logger.error("adcorePo2Dto fail, adcore is null");
		}				
		return adcoreDto;
	}

	@Override
	public List<AdcoreDto> getAll(Integer curPage, Integer pageSize) throws RemoteException {
		List<Adcore> aList = adcoreDao.getAll(curPage, pageSize);
		List<AdcoreDto> aDtoList = new ArrayList<AdcoreDto>();
		if (aList != null) {
			for(Adcore a : aList){
				aDtoList.add(adcorePo2Dto(a));
			}
		}		
		return aDtoList;
	}

	@Override
	public AdcoreDto getById(Long id) throws RemoteException {
		Adcore adcore = adcoreDao.findById(id);		
		return adcorePo2Dto(adcore);
	}
}
