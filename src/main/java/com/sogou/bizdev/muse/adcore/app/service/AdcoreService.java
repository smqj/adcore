package com.sogou.bizdev.muse.adcore.app.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.sogou.bizdev.muse.adcore.app.dto.AdcoreDto;

public interface AdcoreService extends Remote{
	public AdcoreDto addAdcore(AdcoreDto adcoreDto) throws RemoteException;
	public void updateAdcore(AdcoreDto adcoreDto) throws RemoteException;
	public void deleteAdcore(Long cpcId) throws RemoteException;
	public List<AdcoreDto> getAll(Integer curPage, Integer pageSize) throws RemoteException;
	public AdcoreDto getById(Long id)throws RemoteException;
}
