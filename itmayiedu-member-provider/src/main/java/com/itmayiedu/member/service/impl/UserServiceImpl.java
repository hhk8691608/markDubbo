package com.itmayiedu.member.service.impl;

import com.itmayiedu.member.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public String getUser(Long id) {
		System.out.println("��Ա���� ���ܶ�������####getUser() id:"+id);
        if(id==1){
      	  return "��ʤ��";
        }
        if(id==2){
      	  return "��ǿ��";
        }
		return "δ�ҵ�...";
	}

}
