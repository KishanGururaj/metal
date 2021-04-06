package com.wolken.wolkenapp.dto;

public class MetalDTO {
	private int atomicNo;
	private String metalName;
	private String reactivity;
	public int getAtomicNo() {
		return atomicNo;
	}
	public void setAtomicNo(int atomicNo) {
		this.atomicNo= atomicNo;
	}
	public MetalDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object is Created");
	}
	public void setMetalName(String metalName) {
		this.metalName=metalName;
	}
	public void setReactivity(String reactivity) {
		this.reactivity=reactivity;
	}
	public String getMetalName() {
		return metalName;
	}
	public String getReactivity() {
		return reactivity;
	}
	@Override 
	public String toString() {
		return "MetalDTO -AtomicNo"+this.atomicNo+"MetalName:"+this.metalName+" Reactivity: "+this.reactivity;
	}
	@Override 
	public int hashCode() {
		return this.atomicNo;
	}
	public boolean equals(Object obj) {
		MetalDTO metalDTO = (MetalDTO)obj;
		if(obj==null) {
			return false;
		}
		else {
			if (obj !=null) {
				if(obj instanceof MetalDTO) {
					if(this.hashCode()==metalDTO.hashCode()) {
						return true;
						
					}
				}
			}
			return false;
		}
	}
}

