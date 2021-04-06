package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dto.MetalDTO;

public class MetalTester {
	public static void main(String[] args) {
		MetalDTO metalDTO =new MetalDTO();
		metalDTO.setAtomicNo(13);
		metalDTO.setMetalName("aluminium");
		metalDTO.setReactivity("yes");
		System.out.println(metalDTO);
		MetalDTO metalDTO1 =new MetalDTO();
		metalDTO1.setAtomicNo(82);
		metalDTO1.setMetalName("lead");
		metalDTO1.setReactivity("yes");
		System.out.println(metalDTO1);
		System.out.println(metalDTO.hashCode());
		System.out.println(metalDTO1.hashCode());
		System.out.println(metalDTO.equals(metalDTO1));
	}
	

}
