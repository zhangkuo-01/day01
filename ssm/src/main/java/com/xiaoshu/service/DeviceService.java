package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.DeviceMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Device;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class DeviceService {

	@Autowired
	DeviceMapper deviceMapper;

	public PageInfo<Device> finddevicePage(Device device, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Device> userList = deviceMapper.select(device);
		PageInfo<Device> pageInfo = new PageInfo<Device>(userList);
		return pageInfo;
	}

	public Device existdeviceName(String deviceName) {
		// TODO Auto-generated method stub
		Device device=deviceMapper.findALL(deviceName);
		return device;
	}

	public void addDevice(Device device) {
		// TODO Auto-generated method stub
		deviceMapper.insert(device);
	}

	public void deleteDevice(int parseInt) {
		// TODO Auto-generated method stub
		deviceMapper.deleteByPrimaryKey(parseInt);
	}

	public void updateDevice(Device device) {
		// TODO Auto-generated method stub
		deviceMapper.updateByPrimaryKey(device);
	}
}
